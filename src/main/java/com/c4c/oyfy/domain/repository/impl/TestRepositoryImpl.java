package com.c4c.oyfy.domain.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c4c.oyfy.domain.repository.TestRepository;
import com.oyfy.dbflute.exbhv.BathBhv;


@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    BathBhv BathBhv;

    @Override
    public int test() {
        System.out.println(1);

        BathBhv.selectList(cb -> {
            cb.query().addOrderBy_Bath24hFlg_Asc();
        });
        return BathBhv.selectCount(cb -> {
            cb.query().setBath24hFlg_Equal(1);
        });

    }
}
