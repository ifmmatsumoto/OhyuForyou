package com.c4c.oyfy.app.prefecture;

import java.util.LinkedHashMap;
import java.util.List;

import com.c4c.oyfy.app.dto.StationDto.Response.Station;

import lombok.Data;

@Data
public class StationForm {
    /** 都道府県名 */
    private String areaName;
    /** 路線リスト */
    private LinkedHashMap<String, List<Station>> line;
    /** 駅リスト */
    private List<Station> station;
}
