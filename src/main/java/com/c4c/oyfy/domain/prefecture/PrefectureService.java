package com.c4c.oyfy.domain.prefecture;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.c4c.oyfy.app.dto.PrefectureDto;


@Service
public class PrefectureService {

    private RestTemplate restTemplate = new RestTemplate();

    public PrefectureDto findPrefectureList(String AreaCode) {

        System.out.println("areacode" + AreaCode);

        /** 地域検索API リクエストURL */
        String URL = "https://www.land.mlit.go.jp/webland/api/CitySearch?area=" + AreaCode;

        System.out.println(URL);

        return restTemplate.getForObject(URL, PrefectureDto.class);
    }
}