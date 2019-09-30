package com.c4c.oyfy.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class _Common_Form {
    /** 共通メッセージ(成功) */
    protected String okMsg;
    /** 共通メッセージ(失敗) */
    protected String ngMsg;
    /** 表示ページ(初期値) */
    @Builder.Default
    protected int page = 1;
}
