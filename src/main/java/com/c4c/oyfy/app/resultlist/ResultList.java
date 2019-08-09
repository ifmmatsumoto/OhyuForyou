package com.c4c.oyfy.app.resultlist;

import java.util.List;

import org.dbflute.cbean.result.PagingResultBean;

import lombok.Data;

@Data
public class ResultList {
    /** 検索キーワード */
    String keyword;
    /** 検索キーワード一覧 */
    List<String> keywordList;
    /** ページ情報を含めた検索結果  */
    PagingResultBean<?> page;
}
