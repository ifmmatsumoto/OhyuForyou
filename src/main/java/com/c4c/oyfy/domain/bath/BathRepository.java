package com.c4c.oyfy.domain.bath;

import com.c4c.oyfy.app.search.ResultList;
import com.c4c.oyfy.app.top.CurrentLocationForm;

public interface BathRepository {
    /**
     * 検索条件を元に銭湯リストを取得
     * @param keyword
     * @param page
     * @param feeFrom
     * @param feeTo
     * @return
     */
    public ResultList findBathList(String keyword, Integer feeFrom, Integer feeTo, int page);

    public ResultList findNearbyBath(CurrentLocationForm currentLocationForm);
}
