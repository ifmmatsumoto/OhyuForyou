package com.c4c.oyfy.app.test;

import java.util.ArrayList;
import java.util.List;

import com.oyfy.dbflute.exentity.Bath;

public class TestHelper {

    public static List<TestForm> toForm(List<Bath> entityList) {
        List<TestForm> formList = new ArrayList<>();

        entityList.forEach(entity -> {
            TestForm form = new TestForm();
            form.setBathNameJa(entity.getBathNameJa());
            form.setBathNameEn(entity.getBathNameEn());
            form.setBathAreaCode(entity.getBathAreaCode());
            form.setBathCityCode(entity.getBathCityCode());
            form.setBathImage(entity.getBathImage());
            form.setBathAddressJa(entity.getBathAddressJa());
            form.setBathAddressEn(entity.getBathAddressEn());
            form.setBathTel(entity.getBathTel());
            form.setBathFee(entity.getBathFee());
            form.setBathType(entity.getBathType());
            form.setBath24hFlg(entity.getBath24hFlg());
            form.setBathTimeSt(entity.getBathTimeSt());
            form.setBathTimeEd(entity.getBathTimeEd());
            form.setBathPlaceLat(entity.getBathPlaceLat());
            form.setBathPlaceLon(entity.getBathPlaceLon());
            form.setBathTemperatureUp(entity.getBathTemperatureUp());
            form.setBathTemperatureLow(entity.getBathTemperatureLow());
            form.setDelFlg(entity.getDelFlg());
            form.setCreateDate(entity.getCreateDate());
            form.setUpdateDate(entity.getUpdateDate());
            formList.add(form);
        });
         return formList;
    }
}
