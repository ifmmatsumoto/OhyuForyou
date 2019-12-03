package com.c4c.oyfy.app.illust;

import lombok.Data;

@Data
public class IllustItemForm {
    /* タグ名 和名 */
    private String tagNameJa;
    /* イラストタグ */
    private String illustTag;
    /* おじじタグ */
    private String ojijiTag;
    /* イラストタグ */
    private String temperatureTag;
    /** フッター画像切り替え 駅 */
    protected String stationName;
    /** フッター画像切り替え 都道府県 */
    protected String prefectureName;
    /** フッター画像切り替え イラスト */
    protected String illustName;
}
