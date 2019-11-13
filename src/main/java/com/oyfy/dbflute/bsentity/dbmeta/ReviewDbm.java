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
 * The DB meta of review. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ReviewDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ReviewDbm _instance = new ReviewDbm();
    private ReviewDbm() {}
    public static ReviewDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Review)et).getReviewId(), (et, vl) -> ((Review)et).setReviewId(cti(vl)), "reviewId");
        setupEpg(_epgMap, et -> ((Review)et).getBathId(), (et, vl) -> ((Review)et).setBathId(cti(vl)), "bathId");
        setupEpg(_epgMap, et -> ((Review)et).getNewyorker(), (et, vl) -> ((Review)et).setNewyorker((String)vl), "newyorker");
        setupEpg(_epgMap, et -> ((Review)et).getReview(), (et, vl) -> ((Review)et).setReview((String)vl), "review");
        setupEpg(_epgMap, et -> ((Review)et).getCreateDate(), (et, vl) -> ((Review)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((Review)et).getUpdateDate(), (et, vl) -> ((Review)et).setUpdateDate(ctldt(vl)), "updateDate");
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
        setupEfpg(_efpgMap, et -> ((Review)et).getBath(), (et, vl) -> ((Review)et).setBath((OptionalEntity<Bath>)vl), "bath");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "review";
    protected final String _tableDispName = "review";
    protected final String _tablePropertyName = "review";
    protected final TableSqlName _tableSqlName = new TableSqlName("review", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReviewId = cci("review_id", "review_id", null, null, Integer.class, "reviewId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBathId = cci("bath_id", "bath_id", null, null, Integer.class, "bathId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "bath", null, null, false);
    protected final ColumnInfo _columnNewyorker = cci("newyorker", "newyorker", null, null, String.class, "newyorker", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReview = cci("review", "review", null, null, String.class, "review", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * review_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReviewId() { return _columnReviewId; }
    /**
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBathId() { return _columnBathId; }
    /**
     * newyorker: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewyorker() { return _columnNewyorker; }
    /**
     * review: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReview() { return _columnReview; }
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
        ls.add(columnReviewId());
        ls.add(columnBathId());
        ls.add(columnNewyorker());
        ls.add(columnReview());
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
    protected UniqueInfo cpui() { return hpcpui(columnReviewId()); }
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
    /**
     * bath by my bath_id, named 'bath'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBath() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBathId(), BathDbm.getInstance().columnBathId());
        return cfi("FK_REVIEW_ID", "bath", this, BathDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "reviewList", false);
    }

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
    public String getEntityTypeName() { return "com.oyfy.dbflute.exentity.Review"; }
    public String getConditionBeanTypeName() { return "com.oyfy.dbflute.cbean.ReviewCB"; }
    public String getBehaviorTypeName() { return "com.oyfy.dbflute.exbhv.ReviewBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Review> getEntityType() { return Review.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Review newEntity() { return new Review(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Review)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Review)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
