package com.c4c.oyfy.domain.prefecture;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.c4c.oyfy.app.area.api.PrefectureDto;


@Service
public class PrefectureService {

    private RestTemplate restTemplate = new RestTemplate();

    /**
     * 地域検索
     * @param AreaCode
     * @return
     */
    public PrefectureDto findPrefectureList(String AreaCode) {
        /** 地域検索API リクエストURL */
        String URL = "https://www.land.mlit.go.jp/webland/api/CitySearch?area=" + AreaCode;
        return restTemplate.getForObject(URL, PrefectureDto.class);
    }
}