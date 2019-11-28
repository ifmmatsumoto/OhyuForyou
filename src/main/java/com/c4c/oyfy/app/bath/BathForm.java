package com.c4c.oyfy.app.bath;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.c4c.oyfy.app._Common_Form;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.Review;
import com.oyfy.dbflute.exentity.Tag;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class BathForm extends _Common_Form {
    /** 銭湯ID */
    private int bathId;
    /** 銭湯情報 */
    private Bath bath;
    /** 銭湯種別 */
    private String dispBathType;
    /** 定休日 */
    private String dispBathHoliday;
    /** 24時間フラグ */
    private String dispBath24hFlg;
    /** タグ一覧 */
    private List<Tag> tagList;
    /** 投稿者 */
    @NotBlank(message="サンプル")
    @Size(max=100, message="{max}文字以上です。")
    private String newyorker;
    /** レビュー */
    @NotBlank(message="サンプル")
    @Size(max=2000, message="{max}文字以上です。")
    private String review;
    /** レビュー一覧 */
    private List<Review> reviewList;

}
