package com.c4c.oyfy.domain.illust;

import java.util.List;

import com.oyfy.dbflute.exentity.Tag;

public interface IllustSearchRepository {
    /**
     * イラストタグ検索
     * @return
     */
    public List<Tag> findAllTag();
}
