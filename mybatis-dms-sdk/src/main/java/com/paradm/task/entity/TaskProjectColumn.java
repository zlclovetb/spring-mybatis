package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskProjectColumn extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long parentId;

    /** 
     */ 
    private Long taskProjectId;

    /** 
     */ 
    private String name;

    /** 
     */ 
    private String columnType;

    /** 
     */ 
    private Integer columnLimit;

    /** 
     */ 
    private String allowLimitFlag;

    /** 
     */ 
    private Integer sort;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_PROJECT_COLUMN.PARENT_ID
     * @return TASK_PROJECT_COLUMN.PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.PARENT_ID
     * @param parentId TASK_PROJECT_COLUMN.PARENT_ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /** 
     * 获取 TASK_PROJECT_COLUMN.TASK_PROJECT_ID
     * @return TASK_PROJECT_COLUMN.TASK_PROJECT_ID
     */
    public Long getTaskProjectId() {
        return taskProjectId;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.TASK_PROJECT_ID
     * @param taskProjectId TASK_PROJECT_COLUMN.TASK_PROJECT_ID
     */
    public void setTaskProjectId(Long taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    /** 
     * 获取 TASK_PROJECT_COLUMN.NAME
     * @return TASK_PROJECT_COLUMN.NAME
     */
    public String getName() {
        return name;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.NAME
     * @param name TASK_PROJECT_COLUMN.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /** 
     * 获取 TASK_PROJECT_COLUMN.COLUMN_TYPE
     * @return TASK_PROJECT_COLUMN.COLUMN_TYPE
     */
    public String getColumnType() {
        return columnType;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.COLUMN_TYPE
     * @param columnType TASK_PROJECT_COLUMN.COLUMN_TYPE
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    /** 
     * 获取 TASK_PROJECT_COLUMN.COLUMN_LIMIT
     * @return TASK_PROJECT_COLUMN.COLUMN_LIMIT
     */
    public Integer getColumnLimit() {
        return columnLimit;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.COLUMN_LIMIT
     * @param columnLimit TASK_PROJECT_COLUMN.COLUMN_LIMIT
     */
    public void setColumnLimit(Integer columnLimit) {
        this.columnLimit = columnLimit;
    }

    /** 
     * 获取 TASK_PROJECT_COLUMN.ALLOW_LIMIT_FLAG
     * @return TASK_PROJECT_COLUMN.ALLOW_LIMIT_FLAG
     */
    public String getAllowLimitFlag() {
        return allowLimitFlag;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.ALLOW_LIMIT_FLAG
     * @param allowLimitFlag TASK_PROJECT_COLUMN.ALLOW_LIMIT_FLAG
     */
    public void setAllowLimitFlag(String allowLimitFlag) {
        this.allowLimitFlag = allowLimitFlag == null ? null : allowLimitFlag.trim();
    }

    /** 
     * 获取 TASK_PROJECT_COLUMN.SORT
     * @return TASK_PROJECT_COLUMN.SORT
     */
    public Integer getSort() {
        return sort;
    }

    /** 
     * 设置 TASK_PROJECT_COLUMN.SORT
     * @param sort TASK_PROJECT_COLUMN.SORT
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}