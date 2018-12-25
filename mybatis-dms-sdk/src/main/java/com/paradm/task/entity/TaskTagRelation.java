package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskTagRelation extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long taskId;

    /** 
     */ 
    private Long taskTagId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_TAG_RELATION.TASK_ID
     * @return TASK_TAG_RELATION.TASK_ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /** 
     * 设置 TASK_TAG_RELATION.TASK_ID
     * @param taskId TASK_TAG_RELATION.TASK_ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /** 
     * 获取 TASK_TAG_RELATION.TASK_TAG_ID
     * @return TASK_TAG_RELATION.TASK_TAG_ID
     */
    public Long getTaskTagId() {
        return taskTagId;
    }

    /** 
     * 设置 TASK_TAG_RELATION.TASK_TAG_ID
     * @param taskTagId TASK_TAG_RELATION.TASK_TAG_ID
     */
    public void setTaskTagId(Long taskTagId) {
        this.taskTagId = taskTagId;
    }
}