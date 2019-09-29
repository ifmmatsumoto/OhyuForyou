package com.c4c.oyfy.domain.bath;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.coption.RangeOfOption;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.c4c.oyfy.app.search.ResultList;
import com.c4c.oyfy.util.OyfyConst;
import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exbhv.BathTagBhv;
import com.oyfy.dbflute.exbhv.TagBhv;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.Tag;

@Repository
public class BathRepositoryImpl extends OyfyConst implements BathRepository {

    @Autowired
    BathBhv bathBhv;
    @Autowired
    TagBhv tagBhv;
    @Autowired
    BathTagBhv bathTagBhv;

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

        // キーワードが未入力の場合は全検索 TODO キーワード入力時と合わせてできないか確認
        if (StringUtils.isEmpty(keyword)) {
            resultList.setPage(bathBhv.selectPage(cb -> {
                cb.query().setDelFlg_Equal(0);
                // 料金From～Toによる絞り込み TODO 片方指定とかできてもいいかも
                if(feeFrom != null && feeTo != null) {
                    cb.query().setBathFee_RangeOf(feeFrom, feeTo, new RangeOfOption().orIsNull());
                }
                cb.paging(PAGE_SIZE, page); // 表示件数, 表示ページ数
            }));
            return resultList;
        }

        // タグ名で検索
        ListResultBean<Tag> tagList = tagBhv.selectList(cb -> {
            cb.query().setTagNameJa_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
        });
        if (tagList == null || tagList.size() == 0) return resultList;

        // 銭湯検索用に使うタグIDリストを取得
        List<Integer> bathTagIdList = new ArrayList<>();
        tagList.forEach(tag -> {
            bathTagIdList.add(tag.getTagId());
        });

        // TODO OR検索になってる
        resultList.setPage(bathBhv.selectPage(cb -> {
            cb.query().setDelFlg_Equal(0);
            // 料金From～Toによる絞り込み TODO 片方指定とかできてもいいかも
            if(feeFrom != null && feeTo != null) {
                cb.query().setBathFee_RangeOf(feeFrom, feeTo, new RangeOfOption().orIsNull());
            }
            cb.paging(PAGE_SIZE, page); // 表示件数, 表示ページ数
            cb.query().existsBathTag(bathTagCB -> {
                bathTagCB.query().setTagId_InScope(bathTagIdList);
            });
        }));
        return resultList;
    }

    /**
     * 銭湯リストを取得(全件取得)
     */
    @Override
    public List<Bath> searchBathList() {
        // 銭湯ID順で銭湯リストを取得
        return bathBhv.selectList(cb -> {
            cb.query().setDelFlg_Equal(0);
            cb.query().addOrderBy_BathId_Asc();
        });
    }

    /**
     * 銭湯リストを取得(キーワード検索)
     */
    @Override
    public List<Bath> searchBathList(String keyword) {
        // タグ名で検索
        ListResultBean<Tag> tagList = tagBhv.selectList(cb -> {
            cb.query().setTagNameJa_LikeSearch(keyword, op -> op.likeContain().splitBySpace().asOrSplit());
        });
        if (tagList == null || tagList.size() == 0) return null;

        // 銭湯検索用に使うタグIDリストを取得
        List<Integer> bathTagIdList = new ArrayList<>();
        tagList.forEach(tag -> {
            bathTagIdList.add(tag.getTagId());
        });

        // TODO:haraguchi OR検索になってる
        // 銭湯タグテーブルから該当の銭湯を取得
        return bathBhv.selectList(cb -> {
            cb.query().setDelFlg_Equal(0);
            cb.query().existsBathTag(bathTagCB -> {
                bathTagCB.query().setTagId_InScope(bathTagIdList);
            });
        });
    }

    /** 銭湯リストを取得 */
    @Override
    public List<Bath> getBathList() {
        // 銭湯ID順で銭湯リストを取得
        return bathBhv.selectList(cb -> {
            cb.query().addOrderBy_BathId_Asc();
        });
    }

    /** 銭湯リストを取得 */
    @Override
    public Bath findBath(int bathId) {
        // 銭湯ID順で銭湯リストを取得
        return bathBhv.selectByPK(bathId).get();
    }
}
