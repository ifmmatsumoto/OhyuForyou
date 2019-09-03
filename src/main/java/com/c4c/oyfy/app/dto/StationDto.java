package com.c4c.oyfy.app.dto;

import java.util.List;

import org.json.JSONObject;

import lombok.Data;

@Data
public class StationDto {
    /** APIの戻り値 */
     Station response;

    @Data
    /** 駅配列 */
    public class Station {
        List<JSONObject> station;
    }
}
