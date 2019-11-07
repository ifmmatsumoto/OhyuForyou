package com.c4c.oyfy.app.illust;

import java.util.List;

import org.springframework.util.StringUtils;

import com.oyfy.dbflute.exentity.Tag;

public class IllustHelper {
    public static IllustSearchForm toForm(List<Tag> entityList) {
        IllustSearchForm formList = new IllustSearchForm();

        entityList.forEach(entity -> {
            IllustItemForm form = new IllustItemForm();
            form.setTagNameJa(entity.getTagNameJa());
            // 画像が無いタグは表示しない
            if (StringUtils.isEmpty(entity.getTagImage())) return;

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

    public static String toKeyWord(IllustSearchForm form) {
        List<IllustItemForm> illustList = form.getIllustItemList();
        StringBuilder sb = new StringBuilder();
        illustList.forEach(illust -> {
            sb.append(illust.getTagNameJa());
            sb.append(" ");
        });
        return sb.toString();
    }

    public enum ImgPath {
        ILLUST("illust", "/oyfy/img/illust/"),
        OJIJI("ojiji", "/oyfy/img/ojiji/"),
        TEMPERATURE("temperature","/oyfy/img/temperature/"),
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
