package com.c4c.oyfy.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c4c.oyfy.domain.repository.BathRepository;
import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exbhv.BathTagBhv;
import com.oyfy.dbflute.exbhv.MemberBhv;
import com.oyfy.dbflute.exbhv.TagBhv;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.Tag;


@Repository
public class BathRepositoryImpl implements BathRepository {

    @Autowired
    BathBhv bathBhv;
    @Autowired
    TagBhv tagBhv;
    @Autowired
    BathTagBhv bathTagBhv;
    @Autowired
    MemberBhv memberBhv;

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
}
