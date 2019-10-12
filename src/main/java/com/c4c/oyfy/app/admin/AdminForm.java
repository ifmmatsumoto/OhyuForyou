package com.c4c.oyfy.app.admin;

import org.springframework.web.multipart.MultipartFile;

import com.c4c.oyfy.app._Common_Form;
import com.c4c.oyfy.app.search.ResultList;
import com.oyfy.dbflute.exentity.Bath;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AdminForm extends _Common_Form {
    /** 入力フォーム */
    Bath bath = new Bath();
    /** 銭湯一覧リスト */
    ResultList resultList;
    /** 画像受け取り用 */
    MultipartFile inputImage;
    /** 画像表示用 */
    String pvImage;
}
