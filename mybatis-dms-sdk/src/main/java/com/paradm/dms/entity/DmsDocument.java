package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsDocument extends BaseEntity implements Serializable {
    /** 
     */ 
    private String docName;

    /** 
     */ 
    private String docType;

    /** 
     */ 
    private Long parentId;

    /** 
     */ 
    private Long hierarchyId;

    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private Long itemSize;

    /** 
     */ 
    private Long profileId;

    /** 
     */ 
    private Long versionId;

    /** 
     */ 
    private String priority;

    /** 
     */ 
    private String referenceNo;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private String alertStatus;

    /** 
     */ 
    private String inheritFlag;

    /** 
     */ 
    private Long checkoutOrgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_DOCUMENT.DOC_NAME
     * @return DMS_DOCUMENT.DOC_NAME
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * 设置 DMS_DOCUMENT.DOC_NAME
     * @param docName DMS_DOCUMENT.DOC_NAME
     */
    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.DOC_TYPE
     * @return DMS_DOCUMENT.DOC_TYPE
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * 设置 DMS_DOCUMENT.DOC_TYPE
     * @param docType DMS_DOCUMENT.DOC_TYPE
     */
    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.PARENT_ID
     * @return DMS_DOCUMENT.PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /** 
     * 设置 DMS_DOCUMENT.PARENT_ID
     * @param parentId DMS_DOCUMENT.PARENT_ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /** 
     * 获取 DMS_DOCUMENT.HIERARCHY_ID
     * @return DMS_DOCUMENT.HIERARCHY_ID
     */
    public Long getHierarchyId() {
        return hierarchyId;
    }

    /** 
     * 设置 DMS_DOCUMENT.HIERARCHY_ID
     * @param hierarchyId DMS_DOCUMENT.HIERARCHY_ID
     */
    public void setHierarchyId(Long hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /** 
     * 获取 DMS_DOCUMENT.ROOT_ID
     * @return DMS_DOCUMENT.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 DMS_DOCUMENT.ROOT_ID
     * @param rootId DMS_DOCUMENT.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 DMS_DOCUMENT.ITEM_SIZE
     * @return DMS_DOCUMENT.ITEM_SIZE
     */
    public Long getItemSize() {
        return itemSize;
    }

    /** 
     * 设置 DMS_DOCUMENT.ITEM_SIZE
     * @param itemSize DMS_DOCUMENT.ITEM_SIZE
     */
    public void setItemSize(Long itemSize) {
        this.itemSize = itemSize;
    }

    /** 
     * 获取 DMS_DOCUMENT.PROFILE_ID
     * @return DMS_DOCUMENT.PROFILE_ID
     */
    public Long getProfileId() {
        return profileId;
    }

    /** 
     * 设置 DMS_DOCUMENT.PROFILE_ID
     * @param profileId DMS_DOCUMENT.PROFILE_ID
     */
    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    /** 
     * 获取 DMS_DOCUMENT.VERSION_ID
     * @return DMS_DOCUMENT.VERSION_ID
     */
    public Long getVersionId() {
        return versionId;
    }

    /** 
     * 设置 DMS_DOCUMENT.VERSION_ID
     * @param versionId DMS_DOCUMENT.VERSION_ID
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    /** 
     * 获取 DMS_DOCUMENT.PRIORITY
     * @return DMS_DOCUMENT.PRIORITY
     */
    public String getPriority() {
        return priority;
    }

    /** 
     * 设置 DMS_DOCUMENT.PRIORITY
     * @param priority DMS_DOCUMENT.PRIORITY
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.REFERENCE_NO
     * @return DMS_DOCUMENT.REFERENCE_NO
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /** 
     * 设置 DMS_DOCUMENT.REFERENCE_NO
     * @param referenceNo DMS_DOCUMENT.REFERENCE_NO
     */
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo == null ? null : referenceNo.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.DESCRIPTION
     * @return DMS_DOCUMENT.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 DMS_DOCUMENT.DESCRIPTION
     * @param description DMS_DOCUMENT.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.STATUS
     * @return DMS_DOCUMENT.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 DMS_DOCUMENT.STATUS
     * @param status DMS_DOCUMENT.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.ALERT_STATUS
     * @return DMS_DOCUMENT.ALERT_STATUS
     */
    public String getAlertStatus() {
        return alertStatus;
    }

    /** 
     * 设置 DMS_DOCUMENT.ALERT_STATUS
     * @param alertStatus DMS_DOCUMENT.ALERT_STATUS
     */
    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus == null ? null : alertStatus.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.INHERIT_FLAG
     * @return DMS_DOCUMENT.INHERIT_FLAG
     */
    public String getInheritFlag() {
        return inheritFlag;
    }

    /** 
     * 设置 DMS_DOCUMENT.INHERIT_FLAG
     * @param inheritFlag DMS_DOCUMENT.INHERIT_FLAG
     */
    public void setInheritFlag(String inheritFlag) {
        this.inheritFlag = inheritFlag == null ? null : inheritFlag.trim();
    }

    /** 
     * 获取 DMS_DOCUMENT.CHECKOUT_ORG_ID
     * @return DMS_DOCUMENT.CHECKOUT_ORG_ID
     */
    public Long getCheckoutOrgId() {
        return checkoutOrgId;
    }

    /** 
     * 设置 DMS_DOCUMENT.CHECKOUT_ORG_ID
     * @param checkoutOrgId DMS_DOCUMENT.CHECKOUT_ORG_ID
     */
    public void setCheckoutOrgId(Long checkoutOrgId) {
        this.checkoutOrgId = checkoutOrgId;
    }
}