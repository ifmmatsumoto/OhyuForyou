package com.c4c.oyfy.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c4c.oyfy.domain.repository.TestRepository;
import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exbhv.BathTagBhv;
import com.oyfy.dbflute.exbhv.MemberBhv;
import com.oyfy.dbflute.exbhv.TagBhv;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.Member;
import com.oyfy.dbflute.exentity.Tag;


@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    BathBhv bathBhv;
    @Autowired
    TagBhv tagBhv;
    @Autowired
    BathTagBhv bathTagBhv;
    @Autowired
    MemberBhv memberBhv;

    @Override
    public int test() {
        System.out.println(1);

        bathBhv.selectList(cb -> {
            cb.query().addOrderBy_Bath24hFlg_Asc();
        });
        return bathBhv.selectCount(cb -> {
            cb.query().setBath24hFlg_Equal(1);
        });

    }

    @Override
    public List<Bath> searchPathList(String keyword) {
        String keyword1 = "a";
        System.out.println(System.getProperty("file.encoding"));
        ListResultBean<Tag> tagList = tagBhv.selectList(cb -> {
            cb.query().setTagNameEn_Equal(keyword1);
        });
        List<Integer> bathTagIdList = new ArrayList<>();
//        tagList.forEach(tag -> {
//            bathTagIdList.add(tag.getTagId());
//        });
//
        ListResultBean<Member> selectList = memberBhv.selectList(cb -> {
            cb.query().setMemberName_Equal("あ");
        });

        System.out.println(selectList);
        Tag tag = new Tag();
        tag.setTagNameJa("あ");

        tagBhv.insert(tag);

        //        int selectCount = bathBhv.selectCount(cb -> {
//            cb.query().setBathNameJa_Equal("適当銭湯");
//        });
        // exitstリファラーを使ってBathTagテーブルのデータで抽出
//        bathBhv.selectList(cb -> {
//            cb.query().existsBathTag(bathTagCB -> {
//                bathTagCB.query().setTagId_InScope(bathTagIdList);
//            });
//        });

        return bathBhv.selectList(cb -> {
            cb.query().setBath24hFlg_Equal(1);
        });
    }
}
