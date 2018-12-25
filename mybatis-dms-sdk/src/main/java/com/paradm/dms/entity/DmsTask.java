package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsTask extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long actorUser;

    /** 
     */ 
    private Date dueDate;

    /** 
     */ 
    private String message;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private String isSend;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_TASK.DOC_ID
     * @return DMS_TASK.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_TASK.DOC_ID
     * @param docId DMS_TASK.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_TASK.ACTOR_USER
     * @return DMS_TASK.ACTOR_USER
     */
    public Long getActorUser() {
        return actorUser;
    }

    /** 
     * 设置 DMS_TASK.ACTOR_USER
     * @param actorUser DMS_TASK.ACTOR_USER
     */
    public void setActorUser(Long actorUser) {
        this.actorUser = actorUser;
    }

    /** 
     * 获取 DMS_TASK.DUE_DATE
     * @return DMS_TASK.DUE_DATE
     */
    public Date getDueDate() {
        return dueDate;
    }

    /** 
     * 设置 DMS_TASK.DUE_DATE
     * @param dueDate DMS_TASK.DUE_DATE
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /** 
     * 获取 DMS_TASK.MESSAGE
     * @return DMS_TASK.MESSAGE
     */
    public String getMessage() {
        return message;
    }

    /** 
     * 设置 DMS_TASK.MESSAGE
     * @param message DMS_TASK.MESSAGE
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /** 
     * 获取 DMS_TASK.STATUS
     * @return DMS_TASK.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 DMS_TASK.STATUS
     * @param status DMS_TASK.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 DMS_TASK.IS_SEND
     * @return DMS_TASK.IS_SEND
     */
    public String getIsSend() {
        return isSend;
    }

    /** 
     * 设置 DMS_TASK.IS_SEND
     * @param isSend DMS_TASK.IS_SEND
     */
    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }
}