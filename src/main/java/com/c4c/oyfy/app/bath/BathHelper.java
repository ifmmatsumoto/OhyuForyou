package com.c4c.oyfy.app.bath;

import java.util.Base64;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.util.OyfyUtil;
import com.oyfy.dbflute.exentity.Bath;

public class BathHelper {

    public static BathForm toForm(BathForm form, Bath bath) throws OyfyException {
        form.setBath(bath);
        String bathImgStr = null;
        if (form.getBath().getBathImage() != null) {
         // 画像をbase64エンコーディング TODO　拡張子指定
            bathImgStr = "data:image/jpg;base64," + Base64.getEncoder().encodeToString(form.getBath().getBathImage());
        }
        form.setDispBathImg(bathImgStr);
        // 銭湯種別
        form.setDispBathType(OyfyUtil.getBathTypeName(bath.getBathType()));
        // 定休日
        form.setDispBathHoliday(OyfyUtil.getTeikyubi(bath.getBathHoliday()));
        // 24時間フラグ
        form.setDispBath24hFlg(OyfyUtil.get24FlgName(bath.getBath24hFlg()));
        return form;
    }
}
