package com.c4c.oyfy.domain.repository;

import java.util.List;

import com.oyfy.dbflute.exentity.Bath;

public interface BathRepository {

    /**
     * 銭湯リストを取得
     * @return
     */
    public List<Bath> getBathList();

    /**
     * 銭湯リストを取得
     * @param keywords
     * @return
     */
    public List<Bath> getBathList(String[] keywords);

}
