package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsVersion extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private String versionNumber;

    /** 
     */ 
    private String versionLabel;

    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private Long contentId;

    /** 
     */ 
    private Long itemSize;

    /** 
     */ 
    private String comment;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_VERSION.DOC_ID
     * @return DMS_VERSION.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_VERSION.DOC_ID
     * @param docId DMS_VERSION.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_VERSION.VERSION_NUMBER
     * @return DMS_VERSION.VERSION_NUMBER
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * 设置 DMS_VERSION.VERSION_NUMBER
     * @param versionNumber DMS_VERSION.VERSION_NUMBER
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber == null ? null : versionNumber.trim();
    }

    /** 
     * 获取 DMS_VERSION.VERSION_LABEL
     * @return DMS_VERSION.VERSION_LABEL
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /** 
     * 设置 DMS_VERSION.VERSION_LABEL
     * @param versionLabel DMS_VERSION.VERSION_LABEL
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel == null ? null : versionLabel.trim();
    }

    /** 
     * 获取 DMS_VERSION.ROOT_ID
     * @return DMS_VERSION.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 DMS_VERSION.ROOT_ID
     * @param rootId DMS_VERSION.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 DMS_VERSION.CONTENT_ID
     * @return DMS_VERSION.CONTENT_ID
     */
    public Long getContentId() {
        return contentId;
    }

    /** 
     * 设置 DMS_VERSION.CONTENT_ID
     * @param contentId DMS_VERSION.CONTENT_ID
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /** 
     * 获取 DMS_VERSION.ITEM_SIZE
     * @return DMS_VERSION.ITEM_SIZE
     */
    public Long getItemSize() {
        return itemSize;
    }

    /** 
     * 设置 DMS_VERSION.ITEM_SIZE
     * @param itemSize DMS_VERSION.ITEM_SIZE
     */
    public void setItemSize(Long itemSize) {
        this.itemSize = itemSize;
    }

    /** 
     * 获取 DMS_VERSION.COMMENT
     * @return DMS_VERSION.COMMENT
     */
    public String getComment() {
        return comment;
    }

    /** 
     * 设置 DMS_VERSION.COMMENT
     * @param comment DMS_VERSION.COMMENT
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}