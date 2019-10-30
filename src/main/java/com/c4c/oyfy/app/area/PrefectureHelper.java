package com.c4c.oyfy.app.area;

public class PrefectureHelper {
    public static String toKeyWord(PrefectureSearchForm form) {
        // 地域名配列をstringへ変換
        String prefectureName = String.join(" ", form.getPrefectureNames());
        return prefectureName;
    }
}
