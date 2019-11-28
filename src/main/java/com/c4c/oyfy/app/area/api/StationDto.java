package com.c4c.oyfy.app.area.api;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class StationDto implements Serializable {
    /** APIの戻り値 */
    Response response;
    @Data
    public static class Response {
        public List<Station> station;
        @Data
        public static class Station {
            String name;
            String prefecture;
            float x;
            float y;
            String postal;
            String prev;
            String next;
        }
    }
}
