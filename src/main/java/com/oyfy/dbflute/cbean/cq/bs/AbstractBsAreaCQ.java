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
 * The abstract condition-query of area.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAreaCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAreaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "area";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCode The value of cityCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCityCode_Equal(Integer cityCode) {
        doSetCityCode_Equal(cityCode);
    }

    protected void doSetCityCode_Equal(Integer cityCode) {
        regCityCode(CK_EQ, cityCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCode The value of cityCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCityCode_NotEqual(Integer cityCode) {
        doSetCityCode_NotEqual(cityCode);
    }

    protected void doSetCityCode_NotEqual(Integer cityCode) {
        regCityCode(CK_NES, cityCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCode The value of cityCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCityCode_GreaterThan(Integer cityCode) {
        regCityCode(CK_GT, cityCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCode The value of cityCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCityCode_LessThan(Integer cityCode) {
        regCityCode(CK_LT, cityCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCode The value of cityCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCityCode_GreaterEqual(Integer cityCode) {
        regCityCode(CK_GE, cityCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCode The value of cityCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCityCode_LessEqual(Integer cityCode) {
        regCityCode(CK_LE, cityCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param minNumber The min number of cityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCityCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCityCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param minNumber The min number of cityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cityCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCityCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCityCode(), "city_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCodeList The collection of cityCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityCode_InScope(Collection<Integer> cityCodeList) {
        doSetCityCode_InScope(cityCodeList);
    }

    protected void doSetCityCode_InScope(Collection<Integer> cityCodeList) {
        regINS(CK_INS, cTL(cityCodeList), xgetCValueCityCode(), "city_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * city_code: {IX, NotNull, INT(10)}
     * @param cityCodeList The collection of cityCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityCode_NotInScope(Collection<Integer> cityCodeList) {
        doSetCityCode_NotInScope(cityCodeList);
    }

    protected void doSetCityCode_NotInScope(Collection<Integer> cityCodeList) {
        regINS(CK_NINS, cTL(cityCodeList), xgetCValueCityCode(), "city_code");
    }

    protected void regCityCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCityCode(), "city_code"); }
    protected abstract ConditionValue xgetCValueCityCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_Equal(String cityNameJa) {
        doSetCityNameJa_Equal(fRES(cityNameJa));
    }

    protected void doSetCityNameJa_Equal(String cityNameJa) {
        regCityNameJa(CK_EQ, cityNameJa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_NotEqual(String cityNameJa) {
        doSetCityNameJa_NotEqual(fRES(cityNameJa));
    }

    protected void doSetCityNameJa_NotEqual(String cityNameJa) {
        regCityNameJa(CK_NES, cityNameJa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_GreaterThan(String cityNameJa) {
        regCityNameJa(CK_GT, fRES(cityNameJa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_LessThan(String cityNameJa) {
        regCityNameJa(CK_LT, fRES(cityNameJa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_GreaterEqual(String cityNameJa) {
        regCityNameJa(CK_GE, fRES(cityNameJa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_LessEqual(String cityNameJa) {
        regCityNameJa(CK_LE, fRES(cityNameJa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJaList The collection of cityNameJa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_InScope(Collection<String> cityNameJaList) {
        doSetCityNameJa_InScope(cityNameJaList);
    }

    protected void doSetCityNameJa_InScope(Collection<String> cityNameJaList) {
        regINS(CK_INS, cTL(cityNameJaList), xgetCValueCityNameJa(), "city_name_ja");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJaList The collection of cityNameJa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameJa_NotInScope(Collection<String> cityNameJaList) {
        doSetCityNameJa_NotInScope(cityNameJaList);
    }

    protected void doSetCityNameJa_NotInScope(Collection<String> cityNameJaList) {
        regINS(CK_NINS, cTL(cityNameJaList), xgetCValueCityNameJa(), "city_name_ja");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCityNameJa_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cityNameJa The value of cityNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityNameJa_LikeSearch(String cityNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityNameJa_LikeSearch(cityNameJa, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCityNameJa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cityNameJa The value of cityNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCityNameJa_LikeSearch(String cityNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cityNameJa), xgetCValueCityNameJa(), "city_name_ja", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityNameJa_NotLikeSearch(String cityNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityNameJa_NotLikeSearch(cityNameJa, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_ja: {NotNull, VARCHAR(255)}
     * @param cityNameJa The value of cityNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCityNameJa_NotLikeSearch(String cityNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cityNameJa), xgetCValueCityNameJa(), "city_name_ja", likeSearchOption);
    }

    protected void regCityNameJa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCityNameJa(), "city_name_ja"); }
    protected abstract ConditionValue xgetCValueCityNameJa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_Equal(String cityNameEn) {
        doSetCityNameEn_Equal(fRES(cityNameEn));
    }

    protected void doSetCityNameEn_Equal(String cityNameEn) {
        regCityNameEn(CK_EQ, cityNameEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_NotEqual(String cityNameEn) {
        doSetCityNameEn_NotEqual(fRES(cityNameEn));
    }

    protected void doSetCityNameEn_NotEqual(String cityNameEn) {
        regCityNameEn(CK_NES, cityNameEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_GreaterThan(String cityNameEn) {
        regCityNameEn(CK_GT, fRES(cityNameEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_LessThan(String cityNameEn) {
        regCityNameEn(CK_LT, fRES(cityNameEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_GreaterEqual(String cityNameEn) {
        regCityNameEn(CK_GE, fRES(cityNameEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_LessEqual(String cityNameEn) {
        regCityNameEn(CK_LE, fRES(cityNameEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEnList The collection of cityNameEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_InScope(Collection<String> cityNameEnList) {
        doSetCityNameEn_InScope(cityNameEnList);
    }

    protected void doSetCityNameEn_InScope(Collection<String> cityNameEnList) {
        regINS(CK_INS, cTL(cityNameEnList), xgetCValueCityNameEn(), "city_name_en");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEnList The collection of cityNameEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityNameEn_NotInScope(Collection<String> cityNameEnList) {
        doSetCityNameEn_NotInScope(cityNameEnList);
    }

    protected void doSetCityNameEn_NotInScope(Collection<String> cityNameEnList) {
        regINS(CK_NINS, cTL(cityNameEnList), xgetCValueCityNameEn(), "city_name_en");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCityNameEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cityNameEn The value of cityNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityNameEn_LikeSearch(String cityNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityNameEn_LikeSearch(cityNameEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCityNameEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cityNameEn The value of cityNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCityNameEn_LikeSearch(String cityNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cityNameEn), xgetCValueCityNameEn(), "city_name_en", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityNameEn_NotLikeSearch(String cityNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityNameEn_NotLikeSearch(cityNameEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_name_en: {NotNull, VARCHAR(255)}
     * @param cityNameEn The value of cityNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCityNameEn_NotLikeSearch(String cityNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cityNameEn), xgetCValueCityNameEn(), "city_name_en", likeSearchOption);
    }

    protected void regCityNameEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCityNameEn(), "city_name_en"); }
    protected abstract ConditionValue xgetCValueCityNameEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_Equal(String cityImage) {
        doSetCityImage_Equal(fRES(cityImage));
    }

    protected void doSetCityImage_Equal(String cityImage) {
        regCityImage(CK_EQ, cityImage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_NotEqual(String cityImage) {
        doSetCityImage_NotEqual(fRES(cityImage));
    }

    protected void doSetCityImage_NotEqual(String cityImage) {
        regCityImage(CK_NES, cityImage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_GreaterThan(String cityImage) {
        regCityImage(CK_GT, fRES(cityImage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_LessThan(String cityImage) {
        regCityImage(CK_LT, fRES(cityImage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_GreaterEqual(String cityImage) {
        regCityImage(CK_GE, fRES(cityImage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_LessEqual(String cityImage) {
        regCityImage(CK_LE, fRES(cityImage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImageList The collection of cityImage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_InScope(Collection<String> cityImageList) {
        doSetCityImage_InScope(cityImageList);
    }

    protected void doSetCityImage_InScope(Collection<String> cityImageList) {
        regINS(CK_INS, cTL(cityImageList), xgetCValueCityImage(), "city_image");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImageList The collection of cityImage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityImage_NotInScope(Collection<String> cityImageList) {
        doSetCityImage_NotInScope(cityImageList);
    }

    protected void doSetCityImage_NotInScope(Collection<String> cityImageList) {
        regINS(CK_NINS, cTL(cityImageList), xgetCValueCityImage(), "city_image");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setCityImage_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cityImage The value of cityImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityImage_LikeSearch(String cityImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityImage_LikeSearch(cityImage, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setCityImage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cityImage The value of cityImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCityImage_LikeSearch(String cityImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cityImage), xgetCValueCityImage(), "city_image", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityImage_NotLikeSearch(String cityImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityImage_NotLikeSearch(cityImage, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_image: {VARCHAR(2100)}
     * @param cityImage The value of cityImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCityImage_NotLikeSearch(String cityImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cityImage), xgetCValueCityImage(), "city_image", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     */
    public void setCityImage_IsNull() { regCityImage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     */
    public void setCityImage_IsNullOrEmpty() { regCityImage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * city_image: {VARCHAR(2100)}
     */
    public void setCityImage_IsNotNull() { regCityImage(CK_ISNN, DOBJ); }

    protected void regCityImage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCityImage(), "city_image"); }
    protected abstract ConditionValue xgetCValueCityImage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_Equal(String cityColor) {
        doSetCityColor_Equal(fRES(cityColor));
    }

    protected void doSetCityColor_Equal(String cityColor) {
        regCityColor(CK_EQ, cityColor);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_NotEqual(String cityColor) {
        doSetCityColor_NotEqual(fRES(cityColor));
    }

    protected void doSetCityColor_NotEqual(String cityColor) {
        regCityColor(CK_NES, cityColor);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_GreaterThan(String cityColor) {
        regCityColor(CK_GT, fRES(cityColor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_LessThan(String cityColor) {
        regCityColor(CK_LT, fRES(cityColor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_GreaterEqual(String cityColor) {
        regCityColor(CK_GE, fRES(cityColor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_LessEqual(String cityColor) {
        regCityColor(CK_LE, fRES(cityColor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColorList The collection of cityColor as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_InScope(Collection<String> cityColorList) {
        doSetCityColor_InScope(cityColorList);
    }

    protected void doSetCityColor_InScope(Collection<String> cityColorList) {
        regINS(CK_INS, cTL(cityColorList), xgetCValueCityColor(), "city_color");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColorList The collection of cityColor as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityColor_NotInScope(Collection<String> cityColorList) {
        doSetCityColor_NotInScope(cityColorList);
    }

    protected void doSetCityColor_NotInScope(Collection<String> cityColorList) {
        regINS(CK_NINS, cTL(cityColorList), xgetCValueCityColor(), "city_color");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_color: {VARCHAR(255)} <br>
     * <pre>e.g. setCityColor_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cityColor The value of cityColor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityColor_LikeSearch(String cityColor, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityColor_LikeSearch(cityColor, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_color: {VARCHAR(255)} <br>
     * <pre>e.g. setCityColor_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cityColor The value of cityColor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCityColor_LikeSearch(String cityColor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cityColor), xgetCValueCityColor(), "city_color", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityColor_NotLikeSearch(String cityColor, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityColor_NotLikeSearch(cityColor, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_color: {VARCHAR(255)}
     * @param cityColor The value of cityColor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCityColor_NotLikeSearch(String cityColor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cityColor), xgetCValueCityColor(), "city_color", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     */
    public void setCityColor_IsNull() { regCityColor(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     */
    public void setCityColor_IsNullOrEmpty() { regCityColor(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * city_color: {VARCHAR(255)}
     */
    public void setCityColor_IsNotNull() { regCityColor(CK_ISNN, DOBJ); }

    protected void regCityColor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCityColor(), "city_color"); }
    protected abstract ConditionValue xgetCValueCityColor();

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
    public HpSLCFunction<AreaCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AreaCB.class);
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
    public HpSLCFunction<AreaCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AreaCB.class);
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
    public HpSLCFunction<AreaCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AreaCB.class);
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
    public HpSLCFunction<AreaCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AreaCB.class);
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
    public HpSLCFunction<AreaCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AreaCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AreaCB&gt;() {
     *     public void query(AreaCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AreaCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AreaCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AreaCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AreaCQ sq);

    protected AreaCB xcreateScalarConditionCB() {
        AreaCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AreaCB xcreateScalarConditionPartitionByCB() {
        AreaCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected AreaCB newMyCB() {
        return new AreaCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AreaCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
