package com.c4c.oyfy.app.test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;

@Data
public class TestForm {

    String keyword;

    String bathNameJa;

    String bathNameEn;

    int bathAreaCode;

    int bathCityCode;

    byte[] bathImage;

    String bathAddressJa;

    String bathAddressEn;

    String bathTel;

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

    int delFlg;

    LocalDateTime createDate;

    LocalDateTime updateDate;

}
