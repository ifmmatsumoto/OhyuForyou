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
    /** 表示ページ(初期値) */
    @Builder.Default
    protected int page = 1;
}
