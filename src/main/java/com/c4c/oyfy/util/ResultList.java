package com.c4c.oyfy.util;

import org.dbflute.cbean.result.PagingResultBean;

import lombok.Data;

@Data
public class ResultList {
    /** ページ情報を含めた検索結果  */
    PagingResultBean<?> page;
}
