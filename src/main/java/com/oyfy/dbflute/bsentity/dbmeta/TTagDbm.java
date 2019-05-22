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
 * The DB meta of t_tag. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTagDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTagDbm _instance = new TTagDbm();
    private TTagDbm() {}
    public static TTagDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTag)et).getTagId(), (et, vl) -> ((TTag)et).setTagId(cti(vl)), "tagId");
        setupEpg(_epgMap, et -> ((TTag)et).getTagNameJa(), (et, vl) -> ((TTag)et).setTagNameJa((String)vl), "tagNameJa");
        setupEpg(_epgMap, et -> ((TTag)et).getTagNameEn(), (et, vl) -> ((TTag)et).setTagNameEn((String)vl), "tagNameEn");
        setupEpg(_epgMap, et -> ((TTag)et).getTagImage(), (et, vl) -> ((TTag)et).setTagImage((String)vl), "tagImage");
        setupEpg(_epgMap, et -> ((TTag)et).getCreateDate(), (et, vl) -> ((TTag)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((TTag)et).getUpdateDate(), (et, vl) -> ((TTag)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_tag";
    protected final String _tableDispName = "t_tag";
    protected final String _tablePropertyName = "TTag";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_tag", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTagId = cci("tag_id", "tag_id", null, null, Integer.class, "tagId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNameJa = cci("tag_name_ja", "tag_name_ja", null, null, String.class, "tagNameJa", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNameEn = cci("tag_name_en", "tag_name_en", null, null, String.class, "tagNameEn", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagImage = cci("tag_image", "tag_image", null, null, String.class, "tagImage", null, false, false, false, "VARCHAR", 2100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * tag_id: {IX, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagId() { return _columnTagId; }
    /**
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagNameJa() { return _columnTagNameJa; }
    /**
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagNameEn() { return _columnTagNameEn; }
    /**
     * tag_image: {VARCHAR(2100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagImage() { return _columnTagImage; }
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
        ls.add(columnTagId());
        ls.add(columnTagNameJa());
        ls.add(columnTagNameEn());
        ls.add(columnTagImage());
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
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.TTag"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.TTagCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.TTagBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTag> getEntityType() { return TTag.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTag newEntity() { return new TTag(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTag)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTag)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
