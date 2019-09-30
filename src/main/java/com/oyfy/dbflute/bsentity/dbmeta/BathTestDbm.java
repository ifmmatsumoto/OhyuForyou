package com.oyfy.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oyfy.dbflute.allcommon.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The DB meta of bath_test. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BathTestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BathTestDbm _instance = new BathTestDbm();
    private BathTestDbm() {}
    public static BathTestDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((BathTest)et).getBathId(), (et, vl) -> ((BathTest)et).setBathId(cti(vl)), "bathId");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathNameJa(), (et, vl) -> ((BathTest)et).setBathNameJa((String)vl), "bathNameJa");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathNameEn(), (et, vl) -> ((BathTest)et).setBathNameEn((String)vl), "bathNameEn");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathAreaCode(), (et, vl) -> ((BathTest)et).setBathAreaCode(cti(vl)), "bathAreaCode");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathCityCode(), (et, vl) -> ((BathTest)et).setBathCityCode(cti(vl)), "bathCityCode");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathImage(), (et, vl) -> ((BathTest)et).setBathImage((byte[])vl), "bathImage");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathAddressJa(), (et, vl) -> ((BathTest)et).setBathAddressJa((String)vl), "bathAddressJa");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathAddressEn(), (et, vl) -> ((BathTest)et).setBathAddressEn((String)vl), "bathAddressEn");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathTel(), (et, vl) -> ((BathTest)et).setBathTel((String)vl), "bathTel");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathDetail(), (et, vl) -> ((BathTest)et).setBathDetail((String)vl), "bathDetail");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathFee(), (et, vl) -> ((BathTest)et).setBathFee(cti(vl)), "bathFee");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathType(), (et, vl) -> ((BathTest)et).setBathType(cti(vl)), "bathType");
        setupEpg(_epgMap, et -> ((BathTest)et).getBath24hFlg(), (et, vl) -> ((BathTest)et).setBath24hFlg(cti(vl)), "bath24hFlg");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathTimeSt(), (et, vl) -> ((BathTest)et).setBathTimeSt(ctlt(vl)), "bathTimeSt");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathTimeEd(), (et, vl) -> ((BathTest)et).setBathTimeEd(ctlt(vl)), "bathTimeEd");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathPlaceLat(), (et, vl) -> ((BathTest)et).setBathPlaceLat(ctb(vl)), "bathPlaceLat");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathPlaceLon(), (et, vl) -> ((BathTest)et).setBathPlaceLon(ctb(vl)), "bathPlaceLon");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathTemperatureUp(), (et, vl) -> ((BathTest)et).setBathTemperatureUp(ctb(vl)), "bathTemperatureUp");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathTemperatureLow(), (et, vl) -> ((BathTest)et).setBathTemperatureLow(ctb(vl)), "bathTemperatureLow");
        setupEpg(_epgMap, et -> ((BathTest)et).getBathHoliday(), (et, vl) -> ((BathTest)et).setBathHoliday(cti(vl)), "bathHoliday");
        setupEpg(_epgMap, et -> ((BathTest)et).getDelFlg(), (et, vl) -> ((BathTest)et).setDelFlg(cti(vl)), "delFlg");
        setupEpg(_epgMap, et -> ((BathTest)et).getCreateDate(), (et, vl) -> ((BathTest)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((BathTest)et).getUpdateDate(), (et, vl) -> ((BathTest)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "bath_test";
    protected final String _tableDispName = "bath_test";
    protected final String _tablePropertyName = "bathTest";
    protected final TableSqlName _tableSqlName = new TableSqlName("bath_test", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBathId = cci("bath_id", "bath_id", null, null, Integer.class, "bathId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathNameJa = cci("bath_name_ja", "bath_name_ja", null, null, String.class, "bathNameJa", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathNameEn = cci("bath_name_en", "bath_name_en", null, null, String.class, "bathNameEn", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathAreaCode = cci("bath_area_code", "bath_area_code", null, null, Integer.class, "bathAreaCode", null, false, false, false, "INT", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathCityCode = cci("bath_city_code", "bath_city_code", null, null, Integer.class, "bathCityCode", null, false, false, false, "INT", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathImage = cci("bath_image", "bath_image", null, null, byte[].class, "bathImage", null, false, false, false, "LONGBLOB", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathAddressJa = cci("bath_address_ja", "bath_address_ja", null, null, String.class, "bathAddressJa", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathAddressEn = cci("bath_address_en", "bath_address_en", null, null, String.class, "bathAddressEn", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathTel = cci("bath_tel", "bath_tel", null, null, String.class, "bathTel", null, false, false, false, "VARCHAR", 15, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathDetail = cci("bath_detail", "bath_detail", null, null, String.class, "bathDetail", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathFee = cci("bath_fee", "bath_fee", null, null, Integer.class, "bathFee", null, false, false, false, "INT", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathType = cci("bath_type", "bath_type", null, null, Integer.class, "bathType", null, false, false, false, "INT", 10, 0, null, "10", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBath24hFlg = cci("bath_24h_flg", "bath_24h_flg", null, null, Integer.class, "bath24hFlg", null, false, false, false, "INT", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathTimeSt = cci("bath_time_st", "bath_time_st", null, null, java.time.LocalTime.class, "bathTimeSt", null, false, false, false, "TIME", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathTimeEd = cci("bath_time_ed", "bath_time_ed", null, null, java.time.LocalTime.class, "bathTimeEd", null, false, false, false, "TIME", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathPlaceLat = cci("bath_place_lat", "bath_place_lat", null, null, java.math.BigDecimal.class, "bathPlaceLat", null, false, false, false, "DOUBLE", 9, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathPlaceLon = cci("bath_place_lon", "bath_place_lon", null, null, java.math.BigDecimal.class, "bathPlaceLon", null, false, false, false, "DOUBLE", 9, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathTemperatureUp = cci("bath_temperature_up", "bath_temperature_up", null, null, java.math.BigDecimal.class, "bathTemperatureUp", null, false, false, false, "DOUBLE", 3, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathTemperatureLow = cci("bath_temperature_low", "bath_temperature_low", null, null, java.math.BigDecimal.class, "bathTemperatureLow", null, false, false, false, "DOUBLE", 3, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathHoliday = cci("bath_holiday", "bath_holiday", null, null, Integer.class, "bathHoliday", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("del_flg", "del_flg", null, null, Integer.class, "delFlg", null, false, false, false, "INT", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * bath_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathId() { return _columnBathId; }
    /**
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathNameJa() { return _columnBathNameJa; }
    /**
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathNameEn() { return _columnBathNameEn; }
    /**
     * bath_area_code: {INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathAreaCode() { return _columnBathAreaCode; }
    /**
     * bath_city_code: {INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathCityCode() { return _columnBathCityCode; }
    /**
     * bath_image: {LONGBLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathImage() { return _columnBathImage; }
    /**
     * bath_address_ja: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathAddressJa() { return _columnBathAddressJa; }
    /**
     * bath_address_en: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathAddressEn() { return _columnBathAddressEn; }
    /**
     * bath_tel: {VARCHAR(15)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathTel() { return _columnBathTel; }
    /**
     * bath_detail: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathDetail() { return _columnBathDetail; }
    /**
     * bath_fee: {INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathFee() { return _columnBathFee; }
    /**
     * bath_type: {INT(10), default=[10]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathType() { return _columnBathType; }
    /**
     * bath_24h_flg: {INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBath24hFlg() { return _columnBath24hFlg; }
    /**
     * bath_time_st: {TIME(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathTimeSt() { return _columnBathTimeSt; }
    /**
     * bath_time_ed: {TIME(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathTimeEd() { return _columnBathTimeEd; }
    /**
     * bath_place_lat: {DOUBLE(9, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathPlaceLat() { return _columnBathPlaceLat; }
    /**
     * bath_place_lon: {DOUBLE(9, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathPlaceLon() { return _columnBathPlaceLon; }
    /**
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathTemperatureUp() { return _columnBathTemperatureUp; }
    /**
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathTemperatureLow() { return _columnBathTemperatureLow; }
    /**
     * bath_holiday: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathHoliday() { return _columnBathHoliday; }
    /**
     * del_flg: {INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * create_date: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDate() { return _columnCreateDate; }
    /**
     * update_date: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDate() { return _columnUpdateDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBathId());
        ls.add(columnBathNameJa());
        ls.add(columnBathNameEn());
        ls.add(columnBathAreaCode());
        ls.add(columnBathCityCode());
        ls.add(columnBathImage());
        ls.add(columnBathAddressJa());
        ls.add(columnBathAddressEn());
        ls.add(columnBathTel());
        ls.add(columnBathDetail());
        ls.add(columnBathFee());
        ls.add(columnBathType());
        ls.add(columnBath24hFlg());
        ls.add(columnBathTimeSt());
        ls.add(columnBathTimeEd());
        ls.add(columnBathPlaceLat());
        ls.add(columnBathPlaceLon());
        ls.add(columnBathTemperatureUp());
        ls.add(columnBathTemperatureLow());
        ls.add(columnBathHoliday());
        ls.add(columnDelFlg());
        ls.add(columnCreateDate());
        ls.add(columnUpdateDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBathId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.BathTest"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.BathTestCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.BathTestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BathTest> getEntityType() { return BathTest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BathTest newEntity() { return new BathTest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BathTest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BathTest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
