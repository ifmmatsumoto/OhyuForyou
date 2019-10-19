package com.c4c.oyfy.util;

public class OyfyConst {

    /** 1ページ表示サイズ */
    public final int PAGE_SIZE = 20;
    /** 銭湯種別 */
    public static enum BathType {
        BATH(10,  "銭湯"),
        SPER(20, "スーパー銭湯"),
        ONSN(30, "温泉");
        private int num;
        private String str;
        BathType(int num, String str) { this.num=num; this.str=str; }
        public int num() { return num; }
        public String str() { return str; }
    }
    /** エリア区分 */
    public static enum Division {
        PREFECTUR(1, "/area/prefecture"),
        STATION(2, "/area/station");
        private int id;
        private String str;
        Division(int id, String str) { this.id=id; this.str=str; }
        public int id() { return id; }
        public String str() { return str; }
    }
    /** 24時間フラグ */
    public static enum Flg24 {
        ON(1,  "24時間営業");
        private int num;
        private String str;
        Flg24(int num, String str) { this.num=num; this.str=str; }
        public int num() { return num; }
        public String str() { return str; }
    }
}
