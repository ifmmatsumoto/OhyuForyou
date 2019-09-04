package com.c4c.oyfy.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.c4c.oyfy.app.dto.StationDto;

@Service
@Transactional
public class StationService {

    RestTemplate restTemplate = new RestTemplate();

	public StationDto findLineList(String areaname) {

	    /** 沿線検索API リクエストURL */
	    String URL = "http://express.heartrails.com/api/json?method=getAreas";

	    System.out.println(URL);

	     StationDto forObject = restTemplate.getForObject(URL, StationDto.class);
	     System.out.println();
	     return null;
	}

	public StationDto findStationList(String areaname) {

	    //TODO: 路線検索結果を元に駅名を取得する
	     /** 沿線検索API リクエストURL */
	     String URL = "http://express.heartrails.com/api/json?method=getStations&line=" + areaname;

	     System.out.println(URL);

	     return restTemplate.getForObject(URL, StationDto.class);
	 }


}