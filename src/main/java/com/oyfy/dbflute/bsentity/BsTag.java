package com.oyfy.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oyfy.dbflute.allcommon.DBMetaInstanceHandler;
import com.oyfy.dbflute.exentity.*;

/**
 * The entity of tag as TABLE. <br>
 * タグ
 * <pre>
 * [primary-key]
 *     tag_id
 *
 * [column]
 *     tag_id, tag_name_ja, tag_name_en, tag_image, create_date, update_date
 *
 * [sequence]
 *     
 *
 * [identity]
 *     tag_id
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
 * Integer tagId = entity.getTagId();
 * String tagNameJa = entity.getTagNameJa();
 * String tagNameEn = entity.getTagNameEn();
 * String tagImage = entity.getTagImage();
 * java.time.LocalDateTime createDate = entity.getCreateDate();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * entity.setTagId(tagId);
 * entity.setTagNameJa(tagNameJa);
 * entity.setTagNameEn(tagNameEn);
 * entity.setTagImage(tagImage);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTag extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** tag_id: {PK, ID, NotNull, INT(10)} */
    protected Integer _tagId;

    /** tag_name_ja: {VARCHAR(255)} */
    protected String _tagNameJa;

    /** tag_name_en: {VARCHAR(255)} */
    protected String _tagNameEn;

    /** tag_image: {VARCHAR(2100)} */
    protected String _tagImage;

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
        return "tag";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tagId == null) { return false; }
        return true;
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
        if (obj instanceof BsTag) {
            BsTag other = (BsTag)obj;
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
        sb.append(dm).append(xfND(_tagId));
        sb.append(dm).append(xfND(_tagNameJa));
        sb.append(dm).append(xfND(_tagNameEn));
        sb.append(dm).append(xfND(_tagImage));
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
        return "";
    }

    @Override
    public Tag clone() {
        return (Tag)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] tag_id: {PK, ID, NotNull, INT(10)} <br>
     * タグID
     * @return The value of the column 'tag_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTagId() {
        checkSpecifiedProperty("tagId");
        return _tagId;
    }

    /**
     * [set] tag_id: {PK, ID, NotNull, INT(10)} <br>
     * タグID
     * @param tagId The value of the column 'tag_id'. (basically NotNull if update: for the constraint)
     */
    public void setTagId(Integer tagId) {
        registerModifiedProperty("tagId");
        _tagId = tagId;
    }

    /**
     * [get] tag_name_ja: {VARCHAR(255)} <br>
     * タグ 和名
     * @return The value of the column 'tag_name_ja'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagNameJa() {
        checkSpecifiedProperty("tagNameJa");
        return _tagNameJa;
    }

    /**
     * [set] tag_name_ja: {VARCHAR(255)} <br>
     * タグ 和名
     * @param tagNameJa The value of the column 'tag_name_ja'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagNameJa(String tagNameJa) {
        registerModifiedProperty("tagNameJa");
        _tagNameJa = tagNameJa;
    }

    /**
     * [get] tag_name_en: {VARCHAR(255)} <br>
     * タグ 英名
     * @return The value of the column 'tag_name_en'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagNameEn() {
        checkSpecifiedProperty("tagNameEn");
        return _tagNameEn;
    }

    /**
     * [set] tag_name_en: {VARCHAR(255)} <br>
     * タグ 英名
     * @param tagNameEn The value of the column 'tag_name_en'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagNameEn(String tagNameEn) {
        registerModifiedProperty("tagNameEn");
        _tagNameEn = tagNameEn;
    }

    /**
     * [get] tag_image: {VARCHAR(2100)} <br>
     * タグ画像
     * @return The value of the column 'tag_image'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagImage() {
        checkSpecifiedProperty("tagImage");
        return _tagImage;
    }

    /**
     * [set] tag_image: {VARCHAR(2100)} <br>
     * タグ画像
     * @param tagImage The value of the column 'tag_image'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagImage(String tagImage) {
        registerModifiedProperty("tagImage");
        _tagImage = tagImage;
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
