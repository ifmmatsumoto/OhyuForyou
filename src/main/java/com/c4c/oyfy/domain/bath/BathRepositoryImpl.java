package com.c4c.oyfy.domain.bath;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.UnionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.c4c.oyfy.app.search.ResultList;
import com.c4c.oyfy.app.top.TopForm;
import com.c4c.oyfy.util.OyfyConst;
import com.oyfy.dbflute.cbean.BathCB;
import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exbhv.BathTagBhv;
import com.oyfy.dbflute.exbhv.ReviewBhv;
import com.oyfy.dbflute.exbhv.TagBhv;
import com.oyfy.dbflute.exbhv.pmbean.NearbyBathPmb;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.BathTag;
import com.oyfy.dbflute.exentity.Review;
import com.oyfy.dbflute.exentity.Tag;


@Repository
public class BathRepositoryImpl extends OyfyConst implements BathRepository {

    @Autowired
    BathBhv bathBhv;
    @Autowired
    TagBhv tagBhv;
    @Autowired
    BathTagBhv bathTagBhv;
    @Autowired
    ReviewBhv reviewBhv;

    /**
     * キーワードを元に銭湯リストを取得
     * @param keyword
     * @param page
     * @param feeFrom
     * @param feeTo
     * @return
     */
    @Override
    public ResultList findBathList(String keyword, Integer feeFrom, Integer feeTo, int page) {
        // ページ情報を含めた検索結果
        ResultList resultList = new ResultList();

        // キーワードが未入力の場合は全検索
        if (StringUtils.isEmpty(keyword)) {
            resultList.setPage(bathBhv.selectPage(cb -> {
                cb.query().setDelFlg_Equal(0);
                // 料金From～Toによる絞り込み (片方指定とかできてもいいかも)
                if(feeFrom != null && feeTo != null) {
                    cb.query().setBathFee_RangeOf(feeFrom, feeTo, op -> op.getCalculationRange());

                }
                cb.paging(PAGE_SIZE, page); // 表示件数, 表示ページ数
            }));
            return resultList;
        }
        // 銭湯名で検索
        PagingResultBean<Bath> selectPage = bathBhv.selectPage(cb -> {
            cb.orScopeQuery(orCB -> {
                orCB.query().setBathNameJa_Equal(keyword);
                orCB.query().setBathNameEn_Equal(keyword);
            });
            cb.paging(PAGE_SIZE, page);
        });
        if(selectPage.size() != 0) {
            resultList.setPage(selectPage);
            return resultList; // return resultList.setPage(selectPage);はむりだった
        }

        // タグ名で検索
        ListResultBean<Tag> tagList = tagBhv.selectList(cb -> {
            cb.query().setTagNameJa_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
        });

        List<Integer> dummyIntegerList = new ArrayList<>();
        dummyIntegerList.add(-1);

        List<Integer> bathTagIdList = (tagList == null || tagList.size() == 0)
                ? dummyIntegerList
                : tagList.stream().map(tag -> {
                    return tag.getTagId();
                }).collect(Collectors.toList());
        resultList.setPage(bathBhv.selectPage(cb -> {
            cb.query().setDelFlg_Equal(0);
            // 料金From～Toによる絞り込み (片方指定とかできてもいいかも)
            if(feeFrom != null && feeTo != null) {
                cb.query().setBathFee_RangeOf(feeFrom, feeTo, op -> op.getCalculationRange());
            }
            cb.paging(PAGE_SIZE, page); // 表示件数, 表示ページ数
            cb.query().existsBathTag(bathTagCB -> {
                bathTagCB.query().setTagId_InScope(bathTagIdList);
            });

            cb.union(new UnionQuery<BathCB>() {
                @Override
                public void query(BathCB unionCB) {
                    unionCB.orScopeQuery(orCB -> {
                        orCB.query().setBathDetail_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
                        orCB.query().setBathAddressJa_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
                        orCB.query().setBathAddressEn_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
                        orCB.query().setBathNearStation_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
                    });
                }
            });
        }));
        return resultList;
    }

    /**
     * 銭湯IDを元に銭湯詳細を取得
     * @param bathId
     * @return
     */
    @Override
    public Bath findBathDetail(int bathId) {
        return bathBhv.selectByPK(bathId).get();
    }

    /**
     * 銭湯IDを元にタグ一覧を取得
     * @param bathId
     * @return
     */
    @Override
    public List<Tag> findTagList(int bathId) {
        // 銭湯IDに紐づくタグIDを取得
        ListResultBean<BathTag> tagIdList = bathTagBhv.selectList(cb -> {
            cb.query().setBathId_Equal(bathId);
        });
        // タグが登録されていない場合は終了
        if (tagIdList == null || tagIdList.size() ==0) return null;

        // タグ検索用に使うタグIDリストを取得
        List<Integer> bathTagIdList = new ArrayList<>();
        tagIdList.forEach(tag -> {
            bathTagIdList.add(tag.getTagId());
        });
        // タグリストを取得
        ListResultBean<Tag> tagList = tagBhv.selectList(cb -> {
            cb.query().setTagId_InScope(bathTagIdList);
        });
        return tagList;
    }

    /**
     * 銭湯登録・更新
     * @param bath
     */
    @Override
    public void registBath(Bath bath) {
        if (bath.getBathId() == null || bath.getBathId() == 0) {
            // 新規登録
            bathBhv.insert(bath);
        } else {
            // 更新
            bathBhv.update(bath);
        }
    }
    public ResultList findNearbyBath(TopForm form) {
        // ページ情報を含めた検索結果
        ResultList resultList = new ResultList();

        NearbyBathPmb pmb = new NearbyBathPmb();
        pmb.setBath_place_lat(BigDecimal.valueOf(form.getLatitude()));
        pmb.setBath_place_lon(BigDecimal.valueOf(form.getLongitude()));
        pmb.setDistance(form.getDistance());
        pmb.paging(PAGE_SIZE, 1);
        resultList.setPage(bathBhv.outsideSql().selectPage(pmb));

        return resultList;
    }

    /**
     * コメント登録
     * @param review
     */
    @Override
    public void registReview(Review review) {
        reviewBhv.insert(review);
    }

    /**
     * 銭湯IDを元にコメント一覧を取得
     * @param bathId
     * @return
     */
    @Override
    public List<Review> findReviewList(int bathId) {
        ListResultBean<Review> reviewList = reviewBhv.selectList(cb -> {
            cb.query().setBathId_Equal(bathId);
            cb.query().addOrderBy_CreateDate_Asc();
        });
        return reviewList;
    }
}
