package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;
import com.oyfy.dbflute.cbean.*;

/**
 * The referrer loader of bath as TABLE. <br>
 * <pre>
 * [primary key]
 *     bath_id
 *
 * [column]
 *     bath_id, bath_name_ja, bath_name_en, bath_area_code, bath_city_code, bath_image, bath_address_ja, bath_address_en, bath_tel, bath_detail, bath_fee, bath_type, bath_24h_flg, bath_time_st, bath_time_ed, bath_place_lat, bath_place_lon, bath_temperature_up, bath_temperature_low, bath_holiday, del_flg, create_date, update_date
 *
 * [sequence]
 *     
 *
 * [identity]
 *     bath_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     bath_tag
 *
 * [referrer table]
 *     bath_tag
 *
 * [foreign property]
 *     bathTag
 *
 * [referrer property]
 *     bathTagList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBath {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Bath> _selectedList;
    protected BehaviorSelector _selector;
    protected BathBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBath ready(List<Bath> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BathBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BathBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BathTag> _referrerBathTag;

    /**
     * Load referrer of bathTagList by the set-upper of referrer. <br>
     * bath_tag by bath_id, named 'bathTagList'.
     * <pre>
     * <span style="color: #0000C0">bathBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bathList</span>, <span style="color: #553000">bathLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bathLoader</span>.<span style="color: #CC4747">loadBathTag</span>(<span style="color: #553000">tagCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tagCB</span>.setupSelect...
     *         <span style="color: #553000">tagCB</span>.query().set...
     *         <span style="color: #553000">tagCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tagLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tagLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Bath bath : <span style="color: #553000">bathList</span>) {
     *     ... = bath.<span style="color: #CC4747">getBathTagList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBathId_InScope(pkList);
     * cb.query().addOrderBy_BathId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBathTag> loadBathTag(ReferrerConditionSetupper<BathTagCB> refCBLambda) {
        myBhv().loadBathTag(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBathTag = refLs);
        return hd -> hd.handle(new LoaderOfBathTag().ready(_referrerBathTag, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBathTag _foreignBathTagLoader;
    public LoaderOfBathTag pulloutBathTag() {
        if (_foreignBathTagLoader == null)
        { _foreignBathTagLoader = new LoaderOfBathTag().ready(myBhv().pulloutBathTag(_selectedList), _selector); }
        return _foreignBathTagLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Bath> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
