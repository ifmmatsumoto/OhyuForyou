package com.c4c.oyfy.app.admin;

import com.c4c.oyfy.app._Common_Form;
import com.c4c.oyfy.app.search.ResultList;
import com.oyfy.dbflute.exentity.Bath;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AdminForm extends _Common_Form {
    Bath bath = new Bath();
    ResultList resultList;
}
