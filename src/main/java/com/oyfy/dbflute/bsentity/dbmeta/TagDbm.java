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
 * The DB meta of tag. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TagDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TagDbm _instance = new TagDbm();
    private TagDbm() {}
    public static TagDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Tag)et).getTagId(), (et, vl) -> ((Tag)et).setTagId(cti(vl)), "tagId");
        setupEpg(_epgMap, et -> ((Tag)et).getTagNameJa(), (et, vl) -> ((Tag)et).setTagNameJa((String)vl), "tagNameJa");
        setupEpg(_epgMap, et -> ((Tag)et).getTagNameEn(), (et, vl) -> ((Tag)et).setTagNameEn((String)vl), "tagNameEn");
        setupEpg(_epgMap, et -> ((Tag)et).getTagImage(), (et, vl) -> ((Tag)et).setTagImage((String)vl), "tagImage");
        setupEpg(_epgMap, et -> ((Tag)et).getCreateDate(), (et, vl) -> ((Tag)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((Tag)et).getUpdateDate(), (et, vl) -> ((Tag)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "tag";
    protected final String _tableDispName = "tag";
    protected final String _tablePropertyName = "tag";
    protected final TableSqlName _tableSqlName = new TableSqlName("tag", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTagId = cci("tag_id", "tag_id", null, null, Integer.class, "tagId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNameJa = cci("tag_name_ja", "tag_name_ja", null, null, String.class, "tagNameJa", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNameEn = cci("tag_name_en", "tag_name_en", null, null, String.class, "tagNameEn", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagImage = cci("tag_image", "tag_image", null, null, String.class, "tagImage", null, false, false, false, "VARCHAR", 2100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * tag_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagId() { return _columnTagId; }
    /**
     * tag_name_ja: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagNameJa() { return _columnTagNameJa; }
    /**
     * tag_name_en: {VARCHAR(255)}
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
    protected UniqueInfo cpui() { return hpcpui(columnTagId()); }
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
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.Tag"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.TagCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.TagBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Tag> getEntityType() { return Tag.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Tag newEntity() { return new Tag(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Tag)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Tag)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
