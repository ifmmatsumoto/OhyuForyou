package com.c4c.oyfy.app.area;

public class StationHelper {
    public static String toKeyWord(StationSearchForm form) {
        // 駅名配列をstringへ変換
        String stationName = String.join(" ", form.getStationNames());
        return stationName;
    }
}
