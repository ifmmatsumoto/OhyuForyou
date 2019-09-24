package com.c4c.oyfy.app.search;

import lombok.Data;

@Data
public class Conditions {
    /** 検索キーワード */
    String keyword;
    /** 表示ページ */
    int page;
    /** 料金From */
    Integer feeFrom;
    /** 料金To */
    Integer feeTo;
}
