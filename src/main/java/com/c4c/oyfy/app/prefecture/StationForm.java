package com.c4c.oyfy.app.prefecture;

import com.c4c.oyfy.app._Common_Form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class StationForm {

    /** 都道府県名 */
    String areaName;

    /** 路線リスト */
    List<String> line
    = new ArrayList<String>();

    /** 駅リスト */
//    List<String> station
//    = new ArrayList<String>();
}
