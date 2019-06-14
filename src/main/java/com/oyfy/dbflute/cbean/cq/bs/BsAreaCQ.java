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
 * The base condition-query of area.
 * @author DBFlute(AutoGenerator)
 */
public class BsAreaCQ extends AbstractBsAreaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AreaCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAreaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from area) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AreaCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AreaCIQ xcreateCIQ() {
        AreaCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AreaCIQ xnewCIQ() {
        return new AreaCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join area on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AreaCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AreaCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cityCode;
    public ConditionValue xdfgetCityCode()
    { if (_cityCode == null) { _cityCode = nCV(); }
      return _cityCode; }
    protected ConditionValue xgetCValueCityCode() { return xdfgetCityCode(); }

    /**
     * Add order-by as ascend. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityCode_Asc() { regOBA("city_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityCode_Desc() { regOBD("city_code"); return this; }

    protected ConditionValue _cityNameJa;
    public ConditionValue xdfgetCityNameJa()
    { if (_cityNameJa == null) { _cityNameJa = nCV(); }
      return _cityNameJa; }
    protected ConditionValue xgetCValueCityNameJa() { return xdfgetCityNameJa(); }

    /**
     * Add order-by as ascend. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityNameJa_Asc() { regOBA("city_name_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityNameJa_Desc() { regOBD("city_name_ja"); return this; }

    protected ConditionValue _cityNameEn;
    public ConditionValue xdfgetCityNameEn()
    { if (_cityNameEn == null) { _cityNameEn = nCV(); }
      return _cityNameEn; }
    protected ConditionValue xgetCValueCityNameEn() { return xdfgetCityNameEn(); }

    /**
     * Add order-by as ascend. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityNameEn_Asc() { regOBA("city_name_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityNameEn_Desc() { regOBD("city_name_en"); return this; }

    protected ConditionValue _cityImage;
    public ConditionValue xdfgetCityImage()
    { if (_cityImage == null) { _cityImage = nCV(); }
      return _cityImage; }
    protected ConditionValue xgetCValueCityImage() { return xdfgetCityImage(); }

    /**
     * Add order-by as ascend. <br>
     * city_image: {VARCHAR(2100)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityImage_Asc() { regOBA("city_image"); return this; }

    /**
     * Add order-by as descend. <br>
     * city_image: {VARCHAR(2100)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityImage_Desc() { regOBD("city_image"); return this; }

    protected ConditionValue _cityColor;
    public ConditionValue xdfgetCityColor()
    { if (_cityColor == null) { _cityColor = nCV(); }
      return _cityColor; }
    protected ConditionValue xgetCValueCityColor() { return xdfgetCityColor(); }

    /**
     * Add order-by as ascend. <br>
     * city_color: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityColor_Asc() { regOBA("city_color"); return this; }

    /**
     * Add order-by as descend. <br>
     * city_color: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CityColor_Desc() { regOBD("city_color"); return this; }

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
    public BsAreaCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

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
    public BsAreaCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAreaCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

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
    public BsAreaCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAreaCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, AreaCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AreaCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AreaCB.class.getName(); }
    protected String xCQ() { return AreaCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
