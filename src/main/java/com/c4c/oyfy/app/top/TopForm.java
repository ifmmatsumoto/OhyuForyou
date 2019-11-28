package com.c4c.oyfy.app.top;

import com.c4c.oyfy.app._Common_Form;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TopForm extends _Common_Form {
    /** キーワード */
    String keyword;
    /** 現在地検索用 経度 */
    double longitude;
    /** 現在地検索用 緯度 */
    double latitude;
    /** 現在地検索用 距離(半径) */
    int distance;
}
