package com.oyfy.dbflute.cbean.nss;

import com.oyfy.dbflute.cbean.cq.BathCQ;

/**
 * The nest select set-upper of bath.
 * @author DBFlute(AutoGenerator)
 */
public class BathNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BathCQ _query;
    public BathNss(BathCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * bath_tag by my bath_id, named 'bathTag'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BathTagNss withBathTag() {
        _query.xdoNss(() -> _query.queryBathTag());
        return new BathTagNss(_query.queryBathTag());
    }
}
