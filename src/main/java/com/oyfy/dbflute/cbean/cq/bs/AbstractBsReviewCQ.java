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
 * The abstract condition-query of review.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsReviewCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsReviewCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "review";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewId The value of reviewId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReviewId_Equal(Integer reviewId) {
        doSetReviewId_Equal(reviewId);
    }

    protected void doSetReviewId_Equal(Integer reviewId) {
        regReviewId(CK_EQ, reviewId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewId The value of reviewId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReviewId_NotEqual(Integer reviewId) {
        doSetReviewId_NotEqual(reviewId);
    }

    protected void doSetReviewId_NotEqual(Integer reviewId) {
        regReviewId(CK_NES, reviewId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewId The value of reviewId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReviewId_GreaterThan(Integer reviewId) {
        regReviewId(CK_GT, reviewId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewId The value of reviewId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReviewId_LessThan(Integer reviewId) {
        regReviewId(CK_LT, reviewId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewId The value of reviewId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReviewId_GreaterEqual(Integer reviewId) {
        regReviewId(CK_GE, reviewId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewId The value of reviewId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReviewId_LessEqual(Integer reviewId) {
        regReviewId(CK_LE, reviewId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of reviewId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reviewId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReviewId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReviewId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of reviewId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reviewId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReviewId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReviewId(), "review_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewIdList The collection of reviewId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReviewId_InScope(Collection<Integer> reviewIdList) {
        doSetReviewId_InScope(reviewIdList);
    }

    protected void doSetReviewId_InScope(Collection<Integer> reviewIdList) {
        regINS(CK_INS, cTL(reviewIdList), xgetCValueReviewId(), "review_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     * @param reviewIdList The collection of reviewId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReviewId_NotInScope(Collection<Integer> reviewIdList) {
        doSetReviewId_NotInScope(reviewIdList);
    }

    protected void doSetReviewId_NotInScope(Collection<Integer> reviewIdList) {
        regINS(CK_NINS, cTL(reviewIdList), xgetCValueReviewId(), "review_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     */
    public void setReviewId_IsNull() { regReviewId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * review_id: {PK, ID, NotNull, INT(10)}
     */
    public void setReviewId_IsNotNull() { regReviewId(CK_ISNN, DOBJ); }

    protected void regReviewId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReviewId(), "review_id"); }
    protected abstract ConditionValue xgetCValueReviewId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
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
     * bath_id: {IX, NotNull, INT(10), FK to bath}
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
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_GreaterThan(Integer bathId) {
        regBathId(CK_GT, bathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_LessThan(Integer bathId) {
        regBathId(CK_LT, bathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_GreaterEqual(Integer bathId) {
        regBathId(CK_GE, bathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @param bathId The value of bathId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_LessEqual(Integer bathId) {
        regBathId(CK_LE, bathId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
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
     * bath_id: {IX, NotNull, INT(10), FK to bath}
     * @param minNumber The min number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathId(), "bath_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_id: {IX, NotNull, INT(10), FK to bath}
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
     * bath_id: {IX, NotNull, INT(10), FK to bath}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_Equal(String newyorker) {
        doSetNewyorker_Equal(fRES(newyorker));
    }

    protected void doSetNewyorker_Equal(String newyorker) {
        regNewyorker(CK_EQ, newyorker);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_NotEqual(String newyorker) {
        doSetNewyorker_NotEqual(fRES(newyorker));
    }

    protected void doSetNewyorker_NotEqual(String newyorker) {
        regNewyorker(CK_NES, newyorker);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_GreaterThan(String newyorker) {
        regNewyorker(CK_GT, fRES(newyorker));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_LessThan(String newyorker) {
        regNewyorker(CK_LT, fRES(newyorker));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_GreaterEqual(String newyorker) {
        regNewyorker(CK_GE, fRES(newyorker));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_LessEqual(String newyorker) {
        regNewyorker(CK_LE, fRES(newyorker));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorkerList The collection of newyorker as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_InScope(Collection<String> newyorkerList) {
        doSetNewyorker_InScope(newyorkerList);
    }

    protected void doSetNewyorker_InScope(Collection<String> newyorkerList) {
        regINS(CK_INS, cTL(newyorkerList), xgetCValueNewyorker(), "newyorker");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorkerList The collection of newyorker as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewyorker_NotInScope(Collection<String> newyorkerList) {
        doSetNewyorker_NotInScope(newyorkerList);
    }

    protected void doSetNewyorker_NotInScope(Collection<String> newyorkerList) {
        regINS(CK_NINS, cTL(newyorkerList), xgetCValueNewyorker(), "newyorker");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * newyorker: {VARCHAR(100)} <br>
     * <pre>e.g. setNewyorker_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param newyorker The value of newyorker as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNewyorker_LikeSearch(String newyorker, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNewyorker_LikeSearch(newyorker, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * newyorker: {VARCHAR(100)} <br>
     * <pre>e.g. setNewyorker_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param newyorker The value of newyorker as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNewyorker_LikeSearch(String newyorker, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(newyorker), xgetCValueNewyorker(), "newyorker", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNewyorker_NotLikeSearch(String newyorker, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNewyorker_NotLikeSearch(newyorker, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * newyorker: {VARCHAR(100)}
     * @param newyorker The value of newyorker as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNewyorker_NotLikeSearch(String newyorker, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(newyorker), xgetCValueNewyorker(), "newyorker", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     */
    public void setNewyorker_IsNull() { regNewyorker(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     */
    public void setNewyorker_IsNullOrEmpty() { regNewyorker(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * newyorker: {VARCHAR(100)}
     */
    public void setNewyorker_IsNotNull() { regNewyorker(CK_ISNN, DOBJ); }

    protected void regNewyorker(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNewyorker(), "newyorker"); }
    protected abstract ConditionValue xgetCValueNewyorker();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_Equal(String review) {
        doSetReview_Equal(fRES(review));
    }

    protected void doSetReview_Equal(String review) {
        regReview(CK_EQ, review);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_NotEqual(String review) {
        doSetReview_NotEqual(fRES(review));
    }

    protected void doSetReview_NotEqual(String review) {
        regReview(CK_NES, review);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_GreaterThan(String review) {
        regReview(CK_GT, fRES(review));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_LessThan(String review) {
        regReview(CK_LT, fRES(review));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_GreaterEqual(String review) {
        regReview(CK_GE, fRES(review));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_LessEqual(String review) {
        regReview(CK_LE, fRES(review));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * review: {VARCHAR(100)}
     * @param reviewList The collection of review as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_InScope(Collection<String> reviewList) {
        doSetReview_InScope(reviewList);
    }

    protected void doSetReview_InScope(Collection<String> reviewList) {
        regINS(CK_INS, cTL(reviewList), xgetCValueReview(), "review");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * review: {VARCHAR(100)}
     * @param reviewList The collection of review as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReview_NotInScope(Collection<String> reviewList) {
        doSetReview_NotInScope(reviewList);
    }

    protected void doSetReview_NotInScope(Collection<String> reviewList) {
        regINS(CK_NINS, cTL(reviewList), xgetCValueReview(), "review");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * review: {VARCHAR(100)} <br>
     * <pre>e.g. setReview_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param review The value of review as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReview_LikeSearch(String review, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReview_LikeSearch(review, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * review: {VARCHAR(100)} <br>
     * <pre>e.g. setReview_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param review The value of review as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setReview_LikeSearch(String review, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(review), xgetCValueReview(), "review", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReview_NotLikeSearch(String review, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReview_NotLikeSearch(review, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * review: {VARCHAR(100)}
     * @param review The value of review as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setReview_NotLikeSearch(String review, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(review), xgetCValueReview(), "review", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     */
    public void setReview_IsNull() { regReview(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     */
    public void setReview_IsNullOrEmpty() { regReview(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * review: {VARCHAR(100)}
     */
    public void setReview_IsNotNull() { regReview(CK_ISNN, DOBJ); }

    protected void regReview(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReview(), "review"); }
    protected abstract ConditionValue xgetCValueReview();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * @param createDate The value of createDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_Equal(java.time.LocalDateTime createDate) {
        regCreateDate(CK_EQ,  createDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * @param createDate The value of createDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_GreaterThan(java.time.LocalDateTime createDate) {
        regCreateDate(CK_GT,  createDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * @param createDate The value of createDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_LessThan(java.time.LocalDateTime createDate) {
        regCreateDate(CK_LT,  createDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * @param createDate The value of createDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_GreaterEqual(java.time.LocalDateTime createDate) {
        regCreateDate(CK_GE,  createDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * @param createDate The value of createDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_LessEqual(java.time.LocalDateTime createDate) {
        regCreateDate(CK_LE, createDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * <pre>e.g. setCreateDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreateDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreateDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     * <pre>e.g. setCreateDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreateDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "create_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreateDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     */
    public void setCreateDate_IsNull() { regCreateDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * create_date: {DATETIME(19)}
     */
    public void setCreateDate_IsNotNull() { regCreateDate(CK_ISNN, DOBJ); }

    protected void regCreateDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateDate(), "create_date"); }
    protected abstract ConditionValue xgetCValueCreateDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * @param updateDate The value of updateDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_Equal(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_EQ,  updateDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * @param updateDate The value of updateDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_GreaterThan(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_GT,  updateDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * @param updateDate The value of updateDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_LessThan(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_LT,  updateDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * @param updateDate The value of updateDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_GreaterEqual(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_GE,  updateDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * @param updateDate The value of updateDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_LessEqual(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_LE, updateDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * <pre>e.g. setUpdateDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     * <pre>e.g. setUpdateDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     */
    public void setUpdateDate_IsNull() { regUpdateDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_date: {DATETIME(19)}
     */
    public void setUpdateDate_IsNotNull() { regUpdateDate(CK_ISNN, DOBJ); }

    protected void regUpdateDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDate(), "update_date"); }
    protected abstract ConditionValue xgetCValueUpdateDate();

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
    public HpSLCFunction<ReviewCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ReviewCB.class);
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
    public HpSLCFunction<ReviewCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ReviewCB.class);
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
    public HpSLCFunction<ReviewCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ReviewCB.class);
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
    public HpSLCFunction<ReviewCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ReviewCB.class);
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
    public HpSLCFunction<ReviewCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ReviewCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ReviewCB&gt;() {
     *     public void query(ReviewCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReviewCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ReviewCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ReviewCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ReviewCQ sq);

    protected ReviewCB xcreateScalarConditionCB() {
        ReviewCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ReviewCB xcreateScalarConditionPartitionByCB() {
        ReviewCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ReviewCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReviewCB cb = new ReviewCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "review_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ReviewCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ReviewCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ReviewCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReviewCB cb = new ReviewCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "review_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ReviewCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ReviewCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReviewCB cb = new ReviewCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ReviewCQ sq);

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
    protected ReviewCB newMyCB() {
        return new ReviewCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ReviewCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
