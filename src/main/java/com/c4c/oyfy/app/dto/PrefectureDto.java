package com.c4c.oyfy.app.dto;

import java.util.List;

import org.json.JSONObject;

import lombok.Data;

@Data
public class PrefectureDto {
    /** APIの戻り値 */
    String status;
    List<JSONObject> data;
}
