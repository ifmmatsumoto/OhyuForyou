package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The referrer loader of t_bath as TABLE. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     bath_id, bath_name_ja, bath_name_en, bath_area_code, bath_city_code, bath_image, bath_address_ja, bath_address_en, bath_tel, bath_fee, bath_type, bath_24h_flg, bath_time_st, bath_time_ed, bath_place_lat, bath_place_lon, bath_temperature_up, bath_temperature_low, bath_holiday, del_flg, create_date, update_date
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
public class LoaderOfTBath {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBath> _selectedList;
    protected BehaviorSelector _selector;
    protected TBathBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBath ready(List<TBath> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBathBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBathBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBath> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
