package com.oyfy.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oyfy.dbflute.allcommon.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The DB meta of bath_tag. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BathTagDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BathTagDbm _instance = new BathTagDbm();
    private BathTagDbm() {}
    public static BathTagDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BathTag)et).getBathTagId(), (et, vl) -> ((BathTag)et).setBathTagId(cti(vl)), "bathTagId");
        setupEpg(_epgMap, et -> ((BathTag)et).getBathId(), (et, vl) -> ((BathTag)et).setBathId(cti(vl)), "bathId");
        setupEpg(_epgMap, et -> ((BathTag)et).getTagId(), (et, vl) -> ((BathTag)et).setTagId(cti(vl)), "tagId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BathTag)et).getBath(), (et, vl) -> ((BathTag)et).setBath((OptionalEntity<Bath>)vl), "bath");
        setupEfpg(_efpgMap, et -> ((BathTag)et).getBathAsOne(), (et, vl) -> ((BathTag)et).setBathAsOne((OptionalEntity<Bath>)vl), "bathAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "bath_tag";
    protected final String _tableDispName = "bath_tag";
    protected final String _tablePropertyName = "bathTag";
    protected final TableSqlName _tableSqlName = new TableSqlName("bath_tag", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBathTagId = cci("bath_tag_id", "bath_tag_id", null, null, Integer.class, "bathTagId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathId = cci("bath_id", "bath_id", null, null, Integer.class, "bathId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "bath,bathAsOne", "", null, false);
    protected final ColumnInfo _columnTagId = cci("tag_id", "tag_id", null, null, Integer.class, "tagId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathTagId() { return _columnBathTagId; }
    /**
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathId() { return _columnBathId; }
    /**
     * tag_id: {+UQ, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagId() { return _columnTagId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBathTagId());
        ls.add(columnBathId());
        ls.add(columnTagId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBathTagId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnBathId());
        ls.add(columnTagId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * bath by my bath_id, named 'bath'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBath() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBathId(), BathDbm.getInstance().columnBathId());
        return cfi("FK_BATH_ID", "bath", this, BathDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "bathTagList", false);
    }
    /**
     * bath by bath_id, named 'bathAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBathAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBathId(), BathDbm.getInstance().columnBathId());
        return cfi("FK_BATH_ID", "bathAsOne", this, BathDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, false, true, true, null, null, false, "bathTag", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.BathTag"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.BathTagCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.BathTagBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BathTag> getEntityType() { return BathTag.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BathTag newEntity() { return new BathTag(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BathTag)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BathTag)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
