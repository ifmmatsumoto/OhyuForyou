package com.c4c.oyfy.app.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PrefectureDto implements Serializable {
    String status;
    List<Dataname> data;
    @Data
    public static class Dataname {
      String id;
      String name;
    }
}