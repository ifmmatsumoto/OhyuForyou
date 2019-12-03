package com.c4c.oyfy.app.area;

import java.util.LinkedHashMap;
import java.util.List;

import com.c4c.oyfy.app._Common_Form;
import com.c4c.oyfy.app.area.api.StationDto.Response.Station;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StationForm extends _Common_Form {
    /** 都道府県名 */
    private String areaName;
    /** 路線リスト */
    private LinkedHashMap<String, List<Station>> line;
    /** 駅リスト */
    private List<Station> station;
    /** 駅リスト選択値 */
    String[] stationNames;
    /** フッター画像切り替え 駅 */
    protected String stationName;
    /** フッター画像切り替え 都道府県 */
    protected String prefectureName;
    /** フッター画像切り替え イラスト */
    protected String illustName;
}
