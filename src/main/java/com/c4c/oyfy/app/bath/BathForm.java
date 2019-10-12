package com.c4c.oyfy.app.bath;

import com.c4c.oyfy.app._Common_Form;
import com.oyfy.dbflute.exentity.Bath;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class BathForm extends _Common_Form {
    /** 銭湯ID */
    private int bathId;
    /** 銭湯情報 */
    private Bath bath;
    /** 銭湯種別 */
    private String dispBathType;
    /** 定休日 */
    private String dispBathHoliday;
    /** 24時間フラグ */
    private String dispBath24hFlg;
}
