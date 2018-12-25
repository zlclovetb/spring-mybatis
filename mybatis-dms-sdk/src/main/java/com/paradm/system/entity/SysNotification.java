package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class SysNotification extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long notifyUser;

    /** 
     */ 
    private String notifyType;

    /** 
     */ 
    private Date notifyDate;

    /** 
     */ 
    private String subject;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private Long objectId;

    /** 
     */ 
    private String objectType;

    /** 
     */ 
    private Date dueDate;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 SYS_NOTIFICATION.NOTIFY_USER
     * @return SYS_NOTIFICATION.NOTIFY_USER
     */
    public Long getNotifyUser() {
        return notifyUser;
    }

    /** 
     * 设置 SYS_NOTIFICATION.NOTIFY_USER
     * @param notifyUser SYS_NOTIFICATION.NOTIFY_USER
     */
    public void setNotifyUser(Long notifyUser) {
        this.notifyUser = notifyUser;
    }

    /** 
     * 获取 SYS_NOTIFICATION.NOTIFY_TYPE
     * @return SYS_NOTIFICATION.NOTIFY_TYPE
     */
    public String getNotifyType() {
        return notifyType;
    }

    /** 
     * 设置 SYS_NOTIFICATION.NOTIFY_TYPE
     * @param notifyType SYS_NOTIFICATION.NOTIFY_TYPE
     */
    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType == null ? null : notifyType.trim();
    }

    /** 
     * 获取 SYS_NOTIFICATION.NOTIFY_DATE
     * @return SYS_NOTIFICATION.NOTIFY_DATE
     */
    public Date getNotifyDate() {
        return notifyDate;
    }

    /** 
     * 设置 SYS_NOTIFICATION.NOTIFY_DATE
     * @param notifyDate SYS_NOTIFICATION.NOTIFY_DATE
     */
    public void setNotifyDate(Date notifyDate) {
        this.notifyDate = notifyDate;
    }

    /** 
     * 获取 SYS_NOTIFICATION.SUBJECT
     * @return SYS_NOTIFICATION.SUBJECT
     */
    public String getSubject() {
        return subject;
    }

    /** 
     * 设置 SYS_NOTIFICATION.SUBJECT
     * @param subject SYS_NOTIFICATION.SUBJECT
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /** 
     * 获取 SYS_NOTIFICATION.DESCRIPTION
     * @return SYS_NOTIFICATION.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 SYS_NOTIFICATION.DESCRIPTION
     * @param description SYS_NOTIFICATION.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 SYS_NOTIFICATION.STATUS
     * @return SYS_NOTIFICATION.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 SYS_NOTIFICATION.STATUS
     * @param status SYS_NOTIFICATION.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 SYS_NOTIFICATION.OBJECT_ID
     * @return SYS_NOTIFICATION.OBJECT_ID
     */
    public Long getObjectId() {
        return objectId;
    }

    /** 
     * 设置 SYS_NOTIFICATION.OBJECT_ID
     * @param objectId SYS_NOTIFICATION.OBJECT_ID
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    /** 
     * 获取 SYS_NOTIFICATION.OBJECT_TYPE
     * @return SYS_NOTIFICATION.OBJECT_TYPE
     */
    public String getObjectType() {
        return objectType;
    }

    /** 
     * 设置 SYS_NOTIFICATION.OBJECT_TYPE
     * @param objectType SYS_NOTIFICATION.OBJECT_TYPE
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    /** 
     * 获取 SYS_NOTIFICATION.DUE_DATE
     * @return SYS_NOTIFICATION.DUE_DATE
     */
    public Date getDueDate() {
        return dueDate;
    }

    /** 
     * 设置 SYS_NOTIFICATION.DUE_DATE
     * @param dueDate SYS_NOTIFICATION.DUE_DATE
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}