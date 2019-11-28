package com.c4c.oyfy.app.illust;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class IllustSearchForm {

    int fee_low;
    int fee_high;

    List<IllustItemForm> illustItemList = new ArrayList<>();

    public void add(IllustItemForm item) {
        illustItemList.add(item);
    }
}
