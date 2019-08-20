package com.c4c.oyfy.app.illust;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class IllustSearchForm {

    // インスタンスを作らないためにプリミティブ型にしてる
    // どうパフォーマンスに影響するのかはよくわからない
    // プリミティブで対応できるならそっちのほうがいいらしい
    // Effective Javaより。勘違いかも
    boolean temperature_low;
    boolean temperature_high;
    int fee_low;
    int fee_high;

    List<IllustItemForm> illustItemList = new ArrayList<>();

    public void add(IllustItemForm item) {
        illustItemList.add(item);
    }
}
