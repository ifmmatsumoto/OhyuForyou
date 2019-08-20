package com.c4c.oyfy.app.illust;

import java.util.List;

import com.oyfy.dbflute.exentity.Tag;

public class IllustHelper {
    public static IllustSearchForm toForm(List<Tag> entityList) {
        IllustSearchForm formList = new IllustSearchForm();
        final String illustImgPath = "/img/illust/";
        final String ojijiImgPath = "/img/ojiji/";
        entityList.forEach(entity -> {
            IllustItemForm form = new IllustItemForm();
            form.setTagNameJa(entity.getTagNameJa());
            // 登録するファイル名によって入力するフォームを振り分ける(もっと綺麗にかけるかな？)
            if (entity.getTagImage().startsWith("ojiji_")) {
                form.setOjijiTag(ojijiImgPath + entity.getTagImage());
            } else {
                form.setIllustTag(illustImgPath+entity.getTagImage());
            }
            formList.add(form);
        });
         return formList;
    }
}
