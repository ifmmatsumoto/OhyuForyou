package com.c4c.oyfy.app.search;

import lombok.Data;

/**
 * 検索条件
 */
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
