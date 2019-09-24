package com.c4c.oyfy.app.illust;

import java.util.List;

import com.oyfy.dbflute.exentity.Tag;

public class IllustHelper {
    public static IllustSearchForm toForm(List<Tag> entityList) {
        IllustSearchForm formList = new IllustSearchForm();

        entityList.forEach(entity -> {
            IllustItemForm form = new IllustItemForm();
            form.setTagNameJa(entity.getTagNameJa());

            int prefixIndex = entity.getTagImage().indexOf("_");
            String prefixImg = entity.getTagImage().substring(0, prefixIndex);
            // イラスト
            if(prefixImg.equals(ImgPath.ILLUST.getPrefixImg())) {
                form.setIllustTag(ImgPath.ILLUST.getImgPath() + entity.getTagImage());
            }
            // おじじ
            if(prefixImg.startsWith(ImgPath.OJIJI.getPrefixImg())) {
                form.setOjijiTag(ImgPath.OJIJI.getImgPath() + entity.getTagImage());
            }
            // 温度
            if(prefixImg.startsWith(ImgPath.TEMPERATURE.getPrefixImg())) {
                form.setTemperatureTag(ImgPath.TEMPERATURE.getImgPath() + entity.getTagImage());
            }
            formList.add(form);
        });
         return formList;
    }

    public enum ImgPath {
        ILLUST("illust", "/img/illust/"),
        OJIJI("ojiji", "/img/ojiji/"),
        TEMPERATURE("temperature","/img/temperature/"),
        ;

        private final String imgPath;
        private final String prefixImg;

        private ImgPath(final String prefixImg, final String imgPath) {
            this.prefixImg = prefixImg;
            this.imgPath = imgPath;
        }

        public final String getImgPath() {
            return this.imgPath;
        }

        public final String getPrefixImg() {
            return this.prefixImg;
        }
    }
}
