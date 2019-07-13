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
 * The base condition-query of tag.
 * @author DBFlute(AutoGenerator)
 */
public class BsTagCQ extends AbstractBsTagCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TagCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTagCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from tag) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TagCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TagCIQ xcreateCIQ() {
        TagCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TagCIQ xnewCIQ() {
        return new TagCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join tag on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TagCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TagCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tagId;
    public ConditionValue xdfgetTagId()
    { if (_tagId == null) { _tagId = nCV(); }
      return _tagId; }
    protected ConditionValue xgetCValueTagId() { return xdfgetTagId(); }

    /**
     * Add order-by as ascend. <br>
     * tag_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagId_Asc() { regOBA("tag_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * tag_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagId_Desc() { regOBD("tag_id"); return this; }

    protected ConditionValue _tagNameJa;
    public ConditionValue xdfgetTagNameJa()
    { if (_tagNameJa == null) { _tagNameJa = nCV(); }
      return _tagNameJa; }
    protected ConditionValue xgetCValueTagNameJa() { return xdfgetTagNameJa(); }

    /**
     * Add order-by as ascend. <br>
     * tag_name_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagNameJa_Asc() { regOBA("tag_name_ja"); return this; }

    /**
     * Add order-by as descend. <br>
     * tag_name_ja: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagNameJa_Desc() { regOBD("tag_name_ja"); return this; }

    protected ConditionValue _tagNameEn;
    public ConditionValue xdfgetTagNameEn()
    { if (_tagNameEn == null) { _tagNameEn = nCV(); }
      return _tagNameEn; }
    protected ConditionValue xgetCValueTagNameEn() { return xdfgetTagNameEn(); }

    /**
     * Add order-by as ascend. <br>
     * tag_name_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagNameEn_Asc() { regOBA("tag_name_en"); return this; }

    /**
     * Add order-by as descend. <br>
     * tag_name_en: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagNameEn_Desc() { regOBD("tag_name_en"); return this; }

    protected ConditionValue _tagImage;
    public ConditionValue xdfgetTagImage()
    { if (_tagImage == null) { _tagImage = nCV(); }
      return _tagImage; }
    protected ConditionValue xgetCValueTagImage() { return xdfgetTagImage(); }

    /**
     * Add order-by as ascend. <br>
     * tag_image: {VARCHAR(2100)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagImage_Asc() { regOBA("tag_image"); return this; }

    /**
     * Add order-by as descend. <br>
     * tag_image: {VARCHAR(2100)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_TagImage_Desc() { regOBD("tag_image"); return this; }

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
    public BsTagCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

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
    public BsTagCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTagCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

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
    public BsTagCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTagCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TagCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TagCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TagCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TagCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TagCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TagCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TagCQ> _myselfExistsMap;
    public Map<String, TagCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TagCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TagCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TagCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TagCB.class.getName(); }
    protected String xCQ() { return TagCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
