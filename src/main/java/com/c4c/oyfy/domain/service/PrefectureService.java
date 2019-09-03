package com.c4c.oyfy.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.c4c.oyfy.app.dto.PrefectureDto;


@Service
@Transactional
public class PrefectureService {

    private RestTemplate restTemplate = new RestTemplate();

	public PrefectureDto findPrefectureList(int AreaCode) {

	    /** 地域検索API リクエストURL */
	    String URL = "http://www.land.mlit.go.jp/webland/api/CitySearch?area=" + AreaCode;

	    System.out.println(URL);

	    return restTemplate.getForObject(URL, PrefectureDto.class);
	}

}