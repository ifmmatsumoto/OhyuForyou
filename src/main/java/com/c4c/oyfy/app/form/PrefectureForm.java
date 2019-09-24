package com.c4c.oyfy.app.form;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class PrefectureForm extends _Common_Form {

    private String pref_id;
    private String pref_name;
    private Integer division;

}
