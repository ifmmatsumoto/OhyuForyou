package com.c4c.oyfy.domain.test;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exbhv.BathTagBhv;
import com.oyfy.dbflute.exbhv.TagBhv;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.Tag;


@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    BathBhv bathBhv;
    @Autowired
    TagBhv tagBhv;
    @Autowired
    BathTagBhv bathTagBhv;

    @Override
    public List<Bath> searchPathList(String keyword) {

        ListResultBean<Tag> tagList = tagBhv.selectList(cb -> {
            cb.query().setTagNameJa_Equal(keyword);
        });
        // 銭湯検索用に使うタグIDリストを取得する。
        List<Integer> bathTagIdList = new ArrayList<>();
        tagList.forEach(tag -> {
            bathTagIdList.add(tag.getTagId());
        });
        // exitstリファラーを使ってBathTagテーブルのデータで抽出
        return bathBhv.selectList(cb -> {
            cb.query().existsBathTag(bathTagCB -> {
                bathTagCB.query().setTagId_InScope(bathTagIdList);
            });
        });
    }
}
