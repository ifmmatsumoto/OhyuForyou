package com.c4c.oyfy.domain.repository.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exentity.Bath;


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

    @Override
    public List<Bath> searchPathList(String keyword) {
        List<Bath> bath =  BathBhv.selectList(cb -> {
            cb.query().setBathFee_GreaterEqual(460);
        });
        return bath;
    }
}
