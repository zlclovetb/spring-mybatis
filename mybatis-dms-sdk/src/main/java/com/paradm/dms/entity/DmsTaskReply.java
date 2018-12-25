package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsTaskReply extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long dmsTaskId;

    /** 
     */ 
    private String message;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_TASK_REPLY.DOC_ID
     * @return DMS_TASK_REPLY.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_TASK_REPLY.DOC_ID
     * @param docId DMS_TASK_REPLY.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_TASK_REPLY.DMS_TASK_ID
     * @return DMS_TASK_REPLY.DMS_TASK_ID
     */
    public Long getDmsTaskId() {
        return dmsTaskId;
    }

    /** 
     * 设置 DMS_TASK_REPLY.DMS_TASK_ID
     * @param dmsTaskId DMS_TASK_REPLY.DMS_TASK_ID
     */
    public void setDmsTaskId(Long dmsTaskId) {
        this.dmsTaskId = dmsTaskId;
    }

    /** 
     * 获取 DMS_TASK_REPLY.MESSAGE
     * @return DMS_TASK_REPLY.MESSAGE
     */
    public String getMessage() {
        return message;
    }

    /** 
     * 设置 DMS_TASK_REPLY.MESSAGE
     * @param message DMS_TASK_REPLY.MESSAGE
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}