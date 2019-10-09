package com.c4c.oyfy.app.area;

import java.util.List;

import com.c4c.oyfy.app.dto.PrefectureDto.Prefecture;

import lombok.Data;

@Data
public class PrefectureForm {

    /** 都道府コード */
    String areaCode;
    /** 都道府コード */
    String areaName;
    /** 都道府県(地域)リスト */
    List<Prefecture> prefectureList;
}
