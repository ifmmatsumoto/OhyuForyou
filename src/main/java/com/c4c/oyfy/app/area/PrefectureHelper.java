package com.c4c.oyfy.app.area;

import java.util.List;

public class PrefectureHelper {
    public static String toKeyWord(PrefectureSearchForm form) {
        List<PrefectureForm> prefectureList = form.getPrefectureList();
        StringBuilder sb = new StringBuilder();
        prefectureList.forEach(prefecture -> {
            sb.append(prefecture.getAreaName());
            sb.append(" ");
        });
        return sb.toString();
    }
}
