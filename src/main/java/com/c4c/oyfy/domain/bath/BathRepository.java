package com.c4c.oyfy.domain.bath;

import java.util.List;

import com.c4c.oyfy.app.search.ResultList;
import com.oyfy.dbflute.exentity.Bath;

public interface BathRepository {
    /**
     * 検索条件を元に銭湯リストを取得
     * @param keyword
     * @param page
     * @param feeFrom
     * @param feeTo
     * @r
     * eturn
     */
    public ResultList findBathList(String keyword, Integer feeFrom, Integer feeTo, int page);

    /** 銭湯リストを取得 */
    public List<Bath> getBathList();
    public Bath findBath(int bathId);

    /**
     * 銭湯リストを取得
     * @return
     */
    public List<Bath> searchBathList();

    /**
     * 銭湯リストを取得
     * @param keywords
     * @return
     */
    public List<Bath> searchBathList(String keyword);
}
