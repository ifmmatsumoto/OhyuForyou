package com.c4c.oyfy.app.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PrefectureDto implements Serializable {
        String status;
        Datum data;
        @Data
        public class Datum {
            List<Prefectuer> data;
            @Data
            public class Prefectuer {
            String id;
            String name;
            }
        }
}
