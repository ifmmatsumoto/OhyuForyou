package com.c4c.oyfy.app.top;

import com.c4c.oyfy.app._Common_Form;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TopForm extends _Common_Form {
    /** キーワード */
    String keyword;

    double longitude;
    double latitude;
    int distance;
}
