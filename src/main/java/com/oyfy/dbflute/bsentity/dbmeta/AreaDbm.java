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
 * The DB meta of area. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AreaDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AreaDbm _instance = new AreaDbm();
    private AreaDbm() {}
    public static AreaDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Area)et).getCityCode(), (et, vl) -> ((Area)et).setCityCode(cti(vl)), "cityCode");
        setupEpg(_epgMap, et -> ((Area)et).getCityNameJa(), (et, vl) -> ((Area)et).setCityNameJa((String)vl), "cityNameJa");
        setupEpg(_epgMap, et -> ((Area)et).getCityNameEn(), (et, vl) -> ((Area)et).setCityNameEn((String)vl), "cityNameEn");
        setupEpg(_epgMap, et -> ((Area)et).getCityImage(), (et, vl) -> ((Area)et).setCityImage((String)vl), "cityImage");
        setupEpg(_epgMap, et -> ((Area)et).getCityColor(), (et, vl) -> ((Area)et).setCityColor((String)vl), "cityColor");
        setupEpg(_epgMap, et -> ((Area)et).getCreateDate(), (et, vl) -> ((Area)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((Area)et).getUpdateDate(), (et, vl) -> ((Area)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "area";
    protected final String _tableDispName = "area";
    protected final String _tablePropertyName = "area";
    protected final TableSqlName _tableSqlName = new TableSqlName("area", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCityCode = cci("city_code", "city_code", null, null, Integer.class, "cityCode", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCityNameJa = cci("city_name_ja", "city_name_ja", null, null, String.class, "cityNameJa", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCityNameEn = cci("city_name_en", "city_name_en", null, null, String.class, "cityNameEn", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCityImage = cci("city_image", "city_image", null, null, String.class, "cityImage", null, false, false, false, "VARCHAR", 2100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCityColor = cci("city_color", "city_color", null, null, String.class, "cityColor", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * city_code: {IX, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCityCode() { return _columnCityCode; }
    /**
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCityNameJa() { return _columnCityNameJa; }
    /**
     * city_name_en: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCityNameEn() { return _columnCityNameEn; }
    /**
     * city_image: {VARCHAR(2100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCityImage() { return _columnCityImage; }
    /**
     * city_color: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCityColor() { return _columnCityColor; }
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
        ls.add(columnCityCode());
        ls.add(columnCityNameJa());
        ls.add(columnCityNameEn());
        ls.add(columnCityImage());
        ls.add(columnCityColor());
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
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.Area"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.AreaCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.AreaBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Area> getEntityType() { return Area.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Area newEntity() { return new Area(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Area)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Area)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
