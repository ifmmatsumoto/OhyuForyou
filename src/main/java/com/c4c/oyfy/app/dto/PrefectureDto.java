package com.c4c.oyfy.app.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PrefectureDto implements Serializable {
    String status;
    List<Prefecture> data;
    @Data
    public static class Prefecture {
      String id;
      String name;
    }
}