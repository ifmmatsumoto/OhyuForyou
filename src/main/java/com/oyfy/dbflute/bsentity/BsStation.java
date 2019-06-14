package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of station as TABLE. <br>
 * 駅
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     station_code, station_area_code, station_line_code, station_line_name_ja, station_line_name_en, station_g_cd, station_name_ja, station_name_en, station_lon, station_lat, station_image, station_color, create_date, update_date
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
 * Integer stationCode = entity.getStationCode();
 * String stationAreaCode = entity.getStationAreaCode();
 * String stationLineCode = entity.getStationLineCode();
 * String stationLineNameJa = entity.getStationLineNameJa();
 * String stationLineNameEn = entity.getStationLineNameEn();
 * String stationGCd = entity.getStationGCd();
 * String stationNameJa = entity.getStationNameJa();
 * String stationNameEn = entity.getStationNameEn();
 * java.math.BigDecimal stationLon = entity.getStationLon();
 * java.math.BigDecimal stationLat = entity.getStationLat();
 * String stationImage = entity.getStationImage();
 * String stationColor = entity.getStationColor();
 * java.time.LocalDateTime createDate = entity.getCreateDate();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * entity.setStationCode(stationCode);
 * entity.setStationAreaCode(stationAreaCode);
 * entity.setStationLineCode(stationLineCode);
 * entity.setStationLineNameJa(stationLineNameJa);
 * entity.setStationLineNameEn(stationLineNameEn);
 * entity.setStationGCd(stationGCd);
 * entity.setStationNameJa(stationNameJa);
 * entity.setStationNameEn(stationNameEn);
 * entity.setStationLon(stationLon);
 * entity.setStationLat(stationLat);
 * entity.setStationImage(stationImage);
 * entity.setStationColor(stationColor);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsStation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** station_code: {IX, NotNull, INT(10)} */
    protected Integer _stationCode;

    /** station_area_code: {NotNull, VARCHAR(255)} */
    protected String _stationAreaCode;

    /** station_line_code: {NotNull, VARCHAR(255)} */
    protected String _stationLineCode;

    /** station_line_name_ja: {VARCHAR(255)} */
    protected String _stationLineNameJa;

    /** station_line_name_en: {VARCHAR(255)} */
    protected String _stationLineNameEn;

    /** station_g_cd: {VARCHAR(255)} */
    protected String _stationGCd;

    /** station_name_ja: {VARCHAR(255)} */
    protected String _stationNameJa;

    /** station_name_en: {VARCHAR(255)} */
    protected String _stationNameEn;

    /** station_lon: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _stationLon;

    /** station_lat: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _stationLat;

    /** station_image: {VARCHAR(2100)} */
    protected String _stationImage;

    /** station_color: {VARCHAR(255)} */
    protected String _stationColor;

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
        return "station";
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
        if (obj instanceof BsStation) {
            BsStation other = (BsStation)obj;
            if (!xSV(_stationCode, other._stationCode)) { return false; }
            if (!xSV(_stationAreaCode, other._stationAreaCode)) { return false; }
            if (!xSV(_stationLineCode, other._stationLineCode)) { return false; }
            if (!xSV(_stationLineNameJa, other._stationLineNameJa)) { return false; }
            if (!xSV(_stationLineNameEn, other._stationLineNameEn)) { return false; }
            if (!xSV(_stationGCd, other._stationGCd)) { return false; }
            if (!xSV(_stationNameJa, other._stationNameJa)) { return false; }
            if (!xSV(_stationNameEn, other._stationNameEn)) { return false; }
            if (!xSV(_stationLon, other._stationLon)) { return false; }
            if (!xSV(_stationLat, other._stationLat)) { return false; }
            if (!xSV(_stationImage, other._stationImage)) { return false; }
            if (!xSV(_stationColor, other._stationColor)) { return false; }
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
        hs = xCH(hs, _stationCode);
        hs = xCH(hs, _stationAreaCode);
        hs = xCH(hs, _stationLineCode);
        hs = xCH(hs, _stationLineNameJa);
        hs = xCH(hs, _stationLineNameEn);
        hs = xCH(hs, _stationGCd);
        hs = xCH(hs, _stationNameJa);
        hs = xCH(hs, _stationNameEn);
        hs = xCH(hs, _stationLon);
        hs = xCH(hs, _stationLat);
        hs = xCH(hs, _stationImage);
        hs = xCH(hs, _stationColor);
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
        sb.append(dm).append(xfND(_stationCode));
        sb.append(dm).append(xfND(_stationAreaCode));
        sb.append(dm).append(xfND(_stationLineCode));
        sb.append(dm).append(xfND(_stationLineNameJa));
        sb.append(dm).append(xfND(_stationLineNameEn));
        sb.append(dm).append(xfND(_stationGCd));
        sb.append(dm).append(xfND(_stationNameJa));
        sb.append(dm).append(xfND(_stationNameEn));
        sb.append(dm).append(xfND(_stationLon));
        sb.append(dm).append(xfND(_stationLat));
        sb.append(dm).append(xfND(_stationImage));
        sb.append(dm).append(xfND(_stationColor));
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
    public Station clone() {
        return (Station)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] station_code: {IX, NotNull, INT(10)} <br>
     * 駅コード
     * @return The value of the column 'station_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStationCode() {
        checkSpecifiedProperty("stationCode");
        return _stationCode;
    }

    /**
     * [set] station_code: {IX, NotNull, INT(10)} <br>
     * 駅コード
     * @param stationCode The value of the column 'station_code'. (basically NotNull if update: for the constraint)
     */
    public void setStationCode(Integer stationCode) {
        registerModifiedProperty("stationCode");
        _stationCode = stationCode;
    }

    /**
     * [get] station_area_code: {NotNull, VARCHAR(255)} <br>
     * 都道府県コード
     * @return The value of the column 'station_area_code'. (basically NotNull if selected: for the constraint)
     */
    public String getStationAreaCode() {
        checkSpecifiedProperty("stationAreaCode");
        return _stationAreaCode;
    }

    /**
     * [set] station_area_code: {NotNull, VARCHAR(255)} <br>
     * 都道府県コード
     * @param stationAreaCode The value of the column 'station_area_code'. (basically NotNull if update: for the constraint)
     */
    public void setStationAreaCode(String stationAreaCode) {
        registerModifiedProperty("stationAreaCode");
        _stationAreaCode = stationAreaCode;
    }

    /**
     * [get] station_line_code: {NotNull, VARCHAR(255)} <br>
     * 沿線コード
     * @return The value of the column 'station_line_code'. (basically NotNull if selected: for the constraint)
     */
    public String getStationLineCode() {
        checkSpecifiedProperty("stationLineCode");
        return _stationLineCode;
    }

    /**
     * [set] station_line_code: {NotNull, VARCHAR(255)} <br>
     * 沿線コード
     * @param stationLineCode The value of the column 'station_line_code'. (basically NotNull if update: for the constraint)
     */
    public void setStationLineCode(String stationLineCode) {
        registerModifiedProperty("stationLineCode");
        _stationLineCode = stationLineCode;
    }

    /**
     * [get] station_line_name_ja: {VARCHAR(255)} <br>
     * 沿線名 和名
     * @return The value of the column 'station_line_name_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationLineNameJa() {
        checkSpecifiedProperty("stationLineNameJa");
        return _stationLineNameJa;
    }

    /**
     * [set] station_line_name_ja: {VARCHAR(255)} <br>
     * 沿線名 和名
     * @param stationLineNameJa The value of the column 'station_line_name_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationLineNameJa(String stationLineNameJa) {
        registerModifiedProperty("stationLineNameJa");
        _stationLineNameJa = stationLineNameJa;
    }

    /**
     * [get] station_line_name_en: {VARCHAR(255)} <br>
     * 沿線名 英名
     * @return The value of the column 'station_line_name_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationLineNameEn() {
        checkSpecifiedProperty("stationLineNameEn");
        return _stationLineNameEn;
    }

    /**
     * [set] station_line_name_en: {VARCHAR(255)} <br>
     * 沿線名 英名
     * @param stationLineNameEn The value of the column 'station_line_name_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationLineNameEn(String stationLineNameEn) {
        registerModifiedProperty("stationLineNameEn");
        _stationLineNameEn = stationLineNameEn;
    }

    /**
     * [get] station_g_cd: {VARCHAR(255)} <br>
     * 駅グループコード
     * @return The value of the column 'station_g_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationGCd() {
        checkSpecifiedProperty("stationGCd");
        return _stationGCd;
    }

    /**
     * [set] station_g_cd: {VARCHAR(255)} <br>
     * 駅グループコード
     * @param stationGCd The value of the column 'station_g_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationGCd(String stationGCd) {
        registerModifiedProperty("stationGCd");
        _stationGCd = stationGCd;
    }

    /**
     * [get] station_name_ja: {VARCHAR(255)} <br>
     * 駅名 和名
     * @return The value of the column 'station_name_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationNameJa() {
        checkSpecifiedProperty("stationNameJa");
        return _stationNameJa;
    }

    /**
     * [set] station_name_ja: {VARCHAR(255)} <br>
     * 駅名 和名
     * @param stationNameJa The value of the column 'station_name_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationNameJa(String stationNameJa) {
        registerModifiedProperty("stationNameJa");
        _stationNameJa = stationNameJa;
    }

    /**
     * [get] station_name_en: {VARCHAR(255)} <br>
     * 駅名 英名
     * @return The value of the column 'station_name_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationNameEn() {
        checkSpecifiedProperty("stationNameEn");
        return _stationNameEn;
    }

    /**
     * [set] station_name_en: {VARCHAR(255)} <br>
     * 駅名 英名
     * @param stationNameEn The value of the column 'station_name_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationNameEn(String stationNameEn) {
        registerModifiedProperty("stationNameEn");
        _stationNameEn = stationNameEn;
    }

    /**
     * [get] station_lon: {DOUBLE(9, 6)} <br>
     * 経度
     * @return The value of the column 'station_lon'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStationLon() {
        checkSpecifiedProperty("stationLon");
        return _stationLon;
    }

    /**
     * [set] station_lon: {DOUBLE(9, 6)} <br>
     * 経度
     * @param stationLon The value of the column 'station_lon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationLon(java.math.BigDecimal stationLon) {
        registerModifiedProperty("stationLon");
        _stationLon = stationLon;
    }

    /**
     * [get] station_lat: {DOUBLE(9, 6)} <br>
     * 緯度
     * @return The value of the column 'station_lat'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStationLat() {
        checkSpecifiedProperty("stationLat");
        return _stationLat;
    }

    /**
     * [set] station_lat: {DOUBLE(9, 6)} <br>
     * 緯度
     * @param stationLat The value of the column 'station_lat'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationLat(java.math.BigDecimal stationLat) {
        registerModifiedProperty("stationLat");
        _stationLat = stationLat;
    }

    /**
     * [get] station_image: {VARCHAR(2100)} <br>
     * アイコン画像
     * @return The value of the column 'station_image'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationImage() {
        checkSpecifiedProperty("stationImage");
        return _stationImage;
    }

    /**
     * [set] station_image: {VARCHAR(2100)} <br>
     * アイコン画像
     * @param stationImage The value of the column 'station_image'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationImage(String stationImage) {
        registerModifiedProperty("stationImage");
        _stationImage = stationImage;
    }

    /**
     * [get] station_color: {VARCHAR(255)} <br>
     * カラーコード
     * @return The value of the column 'station_color'. (NullAllowed even if selected: for no constraint)
     */
    public String getStationColor() {
        checkSpecifiedProperty("stationColor");
        return _stationColor;
    }

    /**
     * [set] station_color: {VARCHAR(255)} <br>
     * カラーコード
     * @param stationColor The value of the column 'station_color'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationColor(String stationColor) {
        registerModifiedProperty("stationColor");
        _stationColor = stationColor;
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
