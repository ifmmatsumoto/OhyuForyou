package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of review as TABLE. <br>
 * レビュー
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer reviewId = entity.getReviewId();
 * Integer bathId = entity.getBathId();
 * String newyorker = entity.getNewyorker();
 * String review = entity.getReview();
 * java.time.LocalDateTime createDate = entity.getCreateDate();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * entity.setReviewId(reviewId);
 * entity.setBathId(bathId);
 * entity.setNewyorker(newyorker);
 * entity.setReview(review);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsReview extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** review_id: {PK, ID, NotNull, INT(10)} */
    protected Integer _reviewId;

    /** bath_id: {IX, NotNull, INT(10), FK to bath} */
    protected Integer _bathId;

    /** newyorker: {VARCHAR(100)} */
    protected String _newyorker;

    /** review: {VARCHAR(100)} */
    protected String _review;

    /** create_date: {DATETIME(19)} */
    protected java.time.LocalDateTime _createDate;

    /** update_date: {DATETIME(19)} */
    protected java.time.LocalDateTime _updateDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "review";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_reviewId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** bath by my bath_id, named 'bath'. */
    protected OptionalEntity<Bath> _bath;

    /**
     * [get] bath by my bath_id, named 'bath'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'bath'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Bath> getBath() {
        if (_bath == null) { _bath = OptionalEntity.relationEmpty(this, "bath"); }
        return _bath;
    }

    /**
     * [set] bath by my bath_id, named 'bath'.
     * @param bath The entity of foreign property 'bath'. (NullAllowed)
     */
    public void setBath(OptionalEntity<Bath> bath) {
        _bath = bath;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsReview) {
            BsReview other = (BsReview)obj;
            if (!xSV(_reviewId, other._reviewId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _reviewId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bath != null && _bath.isPresent())
        { sb.append(li).append(xbRDS(_bath, "bath")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_reviewId));
        sb.append(dm).append(xfND(_bathId));
        sb.append(dm).append(xfND(_newyorker));
        sb.append(dm).append(xfND(_review));
        sb.append(dm).append(xfND(_createDate));
        sb.append(dm).append(xfND(_updateDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_bath != null && _bath.isPresent())
        { sb.append(dm).append("bath"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Review clone() {
        return (Review)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] review_id: {PK, ID, NotNull, INT(10)} <br>
     * レビューID
     * @return The value of the column 'review_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReviewId() {
        checkSpecifiedProperty("reviewId");
        return _reviewId;
    }

    /**
     * [set] review_id: {PK, ID, NotNull, INT(10)} <br>
     * レビューID
     * @param reviewId The value of the column 'review_id'. (basically NotNull if update: for the constraint)
     */
    public void setReviewId(Integer reviewId) {
        registerModifiedProperty("reviewId");
        _reviewId = reviewId;
    }

    /**
     * [get] bath_id: {IX, NotNull, INT(10), FK to bath} <br>
     * 銭湯ID
     * @return The value of the column 'bath_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathId() {
        checkSpecifiedProperty("bathId");
        return _bathId;
    }

    /**
     * [set] bath_id: {IX, NotNull, INT(10), FK to bath} <br>
     * 銭湯ID
     * @param bathId The value of the column 'bath_id'. (basically NotNull if update: for the constraint)
     */
    public void setBathId(Integer bathId) {
        registerModifiedProperty("bathId");
        _bathId = bathId;
    }

    /**
     * [get] newyorker: {VARCHAR(100)} <br>
     * 投稿者
     * @return The value of the column 'newyorker'. (NullAllowed even if selected: for no constraint)
     */
    public String getNewyorker() {
        checkSpecifiedProperty("newyorker");
        return _newyorker;
    }

    /**
     * [set] newyorker: {VARCHAR(100)} <br>
     * 投稿者
     * @param newyorker The value of the column 'newyorker'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNewyorker(String newyorker) {
        registerModifiedProperty("newyorker");
        _newyorker = newyorker;
    }

    /**
     * [get] review: {VARCHAR(100)} <br>
     * レビュー
     * @return The value of the column 'review'. (NullAllowed even if selected: for no constraint)
     */
    public String getReview() {
        checkSpecifiedProperty("review");
        return _review;
    }

    /**
     * [set] review: {VARCHAR(100)} <br>
     * レビュー
     * @param review The value of the column 'review'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReview(String review) {
        registerModifiedProperty("review");
        _review = review;
    }

    /**
     * [get] create_date: {DATETIME(19)} <br>
     * 作成日時
     * @return The value of the column 'create_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getCreateDate() {
        checkSpecifiedProperty("createDate");
        return _createDate;
    }

    /**
     * [set] create_date: {DATETIME(19)} <br>
     * 作成日時
     * @param createDate The value of the column 'create_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDate(java.time.LocalDateTime createDate) {
        registerModifiedProperty("createDate");
        _createDate = createDate;
    }

    /**
     * [get] update_date: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'update_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDate() {
        checkSpecifiedProperty("updateDate");
        return _updateDate;
    }

    /**
     * [set] update_date: {DATETIME(19)} <br>
     * 更新日時
     * @param updateDate The value of the column 'update_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDate(java.time.LocalDateTime updateDate) {
        registerModifiedProperty("updateDate");
        _updateDate = updateDate;
    }
}
