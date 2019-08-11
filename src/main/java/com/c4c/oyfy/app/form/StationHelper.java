package com.c4c.oyfy.app.form;

import java.util.ArrayList;
import java.util.List;

public class StationHelper {

    public static List<StationForm> toForm(List<StationForm> entityList) {
        List<StationForm> formList = new ArrayList<>();

        entityList.forEach(entity -> {
            StationForm form = new StationForm();
            form.setLine(entity.getLine());
            System.out.println(form.getLine());
            formList.add(form);
        });
         return formList;
    }
}
