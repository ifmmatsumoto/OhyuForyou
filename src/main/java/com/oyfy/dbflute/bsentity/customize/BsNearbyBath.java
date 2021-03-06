package com.oyfy.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oyfy.dbflute.exentity.customize.*;

/**
 * The entity of NearbyBath. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     bath_id, bath_name_ja, bath_name_en, bath_image, bath_address_ja, bath_address_en, bath_tel, bath_detail, bath_fee, bath_type, bath_24h_flg, bath_time_st, bath_time_ed, bath_near_station, bath_place_lat, bath_place_lon, bath_temperature_up, bath_temperature_low, bath_holiday, del_flg, create_date, update_date, distance
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
 * Integer bathId = entity.getBathId();
 * String bathNameJa = entity.getBathNameJa();
 * String bathNameEn = entity.getBathNameEn();
 * String bathImage = entity.getBathImage();
 * String bathAddressJa = entity.getBathAddressJa();
 * String bathAddressEn = entity.getBathAddressEn();
 * String bathTel = entity.getBathTel();
 * String bathDetail = entity.getBathDetail();
 * Integer bathFee = entity.getBathFee();
 * Integer bathType = entity.getBathType();
 * Integer bath24hFlg = entity.getBath24hFlg();
 * java.time.LocalTime bathTimeSt = entity.getBathTimeSt();
 * java.time.LocalTime bathTimeEd = entity.getBathTimeEd();
 * String bathNearStation = entity.getBathNearStation();
 * java.math.BigDecimal bathPlaceLat = entity.getBathPlaceLat();
 * java.math.BigDecimal bathPlaceLon = entity.getBathPlaceLon();
 * java.math.BigDecimal bathTemperatureUp = entity.getBathTemperatureUp();
 * java.math.BigDecimal bathTemperatureLow = entity.getBathTemperatureLow();
 * Integer bathHoliday = entity.getBathHoliday();
 * Integer delFlg = entity.getDelFlg();
 * java.time.LocalDateTime createDate = entity.getCreateDate();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * java.math.BigDecimal distance = entity.getDistance();
 * entity.setBathId(bathId);
 * entity.setBathNameJa(bathNameJa);
 * entity.setBathNameEn(bathNameEn);
 * entity.setBathImage(bathImage);
 * entity.setBathAddressJa(bathAddressJa);
 * entity.setBathAddressEn(bathAddressEn);
 * entity.setBathTel(bathTel);
 * entity.setBathDetail(bathDetail);
 * entity.setBathFee(bathFee);
 * entity.setBathType(bathType);
 * entity.setBath24hFlg(bath24hFlg);
 * entity.setBathTimeSt(bathTimeSt);
 * entity.setBathTimeEd(bathTimeEd);
 * entity.setBathNearStation(bathNearStation);
 * entity.setBathPlaceLat(bathPlaceLat);
 * entity.setBathPlaceLon(bathPlaceLon);
 * entity.setBathTemperatureUp(bathTemperatureUp);
 * entity.setBathTemperatureLow(bathTemperatureLow);
 * entity.setBathHoliday(bathHoliday);
 * entity.setDelFlg(delFlg);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * entity.setDistance(distance);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNearbyBath extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** bath_id: {INT(11), refers to bath.bath_id} */
    protected Integer _bathId;

    /** bath_name_ja: {VARCHAR(255), refers to bath.bath_name_ja} */
    protected String _bathNameJa;

    /** bath_name_en: {VARCHAR(255), refers to bath.bath_name_en} */
    protected String _bathNameEn;

    /** bath_image: {VARCHAR(715827882), refers to bath.bath_image} */
    protected String _bathImage;

    /** bath_address_ja: {VARCHAR(255), refers to bath.bath_address_ja} */
    protected String _bathAddressJa;

    /** bath_address_en: {VARCHAR(255), refers to bath.bath_address_en} */
    protected String _bathAddressEn;

    /** bath_tel: {VARCHAR(15), refers to bath.bath_tel} */
    protected String _bathTel;

    /** bath_detail: {VARCHAR(21845), refers to bath.bath_detail} */
    protected String _bathDetail;

    /** bath_fee: {INT(11), refers to bath.bath_fee} */
    protected Integer _bathFee;

    /** bath_type: {INT(2), refers to bath.bath_type} */
    protected Integer _bathType;

    /** bath_24h_flg: {INT(1), refers to bath.bath_24h_flg} */
    protected Integer _bath24hFlg;

    /** bath_time_st: {TIME(10), refers to bath.bath_time_st} */
    protected java.time.LocalTime _bathTimeSt;

    /** bath_time_ed: {TIME(10), refers to bath.bath_time_ed} */
    protected java.time.LocalTime _bathTimeEd;

    /** bath_near_station: {VARCHAR(255), refers to bath.bath_near_station} */
    protected String _bathNearStation;

    /** bath_place_lat: {DOUBLE(9, 6), refers to bath.bath_place_lat} */
    protected java.math.BigDecimal _bathPlaceLat;

    /** bath_place_lon: {DOUBLE(9, 6), refers to bath.bath_place_lon} */
    protected java.math.BigDecimal _bathPlaceLon;

    /** bath_temperature_up: {FLOAT(12, 31), refers to bath.bath_temperature_up} */
    protected java.math.BigDecimal _bathTemperatureUp;

    /** bath_temperature_low: {FLOAT(12, 31), refers to bath.bath_temperature_low} */
    protected java.math.BigDecimal _bathTemperatureLow;

    /** bath_holiday: {INT(3), refers to bath.bath_holiday} */
    protected Integer _bathHoliday;

    /** del_flg: {INT(1), refers to bath.del_flg} */
    protected Integer _delFlg;

    /** create_date: {DATETIME(19), refers to bath.create_date} */
    protected java.time.LocalDateTime _createDate;

    /** update_date: {DATETIME(19), refers to bath.update_date} */
    protected java.time.LocalDateTime _updateDate;

    /** distance: {DOUBLE(23, 31)} */
    protected java.math.BigDecimal _distance;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oyfy.dbflute.bsentity.customize.dbmeta.NearbyBathDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "NearbyBath";
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
        if (obj instanceof BsNearbyBath) {
            BsNearbyBath other = (BsNearbyBath)obj;
            if (!xSV(_bathId, other._bathId)) { return false; }
            if (!xSV(_bathNameJa, other._bathNameJa)) { return false; }
            if (!xSV(_bathNameEn, other._bathNameEn)) { return false; }
            if (!xSV(_bathImage, other._bathImage)) { return false; }
            if (!xSV(_bathAddressJa, other._bathAddressJa)) { return false; }
            if (!xSV(_bathAddressEn, other._bathAddressEn)) { return false; }
            if (!xSV(_bathTel, other._bathTel)) { return false; }
            if (!xSV(_bathDetail, other._bathDetail)) { return false; }
            if (!xSV(_bathFee, other._bathFee)) { return false; }
            if (!xSV(_bathType, other._bathType)) { return false; }
            if (!xSV(_bath24hFlg, other._bath24hFlg)) { return false; }
            if (!xSV(_bathTimeSt, other._bathTimeSt)) { return false; }
            if (!xSV(_bathTimeEd, other._bathTimeEd)) { return false; }
            if (!xSV(_bathNearStation, other._bathNearStation)) { return false; }
            if (!xSV(_bathPlaceLat, other._bathPlaceLat)) { return false; }
            if (!xSV(_bathPlaceLon, other._bathPlaceLon)) { return false; }
            if (!xSV(_bathTemperatureUp, other._bathTemperatureUp)) { return false; }
            if (!xSV(_bathTemperatureLow, other._bathTemperatureLow)) { return false; }
            if (!xSV(_bathHoliday, other._bathHoliday)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_createDate, other._createDate)) { return false; }
            if (!xSV(_updateDate, other._updateDate)) { return false; }
            if (!xSV(_distance, other._distance)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bathId);
        hs = xCH(hs, _bathNameJa);
        hs = xCH(hs, _bathNameEn);
        hs = xCH(hs, _bathImage);
        hs = xCH(hs, _bathAddressJa);
        hs = xCH(hs, _bathAddressEn);
        hs = xCH(hs, _bathTel);
        hs = xCH(hs, _bathDetail);
        hs = xCH(hs, _bathFee);
        hs = xCH(hs, _bathType);
        hs = xCH(hs, _bath24hFlg);
        hs = xCH(hs, _bathTimeSt);
        hs = xCH(hs, _bathTimeEd);
        hs = xCH(hs, _bathNearStation);
        hs = xCH(hs, _bathPlaceLat);
        hs = xCH(hs, _bathPlaceLon);
        hs = xCH(hs, _bathTemperatureUp);
        hs = xCH(hs, _bathTemperatureLow);
        hs = xCH(hs, _bathHoliday);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _createDate);
        hs = xCH(hs, _updateDate);
        hs = xCH(hs, _distance);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bathId));
        sb.append(dm).append(xfND(_bathNameJa));
        sb.append(dm).append(xfND(_bathNameEn));
        sb.append(dm).append(xfND(_bathImage));
        sb.append(dm).append(xfND(_bathAddressJa));
        sb.append(dm).append(xfND(_bathAddressEn));
        sb.append(dm).append(xfND(_bathTel));
        sb.append(dm).append(xfND(_bathDetail));
        sb.append(dm).append(xfND(_bathFee));
        sb.append(dm).append(xfND(_bathType));
        sb.append(dm).append(xfND(_bath24hFlg));
        sb.append(dm).append(xfND(_bathTimeSt));
        sb.append(dm).append(xfND(_bathTimeEd));
        sb.append(dm).append(xfND(_bathNearStation));
        sb.append(dm).append(xfND(_bathPlaceLat));
        sb.append(dm).append(xfND(_bathPlaceLon));
        sb.append(dm).append(xfND(_bathTemperatureUp));
        sb.append(dm).append(xfND(_bathTemperatureLow));
        sb.append(dm).append(xfND(_bathHoliday));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_createDate));
        sb.append(dm).append(xfND(_updateDate));
        sb.append(dm).append(xfND(_distance));
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
    public NearbyBath clone() {
        return (NearbyBath)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bath_id: {INT(11), refers to bath.bath_id} <br>
     * 銭湯ID
     * @return The value of the column 'bath_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathId() {
        checkSpecifiedProperty("bathId");
        return _bathId;
    }

    /**
     * [set] bath_id: {INT(11), refers to bath.bath_id} <br>
     * 銭湯ID
     * @param bathId The value of the column 'bath_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathId(Integer bathId) {
        registerModifiedProperty("bathId");
        _bathId = bathId;
    }

    /**
     * [get] bath_name_ja: {VARCHAR(255), refers to bath.bath_name_ja} <br>
     * 銭湯 和名
     * @return The value of the column 'bath_name_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathNameJa() {
        checkSpecifiedProperty("bathNameJa");
        return _bathNameJa;
    }

    /**
     * [set] bath_name_ja: {VARCHAR(255), refers to bath.bath_name_ja} <br>
     * 銭湯 和名
     * @param bathNameJa The value of the column 'bath_name_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathNameJa(String bathNameJa) {
        registerModifiedProperty("bathNameJa");
        _bathNameJa = bathNameJa;
    }

    /**
     * [get] bath_name_en: {VARCHAR(255), refers to bath.bath_name_en} <br>
     * 銭湯 英名
     * @return The value of the column 'bath_name_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathNameEn() {
        checkSpecifiedProperty("bathNameEn");
        return _bathNameEn;
    }

    /**
     * [set] bath_name_en: {VARCHAR(255), refers to bath.bath_name_en} <br>
     * 銭湯 英名
     * @param bathNameEn The value of the column 'bath_name_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathNameEn(String bathNameEn) {
        registerModifiedProperty("bathNameEn");
        _bathNameEn = bathNameEn;
    }

    /**
     * [get] bath_image: {VARCHAR(715827882), refers to bath.bath_image} <br>
     * @return The value of the column 'bath_image'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathImage() {
        checkSpecifiedProperty("bathImage");
        return _bathImage;
    }

    /**
     * [set] bath_image: {VARCHAR(715827882), refers to bath.bath_image} <br>
     * @param bathImage The value of the column 'bath_image'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathImage(String bathImage) {
        registerModifiedProperty("bathImage");
        _bathImage = bathImage;
    }

    /**
     * [get] bath_address_ja: {VARCHAR(255), refers to bath.bath_address_ja} <br>
     * 住所 和名
     * @return The value of the column 'bath_address_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathAddressJa() {
        checkSpecifiedProperty("bathAddressJa");
        return _bathAddressJa;
    }

    /**
     * [set] bath_address_ja: {VARCHAR(255), refers to bath.bath_address_ja} <br>
     * 住所 和名
     * @param bathAddressJa The value of the column 'bath_address_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAddressJa(String bathAddressJa) {
        registerModifiedProperty("bathAddressJa");
        _bathAddressJa = bathAddressJa;
    }

    /**
     * [get] bath_address_en: {VARCHAR(255), refers to bath.bath_address_en} <br>
     * 住所 英名
     * @return The value of the column 'bath_address_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathAddressEn() {
        checkSpecifiedProperty("bathAddressEn");
        return _bathAddressEn;
    }

    /**
     * [set] bath_address_en: {VARCHAR(255), refers to bath.bath_address_en} <br>
     * 住所 英名
     * @param bathAddressEn The value of the column 'bath_address_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAddressEn(String bathAddressEn) {
        registerModifiedProperty("bathAddressEn");
        _bathAddressEn = bathAddressEn;
    }

    /**
     * [get] bath_tel: {VARCHAR(15), refers to bath.bath_tel} <br>
     * 電話番号
     * @return The value of the column 'bath_tel'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathTel() {
        checkSpecifiedProperty("bathTel");
        return _bathTel;
    }

    /**
     * [set] bath_tel: {VARCHAR(15), refers to bath.bath_tel} <br>
     * 電話番号
     * @param bathTel The value of the column 'bath_tel'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTel(String bathTel) {
        registerModifiedProperty("bathTel");
        _bathTel = bathTel;
    }

    /**
     * [get] bath_detail: {VARCHAR(21845), refers to bath.bath_detail} <br>
     * 詳細情報
     * @return The value of the column 'bath_detail'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathDetail() {
        checkSpecifiedProperty("bathDetail");
        return _bathDetail;
    }

    /**
     * [set] bath_detail: {VARCHAR(21845), refers to bath.bath_detail} <br>
     * 詳細情報
     * @param bathDetail The value of the column 'bath_detail'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathDetail(String bathDetail) {
        registerModifiedProperty("bathDetail");
        _bathDetail = bathDetail;
    }

    /**
     * [get] bath_fee: {INT(11), refers to bath.bath_fee} <br>
     * 一般入浴料
     * @return The value of the column 'bath_fee'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathFee() {
        checkSpecifiedProperty("bathFee");
        return _bathFee;
    }

    /**
     * [set] bath_fee: {INT(11), refers to bath.bath_fee} <br>
     * 一般入浴料
     * @param bathFee The value of the column 'bath_fee'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathFee(Integer bathFee) {
        registerModifiedProperty("bathFee");
        _bathFee = bathFee;
    }

    /**
     * [get] bath_type: {INT(2), refers to bath.bath_type} <br>
     * 銭湯種別(10:銭湯 20:スーパー銭湯)
     * @return The value of the column 'bath_type'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathType() {
        checkSpecifiedProperty("bathType");
        return _bathType;
    }

    /**
     * [set] bath_type: {INT(2), refers to bath.bath_type} <br>
     * 銭湯種別(10:銭湯 20:スーパー銭湯)
     * @param bathType The value of the column 'bath_type'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathType(Integer bathType) {
        registerModifiedProperty("bathType");
        _bathType = bathType;
    }

    /**
     * [get] bath_24h_flg: {INT(1), refers to bath.bath_24h_flg} <br>
     * 24時間フラグ(1:24時間営業)
     * @return The value of the column 'bath_24h_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBath24hFlg() {
        checkSpecifiedProperty("bath24hFlg");
        return _bath24hFlg;
    }

    /**
     * [set] bath_24h_flg: {INT(1), refers to bath.bath_24h_flg} <br>
     * 24時間フラグ(1:24時間営業)
     * @param bath24hFlg The value of the column 'bath_24h_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBath24hFlg(Integer bath24hFlg) {
        registerModifiedProperty("bath24hFlg");
        _bath24hFlg = bath24hFlg;
    }

    /**
     * [get] bath_time_st: {TIME(10), refers to bath.bath_time_st} <br>
     * 営業時間 開始
     * @return The value of the column 'bath_time_st'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getBathTimeSt() {
        checkSpecifiedProperty("bathTimeSt");
        return _bathTimeSt;
    }

    /**
     * [set] bath_time_st: {TIME(10), refers to bath.bath_time_st} <br>
     * 営業時間 開始
     * @param bathTimeSt The value of the column 'bath_time_st'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTimeSt(java.time.LocalTime bathTimeSt) {
        registerModifiedProperty("bathTimeSt");
        _bathTimeSt = bathTimeSt;
    }

    /**
     * [get] bath_time_ed: {TIME(10), refers to bath.bath_time_ed} <br>
     * 営業時間 終了
     * @return The value of the column 'bath_time_ed'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getBathTimeEd() {
        checkSpecifiedProperty("bathTimeEd");
        return _bathTimeEd;
    }

    /**
     * [set] bath_time_ed: {TIME(10), refers to bath.bath_time_ed} <br>
     * 営業時間 終了
     * @param bathTimeEd The value of the column 'bath_time_ed'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTimeEd(java.time.LocalTime bathTimeEd) {
        registerModifiedProperty("bathTimeEd");
        _bathTimeEd = bathTimeEd;
    }

    /**
     * [get] bath_near_station: {VARCHAR(255), refers to bath.bath_near_station} <br>
     * 最寄り駅
     * @return The value of the column 'bath_near_station'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathNearStation() {
        checkSpecifiedProperty("bathNearStation");
        return _bathNearStation;
    }

    /**
     * [set] bath_near_station: {VARCHAR(255), refers to bath.bath_near_station} <br>
     * 最寄り駅
     * @param bathNearStation The value of the column 'bath_near_station'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathNearStation(String bathNearStation) {
        registerModifiedProperty("bathNearStation");
        _bathNearStation = bathNearStation;
    }

    /**
     * [get] bath_place_lat: {DOUBLE(9, 6), refers to bath.bath_place_lat} <br>
     * 位置情報 緯度
     * @return The value of the column 'bath_place_lat'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathPlaceLat() {
        checkSpecifiedProperty("bathPlaceLat");
        return _bathPlaceLat;
    }

    /**
     * [set] bath_place_lat: {DOUBLE(9, 6), refers to bath.bath_place_lat} <br>
     * 位置情報 緯度
     * @param bathPlaceLat The value of the column 'bath_place_lat'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathPlaceLat(java.math.BigDecimal bathPlaceLat) {
        registerModifiedProperty("bathPlaceLat");
        _bathPlaceLat = bathPlaceLat;
    }

    /**
     * [get] bath_place_lon: {DOUBLE(9, 6), refers to bath.bath_place_lon} <br>
     * 位置情報 経度
     * @return The value of the column 'bath_place_lon'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathPlaceLon() {
        checkSpecifiedProperty("bathPlaceLon");
        return _bathPlaceLon;
    }

    /**
     * [set] bath_place_lon: {DOUBLE(9, 6), refers to bath.bath_place_lon} <br>
     * 位置情報 経度
     * @param bathPlaceLon The value of the column 'bath_place_lon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathPlaceLon(java.math.BigDecimal bathPlaceLon) {
        registerModifiedProperty("bathPlaceLon");
        _bathPlaceLon = bathPlaceLon;
    }

    /**
     * [get] bath_temperature_up: {FLOAT(12, 31), refers to bath.bath_temperature_up} <br>
     * 温度 上限
     * @return The value of the column 'bath_temperature_up'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathTemperatureUp() {
        checkSpecifiedProperty("bathTemperatureUp");
        return _bathTemperatureUp;
    }

    /**
     * [set] bath_temperature_up: {FLOAT(12, 31), refers to bath.bath_temperature_up} <br>
     * 温度 上限
     * @param bathTemperatureUp The value of the column 'bath_temperature_up'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTemperatureUp(java.math.BigDecimal bathTemperatureUp) {
        registerModifiedProperty("bathTemperatureUp");
        _bathTemperatureUp = bathTemperatureUp;
    }

    /**
     * [get] bath_temperature_low: {FLOAT(12, 31), refers to bath.bath_temperature_low} <br>
     * 温度 下限
     * @return The value of the column 'bath_temperature_low'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathTemperatureLow() {
        checkSpecifiedProperty("bathTemperatureLow");
        return _bathTemperatureLow;
    }

    /**
     * [set] bath_temperature_low: {FLOAT(12, 31), refers to bath.bath_temperature_low} <br>
     * 温度 下限
     * @param bathTemperatureLow The value of the column 'bath_temperature_low'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTemperatureLow(java.math.BigDecimal bathTemperatureLow) {
        registerModifiedProperty("bathTemperatureLow");
        _bathTemperatureLow = bathTemperatureLow;
    }

    /**
     * [get] bath_holiday: {INT(3), refers to bath.bath_holiday} <br>
     * 定休日(ビット演算で判定 1:日 2:月 4:火 8:水 16:木 32:金 64:土)
     * @return The value of the column 'bath_holiday'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathHoliday() {
        checkSpecifiedProperty("bathHoliday");
        return _bathHoliday;
    }

    /**
     * [set] bath_holiday: {INT(3), refers to bath.bath_holiday} <br>
     * 定休日(ビット演算で判定 1:日 2:月 4:火 8:水 16:木 32:金 64:土)
     * @param bathHoliday The value of the column 'bath_holiday'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathHoliday(Integer bathHoliday) {
        registerModifiedProperty("bathHoliday");
        _bathHoliday = bathHoliday;
    }

    /**
     * [get] del_flg: {INT(1), refers to bath.del_flg} <br>
     * 削除フラグ(1:削除済み)
     * @return The value of the column 'del_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] del_flg: {INT(1), refers to bath.del_flg} <br>
     * 削除フラグ(1:削除済み)
     * @param delFlg The value of the column 'del_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(Integer delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] create_date: {DATETIME(19), refers to bath.create_date} <br>
     * 作成日時
     * @return The value of the column 'create_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getCreateDate() {
        checkSpecifiedProperty("createDate");
        return _createDate;
    }

    /**
     * [set] create_date: {DATETIME(19), refers to bath.create_date} <br>
     * 作成日時
     * @param createDate The value of the column 'create_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDate(java.time.LocalDateTime createDate) {
        registerModifiedProperty("createDate");
        _createDate = createDate;
    }

    /**
     * [get] update_date: {DATETIME(19), refers to bath.update_date} <br>
     * 更新日時
     * @return The value of the column 'update_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDate() {
        checkSpecifiedProperty("updateDate");
        return _updateDate;
    }

    /**
     * [set] update_date: {DATETIME(19), refers to bath.update_date} <br>
     * 更新日時
     * @param updateDate The value of the column 'update_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDate(java.time.LocalDateTime updateDate) {
        registerModifiedProperty("updateDate");
        _updateDate = updateDate;
    }

    /**
     * [get] distance: {DOUBLE(23, 31)} <br>
     * @return The value of the column 'distance'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDistance() {
        checkSpecifiedProperty("distance");
        return _distance;
    }

    /**
     * [set] distance: {DOUBLE(23, 31)} <br>
     * @param distance The value of the column 'distance'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistance(java.math.BigDecimal distance) {
        registerModifiedProperty("distance");
        _distance = distance;
    }
}
