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
 * The entity of bath_tag as TABLE. <br>
 * 銭湯タグ
 * <pre>
 * [primary-key]
 *     bath_tag_id
 *
 * [column]
 *     bath_tag_id, bath_id, tag_id
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
 *     bath
 *
 * [referrer table]
 *     bath
 *
 * [foreign property]
 *     bath, bathAsOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer bathTagId = entity.getBathTagId();
 * Integer bathId = entity.getBathId();
 * Integer tagId = entity.getTagId();
 * entity.setBathTagId(bathTagId);
 * entity.setBathId(bathId);
 * entity.setTagId(tagId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBathTag extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** bath_tag_id: {PK, NotNull, INT(10)} */
    protected Integer _bathTagId;

    /** bath_id: {UQ+, NotNull, INT(10), FK to bath} */
    protected Integer _bathId;

    /** tag_id: {+UQ, NotNull, INT(10)} */
    protected Integer _tagId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "bath_tag";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_bathTagId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param bathId : UQ+, NotNull, INT(10), FK to bath. (NotNull)
     * @param tagId : +UQ, NotNull, INT(10). (NotNull)
     */
    public void uniqueBy(Integer bathId, Integer tagId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("bathId");
        __uniqueDrivenProperties.addPropertyName("tagId");
        setBathId(bathId);setTagId(tagId);
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

    /** bath by bath_id, named 'bathAsOne'. */
    protected OptionalEntity<Bath> _bathAsOne;

    /**
     * [get] bath by bath_id, named 'bathAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'bathAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<Bath> getBathAsOne() {
        if (_bathAsOne == null) { _bathAsOne = OptionalEntity.relationEmpty(this, "bathAsOne"); }
        return _bathAsOne;
    }

    /**
     * [set] bath by bath_id, named 'bathAsOne'.
     * @param bathAsOne The entity of foreign property(referrer-as-one) 'bathAsOne'. (NullAllowed)
     */
    public void setBathAsOne(OptionalEntity<Bath> bathAsOne) {
        _bathAsOne = bathAsOne;
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
        if (obj instanceof BsBathTag) {
            BsBathTag other = (BsBathTag)obj;
            if (!xSV(_bathTagId, other._bathTagId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bathTagId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bath != null && _bath.isPresent())
        { sb.append(li).append(xbRDS(_bath, "bath")); }
        if (_bathAsOne != null && _bathAsOne.isPresent())
        { sb.append(li).append(xbRDS(_bathAsOne, "bathAsOne")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bathTagId));
        sb.append(dm).append(xfND(_bathId));
        sb.append(dm).append(xfND(_tagId));
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
        if (_bathAsOne != null && _bathAsOne.isPresent())
        { sb.append(dm).append("bathAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BathTag clone() {
        return (BathTag)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bath_tag_id: {PK, NotNull, INT(10)} <br>
     * 銭湯ID
     * @return The value of the column 'bath_tag_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathTagId() {
        checkSpecifiedProperty("bathTagId");
        return _bathTagId;
    }

    /**
     * [set] bath_tag_id: {PK, NotNull, INT(10)} <br>
     * 銭湯ID
     * @param bathTagId The value of the column 'bath_tag_id'. (basically NotNull if update: for the constraint)
     */
    public void setBathTagId(Integer bathTagId) {
        registerModifiedProperty("bathTagId");
        _bathTagId = bathTagId;
    }

    /**
     * [get] bath_id: {UQ+, NotNull, INT(10), FK to bath} <br>
     * 銭湯ID
     * @return The value of the column 'bath_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathId() {
        checkSpecifiedProperty("bathId");
        return _bathId;
    }

    /**
     * [set] bath_id: {UQ+, NotNull, INT(10), FK to bath} <br>
     * 銭湯ID
     * @param bathId The value of the column 'bath_id'. (basically NotNull if update: for the constraint)
     */
    public void setBathId(Integer bathId) {
        registerModifiedProperty("bathId");
        _bathId = bathId;
    }

    /**
     * [get] tag_id: {+UQ, NotNull, INT(10)} <br>
     * タグID
     * @return The value of the column 'tag_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTagId() {
        checkSpecifiedProperty("tagId");
        return _tagId;
    }

    /**
     * [set] tag_id: {+UQ, NotNull, INT(10)} <br>
     * タグID
     * @param tagId The value of the column 'tag_id'. (basically NotNull if update: for the constraint)
     */
    public void setTagId(Integer tagId) {
        registerModifiedProperty("tagId");
        _tagId = tagId;
    }
}
