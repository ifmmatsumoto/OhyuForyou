package com.c4c.oyfy.domain.repository.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oyfy.dbflute.exbhv.TBathBhv;



@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    TBathBhv tBathBhv;

    @Override
    public int test() {
        return tBathBhv.selectCount(cb -> {
            cb.query().setBath24hFlg_Equal(1);;
        });
    }
}
