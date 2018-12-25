package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskAuditTrail extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long taskId;

    /** 
     */ 
    private String description;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_AUDIT_TRAIL.TASK_ID
     * @return TASK_AUDIT_TRAIL.TASK_ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /** 
     * 设置 TASK_AUDIT_TRAIL.TASK_ID
     * @param taskId TASK_AUDIT_TRAIL.TASK_ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /** 
     * 获取 TASK_AUDIT_TRAIL.DESCRIPTION
     * @return TASK_AUDIT_TRAIL.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 TASK_AUDIT_TRAIL.DESCRIPTION
     * @param description TASK_AUDIT_TRAIL.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}