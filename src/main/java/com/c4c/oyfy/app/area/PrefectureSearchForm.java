package com.c4c.oyfy.app.area;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PrefectureSearchForm {
    // インスタンスを作らないためにプリミティブ型にしてる
    // どうパフォーマンスに影響するのかはよくわからない
    // プリミティブで対応できるならそっちのほうがいいらしい
    // Effective Javaより。勘違いかも

    List<PrefectureForm> PrefectureList = new ArrayList<>();

    public void add(PrefectureForm item) {
        PrefectureList.add(item);
    }
}
