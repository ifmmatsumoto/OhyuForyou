package com.oyfy.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oyfy.dbflute.cbean.*;
import com.oyfy.dbflute.cbean.cq.bs.*;
import com.oyfy.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of bath.
 * @author DBFlute(AutoGenerator)
 */
public class BathCIQ extends AbstractBsBathCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBathCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BathCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBathCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueBathId() { return _myCQ.xdfgetBathId(); }
    public String keepBathId_ExistsReferrer_BathTagList(BathTagCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBathId_NotExistsReferrer_BathTagList(BathTagCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBathId_SpecifyDerivedReferrer_BathTagList(BathTagCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBathId_QueryDerivedReferrer_BathTagList(BathTagCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBathId_QueryDerivedReferrer_BathTagListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueBathNameJa() { return _myCQ.xdfgetBathNameJa(); }
    protected ConditionValue xgetCValueBathNameEn() { return _myCQ.xdfgetBathNameEn(); }
    protected ConditionValue xgetCValueBathImage() { return _myCQ.xdfgetBathImage(); }
    protected ConditionValue xgetCValueBathAddressJa() { return _myCQ.xdfgetBathAddressJa(); }
    protected ConditionValue xgetCValueBathAddressEn() { return _myCQ.xdfgetBathAddressEn(); }
    protected ConditionValue xgetCValueBathTel() { return _myCQ.xdfgetBathTel(); }
    protected ConditionValue xgetCValueBathDetail() { return _myCQ.xdfgetBathDetail(); }
    protected ConditionValue xgetCValueBathFee() { return _myCQ.xdfgetBathFee(); }
    protected ConditionValue xgetCValueBathType() { return _myCQ.xdfgetBathType(); }
    protected ConditionValue xgetCValueBath24hFlg() { return _myCQ.xdfgetBath24hFlg(); }
    protected ConditionValue xgetCValueBathTimeSt() { return _myCQ.xdfgetBathTimeSt(); }
    protected ConditionValue xgetCValueBathTimeEd() { return _myCQ.xdfgetBathTimeEd(); }
    protected ConditionValue xgetCValueBathNearStation() { return _myCQ.xdfgetBathNearStation(); }
    protected ConditionValue xgetCValueBathPlaceLat() { return _myCQ.xdfgetBathPlaceLat(); }
    protected ConditionValue xgetCValueBathPlaceLon() { return _myCQ.xdfgetBathPlaceLon(); }
    protected ConditionValue xgetCValueBathTemperatureUp() { return _myCQ.xdfgetBathTemperatureUp(); }
    protected ConditionValue xgetCValueBathTemperatureLow() { return _myCQ.xdfgetBathTemperatureLow(); }
    protected ConditionValue xgetCValueBathHoliday() { return _myCQ.xdfgetBathHoliday(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueCreateDate() { return _myCQ.xdfgetCreateDate(); }
    protected ConditionValue xgetCValueUpdateDate() { return _myCQ.xdfgetUpdateDate(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(BathCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BathCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BathCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BathCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BathCB.class.getName(); }
    protected String xinCQ() { return BathCQ.class.getName(); }
}
