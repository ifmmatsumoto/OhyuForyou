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
 * The abstract condition-query of t_bath.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBathCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBathCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bath";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10)}
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
     * bath_id: {IX, NotNull, INT(10)}
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
     * bath_id: {IX, NotNull, INT(10)}
     * @param bathId The value of bathId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_GreaterThan(Integer bathId) {
        regBathId(CK_GT, bathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10)}
     * @param bathId The value of bathId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_LessThan(Integer bathId) {
        regBathId(CK_LT, bathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10)}
     * @param bathId The value of bathId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_GreaterEqual(Integer bathId) {
        regBathId(CK_GE, bathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10)}
     * @param bathId The value of bathId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathId_LessEqual(Integer bathId) {
        regBathId(CK_LE, bathId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_id: {IX, NotNull, INT(10)}
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
     * bath_id: {IX, NotNull, INT(10)}
     * @param minNumber The min number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathId(), "bath_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_id: {IX, NotNull, INT(10)}
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
     * bath_id: {IX, NotNull, INT(10)}
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
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_Equal(String bathNameJa) {
        doSetBathNameJa_Equal(fRES(bathNameJa));
    }

    protected void doSetBathNameJa_Equal(String bathNameJa) {
        regBathNameJa(CK_EQ, bathNameJa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_NotEqual(String bathNameJa) {
        doSetBathNameJa_NotEqual(fRES(bathNameJa));
    }

    protected void doSetBathNameJa_NotEqual(String bathNameJa) {
        regBathNameJa(CK_NES, bathNameJa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_GreaterThan(String bathNameJa) {
        regBathNameJa(CK_GT, fRES(bathNameJa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_LessThan(String bathNameJa) {
        regBathNameJa(CK_LT, fRES(bathNameJa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_GreaterEqual(String bathNameJa) {
        regBathNameJa(CK_GE, fRES(bathNameJa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_LessEqual(String bathNameJa) {
        regBathNameJa(CK_LE, fRES(bathNameJa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJaList The collection of bathNameJa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_InScope(Collection<String> bathNameJaList) {
        doSetBathNameJa_InScope(bathNameJaList);
    }

    protected void doSetBathNameJa_InScope(Collection<String> bathNameJaList) {
        regINS(CK_INS, cTL(bathNameJaList), xgetCValueBathNameJa(), "bath_name_ja");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJaList The collection of bathNameJa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameJa_NotInScope(Collection<String> bathNameJaList) {
        doSetBathNameJa_NotInScope(bathNameJaList);
    }

    protected void doSetBathNameJa_NotInScope(Collection<String> bathNameJaList) {
        regINS(CK_NINS, cTL(bathNameJaList), xgetCValueBathNameJa(), "bath_name_ja");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setBathNameJa_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bathNameJa The value of bathNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathNameJa_LikeSearch(String bathNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathNameJa_LikeSearch(bathNameJa, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setBathNameJa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bathNameJa The value of bathNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBathNameJa_LikeSearch(String bathNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bathNameJa), xgetCValueBathNameJa(), "bath_name_ja", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathNameJa_NotLikeSearch(String bathNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathNameJa_NotLikeSearch(bathNameJa, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_ja: {NotNull, VARCHAR(255)}
     * @param bathNameJa The value of bathNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBathNameJa_NotLikeSearch(String bathNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bathNameJa), xgetCValueBathNameJa(), "bath_name_ja", likeSearchOption);
    }

    protected void regBathNameJa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathNameJa(), "bath_name_ja"); }
    protected abstract ConditionValue xgetCValueBathNameJa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_Equal(String bathNameEn) {
        doSetBathNameEn_Equal(fRES(bathNameEn));
    }

    protected void doSetBathNameEn_Equal(String bathNameEn) {
        regBathNameEn(CK_EQ, bathNameEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_NotEqual(String bathNameEn) {
        doSetBathNameEn_NotEqual(fRES(bathNameEn));
    }

    protected void doSetBathNameEn_NotEqual(String bathNameEn) {
        regBathNameEn(CK_NES, bathNameEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_GreaterThan(String bathNameEn) {
        regBathNameEn(CK_GT, fRES(bathNameEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_LessThan(String bathNameEn) {
        regBathNameEn(CK_LT, fRES(bathNameEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_GreaterEqual(String bathNameEn) {
        regBathNameEn(CK_GE, fRES(bathNameEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_LessEqual(String bathNameEn) {
        regBathNameEn(CK_LE, fRES(bathNameEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEnList The collection of bathNameEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_InScope(Collection<String> bathNameEnList) {
        doSetBathNameEn_InScope(bathNameEnList);
    }

    protected void doSetBathNameEn_InScope(Collection<String> bathNameEnList) {
        regINS(CK_INS, cTL(bathNameEnList), xgetCValueBathNameEn(), "bath_name_en");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEnList The collection of bathNameEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathNameEn_NotInScope(Collection<String> bathNameEnList) {
        doSetBathNameEn_NotInScope(bathNameEnList);
    }

    protected void doSetBathNameEn_NotInScope(Collection<String> bathNameEnList) {
        regINS(CK_NINS, cTL(bathNameEnList), xgetCValueBathNameEn(), "bath_name_en");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setBathNameEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bathNameEn The value of bathNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathNameEn_LikeSearch(String bathNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathNameEn_LikeSearch(bathNameEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setBathNameEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bathNameEn The value of bathNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBathNameEn_LikeSearch(String bathNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bathNameEn), xgetCValueBathNameEn(), "bath_name_en", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathNameEn_NotLikeSearch(String bathNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathNameEn_NotLikeSearch(bathNameEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_name_en: {NotNull, VARCHAR(255)}
     * @param bathNameEn The value of bathNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBathNameEn_NotLikeSearch(String bathNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bathNameEn), xgetCValueBathNameEn(), "bath_name_en", likeSearchOption);
    }

    protected void regBathNameEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathNameEn(), "bath_name_en"); }
    protected abstract ConditionValue xgetCValueBathNameEn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCode The value of bathAreaCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathAreaCode_Equal(Integer bathAreaCode) {
        doSetBathAreaCode_Equal(bathAreaCode);
    }

    protected void doSetBathAreaCode_Equal(Integer bathAreaCode) {
        regBathAreaCode(CK_EQ, bathAreaCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCode The value of bathAreaCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathAreaCode_NotEqual(Integer bathAreaCode) {
        doSetBathAreaCode_NotEqual(bathAreaCode);
    }

    protected void doSetBathAreaCode_NotEqual(Integer bathAreaCode) {
        regBathAreaCode(CK_NES, bathAreaCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCode The value of bathAreaCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathAreaCode_GreaterThan(Integer bathAreaCode) {
        regBathAreaCode(CK_GT, bathAreaCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCode The value of bathAreaCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathAreaCode_LessThan(Integer bathAreaCode) {
        regBathAreaCode(CK_LT, bathAreaCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCode The value of bathAreaCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathAreaCode_GreaterEqual(Integer bathAreaCode) {
        regBathAreaCode(CK_GE, bathAreaCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCode The value of bathAreaCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathAreaCode_LessEqual(Integer bathAreaCode) {
        regBathAreaCode(CK_LE, bathAreaCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param minNumber The min number of bathAreaCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathAreaCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathAreaCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathAreaCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param minNumber The min number of bathAreaCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathAreaCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathAreaCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathAreaCode(), "bath_area_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCodeList The collection of bathAreaCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAreaCode_InScope(Collection<Integer> bathAreaCodeList) {
        doSetBathAreaCode_InScope(bathAreaCodeList);
    }

    protected void doSetBathAreaCode_InScope(Collection<Integer> bathAreaCodeList) {
        regINS(CK_INS, cTL(bathAreaCodeList), xgetCValueBathAreaCode(), "bath_area_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_area_code: {NotNull, INT(10)}
     * @param bathAreaCodeList The collection of bathAreaCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAreaCode_NotInScope(Collection<Integer> bathAreaCodeList) {
        doSetBathAreaCode_NotInScope(bathAreaCodeList);
    }

    protected void doSetBathAreaCode_NotInScope(Collection<Integer> bathAreaCodeList) {
        regINS(CK_NINS, cTL(bathAreaCodeList), xgetCValueBathAreaCode(), "bath_area_code");
    }

    protected void regBathAreaCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathAreaCode(), "bath_area_code"); }
    protected abstract ConditionValue xgetCValueBathAreaCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCode The value of bathCityCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathCityCode_Equal(Integer bathCityCode) {
        doSetBathCityCode_Equal(bathCityCode);
    }

    protected void doSetBathCityCode_Equal(Integer bathCityCode) {
        regBathCityCode(CK_EQ, bathCityCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCode The value of bathCityCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathCityCode_NotEqual(Integer bathCityCode) {
        doSetBathCityCode_NotEqual(bathCityCode);
    }

    protected void doSetBathCityCode_NotEqual(Integer bathCityCode) {
        regBathCityCode(CK_NES, bathCityCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCode The value of bathCityCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathCityCode_GreaterThan(Integer bathCityCode) {
        regBathCityCode(CK_GT, bathCityCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCode The value of bathCityCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathCityCode_LessThan(Integer bathCityCode) {
        regBathCityCode(CK_LT, bathCityCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCode The value of bathCityCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathCityCode_GreaterEqual(Integer bathCityCode) {
        regBathCityCode(CK_GE, bathCityCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCode The value of bathCityCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathCityCode_LessEqual(Integer bathCityCode) {
        regBathCityCode(CK_LE, bathCityCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param minNumber The min number of bathCityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathCityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathCityCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathCityCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param minNumber The min number of bathCityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathCityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathCityCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathCityCode(), "bath_city_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCodeList The collection of bathCityCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathCityCode_InScope(Collection<Integer> bathCityCodeList) {
        doSetBathCityCode_InScope(bathCityCodeList);
    }

    protected void doSetBathCityCode_InScope(Collection<Integer> bathCityCodeList) {
        regINS(CK_INS, cTL(bathCityCodeList), xgetCValueBathCityCode(), "bath_city_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_city_code: {NotNull, INT(10)}
     * @param bathCityCodeList The collection of bathCityCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathCityCode_NotInScope(Collection<Integer> bathCityCodeList) {
        doSetBathCityCode_NotInScope(bathCityCodeList);
    }

    protected void doSetBathCityCode_NotInScope(Collection<Integer> bathCityCodeList) {
        regINS(CK_NINS, cTL(bathCityCodeList), xgetCValueBathCityCode(), "bath_city_code");
    }

    protected void regBathCityCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathCityCode(), "bath_city_code"); }
    protected abstract ConditionValue xgetCValueBathCityCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_Equal(String bathImage) {
        doSetBathImage_Equal(fRES(bathImage));
    }

    protected void doSetBathImage_Equal(String bathImage) {
        regBathImage(CK_EQ, bathImage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_NotEqual(String bathImage) {
        doSetBathImage_NotEqual(fRES(bathImage));
    }

    protected void doSetBathImage_NotEqual(String bathImage) {
        regBathImage(CK_NES, bathImage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_GreaterThan(String bathImage) {
        regBathImage(CK_GT, fRES(bathImage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_LessThan(String bathImage) {
        regBathImage(CK_LT, fRES(bathImage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_GreaterEqual(String bathImage) {
        regBathImage(CK_GE, fRES(bathImage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_LessEqual(String bathImage) {
        regBathImage(CK_LE, fRES(bathImage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImageList The collection of bathImage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_InScope(Collection<String> bathImageList) {
        doSetBathImage_InScope(bathImageList);
    }

    protected void doSetBathImage_InScope(Collection<String> bathImageList) {
        regINS(CK_INS, cTL(bathImageList), xgetCValueBathImage(), "bath_image");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImageList The collection of bathImage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathImage_NotInScope(Collection<String> bathImageList) {
        doSetBathImage_NotInScope(bathImageList);
    }

    protected void doSetBathImage_NotInScope(Collection<String> bathImageList) {
        regINS(CK_NINS, cTL(bathImageList), xgetCValueBathImage(), "bath_image");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setBathImage_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bathImage The value of bathImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathImage_LikeSearch(String bathImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathImage_LikeSearch(bathImage, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setBathImage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bathImage The value of bathImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBathImage_LikeSearch(String bathImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bathImage), xgetCValueBathImage(), "bath_image", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathImage_NotLikeSearch(String bathImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathImage_NotLikeSearch(bathImage, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     * @param bathImage The value of bathImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBathImage_NotLikeSearch(String bathImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bathImage), xgetCValueBathImage(), "bath_image", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     */
    public void setBathImage_IsNull() { regBathImage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     */
    public void setBathImage_IsNullOrEmpty() { regBathImage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_image: {VARCHAR(2100)}
     */
    public void setBathImage_IsNotNull() { regBathImage(CK_ISNN, DOBJ); }

    protected void regBathImage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathImage(), "bath_image"); }
    protected abstract ConditionValue xgetCValueBathImage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_Equal(String bathAddressJa) {
        doSetBathAddressJa_Equal(fRES(bathAddressJa));
    }

    protected void doSetBathAddressJa_Equal(String bathAddressJa) {
        regBathAddressJa(CK_EQ, bathAddressJa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_NotEqual(String bathAddressJa) {
        doSetBathAddressJa_NotEqual(fRES(bathAddressJa));
    }

    protected void doSetBathAddressJa_NotEqual(String bathAddressJa) {
        regBathAddressJa(CK_NES, bathAddressJa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_GreaterThan(String bathAddressJa) {
        regBathAddressJa(CK_GT, fRES(bathAddressJa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_LessThan(String bathAddressJa) {
        regBathAddressJa(CK_LT, fRES(bathAddressJa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_GreaterEqual(String bathAddressJa) {
        regBathAddressJa(CK_GE, fRES(bathAddressJa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_LessEqual(String bathAddressJa) {
        regBathAddressJa(CK_LE, fRES(bathAddressJa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJaList The collection of bathAddressJa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_InScope(Collection<String> bathAddressJaList) {
        doSetBathAddressJa_InScope(bathAddressJaList);
    }

    protected void doSetBathAddressJa_InScope(Collection<String> bathAddressJaList) {
        regINS(CK_INS, cTL(bathAddressJaList), xgetCValueBathAddressJa(), "bath_address_ja");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJaList The collection of bathAddressJa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressJa_NotInScope(Collection<String> bathAddressJaList) {
        doSetBathAddressJa_NotInScope(bathAddressJaList);
    }

    protected void doSetBathAddressJa_NotInScope(Collection<String> bathAddressJaList) {
        regINS(CK_NINS, cTL(bathAddressJaList), xgetCValueBathAddressJa(), "bath_address_ja");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_ja: {VARCHAR(255)} <br>
     * <pre>e.g. setBathAddressJa_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bathAddressJa The value of bathAddressJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathAddressJa_LikeSearch(String bathAddressJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathAddressJa_LikeSearch(bathAddressJa, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_ja: {VARCHAR(255)} <br>
     * <pre>e.g. setBathAddressJa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bathAddressJa The value of bathAddressJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBathAddressJa_LikeSearch(String bathAddressJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bathAddressJa), xgetCValueBathAddressJa(), "bath_address_ja", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathAddressJa_NotLikeSearch(String bathAddressJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathAddressJa_NotLikeSearch(bathAddressJa, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     * @param bathAddressJa The value of bathAddressJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBathAddressJa_NotLikeSearch(String bathAddressJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bathAddressJa), xgetCValueBathAddressJa(), "bath_address_ja", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     */
    public void setBathAddressJa_IsNull() { regBathAddressJa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     */
    public void setBathAddressJa_IsNullOrEmpty() { regBathAddressJa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_address_ja: {VARCHAR(255)}
     */
    public void setBathAddressJa_IsNotNull() { regBathAddressJa(CK_ISNN, DOBJ); }

    protected void regBathAddressJa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathAddressJa(), "bath_address_ja"); }
    protected abstract ConditionValue xgetCValueBathAddressJa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_Equal(String bathAddressEn) {
        doSetBathAddressEn_Equal(fRES(bathAddressEn));
    }

    protected void doSetBathAddressEn_Equal(String bathAddressEn) {
        regBathAddressEn(CK_EQ, bathAddressEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_NotEqual(String bathAddressEn) {
        doSetBathAddressEn_NotEqual(fRES(bathAddressEn));
    }

    protected void doSetBathAddressEn_NotEqual(String bathAddressEn) {
        regBathAddressEn(CK_NES, bathAddressEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_GreaterThan(String bathAddressEn) {
        regBathAddressEn(CK_GT, fRES(bathAddressEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_LessThan(String bathAddressEn) {
        regBathAddressEn(CK_LT, fRES(bathAddressEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_GreaterEqual(String bathAddressEn) {
        regBathAddressEn(CK_GE, fRES(bathAddressEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_LessEqual(String bathAddressEn) {
        regBathAddressEn(CK_LE, fRES(bathAddressEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEnList The collection of bathAddressEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_InScope(Collection<String> bathAddressEnList) {
        doSetBathAddressEn_InScope(bathAddressEnList);
    }

    protected void doSetBathAddressEn_InScope(Collection<String> bathAddressEnList) {
        regINS(CK_INS, cTL(bathAddressEnList), xgetCValueBathAddressEn(), "bath_address_en");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEnList The collection of bathAddressEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathAddressEn_NotInScope(Collection<String> bathAddressEnList) {
        doSetBathAddressEn_NotInScope(bathAddressEnList);
    }

    protected void doSetBathAddressEn_NotInScope(Collection<String> bathAddressEnList) {
        regINS(CK_NINS, cTL(bathAddressEnList), xgetCValueBathAddressEn(), "bath_address_en");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_en: {VARCHAR(255)} <br>
     * <pre>e.g. setBathAddressEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bathAddressEn The value of bathAddressEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathAddressEn_LikeSearch(String bathAddressEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathAddressEn_LikeSearch(bathAddressEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_en: {VARCHAR(255)} <br>
     * <pre>e.g. setBathAddressEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bathAddressEn The value of bathAddressEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBathAddressEn_LikeSearch(String bathAddressEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bathAddressEn), xgetCValueBathAddressEn(), "bath_address_en", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathAddressEn_NotLikeSearch(String bathAddressEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathAddressEn_NotLikeSearch(bathAddressEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     * @param bathAddressEn The value of bathAddressEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBathAddressEn_NotLikeSearch(String bathAddressEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bathAddressEn), xgetCValueBathAddressEn(), "bath_address_en", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     */
    public void setBathAddressEn_IsNull() { regBathAddressEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     */
    public void setBathAddressEn_IsNullOrEmpty() { regBathAddressEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_address_en: {VARCHAR(255)}
     */
    public void setBathAddressEn_IsNotNull() { regBathAddressEn(CK_ISNN, DOBJ); }

    protected void regBathAddressEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathAddressEn(), "bath_address_en"); }
    protected abstract ConditionValue xgetCValueBathAddressEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_Equal(String bathTel) {
        doSetBathTel_Equal(fRES(bathTel));
    }

    protected void doSetBathTel_Equal(String bathTel) {
        regBathTel(CK_EQ, bathTel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_NotEqual(String bathTel) {
        doSetBathTel_NotEqual(fRES(bathTel));
    }

    protected void doSetBathTel_NotEqual(String bathTel) {
        regBathTel(CK_NES, bathTel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_GreaterThan(String bathTel) {
        regBathTel(CK_GT, fRES(bathTel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_LessThan(String bathTel) {
        regBathTel(CK_LT, fRES(bathTel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_GreaterEqual(String bathTel) {
        regBathTel(CK_GE, fRES(bathTel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_LessEqual(String bathTel) {
        regBathTel(CK_LE, fRES(bathTel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTelList The collection of bathTel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_InScope(Collection<String> bathTelList) {
        doSetBathTel_InScope(bathTelList);
    }

    protected void doSetBathTel_InScope(Collection<String> bathTelList) {
        regINS(CK_INS, cTL(bathTelList), xgetCValueBathTel(), "bath_tel");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTelList The collection of bathTel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTel_NotInScope(Collection<String> bathTelList) {
        doSetBathTel_NotInScope(bathTelList);
    }

    protected void doSetBathTel_NotInScope(Collection<String> bathTelList) {
        regINS(CK_NINS, cTL(bathTelList), xgetCValueBathTel(), "bath_tel");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_tel: {VARCHAR(15)} <br>
     * <pre>e.g. setBathTel_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bathTel The value of bathTel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathTel_LikeSearch(String bathTel, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathTel_LikeSearch(bathTel, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_tel: {VARCHAR(15)} <br>
     * <pre>e.g. setBathTel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bathTel The value of bathTel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBathTel_LikeSearch(String bathTel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bathTel), xgetCValueBathTel(), "bath_tel", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBathTel_NotLikeSearch(String bathTel, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBathTel_NotLikeSearch(bathTel, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     * @param bathTel The value of bathTel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBathTel_NotLikeSearch(String bathTel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bathTel), xgetCValueBathTel(), "bath_tel", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     */
    public void setBathTel_IsNull() { regBathTel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     */
    public void setBathTel_IsNullOrEmpty() { regBathTel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_tel: {VARCHAR(15)}
     */
    public void setBathTel_IsNotNull() { regBathTel(CK_ISNN, DOBJ); }

    protected void regBathTel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathTel(), "bath_tel"); }
    protected abstract ConditionValue xgetCValueBathTel();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFee The value of bathFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathFee_Equal(Integer bathFee) {
        doSetBathFee_Equal(bathFee);
    }

    protected void doSetBathFee_Equal(Integer bathFee) {
        regBathFee(CK_EQ, bathFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFee The value of bathFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathFee_NotEqual(Integer bathFee) {
        doSetBathFee_NotEqual(bathFee);
    }

    protected void doSetBathFee_NotEqual(Integer bathFee) {
        regBathFee(CK_NES, bathFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFee The value of bathFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathFee_GreaterThan(Integer bathFee) {
        regBathFee(CK_GT, bathFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFee The value of bathFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathFee_LessThan(Integer bathFee) {
        regBathFee(CK_LT, bathFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFee The value of bathFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathFee_GreaterEqual(Integer bathFee) {
        regBathFee(CK_GE, bathFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFee The value of bathFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathFee_LessEqual(Integer bathFee) {
        regBathFee(CK_LE, bathFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param minNumber The min number of bathFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathFee_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathFee_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     * @param minNumber The min number of bathFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathFee_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathFee(), "bath_fee", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFeeList The collection of bathFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathFee_InScope(Collection<Integer> bathFeeList) {
        doSetBathFee_InScope(bathFeeList);
    }

    protected void doSetBathFee_InScope(Collection<Integer> bathFeeList) {
        regINS(CK_INS, cTL(bathFeeList), xgetCValueBathFee(), "bath_fee");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_fee: {INT(10)}
     * @param bathFeeList The collection of bathFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathFee_NotInScope(Collection<Integer> bathFeeList) {
        doSetBathFee_NotInScope(bathFeeList);
    }

    protected void doSetBathFee_NotInScope(Collection<Integer> bathFeeList) {
        regINS(CK_NINS, cTL(bathFeeList), xgetCValueBathFee(), "bath_fee");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     */
    public void setBathFee_IsNull() { regBathFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_fee: {INT(10)}
     */
    public void setBathFee_IsNotNull() { regBathFee(CK_ISNN, DOBJ); }

    protected void regBathFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathFee(), "bath_fee"); }
    protected abstract ConditionValue xgetCValueBathFee();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathType The value of bathType as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathType_Equal(Integer bathType) {
        doSetBathType_Equal(bathType);
    }

    protected void doSetBathType_Equal(Integer bathType) {
        regBathType(CK_EQ, bathType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathType The value of bathType as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathType_NotEqual(Integer bathType) {
        doSetBathType_NotEqual(bathType);
    }

    protected void doSetBathType_NotEqual(Integer bathType) {
        regBathType(CK_NES, bathType);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathType The value of bathType as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathType_GreaterThan(Integer bathType) {
        regBathType(CK_GT, bathType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathType The value of bathType as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathType_LessThan(Integer bathType) {
        regBathType(CK_LT, bathType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathType The value of bathType as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathType_GreaterEqual(Integer bathType) {
        regBathType(CK_GE, bathType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathType The value of bathType as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathType_LessEqual(Integer bathType) {
        regBathType(CK_LE, bathType);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param minNumber The min number of bathType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathType_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathType_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param minNumber The min number of bathType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathType_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathType(), "bath_type", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathTypeList The collection of bathType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathType_InScope(Collection<Integer> bathTypeList) {
        doSetBathType_InScope(bathTypeList);
    }

    protected void doSetBathType_InScope(Collection<Integer> bathTypeList) {
        regINS(CK_INS, cTL(bathTypeList), xgetCValueBathType(), "bath_type");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_type: {NotNull, INT(10)}
     * @param bathTypeList The collection of bathType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathType_NotInScope(Collection<Integer> bathTypeList) {
        doSetBathType_NotInScope(bathTypeList);
    }

    protected void doSetBathType_NotInScope(Collection<Integer> bathTypeList) {
        regINS(CK_NINS, cTL(bathTypeList), xgetCValueBathType(), "bath_type");
    }

    protected void regBathType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathType(), "bath_type"); }
    protected abstract ConditionValue xgetCValueBathType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlg The value of bath24hFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBath24hFlg_Equal(Integer bath24hFlg) {
        doSetBath24hFlg_Equal(bath24hFlg);
    }

    protected void doSetBath24hFlg_Equal(Integer bath24hFlg) {
        regBath24hFlg(CK_EQ, bath24hFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlg The value of bath24hFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBath24hFlg_NotEqual(Integer bath24hFlg) {
        doSetBath24hFlg_NotEqual(bath24hFlg);
    }

    protected void doSetBath24hFlg_NotEqual(Integer bath24hFlg) {
        regBath24hFlg(CK_NES, bath24hFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlg The value of bath24hFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBath24hFlg_GreaterThan(Integer bath24hFlg) {
        regBath24hFlg(CK_GT, bath24hFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlg The value of bath24hFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBath24hFlg_LessThan(Integer bath24hFlg) {
        regBath24hFlg(CK_LT, bath24hFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlg The value of bath24hFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBath24hFlg_GreaterEqual(Integer bath24hFlg) {
        regBath24hFlg(CK_GE, bath24hFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlg The value of bath24hFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBath24hFlg_LessEqual(Integer bath24hFlg) {
        regBath24hFlg(CK_LE, bath24hFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param minNumber The min number of bath24hFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bath24hFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBath24hFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBath24hFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param minNumber The min number of bath24hFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bath24hFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBath24hFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBath24hFlg(), "bath_24h_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlgList The collection of bath24hFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBath24hFlg_InScope(Collection<Integer> bath24hFlgList) {
        doSetBath24hFlg_InScope(bath24hFlgList);
    }

    protected void doSetBath24hFlg_InScope(Collection<Integer> bath24hFlgList) {
        regINS(CK_INS, cTL(bath24hFlgList), xgetCValueBath24hFlg(), "bath_24h_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_24h_flg: {NotNull, INT(10)}
     * @param bath24hFlgList The collection of bath24hFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBath24hFlg_NotInScope(Collection<Integer> bath24hFlgList) {
        doSetBath24hFlg_NotInScope(bath24hFlgList);
    }

    protected void doSetBath24hFlg_NotInScope(Collection<Integer> bath24hFlgList) {
        regINS(CK_NINS, cTL(bath24hFlgList), xgetCValueBath24hFlg(), "bath_24h_flg");
    }

    protected void regBath24hFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBath24hFlg(), "bath_24h_flg"); }
    protected abstract ConditionValue xgetCValueBath24hFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     * @param bathTimeSt The value of bathTimeSt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeSt_Equal(java.time.LocalTime bathTimeSt) {
        regBathTimeSt(CK_EQ,  bathTimeSt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     * @param bathTimeSt The value of bathTimeSt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeSt_GreaterThan(java.time.LocalTime bathTimeSt) {
        regBathTimeSt(CK_GT,  bathTimeSt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     * @param bathTimeSt The value of bathTimeSt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeSt_LessThan(java.time.LocalTime bathTimeSt) {
        regBathTimeSt(CK_LT,  bathTimeSt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     * @param bathTimeSt The value of bathTimeSt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeSt_GreaterEqual(java.time.LocalTime bathTimeSt) {
        regBathTimeSt(CK_GE,  bathTimeSt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     * @param bathTimeSt The value of bathTimeSt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeSt_LessEqual(java.time.LocalTime bathTimeSt) {
        regBathTimeSt(CK_LE, bathTimeSt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     */
    public void setBathTimeSt_IsNull() { regBathTimeSt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_time_st: {TIME(8)}
     */
    public void setBathTimeSt_IsNotNull() { regBathTimeSt(CK_ISNN, DOBJ); }

    protected void regBathTimeSt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathTimeSt(), "bath_time_st"); }
    protected abstract ConditionValue xgetCValueBathTimeSt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     * @param bathTimeEd The value of bathTimeEd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeEd_Equal(java.time.LocalTime bathTimeEd) {
        regBathTimeEd(CK_EQ,  bathTimeEd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     * @param bathTimeEd The value of bathTimeEd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeEd_GreaterThan(java.time.LocalTime bathTimeEd) {
        regBathTimeEd(CK_GT,  bathTimeEd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     * @param bathTimeEd The value of bathTimeEd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeEd_LessThan(java.time.LocalTime bathTimeEd) {
        regBathTimeEd(CK_LT,  bathTimeEd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     * @param bathTimeEd The value of bathTimeEd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeEd_GreaterEqual(java.time.LocalTime bathTimeEd) {
        regBathTimeEd(CK_GE,  bathTimeEd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     * @param bathTimeEd The value of bathTimeEd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTimeEd_LessEqual(java.time.LocalTime bathTimeEd) {
        regBathTimeEd(CK_LE, bathTimeEd);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     */
    public void setBathTimeEd_IsNull() { regBathTimeEd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_time_ed: {TIME(8)}
     */
    public void setBathTimeEd_IsNotNull() { regBathTimeEd(CK_ISNN, DOBJ); }

    protected void regBathTimeEd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathTimeEd(), "bath_time_ed"); }
    protected abstract ConditionValue xgetCValueBathTimeEd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLat The value of bathPlaceLat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLat_Equal(java.math.BigDecimal bathPlaceLat) {
        doSetBathPlaceLat_Equal(bathPlaceLat);
    }

    protected void doSetBathPlaceLat_Equal(java.math.BigDecimal bathPlaceLat) {
        regBathPlaceLat(CK_EQ, bathPlaceLat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLat The value of bathPlaceLat as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLat_NotEqual(java.math.BigDecimal bathPlaceLat) {
        doSetBathPlaceLat_NotEqual(bathPlaceLat);
    }

    protected void doSetBathPlaceLat_NotEqual(java.math.BigDecimal bathPlaceLat) {
        regBathPlaceLat(CK_NES, bathPlaceLat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLat The value of bathPlaceLat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLat_GreaterThan(java.math.BigDecimal bathPlaceLat) {
        regBathPlaceLat(CK_GT, bathPlaceLat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLat The value of bathPlaceLat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLat_LessThan(java.math.BigDecimal bathPlaceLat) {
        regBathPlaceLat(CK_LT, bathPlaceLat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLat The value of bathPlaceLat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLat_GreaterEqual(java.math.BigDecimal bathPlaceLat) {
        regBathPlaceLat(CK_GE, bathPlaceLat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLat The value of bathPlaceLat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLat_LessEqual(java.math.BigDecimal bathPlaceLat) {
        regBathPlaceLat(CK_LE, bathPlaceLat);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param minNumber The min number of bathPlaceLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathPlaceLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathPlaceLat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathPlaceLat_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param minNumber The min number of bathPlaceLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathPlaceLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathPlaceLat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathPlaceLat(), "bath_place_lat", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLatList The collection of bathPlaceLat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathPlaceLat_InScope(Collection<java.math.BigDecimal> bathPlaceLatList) {
        doSetBathPlaceLat_InScope(bathPlaceLatList);
    }

    protected void doSetBathPlaceLat_InScope(Collection<java.math.BigDecimal> bathPlaceLatList) {
        regINS(CK_INS, cTL(bathPlaceLatList), xgetCValueBathPlaceLat(), "bath_place_lat");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     * @param bathPlaceLatList The collection of bathPlaceLat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathPlaceLat_NotInScope(Collection<java.math.BigDecimal> bathPlaceLatList) {
        doSetBathPlaceLat_NotInScope(bathPlaceLatList);
    }

    protected void doSetBathPlaceLat_NotInScope(Collection<java.math.BigDecimal> bathPlaceLatList) {
        regINS(CK_NINS, cTL(bathPlaceLatList), xgetCValueBathPlaceLat(), "bath_place_lat");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     */
    public void setBathPlaceLat_IsNull() { regBathPlaceLat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_place_lat: {DOUBLE(9, 6)}
     */
    public void setBathPlaceLat_IsNotNull() { regBathPlaceLat(CK_ISNN, DOBJ); }

    protected void regBathPlaceLat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathPlaceLat(), "bath_place_lat"); }
    protected abstract ConditionValue xgetCValueBathPlaceLat();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLon The value of bathPlaceLon as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLon_Equal(java.math.BigDecimal bathPlaceLon) {
        doSetBathPlaceLon_Equal(bathPlaceLon);
    }

    protected void doSetBathPlaceLon_Equal(java.math.BigDecimal bathPlaceLon) {
        regBathPlaceLon(CK_EQ, bathPlaceLon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLon The value of bathPlaceLon as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLon_NotEqual(java.math.BigDecimal bathPlaceLon) {
        doSetBathPlaceLon_NotEqual(bathPlaceLon);
    }

    protected void doSetBathPlaceLon_NotEqual(java.math.BigDecimal bathPlaceLon) {
        regBathPlaceLon(CK_NES, bathPlaceLon);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLon The value of bathPlaceLon as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLon_GreaterThan(java.math.BigDecimal bathPlaceLon) {
        regBathPlaceLon(CK_GT, bathPlaceLon);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLon The value of bathPlaceLon as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLon_LessThan(java.math.BigDecimal bathPlaceLon) {
        regBathPlaceLon(CK_LT, bathPlaceLon);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLon The value of bathPlaceLon as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLon_GreaterEqual(java.math.BigDecimal bathPlaceLon) {
        regBathPlaceLon(CK_GE, bathPlaceLon);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLon The value of bathPlaceLon as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathPlaceLon_LessEqual(java.math.BigDecimal bathPlaceLon) {
        regBathPlaceLon(CK_LE, bathPlaceLon);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param minNumber The min number of bathPlaceLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathPlaceLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathPlaceLon_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathPlaceLon_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param minNumber The min number of bathPlaceLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathPlaceLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathPlaceLon_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathPlaceLon(), "bath_place_lon", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLonList The collection of bathPlaceLon as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathPlaceLon_InScope(Collection<java.math.BigDecimal> bathPlaceLonList) {
        doSetBathPlaceLon_InScope(bathPlaceLonList);
    }

    protected void doSetBathPlaceLon_InScope(Collection<java.math.BigDecimal> bathPlaceLonList) {
        regINS(CK_INS, cTL(bathPlaceLonList), xgetCValueBathPlaceLon(), "bath_place_lon");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     * @param bathPlaceLonList The collection of bathPlaceLon as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathPlaceLon_NotInScope(Collection<java.math.BigDecimal> bathPlaceLonList) {
        doSetBathPlaceLon_NotInScope(bathPlaceLonList);
    }

    protected void doSetBathPlaceLon_NotInScope(Collection<java.math.BigDecimal> bathPlaceLonList) {
        regINS(CK_NINS, cTL(bathPlaceLonList), xgetCValueBathPlaceLon(), "bath_place_lon");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     */
    public void setBathPlaceLon_IsNull() { regBathPlaceLon(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_place_lon: {DOUBLE(9, 6)}
     */
    public void setBathPlaceLon_IsNotNull() { regBathPlaceLon(CK_ISNN, DOBJ); }

    protected void regBathPlaceLon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathPlaceLon(), "bath_place_lon"); }
    protected abstract ConditionValue xgetCValueBathPlaceLon();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUp The value of bathTemperatureUp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_Equal(java.math.BigDecimal bathTemperatureUp) {
        doSetBathTemperatureUp_Equal(bathTemperatureUp);
    }

    protected void doSetBathTemperatureUp_Equal(java.math.BigDecimal bathTemperatureUp) {
        regBathTemperatureUp(CK_EQ, bathTemperatureUp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUp The value of bathTemperatureUp as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_NotEqual(java.math.BigDecimal bathTemperatureUp) {
        doSetBathTemperatureUp_NotEqual(bathTemperatureUp);
    }

    protected void doSetBathTemperatureUp_NotEqual(java.math.BigDecimal bathTemperatureUp) {
        regBathTemperatureUp(CK_NES, bathTemperatureUp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUp The value of bathTemperatureUp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_GreaterThan(java.math.BigDecimal bathTemperatureUp) {
        regBathTemperatureUp(CK_GT, bathTemperatureUp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUp The value of bathTemperatureUp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_LessThan(java.math.BigDecimal bathTemperatureUp) {
        regBathTemperatureUp(CK_LT, bathTemperatureUp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUp The value of bathTemperatureUp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_GreaterEqual(java.math.BigDecimal bathTemperatureUp) {
        regBathTemperatureUp(CK_GE, bathTemperatureUp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUp The value of bathTemperatureUp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_LessEqual(java.math.BigDecimal bathTemperatureUp) {
        regBathTemperatureUp(CK_LE, bathTemperatureUp);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param minNumber The min number of bathTemperatureUp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathTemperatureUp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathTemperatureUp_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathTemperatureUp_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param minNumber The min number of bathTemperatureUp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathTemperatureUp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathTemperatureUp_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathTemperatureUp(), "bath_temperature_up", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUpList The collection of bathTemperatureUp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_InScope(Collection<java.math.BigDecimal> bathTemperatureUpList) {
        doSetBathTemperatureUp_InScope(bathTemperatureUpList);
    }

    protected void doSetBathTemperatureUp_InScope(Collection<java.math.BigDecimal> bathTemperatureUpList) {
        regINS(CK_INS, cTL(bathTemperatureUpList), xgetCValueBathTemperatureUp(), "bath_temperature_up");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     * @param bathTemperatureUpList The collection of bathTemperatureUp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTemperatureUp_NotInScope(Collection<java.math.BigDecimal> bathTemperatureUpList) {
        doSetBathTemperatureUp_NotInScope(bathTemperatureUpList);
    }

    protected void doSetBathTemperatureUp_NotInScope(Collection<java.math.BigDecimal> bathTemperatureUpList) {
        regINS(CK_NINS, cTL(bathTemperatureUpList), xgetCValueBathTemperatureUp(), "bath_temperature_up");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     */
    public void setBathTemperatureUp_IsNull() { regBathTemperatureUp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_temperature_up: {DOUBLE(3, 3)}
     */
    public void setBathTemperatureUp_IsNotNull() { regBathTemperatureUp(CK_ISNN, DOBJ); }

    protected void regBathTemperatureUp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathTemperatureUp(), "bath_temperature_up"); }
    protected abstract ConditionValue xgetCValueBathTemperatureUp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLow The value of bathTemperatureLow as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_Equal(java.math.BigDecimal bathTemperatureLow) {
        doSetBathTemperatureLow_Equal(bathTemperatureLow);
    }

    protected void doSetBathTemperatureLow_Equal(java.math.BigDecimal bathTemperatureLow) {
        regBathTemperatureLow(CK_EQ, bathTemperatureLow);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLow The value of bathTemperatureLow as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_NotEqual(java.math.BigDecimal bathTemperatureLow) {
        doSetBathTemperatureLow_NotEqual(bathTemperatureLow);
    }

    protected void doSetBathTemperatureLow_NotEqual(java.math.BigDecimal bathTemperatureLow) {
        regBathTemperatureLow(CK_NES, bathTemperatureLow);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLow The value of bathTemperatureLow as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_GreaterThan(java.math.BigDecimal bathTemperatureLow) {
        regBathTemperatureLow(CK_GT, bathTemperatureLow);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLow The value of bathTemperatureLow as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_LessThan(java.math.BigDecimal bathTemperatureLow) {
        regBathTemperatureLow(CK_LT, bathTemperatureLow);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLow The value of bathTemperatureLow as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_GreaterEqual(java.math.BigDecimal bathTemperatureLow) {
        regBathTemperatureLow(CK_GE, bathTemperatureLow);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLow The value of bathTemperatureLow as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_LessEqual(java.math.BigDecimal bathTemperatureLow) {
        regBathTemperatureLow(CK_LE, bathTemperatureLow);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param minNumber The min number of bathTemperatureLow. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathTemperatureLow. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathTemperatureLow_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathTemperatureLow_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param minNumber The min number of bathTemperatureLow. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathTemperatureLow. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathTemperatureLow_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathTemperatureLow(), "bath_temperature_low", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLowList The collection of bathTemperatureLow as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_InScope(Collection<java.math.BigDecimal> bathTemperatureLowList) {
        doSetBathTemperatureLow_InScope(bathTemperatureLowList);
    }

    protected void doSetBathTemperatureLow_InScope(Collection<java.math.BigDecimal> bathTemperatureLowList) {
        regINS(CK_INS, cTL(bathTemperatureLowList), xgetCValueBathTemperatureLow(), "bath_temperature_low");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     * @param bathTemperatureLowList The collection of bathTemperatureLow as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathTemperatureLow_NotInScope(Collection<java.math.BigDecimal> bathTemperatureLowList) {
        doSetBathTemperatureLow_NotInScope(bathTemperatureLowList);
    }

    protected void doSetBathTemperatureLow_NotInScope(Collection<java.math.BigDecimal> bathTemperatureLowList) {
        regINS(CK_NINS, cTL(bathTemperatureLowList), xgetCValueBathTemperatureLow(), "bath_temperature_low");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     */
    public void setBathTemperatureLow_IsNull() { regBathTemperatureLow(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_temperature_low: {DOUBLE(3, 3)}
     */
    public void setBathTemperatureLow_IsNotNull() { regBathTemperatureLow(CK_ISNN, DOBJ); }

    protected void regBathTemperatureLow(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathTemperatureLow(), "bath_temperature_low"); }
    protected abstract ConditionValue xgetCValueBathTemperatureLow();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHoliday The value of bathHoliday as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathHoliday_Equal(Integer bathHoliday) {
        doSetBathHoliday_Equal(bathHoliday);
    }

    protected void doSetBathHoliday_Equal(Integer bathHoliday) {
        regBathHoliday(CK_EQ, bathHoliday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHoliday The value of bathHoliday as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathHoliday_NotEqual(Integer bathHoliday) {
        doSetBathHoliday_NotEqual(bathHoliday);
    }

    protected void doSetBathHoliday_NotEqual(Integer bathHoliday) {
        regBathHoliday(CK_NES, bathHoliday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHoliday The value of bathHoliday as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathHoliday_GreaterThan(Integer bathHoliday) {
        regBathHoliday(CK_GT, bathHoliday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHoliday The value of bathHoliday as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathHoliday_LessThan(Integer bathHoliday) {
        regBathHoliday(CK_LT, bathHoliday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHoliday The value of bathHoliday as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathHoliday_GreaterEqual(Integer bathHoliday) {
        regBathHoliday(CK_GE, bathHoliday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHoliday The value of bathHoliday as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBathHoliday_LessEqual(Integer bathHoliday) {
        regBathHoliday(CK_LE, bathHoliday);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param minNumber The min number of bathHoliday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathHoliday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBathHoliday_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBathHoliday_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param minNumber The min number of bathHoliday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bathHoliday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBathHoliday_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBathHoliday(), "bath_holiday", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHolidayList The collection of bathHoliday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathHoliday_InScope(Collection<Integer> bathHolidayList) {
        doSetBathHoliday_InScope(bathHolidayList);
    }

    protected void doSetBathHoliday_InScope(Collection<Integer> bathHolidayList) {
        regINS(CK_INS, cTL(bathHolidayList), xgetCValueBathHoliday(), "bath_holiday");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bath_holiday: {INT(10)}
     * @param bathHolidayList The collection of bathHoliday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBathHoliday_NotInScope(Collection<Integer> bathHolidayList) {
        doSetBathHoliday_NotInScope(bathHolidayList);
    }

    protected void doSetBathHoliday_NotInScope(Collection<Integer> bathHolidayList) {
        regINS(CK_NINS, cTL(bathHolidayList), xgetCValueBathHoliday(), "bath_holiday");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     */
    public void setBathHoliday_IsNull() { regBathHoliday(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bath_holiday: {INT(10)}
     */
    public void setBathHoliday_IsNotNull() { regBathHoliday(CK_ISNN, DOBJ); }

    protected void regBathHoliday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBathHoliday(), "bath_holiday"); }
    protected abstract ConditionValue xgetCValueBathHoliday();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlg The value of delFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(Integer delFlg) {
        doSetDelFlg_Equal(delFlg);
    }

    protected void doSetDelFlg_Equal(Integer delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlg The value of delFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_NotEqual(Integer delFlg) {
        doSetDelFlg_NotEqual(delFlg);
    }

    protected void doSetDelFlg_NotEqual(Integer delFlg) {
        regDelFlg(CK_NES, delFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlg The value of delFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_GreaterThan(Integer delFlg) {
        regDelFlg(CK_GT, delFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlg The value of delFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_LessThan(Integer delFlg) {
        regDelFlg(CK_LT, delFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlg The value of delFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_GreaterEqual(Integer delFlg) {
        regDelFlg(CK_GE, delFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlg The value of delFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_LessEqual(Integer delFlg) {
        regDelFlg(CK_LE, delFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param minNumber The min number of delFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDelFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDelFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param minNumber The min number of delFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDelFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelFlg(), "del_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<Integer> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    protected void doSetDelFlg_InScope(Collection<Integer> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "del_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * del_flg: {NotNull, INT(10)}
     * @param delFlgList The collection of delFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_NotInScope(Collection<Integer> delFlgList) {
        doSetDelFlg_NotInScope(delFlgList);
    }

    protected void doSetDelFlg_NotInScope(Collection<Integer> delFlgList) {
        regINS(CK_NINS, cTL(delFlgList), xgetCValueDelFlg(), "del_flg");
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "del_flg"); }
    protected abstract ConditionValue xgetCValueDelFlg();

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
    public HpSLCFunction<TBathCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBathCB.class);
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
    public HpSLCFunction<TBathCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBathCB.class);
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
    public HpSLCFunction<TBathCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBathCB.class);
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
    public HpSLCFunction<TBathCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBathCB.class);
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
    public HpSLCFunction<TBathCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBathCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBathCB&gt;() {
     *     public void query(TBathCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBathCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBathCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBathCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBathCQ sq);

    protected TBathCB xcreateScalarConditionCB() {
        TBathCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBathCB xcreateScalarConditionPartitionByCB() {
        TBathCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected TBathCB newMyCB() {
        return new TBathCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBathCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
