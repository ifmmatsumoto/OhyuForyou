package com.c4c.oyfy.app.area;

import java.util.List;

import com.c4c.oyfy.app._Common_Form;
import com.c4c.oyfy.app.area.api.PrefectureDto.Prefecture;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrefectureForm extends _Common_Form {
    /** 区分コード*/
    Integer division;
    /** 都道府コード */
    String areaCode;
    /** 都道府県名 */
    String areaName;
    /** エリア区分 */
    String action;
    /** 都道府県(地域)リスト */
    List<Prefecture> prefectureList;
    /** 都道府県選択値 */
    String[] prefectureNames;
}
