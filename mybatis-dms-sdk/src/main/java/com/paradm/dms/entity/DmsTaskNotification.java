package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsTaskNotification extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long notifyUser;

    /** 
     */ 
    private Date notifyDate;

    /** 
     */ 
    private String description;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_TASK_NOTIFICATION.ROOT_ID
     * @return DMS_TASK_NOTIFICATION.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 DMS_TASK_NOTIFICATION.ROOT_ID
     * @param rootId DMS_TASK_NOTIFICATION.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 DMS_TASK_NOTIFICATION.DOC_ID
     * @return DMS_TASK_NOTIFICATION.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_TASK_NOTIFICATION.DOC_ID
     * @param docId DMS_TASK_NOTIFICATION.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_TASK_NOTIFICATION.NOTIFY_USER
     * @return DMS_TASK_NOTIFICATION.NOTIFY_USER
     */
    public Long getNotifyUser() {
        return notifyUser;
    }

    /** 
     * 设置 DMS_TASK_NOTIFICATION.NOTIFY_USER
     * @param notifyUser DMS_TASK_NOTIFICATION.NOTIFY_USER
     */
    public void setNotifyUser(Long notifyUser) {
        this.notifyUser = notifyUser;
    }

    /** 
     * 获取 DMS_TASK_NOTIFICATION.NOTIFY_DATE
     * @return DMS_TASK_NOTIFICATION.NOTIFY_DATE
     */
    public Date getNotifyDate() {
        return notifyDate;
    }

    /** 
     * 设置 DMS_TASK_NOTIFICATION.NOTIFY_DATE
     * @param notifyDate DMS_TASK_NOTIFICATION.NOTIFY_DATE
     */
    public void setNotifyDate(Date notifyDate) {
        this.notifyDate = notifyDate;
    }

    /** 
     * 获取 DMS_TASK_NOTIFICATION.DESCRIPTION
     * @return DMS_TASK_NOTIFICATION.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 DMS_TASK_NOTIFICATION.DESCRIPTION
     * @param description DMS_TASK_NOTIFICATION.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}