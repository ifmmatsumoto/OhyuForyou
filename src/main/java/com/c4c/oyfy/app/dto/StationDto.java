package com.c4c.oyfy.app.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class StationDto  implements Serializable{
    private static final long serialVersionUID = 1L;

    private Response response;


}

@Data
class Response {
    List<String> area  = new ArrayList<>() ;
}