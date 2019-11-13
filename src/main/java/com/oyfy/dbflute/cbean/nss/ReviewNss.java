package com.oyfy.dbflute.cbean.nss;

import com.oyfy.dbflute.cbean.cq.ReviewCQ;

/**
 * The nest select set-upper of review.
 * @author DBFlute(AutoGenerator)
 */
public class ReviewNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ReviewCQ _query;
    public ReviewNss(ReviewCQ query) { _query = query; }
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
}
