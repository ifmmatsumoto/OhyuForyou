package com.oyfy.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oyfy.dbflute.allcommon.*;
import com.oyfy.dbflute.exbhv.*;
import com.oyfy.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of NearbyBath. <br>
 * This is related to "<span style="color: #AD4747">selectNearbyBath</span>" on BathBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsNearbyBathPmb extends SimplePagingBean implements EntityHandlingPmb<BathBhv, NearbyBath>, AutoPagingHandlingPmb<BathBhv, NearbyBath>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of bath_place_lat. */
    protected java.math.BigDecimal _bath_place_lat;

    /** The parameter of bath_place_lon. */
    protected java.math.BigDecimal _bath_place_lon;

    /** The parameter of distance. */
    protected Integer _distance;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of NearbyBath. <br>
     * This is related to "<span style="color: #AD4747">selectNearbyBath</span>" on BathBhv.
     */
    public BsNearbyBathPmb() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectNearbyBath"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<NearbyBath> getEntityType() { return NearbyBath.class; }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_bath_place_lat);
        sb.append(dm).append(_bath_place_lon);
        sb.append(dm).append(_distance);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bath_place_lat <br>
     * @return The value of bath_place_lat. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getBath_place_lat() {
        return _bath_place_lat;
    }

    /**
     * [set] bath_place_lat <br>
     * @param bath_place_lat The value of bath_place_lat. (NullAllowed)
     */
    public void setBath_place_lat(java.math.BigDecimal bath_place_lat) {
        _bath_place_lat = bath_place_lat;
    }

    /**
     * [get] bath_place_lon <br>
     * @return The value of bath_place_lon. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getBath_place_lon() {
        return _bath_place_lon;
    }

    /**
     * [set] bath_place_lon <br>
     * @param bath_place_lon The value of bath_place_lon. (NullAllowed)
     */
    public void setBath_place_lon(java.math.BigDecimal bath_place_lon) {
        _bath_place_lon = bath_place_lon;
    }

    /**
     * [get] distance <br>
     * @return The value of distance. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getDistance() {
        return _distance;
    }

    /**
     * [set] distance <br>
     * @param distance The value of distance. (NullAllowed)
     */
    public void setDistance(Integer distance) {
        _distance = distance;
    }
}
