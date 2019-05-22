package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The referrer loader of t_tag as TABLE. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     tag_id, tag_name_ja, tag_name_en, tag_image, create_date, update_date
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
public class LoaderOfTTag {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTag> _selectedList;
    protected BehaviorSelector _selector;
    protected TTagBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTag ready(List<TTag> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTagBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTagBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTag> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
