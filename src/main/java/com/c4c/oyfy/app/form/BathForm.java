package com.c4c.oyfy.app.form;

import java.math.BigDecimal;
import java.time.LocalTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class BathForm extends _Common_Form {

    // @TODO 銭湯ID
    int bathId;

    String bathNameJa;
    String bathNameEn;
    Integer bathAreaCode;
    Integer bathCityCode;
    String bathImage;
    String bathAddressJa;
    String bathAddressEn;
    String bathTel;
    String bathDetail;
    int bathFee;
    int bathType;
    int bath24hFlg;
    LocalTime bathTimeSt;
    LocalTime bathTimeEd;
    BigDecimal bathPlaceLat;
    BigDecimal bathPlaceLon;
    BigDecimal bathTemperatureUp;
    BigDecimal bathTemperatureLow;
    int bathHoliday;
}
