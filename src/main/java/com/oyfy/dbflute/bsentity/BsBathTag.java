package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of bath_tag as TABLE. <br>
 * 銭湯タグ
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer bathId = entity.getBathId();
 * Integer tagId = entity.getTagId();
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
    /** bath_id: {IX+, NotNull, INT(10)} */
    protected Integer _bathId;

    /** tag_id: {NotNull, INT(10)} */
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
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
            if (!xSV(_bathId, other._bathId)) { return false; }
            if (!xSV(_tagId, other._tagId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bathId);
        hs = xCH(hs, _tagId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
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
        return "";
    }

    @Override
    public BathTag clone() {
        return (BathTag)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bath_id: {IX+, NotNull, INT(10)} <br>
     * 銭湯ID
     * @return The value of the column 'bath_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBathId() {
        checkSpecifiedProperty("bathId");
        return _bathId;
    }

    /**
     * [set] bath_id: {IX+, NotNull, INT(10)} <br>
     * 銭湯ID
     * @param bathId The value of the column 'bath_id'. (basically NotNull if update: for the constraint)
     */
    public void setBathId(Integer bathId) {
        registerModifiedProperty("bathId");
        _bathId = bathId;
    }

    /**
     * [get] tag_id: {NotNull, INT(10)} <br>
     * タグID
     * @return The value of the column 'tag_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTagId() {
        checkSpecifiedProperty("tagId");
        return _tagId;
    }

    /**
     * [set] tag_id: {NotNull, INT(10)} <br>
     * タグID
     * @param tagId The value of the column 'tag_id'. (basically NotNull if update: for the constraint)
     */
    public void setTagId(Integer tagId) {
        registerModifiedProperty("tagId");
        _tagId = tagId;
    }
}
