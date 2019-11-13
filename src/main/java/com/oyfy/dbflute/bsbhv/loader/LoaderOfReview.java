package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The referrer loader of review as TABLE. <br>
 * <pre>
 * [primary key]
 *     review_id
 *
 * [column]
 *     review_id, bath_id, newyorker, review, create_date, update_date
 *
 * [sequence]
 *     
 *
 * [identity]
 *     review_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     bath
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bath
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfReview {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Review> _selectedList;
    protected BehaviorSelector _selector;
    protected ReviewBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfReview ready(List<Review> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ReviewBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ReviewBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBath _foreignBathLoader;
    public LoaderOfBath pulloutBath() {
        if (_foreignBathLoader == null)
        { _foreignBathLoader = new LoaderOfBath().ready(myBhv().pulloutBath(_selectedList), _selector); }
        return _foreignBathLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Review> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
