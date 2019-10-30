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
 * The base condition-query of bath.
 * @author DBFlute(AutoGenerator)
 */
public class BsBathCQ extends AbstractBsBathCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BathCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBathCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from bath) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BathCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BathCIQ xcreateCIQ() {
        BathCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BathCIQ xnewCIQ() {
        return new BathCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join bath on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BathCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BathCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bathId;
    public ConditionValue xdfgetBathId()
    { if (_bathId == null) { _bathId = nCV(); }
      return _bathId; }
    protected ConditionValue xgetCValueBathId() { return xdfgetBathId(); }

    public Map<String, BathTagCQ> xdfgetBathId_ExistsReferrer_BathTagList() { return xgetSQueMap("bathId_ExistsReferrer_BathTagList"); }
    public String keepBathId_ExistsReferrer_BathTagList(BathTagCQ sq) { return xkeepSQue("bathId_ExistsReferrer_BathTagList", sq); }

    public Map<String, BathTagCQ> xdfgetBathId_NotExistsReferrer_BathTagList() { return xgetSQueMap("bathId_NotExistsReferrer_BathTagList"); }
    public String keepBathId_NotExistsReferrer_BathTagList(BathTagCQ sq) { return xkeepSQue("bathId_NotExistsReferrer_BathTagList", sq); }

    public Map<String, BathTagCQ> xdfgetBathId_SpecifyDerivedReferrer_BathTagList() { return xgetSQueMap("bathId_SpecifyDerivedReferrer_BathTagList"); }
    public String keepBathId_SpecifyDerivedReferrer_BathTagList(BathTagCQ sq) { return xkeepSQue("bathId_SpecifyDerivedReferrer_BathTagList", sq); }

    public Map<String, BathTagCQ> xdfgetBathId_QueryDerivedReferrer_BathTagList() { return xgetSQueMap("bathId_QueryDerivedReferrer_BathTagList"); }
    public String keepBathId_QueryDerivedReferrer_BathTagList(BathTagCQ sq) { return xkeepSQue("bathId_QueryDerivedReferrer_BathTagList", sq); }
    public Map<String, Object> xdfgetBathId_QueryDerivedReferrer_BathTagListParameter() { return xgetSQuePmMap("bathId_QueryDerivedReferrer_BathTagList"); }
    public String keepBathId_QueryDerivedReferrer_BathTagListParameter(Object pm) { return xkeepSQuePm("bathId_QueryDerivedReferrer_BathTagList", pm); }

    /**
     * Add order-by as ascend. <br>
     * bath_id: {PK, ID, NotNull, INT(10), FK to bath_tag}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathId_Asc() { regOBA("bath_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_id: {PK, ID, NotNull, INT(10), FK to bath_tag}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathId_Desc() { regOBD("bath_id"); return this; }

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
    public BsBathCQ addOrderBy_BathNameJa_Asc() { regOBA("bath_name_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathNameJa_Desc() { regOBD("bath_name_ja"); return this; }

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
    public BsBathCQ addOrderBy_BathNameEn_Asc() { regOBA("bath_name_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathNameEn_Desc() { regOBD("bath_name_en"); return this; }

    protected ConditionValue _bathImage;
    public ConditionValue xdfgetBathImage()
    { if (_bathImage == null) { _bathImage = nCV(); }
      return _bathImage; }
    protected ConditionValue xgetCValueBathImage() { return xdfgetBathImage(); }

    /**
     * Add order-by as ascend. <br>
     * bath_image: {LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathImage_Asc() { regOBA("bath_image"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_image: {LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathImage_Desc() { regOBD("bath_image"); return this; }

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
    public BsBathCQ addOrderBy_BathAddressJa_Asc() { regOBA("bath_address_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathAddressJa_Desc() { regOBD("bath_address_ja"); return this; }

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
    public BsBathCQ addOrderBy_BathAddressEn_Asc() { regOBA("bath_address_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_address_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathAddressEn_Desc() { regOBD("bath_address_en"); return this; }

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
    public BsBathCQ addOrderBy_BathTel_Asc() { regOBA("bath_tel"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_tel: {VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTel_Desc() { regOBD("bath_tel"); return this; }

    protected ConditionValue _bathDetail;
    public ConditionValue xdfgetBathDetail()
    { if (_bathDetail == null) { _bathDetail = nCV(); }
      return _bathDetail; }
    protected ConditionValue xgetCValueBathDetail() { return xdfgetBathDetail(); }

    /**
     * Add order-by as ascend. <br>
     * bath_detail: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathDetail_Asc() { regOBA("bath_detail"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_detail: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathDetail_Desc() { regOBD("bath_detail"); return this; }

    protected ConditionValue _bathFee;
    public ConditionValue xdfgetBathFee()
    { if (_bathFee == null) { _bathFee = nCV(); }
      return _bathFee; }
    protected ConditionValue xgetCValueBathFee() { return xdfgetBathFee(); }

    /**
     * Add order-by as ascend. <br>
     * bath_fee: {INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathFee_Asc() { regOBA("bath_fee"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_fee: {INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathFee_Desc() { regOBD("bath_fee"); return this; }

    protected ConditionValue _bathType;
    public ConditionValue xdfgetBathType()
    { if (_bathType == null) { _bathType = nCV(); }
      return _bathType; }
    protected ConditionValue xgetCValueBathType() { return xdfgetBathType(); }

    /**
     * Add order-by as ascend. <br>
     * bath_type: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathType_Asc() { regOBA("bath_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_type: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathType_Desc() { regOBD("bath_type"); return this; }

    protected ConditionValue _bath24hFlg;
    public ConditionValue xdfgetBath24hFlg()
    { if (_bath24hFlg == null) { _bath24hFlg = nCV(); }
      return _bath24hFlg; }
    protected ConditionValue xgetCValueBath24hFlg() { return xdfgetBath24hFlg(); }

    /**
     * Add order-by as ascend. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_Bath24hFlg_Asc() { regOBA("bath_24h_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_Bath24hFlg_Desc() { regOBD("bath_24h_flg"); return this; }

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
    public BsBathCQ addOrderBy_BathTimeSt_Asc() { regOBA("bath_time_st"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_time_st: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTimeSt_Desc() { regOBD("bath_time_st"); return this; }

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
    public BsBathCQ addOrderBy_BathTimeEd_Asc() { regOBA("bath_time_ed"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_time_ed: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTimeEd_Desc() { regOBD("bath_time_ed"); return this; }

    protected ConditionValue _bathNearStation;
    public ConditionValue xdfgetBathNearStation()
    { if (_bathNearStation == null) { _bathNearStation = nCV(); }
      return _bathNearStation; }
    protected ConditionValue xgetCValueBathNearStation() { return xdfgetBathNearStation(); }

    /**
     * Add order-by as ascend. <br>
     * bath_near_station: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathNearStation_Asc() { regOBA("bath_near_station"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_near_station: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathNearStation_Desc() { regOBD("bath_near_station"); return this; }

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
    public BsBathCQ addOrderBy_BathPlaceLat_Asc() { regOBA("bath_place_lat"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathPlaceLat_Desc() { regOBD("bath_place_lat"); return this; }

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
    public BsBathCQ addOrderBy_BathPlaceLon_Asc() { regOBA("bath_place_lon"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathPlaceLon_Desc() { regOBD("bath_place_lon"); return this; }

    protected ConditionValue _bathTemperatureUp;
    public ConditionValue xdfgetBathTemperatureUp()
    { if (_bathTemperatureUp == null) { _bathTemperatureUp = nCV(); }
      return _bathTemperatureUp; }
    protected ConditionValue xgetCValueBathTemperatureUp() { return xdfgetBathTemperatureUp(); }

    /**
     * Add order-by as ascend. <br>
     * bath_temperature_up: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTemperatureUp_Asc() { regOBA("bath_temperature_up"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_temperature_up: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTemperatureUp_Desc() { regOBD("bath_temperature_up"); return this; }

    protected ConditionValue _bathTemperatureLow;
    public ConditionValue xdfgetBathTemperatureLow()
    { if (_bathTemperatureLow == null) { _bathTemperatureLow = nCV(); }
      return _bathTemperatureLow; }
    protected ConditionValue xgetCValueBathTemperatureLow() { return xdfgetBathTemperatureLow(); }

    /**
     * Add order-by as ascend. <br>
     * bath_temperature_low: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTemperatureLow_Asc() { regOBA("bath_temperature_low"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_temperature_low: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathTemperatureLow_Desc() { regOBD("bath_temperature_low"); return this; }

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
    public BsBathCQ addOrderBy_BathHoliday_Asc() { regOBA("bath_holiday"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_holiday: {INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_BathHoliday_Desc() { regOBD("bath_holiday"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * del_flg: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_DelFlg_Asc() { regOBA("del_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * del_flg: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_DelFlg_Desc() { regOBD("del_flg"); return this; }

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
    public BsBathCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

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
    public BsBathCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBathCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

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
    public BsBathCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBathCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BathCQ bq = (BathCQ)bqs;
        BathCQ uq = (BathCQ)uqs;
        if (bq.hasConditionQueryBathTag()) {
            uq.queryBathTag().reflectRelationOnUnionQuery(bq.queryBathTag(), uq.queryBathTag());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * bath_tag by my bath_id, named 'bathTag'.
     * @return The instance of condition-query. (NotNull)
     */
    public BathTagCQ queryBathTag() {
        return xdfgetConditionQueryBathTag();
    }
    public BathTagCQ xdfgetConditionQueryBathTag() {
        String prop = "bathTag";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBathTag()); xsetupOuterJoinBathTag(); }
        return xgetQueRlMap(prop);
    }
    protected BathTagCQ xcreateQueryBathTag() {
        String nrp = xresolveNRP("bath", "bathTag"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BathTagCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bathTag", nrp);
    }
    protected void xsetupOuterJoinBathTag() { xregOutJo("bathTag"); }
    public boolean hasConditionQueryBathTag() { return xhasQueRlMap("bathTag"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BathCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BathCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BathCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BathCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BathCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BathCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BathCQ> _myselfExistsMap;
    public Map<String, BathCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BathCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BathCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BathCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BathCB.class.getName(); }
    protected String xCQ() { return BathCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
