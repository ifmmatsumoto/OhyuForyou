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
 * The abstract condition-query of station.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsStationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsStationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "station";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCode The value of stationCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationCode_Equal(Integer stationCode) {
        doSetStationCode_Equal(stationCode);
    }

    protected void doSetStationCode_Equal(Integer stationCode) {
        regStationCode(CK_EQ, stationCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCode The value of stationCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationCode_NotEqual(Integer stationCode) {
        doSetStationCode_NotEqual(stationCode);
    }

    protected void doSetStationCode_NotEqual(Integer stationCode) {
        regStationCode(CK_NES, stationCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCode The value of stationCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationCode_GreaterThan(Integer stationCode) {
        regStationCode(CK_GT, stationCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCode The value of stationCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationCode_LessThan(Integer stationCode) {
        regStationCode(CK_LT, stationCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCode The value of stationCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationCode_GreaterEqual(Integer stationCode) {
        regStationCode(CK_GE, stationCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCode The value of stationCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationCode_LessEqual(Integer stationCode) {
        regStationCode(CK_LE, stationCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param minNumber The min number of stationCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStationCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStationCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param minNumber The min number of stationCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStationCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStationCode(), "station_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCodeList The collection of stationCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationCode_InScope(Collection<Integer> stationCodeList) {
        doSetStationCode_InScope(stationCodeList);
    }

    protected void doSetStationCode_InScope(Collection<Integer> stationCodeList) {
        regINS(CK_INS, cTL(stationCodeList), xgetCValueStationCode(), "station_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * station_code: {IX, NotNull, INT(10)}
     * @param stationCodeList The collection of stationCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationCode_NotInScope(Collection<Integer> stationCodeList) {
        doSetStationCode_NotInScope(stationCodeList);
    }

    protected void doSetStationCode_NotInScope(Collection<Integer> stationCodeList) {
        regINS(CK_NINS, cTL(stationCodeList), xgetCValueStationCode(), "station_code");
    }

    protected void regStationCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationCode(), "station_code"); }
    protected abstract ConditionValue xgetCValueStationCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_Equal(String stationAreaCode) {
        doSetStationAreaCode_Equal(fRES(stationAreaCode));
    }

    protected void doSetStationAreaCode_Equal(String stationAreaCode) {
        regStationAreaCode(CK_EQ, stationAreaCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_NotEqual(String stationAreaCode) {
        doSetStationAreaCode_NotEqual(fRES(stationAreaCode));
    }

    protected void doSetStationAreaCode_NotEqual(String stationAreaCode) {
        regStationAreaCode(CK_NES, stationAreaCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_GreaterThan(String stationAreaCode) {
        regStationAreaCode(CK_GT, fRES(stationAreaCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_LessThan(String stationAreaCode) {
        regStationAreaCode(CK_LT, fRES(stationAreaCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_GreaterEqual(String stationAreaCode) {
        regStationAreaCode(CK_GE, fRES(stationAreaCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_LessEqual(String stationAreaCode) {
        regStationAreaCode(CK_LE, fRES(stationAreaCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCodeList The collection of stationAreaCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_InScope(Collection<String> stationAreaCodeList) {
        doSetStationAreaCode_InScope(stationAreaCodeList);
    }

    protected void doSetStationAreaCode_InScope(Collection<String> stationAreaCodeList) {
        regINS(CK_INS, cTL(stationAreaCodeList), xgetCValueStationAreaCode(), "station_area_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCodeList The collection of stationAreaCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationAreaCode_NotInScope(Collection<String> stationAreaCodeList) {
        doSetStationAreaCode_NotInScope(stationAreaCodeList);
    }

    protected void doSetStationAreaCode_NotInScope(Collection<String> stationAreaCodeList) {
        regINS(CK_NINS, cTL(stationAreaCodeList), xgetCValueStationAreaCode(), "station_area_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setStationAreaCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationAreaCode The value of stationAreaCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationAreaCode_LikeSearch(String stationAreaCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationAreaCode_LikeSearch(stationAreaCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setStationAreaCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationAreaCode The value of stationAreaCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationAreaCode_LikeSearch(String stationAreaCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationAreaCode), xgetCValueStationAreaCode(), "station_area_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationAreaCode_NotLikeSearch(String stationAreaCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationAreaCode_NotLikeSearch(stationAreaCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_area_code: {NotNull, VARCHAR(255)}
     * @param stationAreaCode The value of stationAreaCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationAreaCode_NotLikeSearch(String stationAreaCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationAreaCode), xgetCValueStationAreaCode(), "station_area_code", likeSearchOption);
    }

    protected void regStationAreaCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationAreaCode(), "station_area_code"); }
    protected abstract ConditionValue xgetCValueStationAreaCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_Equal(String stationLineCode) {
        doSetStationLineCode_Equal(fRES(stationLineCode));
    }

    protected void doSetStationLineCode_Equal(String stationLineCode) {
        regStationLineCode(CK_EQ, stationLineCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_NotEqual(String stationLineCode) {
        doSetStationLineCode_NotEqual(fRES(stationLineCode));
    }

    protected void doSetStationLineCode_NotEqual(String stationLineCode) {
        regStationLineCode(CK_NES, stationLineCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_GreaterThan(String stationLineCode) {
        regStationLineCode(CK_GT, fRES(stationLineCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_LessThan(String stationLineCode) {
        regStationLineCode(CK_LT, fRES(stationLineCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_GreaterEqual(String stationLineCode) {
        regStationLineCode(CK_GE, fRES(stationLineCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_LessEqual(String stationLineCode) {
        regStationLineCode(CK_LE, fRES(stationLineCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCodeList The collection of stationLineCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_InScope(Collection<String> stationLineCodeList) {
        doSetStationLineCode_InScope(stationLineCodeList);
    }

    protected void doSetStationLineCode_InScope(Collection<String> stationLineCodeList) {
        regINS(CK_INS, cTL(stationLineCodeList), xgetCValueStationLineCode(), "station_line_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCodeList The collection of stationLineCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineCode_NotInScope(Collection<String> stationLineCodeList) {
        doSetStationLineCode_NotInScope(stationLineCodeList);
    }

    protected void doSetStationLineCode_NotInScope(Collection<String> stationLineCodeList) {
        regINS(CK_NINS, cTL(stationLineCodeList), xgetCValueStationLineCode(), "station_line_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setStationLineCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationLineCode The value of stationLineCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationLineCode_LikeSearch(String stationLineCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationLineCode_LikeSearch(stationLineCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setStationLineCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationLineCode The value of stationLineCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationLineCode_LikeSearch(String stationLineCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationLineCode), xgetCValueStationLineCode(), "station_line_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationLineCode_NotLikeSearch(String stationLineCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationLineCode_NotLikeSearch(stationLineCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_code: {NotNull, VARCHAR(255)}
     * @param stationLineCode The value of stationLineCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationLineCode_NotLikeSearch(String stationLineCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationLineCode), xgetCValueStationLineCode(), "station_line_code", likeSearchOption);
    }

    protected void regStationLineCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationLineCode(), "station_line_code"); }
    protected abstract ConditionValue xgetCValueStationLineCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_Equal(String stationLineNameJa) {
        doSetStationLineNameJa_Equal(fRES(stationLineNameJa));
    }

    protected void doSetStationLineNameJa_Equal(String stationLineNameJa) {
        regStationLineNameJa(CK_EQ, stationLineNameJa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_NotEqual(String stationLineNameJa) {
        doSetStationLineNameJa_NotEqual(fRES(stationLineNameJa));
    }

    protected void doSetStationLineNameJa_NotEqual(String stationLineNameJa) {
        regStationLineNameJa(CK_NES, stationLineNameJa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_GreaterThan(String stationLineNameJa) {
        regStationLineNameJa(CK_GT, fRES(stationLineNameJa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_LessThan(String stationLineNameJa) {
        regStationLineNameJa(CK_LT, fRES(stationLineNameJa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_GreaterEqual(String stationLineNameJa) {
        regStationLineNameJa(CK_GE, fRES(stationLineNameJa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_LessEqual(String stationLineNameJa) {
        regStationLineNameJa(CK_LE, fRES(stationLineNameJa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJaList The collection of stationLineNameJa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_InScope(Collection<String> stationLineNameJaList) {
        doSetStationLineNameJa_InScope(stationLineNameJaList);
    }

    protected void doSetStationLineNameJa_InScope(Collection<String> stationLineNameJaList) {
        regINS(CK_INS, cTL(stationLineNameJaList), xgetCValueStationLineNameJa(), "station_line_name_ja");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJaList The collection of stationLineNameJa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameJa_NotInScope(Collection<String> stationLineNameJaList) {
        doSetStationLineNameJa_NotInScope(stationLineNameJaList);
    }

    protected void doSetStationLineNameJa_NotInScope(Collection<String> stationLineNameJaList) {
        regINS(CK_NINS, cTL(stationLineNameJaList), xgetCValueStationLineNameJa(), "station_line_name_ja");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)} <br>
     * <pre>e.g. setStationLineNameJa_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationLineNameJa The value of stationLineNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationLineNameJa_LikeSearch(String stationLineNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationLineNameJa_LikeSearch(stationLineNameJa, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)} <br>
     * <pre>e.g. setStationLineNameJa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationLineNameJa The value of stationLineNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationLineNameJa_LikeSearch(String stationLineNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationLineNameJa), xgetCValueStationLineNameJa(), "station_line_name_ja", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationLineNameJa_NotLikeSearch(String stationLineNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationLineNameJa_NotLikeSearch(stationLineNameJa, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     * @param stationLineNameJa The value of stationLineNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationLineNameJa_NotLikeSearch(String stationLineNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationLineNameJa), xgetCValueStationLineNameJa(), "station_line_name_ja", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     */
    public void setStationLineNameJa_IsNull() { regStationLineNameJa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     */
    public void setStationLineNameJa_IsNullOrEmpty() { regStationLineNameJa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_line_name_ja: {VARCHAR(255)}
     */
    public void setStationLineNameJa_IsNotNull() { regStationLineNameJa(CK_ISNN, DOBJ); }

    protected void regStationLineNameJa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationLineNameJa(), "station_line_name_ja"); }
    protected abstract ConditionValue xgetCValueStationLineNameJa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_Equal(String stationLineNameEn) {
        doSetStationLineNameEn_Equal(fRES(stationLineNameEn));
    }

    protected void doSetStationLineNameEn_Equal(String stationLineNameEn) {
        regStationLineNameEn(CK_EQ, stationLineNameEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_NotEqual(String stationLineNameEn) {
        doSetStationLineNameEn_NotEqual(fRES(stationLineNameEn));
    }

    protected void doSetStationLineNameEn_NotEqual(String stationLineNameEn) {
        regStationLineNameEn(CK_NES, stationLineNameEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_GreaterThan(String stationLineNameEn) {
        regStationLineNameEn(CK_GT, fRES(stationLineNameEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_LessThan(String stationLineNameEn) {
        regStationLineNameEn(CK_LT, fRES(stationLineNameEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_GreaterEqual(String stationLineNameEn) {
        regStationLineNameEn(CK_GE, fRES(stationLineNameEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_LessEqual(String stationLineNameEn) {
        regStationLineNameEn(CK_LE, fRES(stationLineNameEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEnList The collection of stationLineNameEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_InScope(Collection<String> stationLineNameEnList) {
        doSetStationLineNameEn_InScope(stationLineNameEnList);
    }

    protected void doSetStationLineNameEn_InScope(Collection<String> stationLineNameEnList) {
        regINS(CK_INS, cTL(stationLineNameEnList), xgetCValueStationLineNameEn(), "station_line_name_en");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEnList The collection of stationLineNameEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLineNameEn_NotInScope(Collection<String> stationLineNameEnList) {
        doSetStationLineNameEn_NotInScope(stationLineNameEnList);
    }

    protected void doSetStationLineNameEn_NotInScope(Collection<String> stationLineNameEnList) {
        regINS(CK_NINS, cTL(stationLineNameEnList), xgetCValueStationLineNameEn(), "station_line_name_en");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_en: {VARCHAR(255)} <br>
     * <pre>e.g. setStationLineNameEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationLineNameEn The value of stationLineNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationLineNameEn_LikeSearch(String stationLineNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationLineNameEn_LikeSearch(stationLineNameEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_en: {VARCHAR(255)} <br>
     * <pre>e.g. setStationLineNameEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationLineNameEn The value of stationLineNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationLineNameEn_LikeSearch(String stationLineNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationLineNameEn), xgetCValueStationLineNameEn(), "station_line_name_en", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationLineNameEn_NotLikeSearch(String stationLineNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationLineNameEn_NotLikeSearch(stationLineNameEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     * @param stationLineNameEn The value of stationLineNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationLineNameEn_NotLikeSearch(String stationLineNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationLineNameEn), xgetCValueStationLineNameEn(), "station_line_name_en", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     */
    public void setStationLineNameEn_IsNull() { regStationLineNameEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     */
    public void setStationLineNameEn_IsNullOrEmpty() { regStationLineNameEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_line_name_en: {VARCHAR(255)}
     */
    public void setStationLineNameEn_IsNotNull() { regStationLineNameEn(CK_ISNN, DOBJ); }

    protected void regStationLineNameEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationLineNameEn(), "station_line_name_en"); }
    protected abstract ConditionValue xgetCValueStationLineNameEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_Equal(String stationGCd) {
        doSetStationGCd_Equal(fRES(stationGCd));
    }

    protected void doSetStationGCd_Equal(String stationGCd) {
        regStationGCd(CK_EQ, stationGCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_NotEqual(String stationGCd) {
        doSetStationGCd_NotEqual(fRES(stationGCd));
    }

    protected void doSetStationGCd_NotEqual(String stationGCd) {
        regStationGCd(CK_NES, stationGCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_GreaterThan(String stationGCd) {
        regStationGCd(CK_GT, fRES(stationGCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_LessThan(String stationGCd) {
        regStationGCd(CK_LT, fRES(stationGCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_GreaterEqual(String stationGCd) {
        regStationGCd(CK_GE, fRES(stationGCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_LessEqual(String stationGCd) {
        regStationGCd(CK_LE, fRES(stationGCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCdList The collection of stationGCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_InScope(Collection<String> stationGCdList) {
        doSetStationGCd_InScope(stationGCdList);
    }

    protected void doSetStationGCd_InScope(Collection<String> stationGCdList) {
        regINS(CK_INS, cTL(stationGCdList), xgetCValueStationGCd(), "station_g_cd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCdList The collection of stationGCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationGCd_NotInScope(Collection<String> stationGCdList) {
        doSetStationGCd_NotInScope(stationGCdList);
    }

    protected void doSetStationGCd_NotInScope(Collection<String> stationGCdList) {
        regINS(CK_NINS, cTL(stationGCdList), xgetCValueStationGCd(), "station_g_cd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_g_cd: {VARCHAR(255)} <br>
     * <pre>e.g. setStationGCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationGCd The value of stationGCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationGCd_LikeSearch(String stationGCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationGCd_LikeSearch(stationGCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_g_cd: {VARCHAR(255)} <br>
     * <pre>e.g. setStationGCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationGCd The value of stationGCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationGCd_LikeSearch(String stationGCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationGCd), xgetCValueStationGCd(), "station_g_cd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationGCd_NotLikeSearch(String stationGCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationGCd_NotLikeSearch(stationGCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     * @param stationGCd The value of stationGCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationGCd_NotLikeSearch(String stationGCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationGCd), xgetCValueStationGCd(), "station_g_cd", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     */
    public void setStationGCd_IsNull() { regStationGCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     */
    public void setStationGCd_IsNullOrEmpty() { regStationGCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_g_cd: {VARCHAR(255)}
     */
    public void setStationGCd_IsNotNull() { regStationGCd(CK_ISNN, DOBJ); }

    protected void regStationGCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationGCd(), "station_g_cd"); }
    protected abstract ConditionValue xgetCValueStationGCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_Equal(String stationNameJa) {
        doSetStationNameJa_Equal(fRES(stationNameJa));
    }

    protected void doSetStationNameJa_Equal(String stationNameJa) {
        regStationNameJa(CK_EQ, stationNameJa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_NotEqual(String stationNameJa) {
        doSetStationNameJa_NotEqual(fRES(stationNameJa));
    }

    protected void doSetStationNameJa_NotEqual(String stationNameJa) {
        regStationNameJa(CK_NES, stationNameJa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_GreaterThan(String stationNameJa) {
        regStationNameJa(CK_GT, fRES(stationNameJa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_LessThan(String stationNameJa) {
        regStationNameJa(CK_LT, fRES(stationNameJa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_GreaterEqual(String stationNameJa) {
        regStationNameJa(CK_GE, fRES(stationNameJa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_LessEqual(String stationNameJa) {
        regStationNameJa(CK_LE, fRES(stationNameJa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJaList The collection of stationNameJa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_InScope(Collection<String> stationNameJaList) {
        doSetStationNameJa_InScope(stationNameJaList);
    }

    protected void doSetStationNameJa_InScope(Collection<String> stationNameJaList) {
        regINS(CK_INS, cTL(stationNameJaList), xgetCValueStationNameJa(), "station_name_ja");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJaList The collection of stationNameJa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameJa_NotInScope(Collection<String> stationNameJaList) {
        doSetStationNameJa_NotInScope(stationNameJaList);
    }

    protected void doSetStationNameJa_NotInScope(Collection<String> stationNameJaList) {
        regINS(CK_NINS, cTL(stationNameJaList), xgetCValueStationNameJa(), "station_name_ja");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_ja: {VARCHAR(255)} <br>
     * <pre>e.g. setStationNameJa_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationNameJa The value of stationNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationNameJa_LikeSearch(String stationNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationNameJa_LikeSearch(stationNameJa, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_ja: {VARCHAR(255)} <br>
     * <pre>e.g. setStationNameJa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationNameJa The value of stationNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationNameJa_LikeSearch(String stationNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationNameJa), xgetCValueStationNameJa(), "station_name_ja", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationNameJa_NotLikeSearch(String stationNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationNameJa_NotLikeSearch(stationNameJa, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     * @param stationNameJa The value of stationNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationNameJa_NotLikeSearch(String stationNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationNameJa), xgetCValueStationNameJa(), "station_name_ja", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     */
    public void setStationNameJa_IsNull() { regStationNameJa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     */
    public void setStationNameJa_IsNullOrEmpty() { regStationNameJa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_name_ja: {VARCHAR(255)}
     */
    public void setStationNameJa_IsNotNull() { regStationNameJa(CK_ISNN, DOBJ); }

    protected void regStationNameJa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationNameJa(), "station_name_ja"); }
    protected abstract ConditionValue xgetCValueStationNameJa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_Equal(String stationNameEn) {
        doSetStationNameEn_Equal(fRES(stationNameEn));
    }

    protected void doSetStationNameEn_Equal(String stationNameEn) {
        regStationNameEn(CK_EQ, stationNameEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_NotEqual(String stationNameEn) {
        doSetStationNameEn_NotEqual(fRES(stationNameEn));
    }

    protected void doSetStationNameEn_NotEqual(String stationNameEn) {
        regStationNameEn(CK_NES, stationNameEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_GreaterThan(String stationNameEn) {
        regStationNameEn(CK_GT, fRES(stationNameEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_LessThan(String stationNameEn) {
        regStationNameEn(CK_LT, fRES(stationNameEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_GreaterEqual(String stationNameEn) {
        regStationNameEn(CK_GE, fRES(stationNameEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_LessEqual(String stationNameEn) {
        regStationNameEn(CK_LE, fRES(stationNameEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEnList The collection of stationNameEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_InScope(Collection<String> stationNameEnList) {
        doSetStationNameEn_InScope(stationNameEnList);
    }

    protected void doSetStationNameEn_InScope(Collection<String> stationNameEnList) {
        regINS(CK_INS, cTL(stationNameEnList), xgetCValueStationNameEn(), "station_name_en");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEnList The collection of stationNameEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationNameEn_NotInScope(Collection<String> stationNameEnList) {
        doSetStationNameEn_NotInScope(stationNameEnList);
    }

    protected void doSetStationNameEn_NotInScope(Collection<String> stationNameEnList) {
        regINS(CK_NINS, cTL(stationNameEnList), xgetCValueStationNameEn(), "station_name_en");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_en: {VARCHAR(255)} <br>
     * <pre>e.g. setStationNameEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationNameEn The value of stationNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationNameEn_LikeSearch(String stationNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationNameEn_LikeSearch(stationNameEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_en: {VARCHAR(255)} <br>
     * <pre>e.g. setStationNameEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationNameEn The value of stationNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationNameEn_LikeSearch(String stationNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationNameEn), xgetCValueStationNameEn(), "station_name_en", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationNameEn_NotLikeSearch(String stationNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationNameEn_NotLikeSearch(stationNameEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     * @param stationNameEn The value of stationNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationNameEn_NotLikeSearch(String stationNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationNameEn), xgetCValueStationNameEn(), "station_name_en", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     */
    public void setStationNameEn_IsNull() { regStationNameEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     */
    public void setStationNameEn_IsNullOrEmpty() { regStationNameEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_name_en: {VARCHAR(255)}
     */
    public void setStationNameEn_IsNotNull() { regStationNameEn(CK_ISNN, DOBJ); }

    protected void regStationNameEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationNameEn(), "station_name_en"); }
    protected abstract ConditionValue xgetCValueStationNameEn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLon The value of stationLon as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLon_Equal(java.math.BigDecimal stationLon) {
        doSetStationLon_Equal(stationLon);
    }

    protected void doSetStationLon_Equal(java.math.BigDecimal stationLon) {
        regStationLon(CK_EQ, stationLon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLon The value of stationLon as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLon_NotEqual(java.math.BigDecimal stationLon) {
        doSetStationLon_NotEqual(stationLon);
    }

    protected void doSetStationLon_NotEqual(java.math.BigDecimal stationLon) {
        regStationLon(CK_NES, stationLon);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLon The value of stationLon as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLon_GreaterThan(java.math.BigDecimal stationLon) {
        regStationLon(CK_GT, stationLon);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLon The value of stationLon as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLon_LessThan(java.math.BigDecimal stationLon) {
        regStationLon(CK_LT, stationLon);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLon The value of stationLon as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLon_GreaterEqual(java.math.BigDecimal stationLon) {
        regStationLon(CK_GE, stationLon);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLon The value of stationLon as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLon_LessEqual(java.math.BigDecimal stationLon) {
        regStationLon(CK_LE, stationLon);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param minNumber The min number of stationLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStationLon_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStationLon_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param minNumber The min number of stationLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationLon. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStationLon_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStationLon(), "station_lon", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLonList The collection of stationLon as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLon_InScope(Collection<java.math.BigDecimal> stationLonList) {
        doSetStationLon_InScope(stationLonList);
    }

    protected void doSetStationLon_InScope(Collection<java.math.BigDecimal> stationLonList) {
        regINS(CK_INS, cTL(stationLonList), xgetCValueStationLon(), "station_lon");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     * @param stationLonList The collection of stationLon as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLon_NotInScope(Collection<java.math.BigDecimal> stationLonList) {
        doSetStationLon_NotInScope(stationLonList);
    }

    protected void doSetStationLon_NotInScope(Collection<java.math.BigDecimal> stationLonList) {
        regINS(CK_NINS, cTL(stationLonList), xgetCValueStationLon(), "station_lon");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     */
    public void setStationLon_IsNull() { regStationLon(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_lon: {DOUBLE(9, 6)}
     */
    public void setStationLon_IsNotNull() { regStationLon(CK_ISNN, DOBJ); }

    protected void regStationLon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationLon(), "station_lon"); }
    protected abstract ConditionValue xgetCValueStationLon();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLat The value of stationLat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLat_Equal(java.math.BigDecimal stationLat) {
        doSetStationLat_Equal(stationLat);
    }

    protected void doSetStationLat_Equal(java.math.BigDecimal stationLat) {
        regStationLat(CK_EQ, stationLat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLat The value of stationLat as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLat_NotEqual(java.math.BigDecimal stationLat) {
        doSetStationLat_NotEqual(stationLat);
    }

    protected void doSetStationLat_NotEqual(java.math.BigDecimal stationLat) {
        regStationLat(CK_NES, stationLat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLat The value of stationLat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLat_GreaterThan(java.math.BigDecimal stationLat) {
        regStationLat(CK_GT, stationLat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLat The value of stationLat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLat_LessThan(java.math.BigDecimal stationLat) {
        regStationLat(CK_LT, stationLat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLat The value of stationLat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLat_GreaterEqual(java.math.BigDecimal stationLat) {
        regStationLat(CK_GE, stationLat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLat The value of stationLat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationLat_LessEqual(java.math.BigDecimal stationLat) {
        regStationLat(CK_LE, stationLat);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param minNumber The min number of stationLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStationLat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStationLat_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param minNumber The min number of stationLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationLat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStationLat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStationLat(), "station_lat", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLatList The collection of stationLat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLat_InScope(Collection<java.math.BigDecimal> stationLatList) {
        doSetStationLat_InScope(stationLatList);
    }

    protected void doSetStationLat_InScope(Collection<java.math.BigDecimal> stationLatList) {
        regINS(CK_INS, cTL(stationLatList), xgetCValueStationLat(), "station_lat");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     * @param stationLatList The collection of stationLat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationLat_NotInScope(Collection<java.math.BigDecimal> stationLatList) {
        doSetStationLat_NotInScope(stationLatList);
    }

    protected void doSetStationLat_NotInScope(Collection<java.math.BigDecimal> stationLatList) {
        regINS(CK_NINS, cTL(stationLatList), xgetCValueStationLat(), "station_lat");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     */
    public void setStationLat_IsNull() { regStationLat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_lat: {DOUBLE(9, 6)}
     */
    public void setStationLat_IsNotNull() { regStationLat(CK_ISNN, DOBJ); }

    protected void regStationLat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationLat(), "station_lat"); }
    protected abstract ConditionValue xgetCValueStationLat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_Equal(String stationImage) {
        doSetStationImage_Equal(fRES(stationImage));
    }

    protected void doSetStationImage_Equal(String stationImage) {
        regStationImage(CK_EQ, stationImage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_NotEqual(String stationImage) {
        doSetStationImage_NotEqual(fRES(stationImage));
    }

    protected void doSetStationImage_NotEqual(String stationImage) {
        regStationImage(CK_NES, stationImage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_GreaterThan(String stationImage) {
        regStationImage(CK_GT, fRES(stationImage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_LessThan(String stationImage) {
        regStationImage(CK_LT, fRES(stationImage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_GreaterEqual(String stationImage) {
        regStationImage(CK_GE, fRES(stationImage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_LessEqual(String stationImage) {
        regStationImage(CK_LE, fRES(stationImage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImageList The collection of stationImage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_InScope(Collection<String> stationImageList) {
        doSetStationImage_InScope(stationImageList);
    }

    protected void doSetStationImage_InScope(Collection<String> stationImageList) {
        regINS(CK_INS, cTL(stationImageList), xgetCValueStationImage(), "station_image");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImageList The collection of stationImage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationImage_NotInScope(Collection<String> stationImageList) {
        doSetStationImage_NotInScope(stationImageList);
    }

    protected void doSetStationImage_NotInScope(Collection<String> stationImageList) {
        regINS(CK_NINS, cTL(stationImageList), xgetCValueStationImage(), "station_image");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setStationImage_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationImage The value of stationImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationImage_LikeSearch(String stationImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationImage_LikeSearch(stationImage, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setStationImage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationImage The value of stationImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationImage_LikeSearch(String stationImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationImage), xgetCValueStationImage(), "station_image", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationImage_NotLikeSearch(String stationImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationImage_NotLikeSearch(stationImage, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_image: {VARCHAR(2100)}
     * @param stationImage The value of stationImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationImage_NotLikeSearch(String stationImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationImage), xgetCValueStationImage(), "station_image", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     */
    public void setStationImage_IsNull() { regStationImage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     */
    public void setStationImage_IsNullOrEmpty() { regStationImage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_image: {VARCHAR(2100)}
     */
    public void setStationImage_IsNotNull() { regStationImage(CK_ISNN, DOBJ); }

    protected void regStationImage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationImage(), "station_image"); }
    protected abstract ConditionValue xgetCValueStationImage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_Equal(String stationColor) {
        doSetStationColor_Equal(fRES(stationColor));
    }

    protected void doSetStationColor_Equal(String stationColor) {
        regStationColor(CK_EQ, stationColor);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_NotEqual(String stationColor) {
        doSetStationColor_NotEqual(fRES(stationColor));
    }

    protected void doSetStationColor_NotEqual(String stationColor) {
        regStationColor(CK_NES, stationColor);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_GreaterThan(String stationColor) {
        regStationColor(CK_GT, fRES(stationColor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_LessThan(String stationColor) {
        regStationColor(CK_LT, fRES(stationColor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_GreaterEqual(String stationColor) {
        regStationColor(CK_GE, fRES(stationColor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_LessEqual(String stationColor) {
        regStationColor(CK_LE, fRES(stationColor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColorList The collection of stationColor as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_InScope(Collection<String> stationColorList) {
        doSetStationColor_InScope(stationColorList);
    }

    protected void doSetStationColor_InScope(Collection<String> stationColorList) {
        regINS(CK_INS, cTL(stationColorList), xgetCValueStationColor(), "station_color");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColorList The collection of stationColor as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationColor_NotInScope(Collection<String> stationColorList) {
        doSetStationColor_NotInScope(stationColorList);
    }

    protected void doSetStationColor_NotInScope(Collection<String> stationColorList) {
        regINS(CK_NINS, cTL(stationColorList), xgetCValueStationColor(), "station_color");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_color: {VARCHAR(255)} <br>
     * <pre>e.g. setStationColor_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationColor The value of stationColor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationColor_LikeSearch(String stationColor, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationColor_LikeSearch(stationColor, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_color: {VARCHAR(255)} <br>
     * <pre>e.g. setStationColor_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationColor The value of stationColor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationColor_LikeSearch(String stationColor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationColor), xgetCValueStationColor(), "station_color", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationColor_NotLikeSearch(String stationColor, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationColor_NotLikeSearch(stationColor, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * station_color: {VARCHAR(255)}
     * @param stationColor The value of stationColor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationColor_NotLikeSearch(String stationColor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationColor), xgetCValueStationColor(), "station_color", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     */
    public void setStationColor_IsNull() { regStationColor(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     */
    public void setStationColor_IsNullOrEmpty() { regStationColor(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * station_color: {VARCHAR(255)}
     */
    public void setStationColor_IsNotNull() { regStationColor(CK_ISNN, DOBJ); }

    protected void regStationColor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationColor(), "station_color"); }
    protected abstract ConditionValue xgetCValueStationColor();

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
    public HpSLCFunction<StationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, StationCB.class);
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
    public HpSLCFunction<StationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, StationCB.class);
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
    public HpSLCFunction<StationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, StationCB.class);
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
    public HpSLCFunction<StationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, StationCB.class);
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
    public HpSLCFunction<StationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, StationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;StationCB&gt;() {
     *     public void query(StationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, StationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        StationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(StationCQ sq);

    protected StationCB xcreateScalarConditionCB() {
        StationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected StationCB xcreateScalarConditionPartitionByCB() {
        StationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected StationCB newMyCB() {
        return new StationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return StationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
