package com.c4c.oyfy.domain.test;

import java.util.List;

import com.oyfy.dbflute.exentity.Bath;

public interface TestRepository {
    public List<Bath> searchPathList(String keyword);
}
