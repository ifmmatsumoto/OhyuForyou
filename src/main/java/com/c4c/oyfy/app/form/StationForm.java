package com.c4c.oyfy.app.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class StationForm {

    /** 路線リスト */
    List<String> line
    = new ArrayList<String>();

}
