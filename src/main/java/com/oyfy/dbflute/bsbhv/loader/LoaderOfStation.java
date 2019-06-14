package com.oyfy.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.*;

/**
 * The referrer loader of station as TABLE. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     station_code, station_area_code, station_line_code, station_line_name_ja, station_line_name_en, station_g_cd, station_name_ja, station_name_en, station_lon, station_lat, station_image, station_color, create_date, update_date
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
public class LoaderOfStation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Station> _selectedList;
    protected BehaviorSelector _selector;
    protected StationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfStation ready(List<Station> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected StationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(StationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Station> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
