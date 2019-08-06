package com.c4c.oyfy.domain.illust;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oyfy.dbflute.exbhv.TagBhv;
import com.oyfy.dbflute.exentity.Tag;

@Repository
public class IllustSearchRepositoryImpl implements IllustSearchRepository{

    @Autowired
    public TagBhv tagBhv;

    public List<Tag> findAllTag() {
       return tagBhv.selectList(cb ->{
        });
    }
}
