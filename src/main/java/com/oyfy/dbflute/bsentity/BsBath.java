package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of bath as TABLE. <br>
 * 銭湯
 * <pre>
 * [primary-key]
 *     bath_id
 *
 * [column]
 *     bath_id, bath_name_ja, bath_name_en, bath_area_code, bath_city_code, bath_image, bath_address_ja, bath_address_en, bath_tel, bath_detail, bath_fee, bath_type, bath_24h_flg, bath_time_st, bath_time_ed, bath_place_lat, bath_place_lon, bath_temperature_up, bath_temperature_low, bath_holiday, del_flg, create_date, update_date
 *
 * [sequence]
 *     
 *
 * [identity]
 *     bath_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     bath_tag
 *
 * [referrer table]
 *     bath_tag
 *
 * [foreign property]
 *     bathTag
 *
 * [referrer property]
 *     bathTagList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer bathId = entity.getBathId();
 * String bathNameJa = entity.getBathNameJa();
 * String bathNameEn = entity.getBathNameEn();
 * Integer bathAreaCode = entity.getBathAreaCode();
 * Integer bathCityCode = entity.getBathCityCode();
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
 * java.math.BigDecimal bathPlaceLat = entity.getBathPlaceLat();
 * java.math.BigDecimal bathPlaceLon = entity.getBathPlaceLon();
 * java.math.BigDecimal bathTemperatureUp = entity.getBathTemperatureUp();
 * java.math.BigDecimal bathTemperatureLow = entity.getBathTemperatureLow();
 * Integer bathHoliday = entity.getBathHoliday();
 * Integer delFlg = entity.getDelFlg();
 * java.time.LocalDateTime createDate = entity.getCreateDate();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * entity.setBathId(bathId);
 * entity.setBathNameJa(bathNameJa);
 * entity.setBathNameEn(bathNameEn);
 * entity.setBathAreaCode(bathAreaCode);
 * entity.setBathCityCode(bathCityCode);
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
 * entity.setBathPlaceLat(bathPlaceLat);
 * entity.setBathPlaceLon(bathPlaceLon);
 * entity.setBathTemperatureUp(bathTemperatureUp);
 * entity.setBathTemperatureLow(bathTemperatureLow);
 * entity.setBathHoliday(bathHoliday);
 * entity.setDelFlg(delFlg);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBath extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** bath_id: {PK, ID, NotNull, INT(10), FK to bath_tag} */
    protected Integer _bathId;

    /** bath_name_ja: {NotNull, VARCHAR(255)} */
    protected String _bathNameJa;

    /** bath_name_en: {VARCHAR(255)} */
    protected String _bathNameEn;

    /** bath_area_code: {INT(10)} */
    protected Integer _bathAreaCode;

    /** bath_city_code: {INT(10)} */
    protected Integer _bathCityCode;

    /** bath_image: {TEXT(65535)} */
    protected String _bathImage;

    /** bath_address_ja: {VARCHAR(255)} */
    protected String _bathAddressJa;

    /** bath_address_en: {VARCHAR(255)} */
    protected String _bathAddressEn;

    /** bath_tel: {VARCHAR(15)} */
    protected String _bathTel;

    /** bath_detail: {VARCHAR(255)} */
    protected String _bathDetail;

    /** bath_fee: {INT(10)} */
    protected Integer _bathFee;

    /** bath_type: {INT(10)} */
    protected Integer _bathType;

    /** bath_24h_flg: {INT(10)} */
    protected Integer _bath24hFlg;

    /** bath_time_st: {TIME(8)} */
    protected java.time.LocalTime _bathTimeSt;

    /** bath_time_ed: {TIME(8)} */
    protected java.time.LocalTime _bathTimeEd;

    /** bath_place_lat: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _bathPlaceLat;

    /** bath_place_lon: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _bathPlaceLon;

    /** bath_temperature_up: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _bathTemperatureUp;

    /** bath_temperature_low: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _bathTemperatureLow;

    /** bath_holiday: {INT(10)} */
    protected Integer _bathHoliday;

    /** del_flg: {INT(10)} */
    protected Integer _delFlg;

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
        return "bath";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_bathId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** bath_tag by my bath_id, named 'bathTag'. */
    protected OptionalEntity<BathTag> _bathTag;

    /**
     * [get] bath_tag by my bath_id, named 'bathTag'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'bathTag'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<BathTag> getBathTag() {
        if (_bathTag == null) { _bathTag = OptionalEntity.relationEmpty(this, "bathTag"); }
        return _bathTag;
    }

    /**
     * [set] bath_tag by my bath_id, named 'bathTag'.
     * @param bathTag The entity of foreign property 'bathTag'. (NullAllowed)
     */
    public void setBathTag(OptionalEntity<BathTag> bathTag) {
        _bathTag = bathTag;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** bath_tag by bath_id, named 'bathTagList'. */
    protected List<BathTag> _bathTagList;

    /**
     * [get] bath_tag by bath_id, named 'bathTagList'.
     * @return The entity list of referrer property 'bathTagList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BathTag> getBathTagList() {
        if (_bathTagList == null) { _bathTagList = newReferrerList(); }
        return _bathTagList;
    }

    /**
     * [set] bath_tag by bath_id, named 'bathTagList'.
     * @param bathTagList The entity list of referrer property 'bathTagList'. (NullAllowed)
     */
    public void setBathTagList(List<BathTag> bathTagList) {
        _bathTagList = bathTagList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBath) {
            BsBath other = (BsBath)obj;
            if (!xSV(_bathId, other._bathId)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bathTag != null && _bathTag.isPresent())
        { sb.append(li).append(xbRDS(_bathTag, "bathTag")); }
        if (_bathTagList != null) { for (BathTag et : _bathTagList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bathTagList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bathId));
        sb.append(dm).append(xfND(_bathNameJa));
        sb.append(dm).append(xfND(_bathNameEn));
        sb.append(dm).append(xfND(_bathAreaCode));
        sb.append(dm).append(xfND(_bathCityCode));
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
        sb.append(dm).append(xfND(_bathPlaceLat));
        sb.append(dm).append(xfND(_bathPlaceLon));
        sb.append(dm).append(xfND(_bathTemperatureUp));
        sb.append(dm).append(xfND(_bathTemperatureLow));
        sb.append(dm).append(xfND(_bathHoliday));
        sb.append(dm).append(xfND(_delFlg));
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
        StringBuilder sb = new StringBuilder();
        if (_bathTag != null && _bathTag.isPresent())
        { sb.append(dm).append("bathTag"); }
        if (_bathTagList != null && !_bathTagList.isEmpty())
        { sb.append(dm).append("bathTagList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Bath clone() {
        return (Bath)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bath_id: {PK, ID, NotNull, INT(10), FK to bath_tag} <br>
     * 銭湯ID
     * @return The value of the column 'bath_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathId() {
        checkSpecifiedProperty("bathId");
        return _bathId;
    }

    /**
     * [set] bath_id: {PK, ID, NotNull, INT(10), FK to bath_tag} <br>
     * 銭湯ID
     * @param bathId The value of the column 'bath_id'. (basically NotNull if update: for the constraint)
     */
    public void setBathId(Integer bathId) {
        registerModifiedProperty("bathId");
        _bathId = bathId;
    }

    /**
     * [get] bath_name_ja: {NotNull, VARCHAR(255)} <br>
     * 銭湯 和名
     * @return The value of the column 'bath_name_ja'. (basically NotNull if selected: for the constraint)
     */
    public String getBathNameJa() {
        checkSpecifiedProperty("bathNameJa");
        return _bathNameJa;
    }

    /**
     * [set] bath_name_ja: {NotNull, VARCHAR(255)} <br>
     * 銭湯 和名
     * @param bathNameJa The value of the column 'bath_name_ja'. (basically NotNull if update: for the constraint)
     */
    public void setBathNameJa(String bathNameJa) {
        registerModifiedProperty("bathNameJa");
        _bathNameJa = bathNameJa;
    }

    /**
     * [get] bath_name_en: {VARCHAR(255)} <br>
     * 銭湯 英名
     * @return The value of the column 'bath_name_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathNameEn() {
        checkSpecifiedProperty("bathNameEn");
        return _bathNameEn;
    }

    /**
     * [set] bath_name_en: {VARCHAR(255)} <br>
     * 銭湯 英名
     * @param bathNameEn The value of the column 'bath_name_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathNameEn(String bathNameEn) {
        registerModifiedProperty("bathNameEn");
        _bathNameEn = bathNameEn;
    }

    /**
     * [get] bath_area_code: {INT(10)} <br>
     * 都道府県コード(国土交通省API使用コード)
     * @return The value of the column 'bath_area_code'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathAreaCode() {
        checkSpecifiedProperty("bathAreaCode");
        return _bathAreaCode;
    }

    /**
     * [set] bath_area_code: {INT(10)} <br>
     * 都道府県コード(国土交通省API使用コード)
     * @param bathAreaCode The value of the column 'bath_area_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAreaCode(Integer bathAreaCode) {
        registerModifiedProperty("bathAreaCode");
        _bathAreaCode = bathAreaCode;
    }

    /**
     * [get] bath_city_code: {INT(10)} <br>
     * 市区町村コード(国土交通省API使用コード)
     * @return The value of the column 'bath_city_code'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathCityCode() {
        checkSpecifiedProperty("bathCityCode");
        return _bathCityCode;
    }

    /**
     * [set] bath_city_code: {INT(10)} <br>
     * 市区町村コード(国土交通省API使用コード)
     * @param bathCityCode The value of the column 'bath_city_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathCityCode(Integer bathCityCode) {
        registerModifiedProperty("bathCityCode");
        _bathCityCode = bathCityCode;
    }

    /**
     * [get] bath_image: {TEXT(65535)} <br>
     * サムネイル画像
     * @return The value of the column 'bath_image'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathImage() {
        checkSpecifiedProperty("bathImage");
        return _bathImage;
    }

    /**
     * [set] bath_image: {TEXT(65535)} <br>
     * サムネイル画像
     * @param bathImage The value of the column 'bath_image'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathImage(String bathImage) {
        registerModifiedProperty("bathImage");
        _bathImage = bathImage;
    }

    /**
     * [get] bath_address_ja: {VARCHAR(255)} <br>
     * 住所 和名
     * @return The value of the column 'bath_address_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathAddressJa() {
        checkSpecifiedProperty("bathAddressJa");
        return _bathAddressJa;
    }

    /**
     * [set] bath_address_ja: {VARCHAR(255)} <br>
     * 住所 和名
     * @param bathAddressJa The value of the column 'bath_address_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAddressJa(String bathAddressJa) {
        registerModifiedProperty("bathAddressJa");
        _bathAddressJa = bathAddressJa;
    }

    /**
     * [get] bath_address_en: {VARCHAR(255)} <br>
     * 住所 英名
     * @return The value of the column 'bath_address_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathAddressEn() {
        checkSpecifiedProperty("bathAddressEn");
        return _bathAddressEn;
    }

    /**
     * [set] bath_address_en: {VARCHAR(255)} <br>
     * 住所 英名
     * @param bathAddressEn The value of the column 'bath_address_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAddressEn(String bathAddressEn) {
        registerModifiedProperty("bathAddressEn");
        _bathAddressEn = bathAddressEn;
    }

    /**
     * [get] bath_tel: {VARCHAR(15)} <br>
     * 電話番号
     * @return The value of the column 'bath_tel'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathTel() {
        checkSpecifiedProperty("bathTel");
        return _bathTel;
    }

    /**
     * [set] bath_tel: {VARCHAR(15)} <br>
     * 電話番号
     * @param bathTel The value of the column 'bath_tel'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTel(String bathTel) {
        registerModifiedProperty("bathTel");
        _bathTel = bathTel;
    }

    /**
     * [get] bath_detail: {VARCHAR(255)} <br>
     * 詳細情報
     * @return The value of the column 'bath_detail'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathDetail() {
        checkSpecifiedProperty("bathDetail");
        return _bathDetail;
    }

    /**
     * [set] bath_detail: {VARCHAR(255)} <br>
     * 詳細情報
     * @param bathDetail The value of the column 'bath_detail'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathDetail(String bathDetail) {
        registerModifiedProperty("bathDetail");
        _bathDetail = bathDetail;
    }

    /**
     * [get] bath_fee: {INT(10)} <br>
     * 一般入浴料
     * @return The value of the column 'bath_fee'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathFee() {
        checkSpecifiedProperty("bathFee");
        return _bathFee;
    }

    /**
     * [set] bath_fee: {INT(10)} <br>
     * 一般入浴料
     * @param bathFee The value of the column 'bath_fee'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathFee(Integer bathFee) {
        registerModifiedProperty("bathFee");
        _bathFee = bathFee;
    }

    /**
     * [get] bath_type: {INT(10)} <br>
     * 銭湯種別(10:銭湯 20:スーパー銭湯)
     * @return The value of the column 'bath_type'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathType() {
        checkSpecifiedProperty("bathType");
        return _bathType;
    }

    /**
     * [set] bath_type: {INT(10)} <br>
     * 銭湯種別(10:銭湯 20:スーパー銭湯)
     * @param bathType The value of the column 'bath_type'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathType(Integer bathType) {
        registerModifiedProperty("bathType");
        _bathType = bathType;
    }

    /**
     * [get] bath_24h_flg: {INT(10)} <br>
     * 24時間フラグ(1:24時間営業)
     * @return The value of the column 'bath_24h_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBath24hFlg() {
        checkSpecifiedProperty("bath24hFlg");
        return _bath24hFlg;
    }

    /**
     * [set] bath_24h_flg: {INT(10)} <br>
     * 24時間フラグ(1:24時間営業)
     * @param bath24hFlg The value of the column 'bath_24h_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBath24hFlg(Integer bath24hFlg) {
        registerModifiedProperty("bath24hFlg");
        _bath24hFlg = bath24hFlg;
    }

    /**
     * [get] bath_time_st: {TIME(8)} <br>
     * 営業時間 開始
     * @return The value of the column 'bath_time_st'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getBathTimeSt() {
        checkSpecifiedProperty("bathTimeSt");
        return _bathTimeSt;
    }

    /**
     * [set] bath_time_st: {TIME(8)} <br>
     * 営業時間 開始
     * @param bathTimeSt The value of the column 'bath_time_st'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTimeSt(java.time.LocalTime bathTimeSt) {
        registerModifiedProperty("bathTimeSt");
        _bathTimeSt = bathTimeSt;
    }

    /**
     * [get] bath_time_ed: {TIME(8)} <br>
     * 営業時間 終了
     * @return The value of the column 'bath_time_ed'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getBathTimeEd() {
        checkSpecifiedProperty("bathTimeEd");
        return _bathTimeEd;
    }

    /**
     * [set] bath_time_ed: {TIME(8)} <br>
     * 営業時間 終了
     * @param bathTimeEd The value of the column 'bath_time_ed'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTimeEd(java.time.LocalTime bathTimeEd) {
        registerModifiedProperty("bathTimeEd");
        _bathTimeEd = bathTimeEd;
    }

    /**
     * [get] bath_place_lat: {DOUBLE(9, 6)} <br>
     * 位置情報 緯度
     * @return The value of the column 'bath_place_lat'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathPlaceLat() {
        checkSpecifiedProperty("bathPlaceLat");
        return _bathPlaceLat;
    }

    /**
     * [set] bath_place_lat: {DOUBLE(9, 6)} <br>
     * 位置情報 緯度
     * @param bathPlaceLat The value of the column 'bath_place_lat'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathPlaceLat(java.math.BigDecimal bathPlaceLat) {
        registerModifiedProperty("bathPlaceLat");
        _bathPlaceLat = bathPlaceLat;
    }

    /**
     * [get] bath_place_lon: {DOUBLE(9, 6)} <br>
     * 位置情報 経度
     * @return The value of the column 'bath_place_lon'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathPlaceLon() {
        checkSpecifiedProperty("bathPlaceLon");
        return _bathPlaceLon;
    }

    /**
     * [set] bath_place_lon: {DOUBLE(9, 6)} <br>
     * 位置情報 経度
     * @param bathPlaceLon The value of the column 'bath_place_lon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathPlaceLon(java.math.BigDecimal bathPlaceLon) {
        registerModifiedProperty("bathPlaceLon");
        _bathPlaceLon = bathPlaceLon;
    }

    /**
     * [get] bath_temperature_up: {DOUBLE(9, 6)} <br>
     * 温度 上限
     * @return The value of the column 'bath_temperature_up'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathTemperatureUp() {
        checkSpecifiedProperty("bathTemperatureUp");
        return _bathTemperatureUp;
    }

    /**
     * [set] bath_temperature_up: {DOUBLE(9, 6)} <br>
     * 温度 上限
     * @param bathTemperatureUp The value of the column 'bath_temperature_up'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTemperatureUp(java.math.BigDecimal bathTemperatureUp) {
        registerModifiedProperty("bathTemperatureUp");
        _bathTemperatureUp = bathTemperatureUp;
    }

    /**
     * [get] bath_temperature_low: {DOUBLE(9, 6)} <br>
     * 温度 下限
     * @return The value of the column 'bath_temperature_low'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathTemperatureLow() {
        checkSpecifiedProperty("bathTemperatureLow");
        return _bathTemperatureLow;
    }

    /**
     * [set] bath_temperature_low: {DOUBLE(9, 6)} <br>
     * 温度 下限
     * @param bathTemperatureLow The value of the column 'bath_temperature_low'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTemperatureLow(java.math.BigDecimal bathTemperatureLow) {
        registerModifiedProperty("bathTemperatureLow");
        _bathTemperatureLow = bathTemperatureLow;
    }

    /**
     * [get] bath_holiday: {INT(10)} <br>
     * 定休日(ビット演算で判定 1:日 2:月 4:火 8:水 16:木 32:金 64:土)
     * @return The value of the column 'bath_holiday'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathHoliday() {
        checkSpecifiedProperty("bathHoliday");
        return _bathHoliday;
    }

    /**
     * [set] bath_holiday: {INT(10)} <br>
     * 定休日(ビット演算で判定 1:日 2:月 4:火 8:水 16:木 32:金 64:土)
     * @param bathHoliday The value of the column 'bath_holiday'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathHoliday(Integer bathHoliday) {
        registerModifiedProperty("bathHoliday");
        _bathHoliday = bathHoliday;
    }

    /**
     * [get] del_flg: {INT(10)} <br>
     * 削除フラグ(1:削除済み)
     * @return The value of the column 'del_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] del_flg: {INT(10)} <br>
     * 削除フラグ(1:削除済み)
     * @param delFlg The value of the column 'del_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(Integer delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
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
