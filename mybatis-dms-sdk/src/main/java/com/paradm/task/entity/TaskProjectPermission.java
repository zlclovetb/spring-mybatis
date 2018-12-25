package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskProjectPermission extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long taskProjectId;

    /** 
     */ 
    private Long orgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_PROJECT_PERMISSION.TASK_PROJECT_ID
     * @return TASK_PROJECT_PERMISSION.TASK_PROJECT_ID
     */
    public Long getTaskProjectId() {
        return taskProjectId;
    }

    /** 
     * 设置 TASK_PROJECT_PERMISSION.TASK_PROJECT_ID
     * @param taskProjectId TASK_PROJECT_PERMISSION.TASK_PROJECT_ID
     */
    public void setTaskProjectId(Long taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    /** 
     * 获取 TASK_PROJECT_PERMISSION.ORG_ID
     * @return TASK_PROJECT_PERMISSION.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 TASK_PROJECT_PERMISSION.ORG_ID
     * @param orgId TASK_PROJECT_PERMISSION.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}