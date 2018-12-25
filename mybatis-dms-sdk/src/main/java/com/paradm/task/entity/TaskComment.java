package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskComment extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long taskId;

    /** 
     */ 
    private String message;

    /** 
     */ 
    private Integer sort;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_COMMENT.TASK_ID
     * @return TASK_COMMENT.TASK_ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /** 
     * 设置 TASK_COMMENT.TASK_ID
     * @param taskId TASK_COMMENT.TASK_ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /** 
     * 获取 TASK_COMMENT.MESSAGE
     * @return TASK_COMMENT.MESSAGE
     */
    public String getMessage() {
        return message;
    }

    /** 
     * 设置 TASK_COMMENT.MESSAGE
     * @param message TASK_COMMENT.MESSAGE
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /** 
     * 获取 TASK_COMMENT.SORT
     * @return TASK_COMMENT.SORT
     */
    public Integer getSort() {
        return sort;
    }

    /** 
     * 设置 TASK_COMMENT.SORT
     * @param sort TASK_COMMENT.SORT
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}