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
 * The base condition-query of review.
 * @author DBFlute(AutoGenerator)
 */
public class BsReviewCQ extends AbstractBsReviewCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ReviewCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsReviewCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from review) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ReviewCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ReviewCIQ xcreateCIQ() {
        ReviewCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ReviewCIQ xnewCIQ() {
        return new ReviewCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join review on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ReviewCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ReviewCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _reviewId;
    public ConditionValue xdfgetReviewId()
    { if (_reviewId == null) { _reviewId = nCV(); }
      return _reviewId; }
    protected ConditionValue xgetCValueReviewId() { return xdfgetReviewId(); }

    /**
     * Add order-by as ascend. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_ReviewId_Asc() { regOBA("review_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_ReviewId_Desc() { regOBD("review_id"); return this; }

    protected ConditionValue _bathId;
    public ConditionValue xdfgetBathId()
    { if (_bathId == null) { _bathId = nCV(); }
      return _bathId; }
    protected ConditionValue xgetCValueBathId() { return xdfgetBathId(); }

    /**
     * Add order-by as ascend. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_BathId_Asc() { regOBA("bath_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_BathId_Desc() { regOBD("bath_id"); return this; }

    protected ConditionValue _newyorker;
    public ConditionValue xdfgetNewyorker()
    { if (_newyorker == null) { _newyorker = nCV(); }
      return _newyorker; }
    protected ConditionValue xgetCValueNewyorker() { return xdfgetNewyorker(); }

    /**
     * Add order-by as ascend. <br>
     * newyorker: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_Newyorker_Asc() { regOBA("newyorker"); return this; }

    /**
     * Add order-by as descend. <br>
     * newyorker: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_Newyorker_Desc() { regOBD("newyorker"); return this; }

    protected ConditionValue _review;
    public ConditionValue xdfgetReview()
    { if (_review == null) { _review = nCV(); }
      return _review; }
    protected ConditionValue xgetCValueReview() { return xdfgetReview(); }

    /**
     * Add order-by as ascend. <br>
     * review: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_Review_Asc() { regOBA("review"); return this; }

    /**
     * Add order-by as descend. <br>
     * review: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_Review_Desc() { regOBD("review"); return this; }

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
    public BsReviewCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

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
    public BsReviewCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReviewCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

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
    public BsReviewCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsReviewCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ReviewCQ bq = (ReviewCQ)bqs;
        ReviewCQ uq = (ReviewCQ)uqs;
        if (bq.hasConditionQueryBath()) {
            uq.queryBath().reflectRelationOnUnionQuery(bq.queryBath(), uq.queryBath());
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
        String nrp = xresolveNRP("review", "bath"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BathCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bath", nrp);
    }
    protected void xsetupOuterJoinBath() { xregOutJo("bath"); }
    public boolean hasConditionQueryBath() { return xhasQueRlMap("bath"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ReviewCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ReviewCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ReviewCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ReviewCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ReviewCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ReviewCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ReviewCQ> _myselfExistsMap;
    public Map<String, ReviewCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ReviewCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ReviewCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ReviewCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ReviewCB.class.getName(); }
    protected String xCQ() { return ReviewCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
