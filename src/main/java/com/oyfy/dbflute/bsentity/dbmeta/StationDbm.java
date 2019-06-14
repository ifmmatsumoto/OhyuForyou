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
 * The DB meta of station. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class StationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final StationDbm _instance = new StationDbm();
    private StationDbm() {}
    public static StationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Station)et).getStationCode(), (et, vl) -> ((Station)et).setStationCode(cti(vl)), "stationCode");
        setupEpg(_epgMap, et -> ((Station)et).getStationAreaCode(), (et, vl) -> ((Station)et).setStationAreaCode((String)vl), "stationAreaCode");
        setupEpg(_epgMap, et -> ((Station)et).getStationLineCode(), (et, vl) -> ((Station)et).setStationLineCode((String)vl), "stationLineCode");
        setupEpg(_epgMap, et -> ((Station)et).getStationLineNameJa(), (et, vl) -> ((Station)et).setStationLineNameJa((String)vl), "stationLineNameJa");
        setupEpg(_epgMap, et -> ((Station)et).getStationLineNameEn(), (et, vl) -> ((Station)et).setStationLineNameEn((String)vl), "stationLineNameEn");
        setupEpg(_epgMap, et -> ((Station)et).getStationGCd(), (et, vl) -> ((Station)et).setStationGCd((String)vl), "stationGCd");
        setupEpg(_epgMap, et -> ((Station)et).getStationNameJa(), (et, vl) -> ((Station)et).setStationNameJa((String)vl), "stationNameJa");
        setupEpg(_epgMap, et -> ((Station)et).getStationNameEn(), (et, vl) -> ((Station)et).setStationNameEn((String)vl), "stationNameEn");
        setupEpg(_epgMap, et -> ((Station)et).getStationLon(), (et, vl) -> ((Station)et).setStationLon(ctb(vl)), "stationLon");
        setupEpg(_epgMap, et -> ((Station)et).getStationLat(), (et, vl) -> ((Station)et).setStationLat(ctb(vl)), "stationLat");
        setupEpg(_epgMap, et -> ((Station)et).getStationImage(), (et, vl) -> ((Station)et).setStationImage((String)vl), "stationImage");
        setupEpg(_epgMap, et -> ((Station)et).getStationColor(), (et, vl) -> ((Station)et).setStationColor((String)vl), "stationColor");
        setupEpg(_epgMap, et -> ((Station)et).getCreateDate(), (et, vl) -> ((Station)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((Station)et).getUpdateDate(), (et, vl) -> ((Station)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "station";
    protected final String _tableDispName = "station";
    protected final String _tablePropertyName = "station";
    protected final TableSqlName _tableSqlName = new TableSqlName("station", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStationCode = cci("station_code", "station_code", null, null, Integer.class, "stationCode", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationAreaCode = cci("station_area_code", "station_area_code", null, null, String.class, "stationAreaCode", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationLineCode = cci("station_line_code", "station_line_code", null, null, String.class, "stationLineCode", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationLineNameJa = cci("station_line_name_ja", "station_line_name_ja", null, null, String.class, "stationLineNameJa", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationLineNameEn = cci("station_line_name_en", "station_line_name_en", null, null, String.class, "stationLineNameEn", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationGCd = cci("station_g_cd", "station_g_cd", null, null, String.class, "stationGCd", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationNameJa = cci("station_name_ja", "station_name_ja", null, null, String.class, "stationNameJa", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationNameEn = cci("station_name_en", "station_name_en", null, null, String.class, "stationNameEn", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationLon = cci("station_lon", "station_lon", null, null, java.math.BigDecimal.class, "stationLon", null, false, false, false, "DOUBLE", 9, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationLat = cci("station_lat", "station_lat", null, null, java.math.BigDecimal.class, "stationLat", null, false, false, false, "DOUBLE", 9, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationImage = cci("station_image", "station_image", null, null, String.class, "stationImage", null, false, false, false, "VARCHAR", 2100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationColor = cci("station_color", "station_color", null, null, String.class, "stationColor", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * station_code: {IX, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationCode() { return _columnStationCode; }
    /**
     * station_area_code: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationAreaCode() { return _columnStationAreaCode; }
    /**
     * station_line_code: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationLineCode() { return _columnStationLineCode; }
    /**
     * station_line_name_ja: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationLineNameJa() { return _columnStationLineNameJa; }
    /**
     * station_line_name_en: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationLineNameEn() { return _columnStationLineNameEn; }
    /**
     * station_g_cd: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationGCd() { return _columnStationGCd; }
    /**
     * station_name_ja: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationNameJa() { return _columnStationNameJa; }
    /**
     * station_name_en: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationNameEn() { return _columnStationNameEn; }
    /**
     * station_lon: {DOUBLE(9, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationLon() { return _columnStationLon; }
    /**
     * station_lat: {DOUBLE(9, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationLat() { return _columnStationLat; }
    /**
     * station_image: {VARCHAR(2100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationImage() { return _columnStationImage; }
    /**
     * station_color: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationColor() { return _columnStationColor; }
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
        ls.add(columnStationCode());
        ls.add(columnStationAreaCode());
        ls.add(columnStationLineCode());
        ls.add(columnStationLineNameJa());
        ls.add(columnStationLineNameEn());
        ls.add(columnStationGCd());
        ls.add(columnStationNameJa());
        ls.add(columnStationNameEn());
        ls.add(columnStationLon());
        ls.add(columnStationLat());
        ls.add(columnStationImage());
        ls.add(columnStationColor());
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
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.Station"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.StationCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.StationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Station> getEntityType() { return Station.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Station newEntity() { return new Station(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Station)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Station)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
