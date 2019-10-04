package com.c4c.oyfy.app.bath;

import java.util.Base64;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.util.OyfyUtil;
import com.oyfy.dbflute.exentity.Bath;

public class BathHelper {

    public static BathForm toForm(BathForm form, Bath bath) throws OyfyException {
        form.setBath(bath);
        // 画像をbase64エンコーディング
        form.setDispBathImg("data:image/jpg;base64," + Base64.getEncoder().encodeToString(form.getBath().getBathImage()));
        // 銭湯種別
        form.setDispBathType(OyfyUtil.getBathTypeName(bath.getBathType()));
        // 定休日
        form.setDispBathHoliday(OyfyUtil.getTeikyubi(bath.getBathHoliday()));
        // 24時間フラグ
        form.setDispBath24hFlg(OyfyUtil.get24FlgName(bath.getBath24hFlg()));
        return form;
    }
}
