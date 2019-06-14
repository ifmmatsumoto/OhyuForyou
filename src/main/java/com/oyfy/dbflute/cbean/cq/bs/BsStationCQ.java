package com.oyfy.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oyfy.dbflute.cbean.cq.ciq.*;
import com.oyfy.dbflute.cbean.*;
import com.oyfy.dbflute.cbean.cq.*;

/**
 * The base condition-query of station.
 * @author DBFlute(AutoGenerator)
 */
public class BsStationCQ extends AbstractBsStationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsStationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from station) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public StationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected StationCIQ xcreateCIQ() {
        StationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected StationCIQ xnewCIQ() {
        return new StationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join station on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public StationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        StationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stationCode;
    public ConditionValue xdfgetStationCode()
    { if (_stationCode == null) { _stationCode = nCV(); }
      return _stationCode; }
    protected ConditionValue xgetCValueStationCode() { return xdfgetStationCode(); }

    /**
     * Add order-by as ascend. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationCode_Asc() { regOBA("station_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationCode_Desc() { regOBD("station_code"); return this; }

    protected ConditionValue _stationAreaCode;
    public ConditionValue xdfgetStationAreaCode()
    { if (_stationAreaCode == null) { _stationAreaCode = nCV(); }
      return _stationAreaCode; }
    protected ConditionValue xgetCValueStationAreaCode() { return xdfgetStationAreaCode(); }

    /**
     * Add order-by as ascend. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationAreaCode_Asc() { regOBA("station_area_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationAreaCode_Desc() { regOBD("station_area_code"); return this; }

    protected ConditionValue _stationLineCode;
    public ConditionValue xdfgetStationLineCode()
    { if (_stationLineCode == null) { _stationLineCode = nCV(); }
      return _stationLineCode; }
    protected ConditionValue xgetCValueStationLineCode() { return xdfgetStationLineCode(); }

    /**
     * Add order-by as ascend. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLineCode_Asc() { regOBA("station_line_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLineCode_Desc() { regOBD("station_line_code"); return this; }

    protected ConditionValue _stationLineNameJa;
    public ConditionValue xdfgetStationLineNameJa()
    { if (_stationLineNameJa == null) { _stationLineNameJa = nCV(); }
      return _stationLineNameJa; }
    protected ConditionValue xgetCValueStationLineNameJa() { return xdfgetStationLineNameJa(); }

    /**
     * Add order-by as ascend. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLineNameJa_Asc() { regOBA("station_line_name_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLineNameJa_Desc() { regOBD("station_line_name_ja"); return this; }

    protected ConditionValue _stationLineNameEn;
    public ConditionValue xdfgetStationLineNameEn()
    { if (_stationLineNameEn == null) { _stationLineNameEn = nCV(); }
      return _stationLineNameEn; }
    protected ConditionValue xgetCValueStationLineNameEn() { return xdfgetStationLineNameEn(); }

    /**
     * Add order-by as ascend. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLineNameEn_Asc() { regOBA("station_line_name_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLineNameEn_Desc() { regOBD("station_line_name_en"); return this; }

    protected ConditionValue _stationGCd;
    public ConditionValue xdfgetStationGCd()
    { if (_stationGCd == null) { _stationGCd = nCV(); }
      return _stationGCd; }
    protected ConditionValue xgetCValueStationGCd() { return xdfgetStationGCd(); }

    /**
     * Add order-by as ascend. <br>
     * station_g_cd: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationGCd_Asc() { regOBA("station_g_cd"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_g_cd: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationGCd_Desc() { regOBD("station_g_cd"); return this; }

    protected ConditionValue _stationNameJa;
    public ConditionValue xdfgetStationNameJa()
    { if (_stationNameJa == null) { _stationNameJa = nCV(); }
      return _stationNameJa; }
    protected ConditionValue xgetCValueStationNameJa() { return xdfgetStationNameJa(); }

    /**
     * Add order-by as ascend. <br>
     * station_name_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationNameJa_Asc() { regOBA("station_name_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_name_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationNameJa_Desc() { regOBD("station_name_ja"); return this; }

    protected ConditionValue _stationNameEn;
    public ConditionValue xdfgetStationNameEn()
    { if (_stationNameEn == null) { _stationNameEn = nCV(); }
      return _stationNameEn; }
    protected ConditionValue xgetCValueStationNameEn() { return xdfgetStationNameEn(); }

    /**
     * Add order-by as ascend. <br>
     * station_name_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationNameEn_Asc() { regOBA("station_name_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_name_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationNameEn_Desc() { regOBD("station_name_en"); return this; }

    protected ConditionValue _stationLon;
    public ConditionValue xdfgetStationLon()
    { if (_stationLon == null) { _stationLon = nCV(); }
      return _stationLon; }
    protected ConditionValue xgetCValueStationLon() { return xdfgetStationLon(); }

    /**
     * Add order-by as ascend. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLon_Asc() { regOBA("station_lon"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLon_Desc() { regOBD("station_lon"); return this; }

    protected ConditionValue _stationLat;
    public ConditionValue xdfgetStationLat()
    { if (_stationLat == null) { _stationLat = nCV(); }
      return _stationLat; }
    protected ConditionValue xgetCValueStationLat() { return xdfgetStationLat(); }

    /**
     * Add order-by as ascend. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLat_Asc() { regOBA("station_lat"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationLat_Desc() { regOBD("station_lat"); return this; }

    protected ConditionValue _stationImage;
    public ConditionValue xdfgetStationImage()
    { if (_stationImage == null) { _stationImage = nCV(); }
      return _stationImage; }
    protected ConditionValue xgetCValueStationImage() { return xdfgetStationImage(); }

    /**
     * Add order-by as ascend. <br>
     * station_image: {VARCHAR(2100)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationImage_Asc() { regOBA("station_image"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_image: {VARCHAR(2100)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationImage_Desc() { regOBD("station_image"); return this; }

    protected ConditionValue _stationColor;
    public ConditionValue xdfgetStationColor()
    { if (_stationColor == null) { _stationColor = nCV(); }
      return _stationColor; }
    protected ConditionValue xgetCValueStationColor() { return xdfgetStationColor(); }

    /**
     * Add order-by as ascend. <br>
     * station_color: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationColor_Asc() { regOBA("station_color"); return this; }

    /**
     * Add order-by as descend. <br>
     * station_color: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_StationColor_Desc() { regOBD("station_color"); return this; }

    protected ConditionValue _createDate;
    public ConditionValue xdfgetCreateDate()
    { if (_createDate == null) { _createDate = nCV(); }
      return _createDate; }
    protected ConditionValue xgetCValueCreateDate() { return xdfgetCreateDate(); }

    /**
     * Add order-by as ascend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

    protected ConditionValue _updateDate;
    public ConditionValue xdfgetUpdateDate()
    { if (_updateDate == null) { _updateDate = nCV(); }
      return _updateDate; }
    protected ConditionValue xgetCValueUpdateDate() { return xdfgetUpdateDate(); }

    /**
     * Add order-by as ascend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsStationCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsStationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsStationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, StationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(StationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return StationCB.class.getName(); }
    protected String xCQ() { return StationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
