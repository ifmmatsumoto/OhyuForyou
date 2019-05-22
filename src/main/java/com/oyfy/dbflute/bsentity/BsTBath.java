package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of t_bath as TABLE. <br>
 * �K��
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     bath_id, bath_name_ja, bath_name_en, bath_area_code, bath_city_code, bath_image, bath_address_ja, bath_address_en, bath_tel, bath_fee, bath_type, bath_24h_flg, bath_time_st, bath_time_ed, bath_place_lat, bath_place_lon, bath_temperature_up, bath_temperature_low, bath_holiday, del_flg, create_date, update_date
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
 * Integer bathAreaCode = entity.getBathAreaCode();
 * Integer bathCityCode = entity.getBathCityCode();
 * String bathImage = entity.getBathImage();
 * String bathAddressJa = entity.getBathAddressJa();
 * String bathAddressEn = entity.getBathAddressEn();
 * String bathTel = entity.getBathTel();
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
public abstract class BsTBath extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** bath_id: {IX, NotNull, INT(10)} */
    protected Integer _bathId;

    /** bath_name_ja: {NotNull, VARCHAR(255)} */
    protected String _bathNameJa;

    /** bath_name_en: {NotNull, VARCHAR(255)} */
    protected String _bathNameEn;

    /** bath_area_code: {NotNull, INT(10)} */
    protected Integer _bathAreaCode;

    /** bath_city_code: {NotNull, INT(10)} */
    protected Integer _bathCityCode;

    /** bath_image: {VARCHAR(2100)} */
    protected String _bathImage;

    /** bath_address_ja: {VARCHAR(255)} */
    protected String _bathAddressJa;

    /** bath_address_en: {VARCHAR(255)} */
    protected String _bathAddressEn;

    /** bath_tel: {VARCHAR(15)} */
    protected String _bathTel;

    /** bath_fee: {INT(10)} */
    protected Integer _bathFee;

    /** bath_type: {NotNull, INT(10)} */
    protected Integer _bathType;

    /** bath_24h_flg: {NotNull, INT(10)} */
    protected Integer _bath24hFlg;

    /** bath_time_st: {TIME(8)} */
    protected java.time.LocalTime _bathTimeSt;

    /** bath_time_ed: {TIME(8)} */
    protected java.time.LocalTime _bathTimeEd;

    /** bath_place_lat: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _bathPlaceLat;

    /** bath_place_lon: {DOUBLE(9, 6)} */
    protected java.math.BigDecimal _bathPlaceLon;

    /** bath_temperature_up: {DOUBLE(3, 3)} */
    protected java.math.BigDecimal _bathTemperatureUp;

    /** bath_temperature_low: {DOUBLE(3, 3)} */
    protected java.math.BigDecimal _bathTemperatureLow;

    /** bath_holiday: {INT(10)} */
    protected Integer _bathHoliday;

    /** del_flg: {NotNull, INT(10)} */
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
        return "t_bath";
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
        if (obj instanceof BsTBath) {
            BsTBath other = (BsTBath)obj;
            if (!xSV(_bathId, other._bathId)) { return false; }
            if (!xSV(_bathNameJa, other._bathNameJa)) { return false; }
            if (!xSV(_bathNameEn, other._bathNameEn)) { return false; }
            if (!xSV(_bathAreaCode, other._bathAreaCode)) { return false; }
            if (!xSV(_bathCityCode, other._bathCityCode)) { return false; }
            if (!xSV(_bathImage, other._bathImage)) { return false; }
            if (!xSV(_bathAddressJa, other._bathAddressJa)) { return false; }
            if (!xSV(_bathAddressEn, other._bathAddressEn)) { return false; }
            if (!xSV(_bathTel, other._bathTel)) { return false; }
            if (!xSV(_bathFee, other._bathFee)) { return false; }
            if (!xSV(_bathType, other._bathType)) { return false; }
            if (!xSV(_bath24hFlg, other._bath24hFlg)) { return false; }
            if (!xSV(_bathTimeSt, other._bathTimeSt)) { return false; }
            if (!xSV(_bathTimeEd, other._bathTimeEd)) { return false; }
            if (!xSV(_bathPlaceLat, other._bathPlaceLat)) { return false; }
            if (!xSV(_bathPlaceLon, other._bathPlaceLon)) { return false; }
            if (!xSV(_bathTemperatureUp, other._bathTemperatureUp)) { return false; }
            if (!xSV(_bathTemperatureLow, other._bathTemperatureLow)) { return false; }
            if (!xSV(_bathHoliday, other._bathHoliday)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
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
        hs = xCH(hs, _bathId);
        hs = xCH(hs, _bathNameJa);
        hs = xCH(hs, _bathNameEn);
        hs = xCH(hs, _bathAreaCode);
        hs = xCH(hs, _bathCityCode);
        hs = xCH(hs, _bathImage);
        hs = xCH(hs, _bathAddressJa);
        hs = xCH(hs, _bathAddressEn);
        hs = xCH(hs, _bathTel);
        hs = xCH(hs, _bathFee);
        hs = xCH(hs, _bathType);
        hs = xCH(hs, _bath24hFlg);
        hs = xCH(hs, _bathTimeSt);
        hs = xCH(hs, _bathTimeEd);
        hs = xCH(hs, _bathPlaceLat);
        hs = xCH(hs, _bathPlaceLon);
        hs = xCH(hs, _bathTemperatureUp);
        hs = xCH(hs, _bathTemperatureLow);
        hs = xCH(hs, _bathHoliday);
        hs = xCH(hs, _delFlg);
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
        sb.append(dm).append(xfND(_bathId));
        sb.append(dm).append(xfND(_bathNameJa));
        sb.append(dm).append(xfND(_bathNameEn));
        sb.append(dm).append(xfND(_bathAreaCode));
        sb.append(dm).append(xfND(_bathCityCode));
        sb.append(dm).append(xfND(_bathImage));
        sb.append(dm).append(xfND(_bathAddressJa));
        sb.append(dm).append(xfND(_bathAddressEn));
        sb.append(dm).append(xfND(_bathTel));
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
        return "";
    }

    @Override
    public TBath clone() {
        return (TBath)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bath_id: {IX, NotNull, INT(10)} <br>
     * �K��ID
     * @return The value of the column 'bath_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathId() {
        checkSpecifiedProperty("bathId");
        return _bathId;
    }

    /**
     * [set] bath_id: {IX, NotNull, INT(10)} <br>
     * �K��ID
     * @param bathId The value of the column 'bath_id'. (basically NotNull if update: for the constraint)
     */
    public void setBathId(Integer bathId) {
        registerModifiedProperty("bathId");
        _bathId = bathId;
    }

    /**
     * [get] bath_name_ja: {NotNull, VARCHAR(255)} <br>
     * �K�� �a��
     * @return The value of the column 'bath_name_ja'. (basically NotNull if selected: for the constraint)
     */
    public String getBathNameJa() {
        checkSpecifiedProperty("bathNameJa");
        return _bathNameJa;
    }

    /**
     * [set] bath_name_ja: {NotNull, VARCHAR(255)} <br>
     * �K�� �a��
     * @param bathNameJa The value of the column 'bath_name_ja'. (basically NotNull if update: for the constraint)
     */
    public void setBathNameJa(String bathNameJa) {
        registerModifiedProperty("bathNameJa");
        _bathNameJa = bathNameJa;
    }

    /**
     * [get] bath_name_en: {NotNull, VARCHAR(255)} <br>
     * �K�� �p��
     * @return The value of the column 'bath_name_en'. (basically NotNull if selected: for the constraint)
     */
    public String getBathNameEn() {
        checkSpecifiedProperty("bathNameEn");
        return _bathNameEn;
    }

    /**
     * [set] bath_name_en: {NotNull, VARCHAR(255)} <br>
     * �K�� �p��
     * @param bathNameEn The value of the column 'bath_name_en'. (basically NotNull if update: for the constraint)
     */
    public void setBathNameEn(String bathNameEn) {
        registerModifiedProperty("bathNameEn");
        _bathNameEn = bathNameEn;
    }

    /**
     * [get] bath_area_code: {NotNull, INT(10)} <br>
     * �s���{���R�[�h(���y��ʏ�API�g�p�R�[�h)
     * @return The value of the column 'bath_area_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathAreaCode() {
        checkSpecifiedProperty("bathAreaCode");
        return _bathAreaCode;
    }

    /**
     * [set] bath_area_code: {NotNull, INT(10)} <br>
     * �s���{���R�[�h(���y��ʏ�API�g�p�R�[�h)
     * @param bathAreaCode The value of the column 'bath_area_code'. (basically NotNull if update: for the constraint)
     */
    public void setBathAreaCode(Integer bathAreaCode) {
        registerModifiedProperty("bathAreaCode");
        _bathAreaCode = bathAreaCode;
    }

    /**
     * [get] bath_city_code: {NotNull, INT(10)} <br>
     * �s�撬���R�[�h(���y��ʏ�API�g�p�R�[�h)
     * @return The value of the column 'bath_city_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathCityCode() {
        checkSpecifiedProperty("bathCityCode");
        return _bathCityCode;
    }

    /**
     * [set] bath_city_code: {NotNull, INT(10)} <br>
     * �s�撬���R�[�h(���y��ʏ�API�g�p�R�[�h)
     * @param bathCityCode The value of the column 'bath_city_code'. (basically NotNull if update: for the constraint)
     */
    public void setBathCityCode(Integer bathCityCode) {
        registerModifiedProperty("bathCityCode");
        _bathCityCode = bathCityCode;
    }

    /**
     * [get] bath_image: {VARCHAR(2100)} <br>
     * �T���l�C���摜
     * @return The value of the column 'bath_image'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathImage() {
        checkSpecifiedProperty("bathImage");
        return _bathImage;
    }

    /**
     * [set] bath_image: {VARCHAR(2100)} <br>
     * �T���l�C���摜
     * @param bathImage The value of the column 'bath_image'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathImage(String bathImage) {
        registerModifiedProperty("bathImage");
        _bathImage = bathImage;
    }

    /**
     * [get] bath_address_ja: {VARCHAR(255)} <br>
     * �Z�� �a��
     * @return The value of the column 'bath_address_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathAddressJa() {
        checkSpecifiedProperty("bathAddressJa");
        return _bathAddressJa;
    }

    /**
     * [set] bath_address_ja: {VARCHAR(255)} <br>
     * �Z�� �a��
     * @param bathAddressJa The value of the column 'bath_address_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAddressJa(String bathAddressJa) {
        registerModifiedProperty("bathAddressJa");
        _bathAddressJa = bathAddressJa;
    }

    /**
     * [get] bath_address_en: {VARCHAR(255)} <br>
     * �Z�� �p��
     * @return The value of the column 'bath_address_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathAddressEn() {
        checkSpecifiedProperty("bathAddressEn");
        return _bathAddressEn;
    }

    /**
     * [set] bath_address_en: {VARCHAR(255)} <br>
     * �Z�� �p��
     * @param bathAddressEn The value of the column 'bath_address_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathAddressEn(String bathAddressEn) {
        registerModifiedProperty("bathAddressEn");
        _bathAddressEn = bathAddressEn;
    }

    /**
     * [get] bath_tel: {VARCHAR(15)} <br>
     * �d�b�ԍ�
     * @return The value of the column 'bath_tel'. (NullAllowed even if selected: for no constraint)
     */
    public String getBathTel() {
        checkSpecifiedProperty("bathTel");
        return _bathTel;
    }

    /**
     * [set] bath_tel: {VARCHAR(15)} <br>
     * �d�b�ԍ�
     * @param bathTel The value of the column 'bath_tel'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTel(String bathTel) {
        registerModifiedProperty("bathTel");
        _bathTel = bathTel;
    }

    /**
     * [get] bath_fee: {INT(10)} <br>
     * ��ʓ�����
     * @return The value of the column 'bath_fee'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathFee() {
        checkSpecifiedProperty("bathFee");
        return _bathFee;
    }

    /**
     * [set] bath_fee: {INT(10)} <br>
     * ��ʓ�����
     * @param bathFee The value of the column 'bath_fee'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathFee(Integer bathFee) {
        registerModifiedProperty("bathFee");
        _bathFee = bathFee;
    }

    /**
     * [get] bath_type: {NotNull, INT(10)} <br>
     * �K�����(10:�K�� 20:�X�[�p�[�K��)
     * @return The value of the column 'bath_type'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathType() {
        checkSpecifiedProperty("bathType");
        return _bathType;
    }

    /**
     * [set] bath_type: {NotNull, INT(10)} <br>
     * �K�����(10:�K�� 20:�X�[�p�[�K��)
     * @param bathType The value of the column 'bath_type'. (basically NotNull if update: for the constraint)
     */
    public void setBathType(Integer bathType) {
        registerModifiedProperty("bathType");
        _bathType = bathType;
    }

    /**
     * [get] bath_24h_flg: {NotNull, INT(10)} <br>
     * 24���ԃt���O(1:24���ԉc��)
     * @return The value of the column 'bath_24h_flg'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBath24hFlg() {
        checkSpecifiedProperty("bath24hFlg");
        return _bath24hFlg;
    }

    /**
     * [set] bath_24h_flg: {NotNull, INT(10)} <br>
     * 24���ԃt���O(1:24���ԉc��)
     * @param bath24hFlg The value of the column 'bath_24h_flg'. (basically NotNull if update: for the constraint)
     */
    public void setBath24hFlg(Integer bath24hFlg) {
        registerModifiedProperty("bath24hFlg");
        _bath24hFlg = bath24hFlg;
    }

    /**
     * [get] bath_time_st: {TIME(8)} <br>
     * �c�Ǝ��� �J�n
     * @return The value of the column 'bath_time_st'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getBathTimeSt() {
        checkSpecifiedProperty("bathTimeSt");
        return _bathTimeSt;
    }

    /**
     * [set] bath_time_st: {TIME(8)} <br>
     * �c�Ǝ��� �J�n
     * @param bathTimeSt The value of the column 'bath_time_st'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTimeSt(java.time.LocalTime bathTimeSt) {
        registerModifiedProperty("bathTimeSt");
        _bathTimeSt = bathTimeSt;
    }

    /**
     * [get] bath_time_ed: {TIME(8)} <br>
     * �c�Ǝ��� �I��
     * @return The value of the column 'bath_time_ed'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getBathTimeEd() {
        checkSpecifiedProperty("bathTimeEd");
        return _bathTimeEd;
    }

    /**
     * [set] bath_time_ed: {TIME(8)} <br>
     * �c�Ǝ��� �I��
     * @param bathTimeEd The value of the column 'bath_time_ed'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTimeEd(java.time.LocalTime bathTimeEd) {
        registerModifiedProperty("bathTimeEd");
        _bathTimeEd = bathTimeEd;
    }

    /**
     * [get] bath_place_lat: {DOUBLE(9, 6)} <br>
     * �ʒu��� �ܓx
     * @return The value of the column 'bath_place_lat'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathPlaceLat() {
        checkSpecifiedProperty("bathPlaceLat");
        return _bathPlaceLat;
    }

    /**
     * [set] bath_place_lat: {DOUBLE(9, 6)} <br>
     * �ʒu��� �ܓx
     * @param bathPlaceLat The value of the column 'bath_place_lat'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathPlaceLat(java.math.BigDecimal bathPlaceLat) {
        registerModifiedProperty("bathPlaceLat");
        _bathPlaceLat = bathPlaceLat;
    }

    /**
     * [get] bath_place_lon: {DOUBLE(9, 6)} <br>
     * �ʒu��� �o�x
     * @return The value of the column 'bath_place_lon'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathPlaceLon() {
        checkSpecifiedProperty("bathPlaceLon");
        return _bathPlaceLon;
    }

    /**
     * [set] bath_place_lon: {DOUBLE(9, 6)} <br>
     * �ʒu��� �o�x
     * @param bathPlaceLon The value of the column 'bath_place_lon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathPlaceLon(java.math.BigDecimal bathPlaceLon) {
        registerModifiedProperty("bathPlaceLon");
        _bathPlaceLon = bathPlaceLon;
    }

    /**
     * [get] bath_temperature_up: {DOUBLE(3, 3)} <br>
     * ���x ���
     * @return The value of the column 'bath_temperature_up'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathTemperatureUp() {
        checkSpecifiedProperty("bathTemperatureUp");
        return _bathTemperatureUp;
    }

    /**
     * [set] bath_temperature_up: {DOUBLE(3, 3)} <br>
     * ���x ���
     * @param bathTemperatureUp The value of the column 'bath_temperature_up'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTemperatureUp(java.math.BigDecimal bathTemperatureUp) {
        registerModifiedProperty("bathTemperatureUp");
        _bathTemperatureUp = bathTemperatureUp;
    }

    /**
     * [get] bath_temperature_low: {DOUBLE(3, 3)} <br>
     * ���x ����
     * @return The value of the column 'bath_temperature_low'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBathTemperatureLow() {
        checkSpecifiedProperty("bathTemperatureLow");
        return _bathTemperatureLow;
    }

    /**
     * [set] bath_temperature_low: {DOUBLE(3, 3)} <br>
     * ���x ����
     * @param bathTemperatureLow The value of the column 'bath_temperature_low'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathTemperatureLow(java.math.BigDecimal bathTemperatureLow) {
        registerModifiedProperty("bathTemperatureLow");
        _bathTemperatureLow = bathTemperatureLow;
    }

    /**
     * [get] bath_holiday: {INT(10)} <br>
     * ��x��(�r�b�g���Z�Ŕ��� 1:�� 2:�� 4:�� 8:�� 16:�� 32:�� 64:�y)
     * @return The value of the column 'bath_holiday'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBathHoliday() {
        checkSpecifiedProperty("bathHoliday");
        return _bathHoliday;
    }

    /**
     * [set] bath_holiday: {INT(10)} <br>
     * ��x��(�r�b�g���Z�Ŕ��� 1:�� 2:�� 4:�� 8:�� 16:�� 32:�� 64:�y)
     * @param bathHoliday The value of the column 'bath_holiday'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBathHoliday(Integer bathHoliday) {
        registerModifiedProperty("bathHoliday");
        _bathHoliday = bathHoliday;
    }

    /**
     * [get] del_flg: {NotNull, INT(10)} <br>
     * �폜�t���O(1:�폜�ς�)
     * @return The value of the column 'del_flg'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] del_flg: {NotNull, INT(10)} <br>
     * �폜�t���O(1:�폜�ς�)
     * @param delFlg The value of the column 'del_flg'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(Integer delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] create_date: {DATETIME(19)} <br>
     * �쐬����
     * @return The value of the column 'create_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getCreateDate() {
        checkSpecifiedProperty("createDate");
        return _createDate;
    }

    /**
     * [set] create_date: {DATETIME(19)} <br>
     * �쐬����
     * @param createDate The value of the column 'create_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDate(java.time.LocalDateTime createDate) {
        registerModifiedProperty("createDate");
        _createDate = createDate;
    }

    /**
     * [get] update_date: {DATETIME(19)} <br>
     * �X�V����
     * @return The value of the column 'update_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDate() {
        checkSpecifiedProperty("updateDate");
        return _updateDate;
    }

    /**
     * [set] update_date: {DATETIME(19)} <br>
     * �X�V����
     * @param updateDate The value of the column 'update_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDate(java.time.LocalDateTime updateDate) {
        registerModifiedProperty("updateDate");
        _updateDate = updateDate;
    }
}
