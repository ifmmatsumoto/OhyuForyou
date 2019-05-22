package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The referrer loader of t_bath_tag as TABLE. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     bath_id, tag_id
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTBathTag {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBathTag> _selectedList;
    protected BehaviorSelector _selector;
    protected TBathTagBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBathTag ready(List<TBathTag> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBathTagBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBathTagBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBathTag> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
