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
 * The abstract condition-query of t_tag.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTagCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTagCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_tag";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {IX, NotNull, INT(10)}
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
     * tag_id: {IX, NotNull, INT(10)}
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
     * tag_id: {IX, NotNull, INT(10)}
     * @param tagId The value of tagId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_GreaterThan(Integer tagId) {
        regTagId(CK_GT, tagId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {IX, NotNull, INT(10)}
     * @param tagId The value of tagId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_LessThan(Integer tagId) {
        regTagId(CK_LT, tagId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {IX, NotNull, INT(10)}
     * @param tagId The value of tagId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_GreaterEqual(Integer tagId) {
        regTagId(CK_GE, tagId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {IX, NotNull, INT(10)}
     * @param tagId The value of tagId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagId_LessEqual(Integer tagId) {
        regTagId(CK_LE, tagId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * tag_id: {IX, NotNull, INT(10)}
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
     * tag_id: {IX, NotNull, INT(10)}
     * @param minNumber The min number of tagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTagId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTagId(), "tag_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * tag_id: {IX, NotNull, INT(10)}
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
     * tag_id: {IX, NotNull, INT(10)}
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_Equal(String tagNameJa) {
        doSetTagNameJa_Equal(fRES(tagNameJa));
    }

    protected void doSetTagNameJa_Equal(String tagNameJa) {
        regTagNameJa(CK_EQ, tagNameJa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_NotEqual(String tagNameJa) {
        doSetTagNameJa_NotEqual(fRES(tagNameJa));
    }

    protected void doSetTagNameJa_NotEqual(String tagNameJa) {
        regTagNameJa(CK_NES, tagNameJa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_GreaterThan(String tagNameJa) {
        regTagNameJa(CK_GT, fRES(tagNameJa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_LessThan(String tagNameJa) {
        regTagNameJa(CK_LT, fRES(tagNameJa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_GreaterEqual(String tagNameJa) {
        regTagNameJa(CK_GE, fRES(tagNameJa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_LessEqual(String tagNameJa) {
        regTagNameJa(CK_LE, fRES(tagNameJa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJaList The collection of tagNameJa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_InScope(Collection<String> tagNameJaList) {
        doSetTagNameJa_InScope(tagNameJaList);
    }

    protected void doSetTagNameJa_InScope(Collection<String> tagNameJaList) {
        regINS(CK_INS, cTL(tagNameJaList), xgetCValueTagNameJa(), "tag_name_ja");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJaList The collection of tagNameJa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameJa_NotInScope(Collection<String> tagNameJaList) {
        doSetTagNameJa_NotInScope(tagNameJaList);
    }

    protected void doSetTagNameJa_NotInScope(Collection<String> tagNameJaList) {
        regINS(CK_NINS, cTL(tagNameJaList), xgetCValueTagNameJa(), "tag_name_ja");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTagNameJa_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tagNameJa The value of tagNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTagNameJa_LikeSearch(String tagNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTagNameJa_LikeSearch(tagNameJa, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTagNameJa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagNameJa The value of tagNameJa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTagNameJa_LikeSearch(String tagNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagNameJa), xgetCValueTagNameJa(), "tag_name_ja", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTagNameJa_NotLikeSearch(String tagNameJa, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTagNameJa_NotLikeSearch(tagNameJa, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_ja: {NotNull, VARCHAR(255)}
     * @param tagNameJa The value of tagNameJa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTagNameJa_NotLikeSearch(String tagNameJa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagNameJa), xgetCValueTagNameJa(), "tag_name_ja", likeSearchOption);
    }

    protected void regTagNameJa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagNameJa(), "tag_name_ja"); }
    protected abstract ConditionValue xgetCValueTagNameJa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_Equal(String tagNameEn) {
        doSetTagNameEn_Equal(fRES(tagNameEn));
    }

    protected void doSetTagNameEn_Equal(String tagNameEn) {
        regTagNameEn(CK_EQ, tagNameEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_NotEqual(String tagNameEn) {
        doSetTagNameEn_NotEqual(fRES(tagNameEn));
    }

    protected void doSetTagNameEn_NotEqual(String tagNameEn) {
        regTagNameEn(CK_NES, tagNameEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_GreaterThan(String tagNameEn) {
        regTagNameEn(CK_GT, fRES(tagNameEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_LessThan(String tagNameEn) {
        regTagNameEn(CK_LT, fRES(tagNameEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_GreaterEqual(String tagNameEn) {
        regTagNameEn(CK_GE, fRES(tagNameEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_LessEqual(String tagNameEn) {
        regTagNameEn(CK_LE, fRES(tagNameEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEnList The collection of tagNameEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_InScope(Collection<String> tagNameEnList) {
        doSetTagNameEn_InScope(tagNameEnList);
    }

    protected void doSetTagNameEn_InScope(Collection<String> tagNameEnList) {
        regINS(CK_INS, cTL(tagNameEnList), xgetCValueTagNameEn(), "tag_name_en");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEnList The collection of tagNameEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNameEn_NotInScope(Collection<String> tagNameEnList) {
        doSetTagNameEn_NotInScope(tagNameEnList);
    }

    protected void doSetTagNameEn_NotInScope(Collection<String> tagNameEnList) {
        regINS(CK_NINS, cTL(tagNameEnList), xgetCValueTagNameEn(), "tag_name_en");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTagNameEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tagNameEn The value of tagNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTagNameEn_LikeSearch(String tagNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTagNameEn_LikeSearch(tagNameEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTagNameEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagNameEn The value of tagNameEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTagNameEn_LikeSearch(String tagNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagNameEn), xgetCValueTagNameEn(), "tag_name_en", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTagNameEn_NotLikeSearch(String tagNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTagNameEn_NotLikeSearch(tagNameEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_name_en: {NotNull, VARCHAR(255)}
     * @param tagNameEn The value of tagNameEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTagNameEn_NotLikeSearch(String tagNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagNameEn), xgetCValueTagNameEn(), "tag_name_en", likeSearchOption);
    }

    protected void regTagNameEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagNameEn(), "tag_name_en"); }
    protected abstract ConditionValue xgetCValueTagNameEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_Equal(String tagImage) {
        doSetTagImage_Equal(fRES(tagImage));
    }

    protected void doSetTagImage_Equal(String tagImage) {
        regTagImage(CK_EQ, tagImage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_NotEqual(String tagImage) {
        doSetTagImage_NotEqual(fRES(tagImage));
    }

    protected void doSetTagImage_NotEqual(String tagImage) {
        regTagImage(CK_NES, tagImage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_GreaterThan(String tagImage) {
        regTagImage(CK_GT, fRES(tagImage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_LessThan(String tagImage) {
        regTagImage(CK_LT, fRES(tagImage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_GreaterEqual(String tagImage) {
        regTagImage(CK_GE, fRES(tagImage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_LessEqual(String tagImage) {
        regTagImage(CK_LE, fRES(tagImage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImageList The collection of tagImage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_InScope(Collection<String> tagImageList) {
        doSetTagImage_InScope(tagImageList);
    }

    protected void doSetTagImage_InScope(Collection<String> tagImageList) {
        regINS(CK_INS, cTL(tagImageList), xgetCValueTagImage(), "tag_image");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImageList The collection of tagImage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagImage_NotInScope(Collection<String> tagImageList) {
        doSetTagImage_NotInScope(tagImageList);
    }

    protected void doSetTagImage_NotInScope(Collection<String> tagImageList) {
        regINS(CK_NINS, cTL(tagImageList), xgetCValueTagImage(), "tag_image");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setTagImage_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tagImage The value of tagImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTagImage_LikeSearch(String tagImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTagImage_LikeSearch(tagImage, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_image: {VARCHAR(2100)} <br>
     * <pre>e.g. setTagImage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagImage The value of tagImage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTagImage_LikeSearch(String tagImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagImage), xgetCValueTagImage(), "tag_image", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTagImage_NotLikeSearch(String tagImage, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTagImage_NotLikeSearch(tagImage, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     * @param tagImage The value of tagImage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTagImage_NotLikeSearch(String tagImage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagImage), xgetCValueTagImage(), "tag_image", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     */
    public void setTagImage_IsNull() { regTagImage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     */
    public void setTagImage_IsNullOrEmpty() { regTagImage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * tag_image: {VARCHAR(2100)}
     */
    public void setTagImage_IsNotNull() { regTagImage(CK_ISNN, DOBJ); }

    protected void regTagImage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagImage(), "tag_image"); }
    protected abstract ConditionValue xgetCValueTagImage();

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
    public HpSLCFunction<TTagCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTagCB.class);
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
    public HpSLCFunction<TTagCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTagCB.class);
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
    public HpSLCFunction<TTagCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTagCB.class);
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
    public HpSLCFunction<TTagCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTagCB.class);
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
    public HpSLCFunction<TTagCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTagCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTagCB&gt;() {
     *     public void query(TTagCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTagCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTagCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTagCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTagCQ sq);

    protected TTagCB xcreateScalarConditionCB() {
        TTagCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTagCB xcreateScalarConditionPartitionByCB() {
        TTagCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected TTagCB newMyCB() {
        return new TTagCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTagCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
