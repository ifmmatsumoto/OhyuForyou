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
 * The base condition-query of bath_tag.
 * @author DBFlute(AutoGenerator)
 */
public class BsBathTagCQ extends AbstractBsBathTagCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BathTagCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBathTagCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from bath_tag) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BathTagCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BathTagCIQ xcreateCIQ() {
        BathTagCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BathTagCIQ xnewCIQ() {
        return new BathTagCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join bath_tag on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BathTagCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BathTagCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bathTagId;
    public ConditionValue xdfgetBathTagId()
    { if (_bathTagId == null) { _bathTagId = nCV(); }
      return _bathTagId; }
    protected ConditionValue xgetCValueBathTagId() { return xdfgetBathTagId(); }

    /**
     * Add order-by as ascend. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTagCQ addOrderBy_BathTagId_Asc() { regOBA("bath_tag_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTagCQ addOrderBy_BathTagId_Desc() { regOBD("bath_tag_id"); return this; }

    protected ConditionValue _bathId;
    public ConditionValue xdfgetBathId()
    { if (_bathId == null) { _bathId = nCV(); }
      return _bathId; }
    protected ConditionValue xgetCValueBathId() { return xdfgetBathId(); }

    /**
     * Add order-by as ascend. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @return this. (NotNull)
     */
    public BsBathTagCQ addOrderBy_BathId_Asc() { regOBA("bath_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @return this. (NotNull)
     */
    public BsBathTagCQ addOrderBy_BathId_Desc() { regOBD("bath_id"); return this; }

    protected ConditionValue _tagId;
    public ConditionValue xdfgetTagId()
    { if (_tagId == null) { _tagId = nCV(); }
      return _tagId; }
    protected ConditionValue xgetCValueTagId() { return xdfgetTagId(); }

    /**
     * Add order-by as ascend. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTagCQ addOrderBy_TagId_Asc() { regOBA("tag_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBathTagCQ addOrderBy_TagId_Desc() { regOBD("tag_id"); return this; }

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
    public BsBathTagCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBathTagCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BathTagCQ bq = (BathTagCQ)bqs;
        BathTagCQ uq = (BathTagCQ)uqs;
        if (bq.hasConditionQueryBath()) {
            uq.queryBath().reflectRelationOnUnionQuery(bq.queryBath(), uq.queryBath());
        }
        if (bq.hasConditionQueryBathAsOne()) {
            uq.queryBathAsOne().reflectRelationOnUnionQuery(bq.queryBathAsOne(), uq.queryBathAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * bath by my bath_id, named 'bath'.
     * @return The instance of condition-query. (NotNull)
     */
    public BathCQ queryBath() {
        return xdfgetConditionQueryBath();
    }
    public BathCQ xdfgetConditionQueryBath() {
        String prop = "bath";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBath()); xsetupOuterJoinBath(); }
        return xgetQueRlMap(prop);
    }
    protected BathCQ xcreateQueryBath() {
        String nrp = xresolveNRP("bath_tag", "bath"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BathCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bath", nrp);
    }
    protected void xsetupOuterJoinBath() { xregOutJo("bath"); }
    public boolean hasConditionQueryBath() { return xhasQueRlMap("bath"); }

    /**
     * Get the condition-query for relation table. <br>
     * bath by bath_id, named 'bathAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BathCQ queryBathAsOne() { return xdfgetConditionQueryBathAsOne(); }
    public BathCQ xdfgetConditionQueryBathAsOne() {
        String prop = "bathAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBathAsOne()); xsetupOuterJoinBathAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BathCQ xcreateQueryBathAsOne() {
        String nrp = xresolveNRP("bath_tag", "bathAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BathCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bathAsOne", nrp);
    }
    protected void xsetupOuterJoinBathAsOne() { xregOutJo("bathAsOne"); }
    public boolean hasConditionQueryBathAsOne() { return xhasQueRlMap("bathAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BathTagCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BathTagCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BathTagCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BathTagCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BathTagCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BathTagCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BathTagCQ> _myselfExistsMap;
    public Map<String, BathTagCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BathTagCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BathTagCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BathTagCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BathTagCB.class.getName(); }
    protected String xCQ() { return BathTagCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
