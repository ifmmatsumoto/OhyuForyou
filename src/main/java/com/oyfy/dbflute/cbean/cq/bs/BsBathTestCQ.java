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
 * The base condition-query of bath_test.
 * @author DBFlute(AutoGenerator)
 */
public class BsBathTestCQ extends AbstractBsBathTestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BathTestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBathTestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from bath_test) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BathTestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BathTestCIQ xcreateCIQ() {
        BathTestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BathTestCIQ xnewCIQ() {
        return new BathTestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join bath_test on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BathTestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BathTestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bathId;
    public ConditionValue xdfgetBathId()
    { if (_bathId == null) { _bathId = nCV(); }
      return _bathId; }
    protected ConditionValue xgetCValueBathId() { return xdfgetBathId(); }

    /**
     * Add order-by as ascend. <br>
     * bath_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathId_Asc() { regOBA("bath_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathId_Desc() { regOBD("bath_id"); return this; }

    protected ConditionValue _bathNameJa;
    public ConditionValue xdfgetBathNameJa()
    { if (_bathNameJa == null) { _bathNameJa = nCV(); }
      return _bathNameJa; }
    protected ConditionValue xgetCValueBathNameJa() { return xdfgetBathNameJa(); }

    /**
     * Add order-by as ascend. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathNameJa_Asc() { regOBA("bath_name_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathNameJa_Desc() { regOBD("bath_name_ja"); return this; }

    protected ConditionValue _bathNameEn;
    public ConditionValue xdfgetBathNameEn()
    { if (_bathNameEn == null) { _bathNameEn = nCV(); }
      return _bathNameEn; }
    protected ConditionValue xgetCValueBathNameEn() { return xdfgetBathNameEn(); }

    /**
     * Add order-by as ascend. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathNameEn_Asc() { regOBA("bath_name_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathNameEn_Desc() { regOBD("bath_name_en"); return this; }

    protected ConditionValue _bathAreaCode;
    public ConditionValue xdfgetBathAreaCode()
    { if (_bathAreaCode == null) { _bathAreaCode = nCV(); }
      return _bathAreaCode; }
    protected ConditionValue xgetCValueBathAreaCode() { return xdfgetBathAreaCode(); }

    /**
     * Add order-by as ascend. <br>
     * bath_area_code: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathAreaCode_Asc() { regOBA("bath_area_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_area_code: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathAreaCode_Desc() { regOBD("bath_area_code"); return this; }

    protected ConditionValue _bathCityCode;
    public ConditionValue xdfgetBathCityCode()
    { if (_bathCityCode == null) { _bathCityCode = nCV(); }
      return _bathCityCode; }
    protected ConditionValue xgetCValueBathCityCode() { return xdfgetBathCityCode(); }

    /**
     * Add order-by as ascend. <br>
     * bath_city_code: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathCityCode_Asc() { regOBA("bath_city_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_city_code: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathCityCode_Desc() { regOBD("bath_city_code"); return this; }

    protected ConditionValue _bathImage;
    public ConditionValue xdfgetBathImage()
    { if (_bathImage == null) { _bathImage = nCV(); }
      return _bathImage; }
    protected ConditionValue xgetCValueBathImage() { return xdfgetBathImage(); }

    /**
     * Add order-by as ascend. <br>
     * bath_image: {LONGBLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathImage_Asc() { regOBA("bath_image"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_image: {LONGBLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathImage_Desc() { regOBD("bath_image"); return this; }

    protected ConditionValue _bathAddressJa;
    public ConditionValue xdfgetBathAddressJa()
    { if (_bathAddressJa == null) { _bathAddressJa = nCV(); }
      return _bathAddressJa; }
    protected ConditionValue xgetCValueBathAddressJa() { return xdfgetBathAddressJa(); }

    /**
     * Add order-by as ascend. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathAddressJa_Asc() { regOBA("bath_address_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathAddressJa_Desc() { regOBD("bath_address_ja"); return this; }

    protected ConditionValue _bathAddressEn;
    public ConditionValue xdfgetBathAddressEn()
    { if (_bathAddressEn == null) { _bathAddressEn = nCV(); }
      return _bathAddressEn; }
    protected ConditionValue xgetCValueBathAddressEn() { return xdfgetBathAddressEn(); }

    /**
     * Add order-by as ascend. <br>
     * bath_address_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathAddressEn_Asc() { regOBA("bath_address_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_address_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathAddressEn_Desc() { regOBD("bath_address_en"); return this; }

    protected ConditionValue _bathTel;
    public ConditionValue xdfgetBathTel()
    { if (_bathTel == null) { _bathTel = nCV(); }
      return _bathTel; }
    protected ConditionValue xgetCValueBathTel() { return xdfgetBathTel(); }

    /**
     * Add order-by as ascend. <br>
     * bath_tel: {VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTel_Asc() { regOBA("bath_tel"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_tel: {VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTel_Desc() { regOBD("bath_tel"); return this; }

    protected ConditionValue _bathDetail;
    public ConditionValue xdfgetBathDetail()
    { if (_bathDetail == null) { _bathDetail = nCV(); }
      return _bathDetail; }
    protected ConditionValue xgetCValueBathDetail() { return xdfgetBathDetail(); }

    /**
     * Add order-by as ascend. <br>
     * bath_detail: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathDetail_Asc() { regOBA("bath_detail"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_detail: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathDetail_Desc() { regOBD("bath_detail"); return this; }

    protected ConditionValue _bathFee;
    public ConditionValue xdfgetBathFee()
    { if (_bathFee == null) { _bathFee = nCV(); }
      return _bathFee; }
    protected ConditionValue xgetCValueBathFee() { return xdfgetBathFee(); }

    /**
     * Add order-by as ascend. <br>
     * bath_fee: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathFee_Asc() { regOBA("bath_fee"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_fee: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathFee_Desc() { regOBD("bath_fee"); return this; }

    protected ConditionValue _bathType;
    public ConditionValue xdfgetBathType()
    { if (_bathType == null) { _bathType = nCV(); }
      return _bathType; }
    protected ConditionValue xgetCValueBathType() { return xdfgetBathType(); }

    /**
     * Add order-by as ascend. <br>
     * bath_type: {INT(10), default=[10]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathType_Asc() { regOBA("bath_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_type: {INT(10), default=[10]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathType_Desc() { regOBD("bath_type"); return this; }

    protected ConditionValue _bath24hFlg;
    public ConditionValue xdfgetBath24hFlg()
    { if (_bath24hFlg == null) { _bath24hFlg = nCV(); }
      return _bath24hFlg; }
    protected ConditionValue xgetCValueBath24hFlg() { return xdfgetBath24hFlg(); }

    /**
     * Add order-by as ascend. <br>
     * bath_24h_flg: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_Bath24hFlg_Asc() { regOBA("bath_24h_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_24h_flg: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_Bath24hFlg_Desc() { regOBD("bath_24h_flg"); return this; }

    protected ConditionValue _bathTimeSt;
    public ConditionValue xdfgetBathTimeSt()
    { if (_bathTimeSt == null) { _bathTimeSt = nCV(); }
      return _bathTimeSt; }
    protected ConditionValue xgetCValueBathTimeSt() { return xdfgetBathTimeSt(); }

    /**
     * Add order-by as ascend. <br>
     * bath_time_st: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTimeSt_Asc() { regOBA("bath_time_st"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_time_st: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTimeSt_Desc() { regOBD("bath_time_st"); return this; }

    protected ConditionValue _bathTimeEd;
    public ConditionValue xdfgetBathTimeEd()
    { if (_bathTimeEd == null) { _bathTimeEd = nCV(); }
      return _bathTimeEd; }
    protected ConditionValue xgetCValueBathTimeEd() { return xdfgetBathTimeEd(); }

    /**
     * Add order-by as ascend. <br>
     * bath_time_ed: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTimeEd_Asc() { regOBA("bath_time_ed"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_time_ed: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTimeEd_Desc() { regOBD("bath_time_ed"); return this; }

    protected ConditionValue _bathPlaceLat;
    public ConditionValue xdfgetBathPlaceLat()
    { if (_bathPlaceLat == null) { _bathPlaceLat = nCV(); }
      return _bathPlaceLat; }
    protected ConditionValue xgetCValueBathPlaceLat() { return xdfgetBathPlaceLat(); }

    /**
     * Add order-by as ascend. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathPlaceLat_Asc() { regOBA("bath_place_lat"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathPlaceLat_Desc() { regOBD("bath_place_lat"); return this; }

    protected ConditionValue _bathPlaceLon;
    public ConditionValue xdfgetBathPlaceLon()
    { if (_bathPlaceLon == null) { _bathPlaceLon = nCV(); }
      return _bathPlaceLon; }
    protected ConditionValue xgetCValueBathPlaceLon() { return xdfgetBathPlaceLon(); }

    /**
     * Add order-by as ascend. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathPlaceLon_Asc() { regOBA("bath_place_lon"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathPlaceLon_Desc() { regOBD("bath_place_lon"); return this; }

    protected ConditionValue _bathTemperatureUp;
    public ConditionValue xdfgetBathTemperatureUp()
    { if (_bathTemperatureUp == null) { _bathTemperatureUp = nCV(); }
      return _bathTemperatureUp; }
    protected ConditionValue xgetCValueBathTemperatureUp() { return xdfgetBathTemperatureUp(); }

    /**
     * Add order-by as ascend. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTemperatureUp_Asc() { regOBA("bath_temperature_up"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTemperatureUp_Desc() { regOBD("bath_temperature_up"); return this; }

    protected ConditionValue _bathTemperatureLow;
    public ConditionValue xdfgetBathTemperatureLow()
    { if (_bathTemperatureLow == null) { _bathTemperatureLow = nCV(); }
      return _bathTemperatureLow; }
    protected ConditionValue xgetCValueBathTemperatureLow() { return xdfgetBathTemperatureLow(); }

    /**
     * Add order-by as ascend. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTemperatureLow_Asc() { regOBA("bath_temperature_low"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathTemperatureLow_Desc() { regOBD("bath_temperature_low"); return this; }

    protected ConditionValue _bathHoliday;
    public ConditionValue xdfgetBathHoliday()
    { if (_bathHoliday == null) { _bathHoliday = nCV(); }
      return _bathHoliday; }
    protected ConditionValue xgetCValueBathHoliday() { return xdfgetBathHoliday(); }

    /**
     * Add order-by as ascend. <br>
     * bath_holiday: {INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathHoliday_Asc() { regOBA("bath_holiday"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_holiday: {INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_BathHoliday_Desc() { regOBD("bath_holiday"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * del_flg: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_DelFlg_Asc() { regOBA("del_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * del_flg: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_DelFlg_Desc() { regOBD("del_flg"); return this; }

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
    public BsBathTestCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

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
    public BsBathTestCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBathTestCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

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
    public BsBathTestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBathTestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, BathTestCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BathTestCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BathTestCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BathTestCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BathTestCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BathTestCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BathTestCQ> _myselfExistsMap;
    public Map<String, BathTestCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BathTestCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BathTestCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BathTestCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BathTestCB.class.getName(); }
    protected String xCQ() { return BathTestCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
