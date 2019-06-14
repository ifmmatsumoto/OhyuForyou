package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The referrer loader of bath_tag as TABLE. <br>
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
public class LoaderOfBathTag {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BathTag> _selectedList;
    protected BehaviorSelector _selector;
    protected BathTagBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBathTag ready(List<BathTag> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BathTagBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BathTagBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BathTag> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
