package com.c4c.oyfy.app.dto;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class StationDto {

    @JsonDeserialize(using = StationDataDto.class)
    String response;

    public ArrayList<String> findResponse() {

        JSONObject jsonObj = new JSONObject(response);

        System.out.println("apiから取得したJSON配列 \n" + response);

        // JSON配列から必要値を取得
        JSONArray jsonArray = jsonObj.getJSONArray("line");

        // 通常配列にして画面へ返す
        ArrayList<String> lineList = new ArrayList<String>();

        if (jsonArray != null) {
            int len = jsonArray.length();
            for (int i=0;i<len;i++){
              lineList.add(jsonArray.get(i).toString());
            }
         }

        System.out.println("出力用のArrayList \n" + lineList);
        return lineList;
    }
}