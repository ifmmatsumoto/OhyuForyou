package com.c4c.oyfy.domain.repository.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oyfy.dbflute.exbhv.UserBhv;

@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    UserBhv userBhv;

    @Override
    public int test() {
        return userBhv.selectCount(cb -> {
            cb.query().setId_Equal(1);
        });
    }
}
