package com.oyfy.dbflute.cbean.nss;

import com.oyfy.dbflute.cbean.cq.BathTagCQ;

/**
 * The nest select set-upper of bath_tag.
 * @author DBFlute(AutoGenerator)
 */
public class BathTagNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BathTagCQ _query;
    public BathTagNss(BathTagCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * bath by my bath_id, named 'bath'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BathNss withBath() {
        _query.xdoNss(() -> _query.queryBath());
        return new BathNss(_query.queryBath());
    }
    /**
     * With nested relation columns to select clause. <br>
     * bath by bath_id, named 'bathAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BathNss withBathAsOne() {
        _query.xdoNss(() -> _query.queryBathAsOne());
        return new BathNss(_query.queryBathAsOne());
    }
}
