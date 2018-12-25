package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsPermission extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long orgId;

    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Integer readFlag;

    /** 
     */ 
    private Integer createFolderFlag;

    /** 
     */ 
    private Integer createDocumentFlag;

    /** 
     */ 
    private Integer setAlertFlag;

    /** 
     */ 
    private Integer renameFlag;

    /** 
     */ 
    private Integer deleteFlag;

    /** 
     */ 
    private Integer copyFlag;

    /** 
     */ 
    private Integer moveFlag;

    /** 
     */ 
    private Integer accessControlFlag;

    /** 
     */ 
    private Integer auditTrailFlag;

    /** 
     */ 
    private Integer downloadFlag;

    /** 
     */ 
    private Integer editIndexFlag;

    /** 
     */ 
    private Integer updateFlag;

    /** 
     */ 
    private Integer invitationFlag;

    /** 
     */ 
    private Integer listVersionFlag;

    /** 
     */ 
    private String mustFlag;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_PERMISSION.ORG_ID
     * @return DMS_PERMISSION.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 DMS_PERMISSION.ORG_ID
     * @param orgId DMS_PERMISSION.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /** 
     * 获取 DMS_PERMISSION.ROOT_ID
     * @return DMS_PERMISSION.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 DMS_PERMISSION.ROOT_ID
     * @param rootId DMS_PERMISSION.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 DMS_PERMISSION.DOC_ID
     * @return DMS_PERMISSION.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_PERMISSION.DOC_ID
     * @param docId DMS_PERMISSION.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_PERMISSION.READ_FLAG
     * @return DMS_PERMISSION.READ_FLAG
     */
    public Integer getReadFlag() {
        return readFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.READ_FLAG
     * @param readFlag DMS_PERMISSION.READ_FLAG
     */
    public void setReadFlag(Integer readFlag) {
        this.readFlag = readFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.CREATE_FOLDER_FLAG
     * @return DMS_PERMISSION.CREATE_FOLDER_FLAG
     */
    public Integer getCreateFolderFlag() {
        return createFolderFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.CREATE_FOLDER_FLAG
     * @param createFolderFlag DMS_PERMISSION.CREATE_FOLDER_FLAG
     */
    public void setCreateFolderFlag(Integer createFolderFlag) {
        this.createFolderFlag = createFolderFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.CREATE_DOCUMENT_FLAG
     * @return DMS_PERMISSION.CREATE_DOCUMENT_FLAG
     */
    public Integer getCreateDocumentFlag() {
        return createDocumentFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.CREATE_DOCUMENT_FLAG
     * @param createDocumentFlag DMS_PERMISSION.CREATE_DOCUMENT_FLAG
     */
    public void setCreateDocumentFlag(Integer createDocumentFlag) {
        this.createDocumentFlag = createDocumentFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.SET_ALERT_FLAG
     * @return DMS_PERMISSION.SET_ALERT_FLAG
     */
    public Integer getSetAlertFlag() {
        return setAlertFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.SET_ALERT_FLAG
     * @param setAlertFlag DMS_PERMISSION.SET_ALERT_FLAG
     */
    public void setSetAlertFlag(Integer setAlertFlag) {
        this.setAlertFlag = setAlertFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.RENAME_FLAG
     * @return DMS_PERMISSION.RENAME_FLAG
     */
    public Integer getRenameFlag() {
        return renameFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.RENAME_FLAG
     * @param renameFlag DMS_PERMISSION.RENAME_FLAG
     */
    public void setRenameFlag(Integer renameFlag) {
        this.renameFlag = renameFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.DELETE_FLAG
     * @return DMS_PERMISSION.DELETE_FLAG
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.DELETE_FLAG
     * @param deleteFlag DMS_PERMISSION.DELETE_FLAG
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.COPY_FLAG
     * @return DMS_PERMISSION.COPY_FLAG
     */
    public Integer getCopyFlag() {
        return copyFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.COPY_FLAG
     * @param copyFlag DMS_PERMISSION.COPY_FLAG
     */
    public void setCopyFlag(Integer copyFlag) {
        this.copyFlag = copyFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.MOVE_FLAG
     * @return DMS_PERMISSION.MOVE_FLAG
     */
    public Integer getMoveFlag() {
        return moveFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.MOVE_FLAG
     * @param moveFlag DMS_PERMISSION.MOVE_FLAG
     */
    public void setMoveFlag(Integer moveFlag) {
        this.moveFlag = moveFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.ACCESS_CONTROL_FLAG
     * @return DMS_PERMISSION.ACCESS_CONTROL_FLAG
     */
    public Integer getAccessControlFlag() {
        return accessControlFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.ACCESS_CONTROL_FLAG
     * @param accessControlFlag DMS_PERMISSION.ACCESS_CONTROL_FLAG
     */
    public void setAccessControlFlag(Integer accessControlFlag) {
        this.accessControlFlag = accessControlFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.AUDIT_TRAIL_FLAG
     * @return DMS_PERMISSION.AUDIT_TRAIL_FLAG
     */
    public Integer getAuditTrailFlag() {
        return auditTrailFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.AUDIT_TRAIL_FLAG
     * @param auditTrailFlag DMS_PERMISSION.AUDIT_TRAIL_FLAG
     */
    public void setAuditTrailFlag(Integer auditTrailFlag) {
        this.auditTrailFlag = auditTrailFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.DOWNLOAD_FLAG
     * @return DMS_PERMISSION.DOWNLOAD_FLAG
     */
    public Integer getDownloadFlag() {
        return downloadFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.DOWNLOAD_FLAG
     * @param downloadFlag DMS_PERMISSION.DOWNLOAD_FLAG
     */
    public void setDownloadFlag(Integer downloadFlag) {
        this.downloadFlag = downloadFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.EDIT_INDEX_FLAG
     * @return DMS_PERMISSION.EDIT_INDEX_FLAG
     */
    public Integer getEditIndexFlag() {
        return editIndexFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.EDIT_INDEX_FLAG
     * @param editIndexFlag DMS_PERMISSION.EDIT_INDEX_FLAG
     */
    public void setEditIndexFlag(Integer editIndexFlag) {
        this.editIndexFlag = editIndexFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.UPDATE_FLAG
     * @return DMS_PERMISSION.UPDATE_FLAG
     */
    public Integer getUpdateFlag() {
        return updateFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.UPDATE_FLAG
     * @param updateFlag DMS_PERMISSION.UPDATE_FLAG
     */
    public void setUpdateFlag(Integer updateFlag) {
        this.updateFlag = updateFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.INVITATION_FLAG
     * @return DMS_PERMISSION.INVITATION_FLAG
     */
    public Integer getInvitationFlag() {
        return invitationFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.INVITATION_FLAG
     * @param invitationFlag DMS_PERMISSION.INVITATION_FLAG
     */
    public void setInvitationFlag(Integer invitationFlag) {
        this.invitationFlag = invitationFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.LIST_VERSION_FLAG
     * @return DMS_PERMISSION.LIST_VERSION_FLAG
     */
    public Integer getListVersionFlag() {
        return listVersionFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.LIST_VERSION_FLAG
     * @param listVersionFlag DMS_PERMISSION.LIST_VERSION_FLAG
     */
    public void setListVersionFlag(Integer listVersionFlag) {
        this.listVersionFlag = listVersionFlag;
    }

    /** 
     * 获取 DMS_PERMISSION.MUST_FLAG
     * @return DMS_PERMISSION.MUST_FLAG
     */
    public String getMustFlag() {
        return mustFlag;
    }

    /** 
     * 设置 DMS_PERMISSION.MUST_FLAG
     * @param mustFlag DMS_PERMISSION.MUST_FLAG
     */
    public void setMustFlag(String mustFlag) {
        this.mustFlag = mustFlag == null ? null : mustFlag.trim();
    }
}