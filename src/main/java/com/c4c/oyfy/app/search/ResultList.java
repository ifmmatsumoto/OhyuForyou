package com.c4c.oyfy.app.search;

import java.util.List;

import org.dbflute.cbean.result.PagingResultBean;

import lombok.Data;

/**
 * 検索結果
 */
@Data
public class ResultList {
    /** 検索キーワード */
    private String keyword;
    /** 検索キーワード一覧 */
    private List<String> keywordList;
    /** ページ情報を含めた検索結果  */
    private PagingResultBean<?> page;
    /** 銭湯画像 */
    private String dispBathImg;
}
