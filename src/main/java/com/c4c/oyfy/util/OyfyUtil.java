package com.c4c.oyfy.util;

import org.springframework.util.StringUtils;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.util.OyfyConst.BathType;
import com.c4c.oyfy.util.OyfyConst.Flg24;

public class OyfyUtil {

    /** 定休日の曜日 */
    private static enum Holiday {
        MON(64, "月曜日"),
        TUE(32, "火曜日"),
        WED(16, "水曜日"),
        THU(8,  "木曜日"),
        FRI(4,  "金曜日"),
        SAT(2,  "土曜日"),
        SUN(1,  "日曜日");
        private int yobiInt;
        private String yobiStr;
        Holiday(int yobiInt, String yobiStr) {
            this.yobiInt = yobiInt;
            this.yobiStr = yobiStr;
        }
    }

    /**
     * 定休日を取得する
     * @param holiday
     * @return
     */
    public static String getTeikyubi(int holiday) throws OyfyException {
        // 戻り値の定休日
        String result = "";
        // 曜日の数だけループ
        for(Holiday yobi : Holiday.values()){
            // 定休日の値 ＞ 曜日のビット値なら定休日
            if (holiday >= yobi.yobiInt) {
                // 定休日の区切り
                if (!StringUtils.isEmpty(result)) result += ',';
                // 定休日に追加
                result += yobi.yobiStr;
                // 定休日の値を更新
                holiday = holiday - yobi.yobiInt;
            }
        }
        return result;
    }

    /**
     * 銭湯種別名を取得する
     * @param holiday
     * @return
     */
    public static String getBathTypeName(int bathtype) {
        for (BathType bathType : BathType.values()) {
            if (bathType.num() == bathtype) {
                return bathType.str();
            }
        }
        return null;
    }

    /**
     * 24時間フラグを取得する
     * @param 24Flg
     * @return
     */
    public static String get24FlgName(int flg24) {
        for (Flg24 flg : Flg24.values()) {
            if (flg.num() == flg24) {
                return flg.str();
            }
        }
        return null;
    }
}
