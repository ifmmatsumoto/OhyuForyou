package com.c4c.oyfy.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.c4c.oyfy.app.dto.LineDto;
import com.c4c.oyfy.app.dto.StationDto;

@Service
@Transactional
public class StationService {

    private RestTemplate restTemplate = new RestTemplate();

	public LineDto findLineList(String areaname) {

	    /** 沿線検索API リクエストURL */
	    String URL = "http://express.heartrails.com/api/json?method=getLines&prefecture=" + areaname;

	    System.out.println(URL);

	    return restTemplate.getForObject(URL, LineDto.class);
	}

	public StationDto findStationList(String[] linename) {

	    System.out.println("パラメータ" + linename[0]);
	    //TODO: 路線検索結果を元に駅名を取得する
	     /** 沿線検索API リクエストURL */
	     String URL = "http://express.heartrails.com/api/json?method=getStations&line=" + linename[0];

	     System.out.println(URL);

	     return restTemplate.getForObject(URL, StationDto.class);
	 }
}