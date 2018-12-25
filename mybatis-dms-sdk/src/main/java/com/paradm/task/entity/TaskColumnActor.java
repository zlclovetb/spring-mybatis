package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskColumnActor extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long taskColumnId;

    /** 
     */ 
    private Long orgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_COLUMN_ACTOR.TASK_COLUMN_ID
     * @return TASK_COLUMN_ACTOR.TASK_COLUMN_ID
     */
    public Long getTaskColumnId() {
        return taskColumnId;
    }

    /** 
     * 设置 TASK_COLUMN_ACTOR.TASK_COLUMN_ID
     * @param taskColumnId TASK_COLUMN_ACTOR.TASK_COLUMN_ID
     */
    public void setTaskColumnId(Long taskColumnId) {
        this.taskColumnId = taskColumnId;
    }

    /** 
     * 获取 TASK_COLUMN_ACTOR.ORG_ID
     * @return TASK_COLUMN_ACTOR.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 TASK_COLUMN_ACTOR.ORG_ID
     * @param orgId TASK_COLUMN_ACTOR.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}