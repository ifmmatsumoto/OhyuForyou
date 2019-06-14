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
 * The condition-query for in-line of area.
 * @author DBFlute(AutoGenerator)
 */
public class AreaCIQ extends AbstractBsAreaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsAreaCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AreaCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsAreaCQ myCQ) {
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
    protected ConditionValue xgetCValueCityCode() { return _myCQ.xdfgetCityCode(); }
    protected ConditionValue xgetCValueCityNameJa() { return _myCQ.xdfgetCityNameJa(); }
    protected ConditionValue xgetCValueCityNameEn() { return _myCQ.xdfgetCityNameEn(); }
    protected ConditionValue xgetCValueCityImage() { return _myCQ.xdfgetCityImage(); }
    protected ConditionValue xgetCValueCityColor() { return _myCQ.xdfgetCityColor(); }
    protected ConditionValue xgetCValueCreateDate() { return _myCQ.xdfgetCreateDate(); }
    protected ConditionValue xgetCValueUpdateDate() { return _myCQ.xdfgetUpdateDate(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(AreaCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return AreaCB.class.getName(); }
    protected String xinCQ() { return AreaCQ.class.getName(); }
}
