package com.c4c.oyfy.app.dto;

import lombok.Data;

@Data
public class LineDto {
    /** APIの戻り値 */
     Line response;

    @Data
    /** 沿線配列 */
    public class Line {
        String[] line;
    }
}