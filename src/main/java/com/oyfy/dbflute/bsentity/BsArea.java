package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of area as TABLE. <br>
 * エリア
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     city_code, city_name_ja, city_name_en, city_image, city_color, create_date, update_date
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer cityCode = entity.getCityCode();
 * String cityNameJa = entity.getCityNameJa();
 * String cityNameEn = entity.getCityNameEn();
 * String cityImage = entity.getCityImage();
 * String cityColor = entity.getCityColor();
 * java.time.LocalDateTime createDate = entity.getCreateDate();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * entity.setCityCode(cityCode);
 * entity.setCityNameJa(cityNameJa);
 * entity.setCityNameEn(cityNameEn);
 * entity.setCityImage(cityImage);
 * entity.setCityColor(cityColor);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsArea extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** city_code: {IX, NotNull, INT(10)} */
    protected Integer _cityCode;

    /** city_name_ja: {NotNull, VARCHAR(255)} */
    protected String _cityNameJa;

    /** city_name_en: {NotNull, VARCHAR(255)} */
    protected String _cityNameEn;

    /** city_image: {VARCHAR(2100)} */
    protected String _cityImage;

    /** city_color: {VARCHAR(255)} */
    protected String _cityColor;

    /** create_date: {DATETIME(19)} */
    protected java.time.LocalDateTime _createDate;

    /** update_date: {DATETIME(19)} */
    protected java.time.LocalDateTime _updateDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "area";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsArea) {
            BsArea other = (BsArea)obj;
            if (!xSV(_cityCode, other._cityCode)) { return false; }
            if (!xSV(_cityNameJa, other._cityNameJa)) { return false; }
            if (!xSV(_cityNameEn, other._cityNameEn)) { return false; }
            if (!xSV(_cityImage, other._cityImage)) { return false; }
            if (!xSV(_cityColor, other._cityColor)) { return false; }
            if (!xSV(_createDate, other._createDate)) { return false; }
            if (!xSV(_updateDate, other._updateDate)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cityCode);
        hs = xCH(hs, _cityNameJa);
        hs = xCH(hs, _cityNameEn);
        hs = xCH(hs, _cityImage);
        hs = xCH(hs, _cityColor);
        hs = xCH(hs, _createDate);
        hs = xCH(hs, _updateDate);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cityCode));
        sb.append(dm).append(xfND(_cityNameJa));
        sb.append(dm).append(xfND(_cityNameEn));
        sb.append(dm).append(xfND(_cityImage));
        sb.append(dm).append(xfND(_cityColor));
        sb.append(dm).append(xfND(_createDate));
        sb.append(dm).append(xfND(_updateDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Area clone() {
        return (Area)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] city_code: {IX, NotNull, INT(10)} <br>
     * 市区町村コード
     * @return The value of the column 'city_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCityCode() {
        checkSpecifiedProperty("cityCode");
        return _cityCode;
    }

    /**
     * [set] city_code: {IX, NotNull, INT(10)} <br>
     * 市区町村コード
     * @param cityCode The value of the column 'city_code'. (basically NotNull if update: for the constraint)
     */
    public void setCityCode(Integer cityCode) {
        registerModifiedProperty("cityCode");
        _cityCode = cityCode;
    }

    /**
     * [get] city_name_ja: {NotNull, VARCHAR(255)} <br>
     * 市区町村名 和名
     * @return The value of the column 'city_name_ja'. (basically NotNull if selected: for the constraint)
     */
    public String getCityNameJa() {
        checkSpecifiedProperty("cityNameJa");
        return _cityNameJa;
    }

    /**
     * [set] city_name_ja: {NotNull, VARCHAR(255)} <br>
     * 市区町村名 和名
     * @param cityNameJa The value of the column 'city_name_ja'. (basically NotNull if update: for the constraint)
     */
    public void setCityNameJa(String cityNameJa) {
        registerModifiedProperty("cityNameJa");
        _cityNameJa = cityNameJa;
    }

    /**
     * [get] city_name_en: {NotNull, VARCHAR(255)} <br>
     * 市区町村名 英名
     * @return The value of the column 'city_name_en'. (basically NotNull if selected: for the constraint)
     */
    public String getCityNameEn() {
        checkSpecifiedProperty("cityNameEn");
        return _cityNameEn;
    }

    /**
     * [set] city_name_en: {NotNull, VARCHAR(255)} <br>
     * 市区町村名 英名
     * @param cityNameEn The value of the column 'city_name_en'. (basically NotNull if update: for the constraint)
     */
    public void setCityNameEn(String cityNameEn) {
        registerModifiedProperty("cityNameEn");
        _cityNameEn = cityNameEn;
    }

    /**
     * [get] city_image: {VARCHAR(2100)} <br>
     * アイコン画像
     * @return The value of the column 'city_image'. (NullAllowed even if selected: for no constraint)
     */
    public String getCityImage() {
        checkSpecifiedProperty("cityImage");
        return _cityImage;
    }

    /**
     * [set] city_image: {VARCHAR(2100)} <br>
     * アイコン画像
     * @param cityImage The value of the column 'city_image'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCityImage(String cityImage) {
        registerModifiedProperty("cityImage");
        _cityImage = cityImage;
    }

    /**
     * [get] city_color: {VARCHAR(255)} <br>
     * カラーコード
     * @return The value of the column 'city_color'. (NullAllowed even if selected: for no constraint)
     */
    public String getCityColor() {
        checkSpecifiedProperty("cityColor");
        return _cityColor;
    }

    /**
     * [set] city_color: {VARCHAR(255)} <br>
     * カラーコード
     * @param cityColor The value of the column 'city_color'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCityColor(String cityColor) {
        registerModifiedProperty("cityColor");
        _cityColor = cityColor;
    }

    /**
     * [get] create_date: {DATETIME(19)} <br>
     * 作成日時
     * @return The value of the column 'create_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getCreateDate() {
        checkSpecifiedProperty("createDate");
        return _createDate;
    }

    /**
     * [set] create_date: {DATETIME(19)} <br>
     * 作成日時
     * @param createDate The value of the column 'create_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDate(java.time.LocalDateTime createDate) {
        registerModifiedProperty("createDate");
        _createDate = createDate;
    }

    /**
     * [get] update_date: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'update_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDate() {
        checkSpecifiedProperty("updateDate");
        return _updateDate;
    }

    /**
     * [set] update_date: {DATETIME(19)} <br>
     * 更新日時
     * @param updateDate The value of the column 'update_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDate(java.time.LocalDateTime updateDate) {
        registerModifiedProperty("updateDate");
        _updateDate = updateDate;
    }
}
