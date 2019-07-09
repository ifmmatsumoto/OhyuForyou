package com.oyfy.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oyfy.dbflute.allcommon.*;
import com.oyfy.dbflute.cbean.*;
import com.oyfy.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of bath_tag.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBathTagCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBathTagCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "bath_tag";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagId The value of bathTagId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTagId_Equal(Integer bathTagId) {
        doSetBathTagId_Equal(bathTagId);
    }

    protected void doSetBathTagId_Equal(Integer bathTagId) {
        regBathTagId(CK_EQ, bathTagId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagId The value of bathTagId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTagId_NotEqual(Integer bathTagId) {
        doSetBathTagId_NotEqual(bathTagId);
    }

    protected void doSetBathTagId_NotEqual(Integer bathTagId) {
        regBathTagId(CK_NES, bathTagId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagId The value of bathTagId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTagId_GreaterThan(Integer bathTagId) {
        regBathTagId(CK_GT, bathTagId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagId The value of bathTagId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTagId_LessThan(Integer bathTagId) {
        regBathTagId(CK_LT, bathTagId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagId The value of bathTagId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTagId_GreaterEqual(Integer bathTagId) {
        regBathTagId(CK_GE, bathTagId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagId The value of bathTagId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTagId_LessEqual(Integer bathTagId) {
        regBathTagId(CK_LE, bathTagId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param minNumber The min number of bathTagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathTagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathTagId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathTagId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param minNumber The min number of bathTagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathTagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathTagId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathTagId(), "bath_tag_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagIdList The collection of bathTagId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTagId_InScope(Collection<Integer> bathTagIdList) {
        doSetBathTagId_InScope(bathTagIdList);
    }

    protected void doSetBathTagId_InScope(Collection<Integer> bathTagIdList) {
        regINS(CK_INS, cTL(bathTagIdList), xgetCValueBathTagId(), "bath_tag_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     * @param bathTagIdList The collection of bathTagId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTagId_NotInScope(Collection<Integer> bathTagIdList) {
        doSetBathTagId_NotInScope(bathTagIdList);
    }

    protected void doSetBathTagId_NotInScope(Collection<Integer> bathTagIdList) {
        regINS(CK_NINS, cTL(bathTagIdList), xgetCValueBathTagId(), "bath_tag_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     */
    public void setBathTagId_IsNull() { regBathTagId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_tag_id: {PK, NotNull, INT(10)}
     */
    public void setBathTagId_IsNotNull() { regBathTagId(CK_ISNN, DOBJ); }

    protected void regBathTagId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathTagId(), "bath_tag_id"); }
    protected abstract ConditionValue xgetCValueBathTagId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_Equal(Integer bathId) {
        doSetBathId_Equal(bathId);
    }

    protected void doSetBathId_Equal(Integer bathId) {
        regBathId(CK_EQ, bathId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_NotEqual(Integer bathId) {
        doSetBathId_NotEqual(bathId);
    }

    protected void doSetBathId_NotEqual(Integer bathId) {
        regBathId(CK_NES, bathId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_GreaterThan(Integer bathId) {
        regBathId(CK_GT, bathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_LessThan(Integer bathId) {
        regBathId(CK_LT, bathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_GreaterEqual(Integer bathId) {
        regBathId(CK_GE, bathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_LessEqual(Integer bathId) {
        regBathId(CK_LE, bathId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param minNumber The min number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param minNumber The min number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathId(), "bath_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathIdList The collection of bathId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathId_InScope(Collection<Integer> bathIdList) {
        doSetBathId_InScope(bathIdList);
    }

    protected void doSetBathId_InScope(Collection<Integer> bathIdList) {
        regINS(CK_INS, cTL(bathIdList), xgetCValueBathId(), "bath_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_id: {UQ+, NotNull, INT(10), FK to bath}
     * @param bathIdList The collection of bathId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathId_NotInScope(Collection<Integer> bathIdList) {
        doSetBathId_NotInScope(bathIdList);
    }

    protected void doSetBathId_NotInScope(Collection<Integer> bathIdList) {
        regINS(CK_NINS, cTL(bathIdList), xgetCValueBathId(), "bath_id");
    }

    protected void regBathId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathId(), "bath_id"); }
    protected abstract ConditionValue xgetCValueBathId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagId The value of tagId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_Equal(Integer tagId) {
        doSetTagId_Equal(tagId);
    }

    protected void doSetTagId_Equal(Integer tagId) {
        regTagId(CK_EQ, tagId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagId The value of tagId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_NotEqual(Integer tagId) {
        doSetTagId_NotEqual(tagId);
    }

    protected void doSetTagId_NotEqual(Integer tagId) {
        regTagId(CK_NES, tagId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagId The value of tagId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_GreaterThan(Integer tagId) {
        regTagId(CK_GT, tagId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagId The value of tagId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_LessThan(Integer tagId) {
        regTagId(CK_LT, tagId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagId The value of tagId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_GreaterEqual(Integer tagId) {
        regTagId(CK_GE, tagId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagId The value of tagId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_LessEqual(Integer tagId) {
        regTagId(CK_LE, tagId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of tagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTagId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTagId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of tagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTagId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTagId(), "tag_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagIdList The collection of tagId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagId_InScope(Collection<Integer> tagIdList) {
        doSetTagId_InScope(tagIdList);
    }

    protected void doSetTagId_InScope(Collection<Integer> tagIdList) {
        regINS(CK_INS, cTL(tagIdList), xgetCValueTagId(), "tag_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * tag_id: {+UQ, NotNull, INT(10)}
     * @param tagIdList The collection of tagId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagId_NotInScope(Collection<Integer> tagIdList) {
        doSetTagId_NotInScope(tagIdList);
    }

    protected void doSetTagId_NotInScope(Collection<Integer> tagIdList) {
        regINS(CK_NINS, cTL(tagIdList), xgetCValueTagId(), "tag_id");
    }

    protected void regTagId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagId(), "tag_id"); }
    protected abstract ConditionValue xgetCValueTagId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BathTagCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BathTagCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BathTagCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BathTagCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BathTagCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BathTagCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BathTagCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BathTagCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BathTagCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BathTagCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BathTagCB&gt;() {
     *     public void query(BathTagCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BathTagCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BathTagCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BathTagCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BathTagCQ sq);

    protected BathTagCB xcreateScalarConditionCB() {
        BathTagCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BathTagCB xcreateScalarConditionPartitionByCB() {
        BathTagCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BathTagCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BathTagCB cb = new BathTagCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "bath_tag_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BathTagCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BathTagCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BathTagCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BathTagCB cb = new BathTagCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "bath_tag_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BathTagCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BathTagCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BathTagCB cb = new BathTagCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BathTagCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected BathTagCB newMyCB() {
        return new BathTagCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BathTagCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
