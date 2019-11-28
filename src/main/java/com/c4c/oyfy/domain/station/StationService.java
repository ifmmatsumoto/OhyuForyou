package com.c4c.oyfy.domain.station;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.c4c.oyfy.app.area.api.LineDto;
import com.c4c.oyfy.app.area.api.StationDto;

@Service
public class StationService {

    private RestTemplate restTemplate = new RestTemplate();

    /**
     * 沿線検索
     * @param areaname
     * @return
     */
    public LineDto findLineList(String areaname) {
        /** 沿線検索API リクエストURL */
        String URL = "http://express.heartrails.com/api/json?method=getLines&prefecture=" + areaname;
        return restTemplate.getForObject(URL, LineDto.class);
    }

    /**
     * 駅検索
     * @param linename
     * @return
     */
    public StationDto findStationList(String linename) {
        /** 駅検索API リクエストURL */
        String URL = "http://express.heartrails.com/api/json?method=getStations&line=" + linename;
        return restTemplate.getForObject(URL, StationDto.class);
    }
}