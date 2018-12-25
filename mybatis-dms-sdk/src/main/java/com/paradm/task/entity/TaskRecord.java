package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskRecord extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long wspId;

    /** 
     */ 
    private Long taskProjectId;

    /** 
     */ 
    private String taskName;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private String isPublic;

    /** 
     */ 
    private String taskType;

    /** 
     */ 
    private Date dueDate;

    /** 
     */ 
    private Integer sort;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private String priority;

    /** 
     */ 
    private Long taskColumnId;

    /** 
     */ 
    private Long approvalOrgId;

    /** 
     */ 
    private Long lockOrgId;

    /** 
     */ 
    private Long actorid;

    /** 
     */ 
    private String haveAttachment;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_RECORD.WSP_ID
     * @return TASK_RECORD.WSP_ID
     */
    public Long getWspId() {
        return wspId;
    }

    /** 
     * 设置 TASK_RECORD.WSP_ID
     * @param wspId TASK_RECORD.WSP_ID
     */
    public void setWspId(Long wspId) {
        this.wspId = wspId;
    }

    /** 
     * 获取 TASK_RECORD.TASK_PROJECT_ID
     * @return TASK_RECORD.TASK_PROJECT_ID
     */
    public Long getTaskProjectId() {
        return taskProjectId;
    }

    /** 
     * 设置 TASK_RECORD.TASK_PROJECT_ID
     * @param taskProjectId TASK_RECORD.TASK_PROJECT_ID
     */
    public void setTaskProjectId(Long taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    /** 
     * 获取 TASK_RECORD.TASK_NAME
     * @return TASK_RECORD.TASK_NAME
     */
    public String getTaskName() {
        return taskName;
    }

    /** 
     * 设置 TASK_RECORD.TASK_NAME
     * @param taskName TASK_RECORD.TASK_NAME
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /** 
     * 获取 TASK_RECORD.DESCRIPTION
     * @return TASK_RECORD.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 TASK_RECORD.DESCRIPTION
     * @param description TASK_RECORD.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 TASK_RECORD.IS_PUBLIC
     * @return TASK_RECORD.IS_PUBLIC
     */
    public String getIsPublic() {
        return isPublic;
    }

    /** 
     * 设置 TASK_RECORD.IS_PUBLIC
     * @param isPublic TASK_RECORD.IS_PUBLIC
     */
    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic == null ? null : isPublic.trim();
    }

    /** 
     * 获取 TASK_RECORD.TASK_TYPE
     * @return TASK_RECORD.TASK_TYPE
     */
    public String getTaskType() {
        return taskType;
    }

    /** 
     * 设置 TASK_RECORD.TASK_TYPE
     * @param taskType TASK_RECORD.TASK_TYPE
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /** 
     * 获取 TASK_RECORD.DUE_DATE
     * @return TASK_RECORD.DUE_DATE
     */
    public Date getDueDate() {
        return dueDate;
    }

    /** 
     * 设置 TASK_RECORD.DUE_DATE
     * @param dueDate TASK_RECORD.DUE_DATE
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /** 
     * 获取 TASK_RECORD.SORT
     * @return TASK_RECORD.SORT
     */
    public Integer getSort() {
        return sort;
    }

    /** 
     * 设置 TASK_RECORD.SORT
     * @param sort TASK_RECORD.SORT
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /** 
     * 获取 TASK_RECORD.STATUS
     * @return TASK_RECORD.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 TASK_RECORD.STATUS
     * @param status TASK_RECORD.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 TASK_RECORD.PRIORITY
     * @return TASK_RECORD.PRIORITY
     */
    public String getPriority() {
        return priority;
    }

    /** 
     * 设置 TASK_RECORD.PRIORITY
     * @param priority TASK_RECORD.PRIORITY
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /** 
     * 获取 TASK_RECORD.TASK_COLUMN_ID
     * @return TASK_RECORD.TASK_COLUMN_ID
     */
    public Long getTaskColumnId() {
        return taskColumnId;
    }

    /** 
     * 设置 TASK_RECORD.TASK_COLUMN_ID
     * @param taskColumnId TASK_RECORD.TASK_COLUMN_ID
     */
    public void setTaskColumnId(Long taskColumnId) {
        this.taskColumnId = taskColumnId;
    }

    /** 
     * 获取 TASK_RECORD.APPROVAL_ORG_ID
     * @return TASK_RECORD.APPROVAL_ORG_ID
     */
    public Long getApprovalOrgId() {
        return approvalOrgId;
    }

    /** 
     * 设置 TASK_RECORD.APPROVAL_ORG_ID
     * @param approvalOrgId TASK_RECORD.APPROVAL_ORG_ID
     */
    public void setApprovalOrgId(Long approvalOrgId) {
        this.approvalOrgId = approvalOrgId;
    }

    /** 
     * 获取 TASK_RECORD.LOCK_ORG_ID
     * @return TASK_RECORD.LOCK_ORG_ID
     */
    public Long getLockOrgId() {
        return lockOrgId;
    }

    /** 
     * 设置 TASK_RECORD.LOCK_ORG_ID
     * @param lockOrgId TASK_RECORD.LOCK_ORG_ID
     */
    public void setLockOrgId(Long lockOrgId) {
        this.lockOrgId = lockOrgId;
    }

    /** 
     * 获取 TASK_RECORD.ACTORID
     * @return TASK_RECORD.ACTORID
     */
    public Long getActorid() {
        return actorid;
    }

    /** 
     * 设置 TASK_RECORD.ACTORID
     * @param actorid TASK_RECORD.ACTORID
     */
    public void setActorid(Long actorid) {
        this.actorid = actorid;
    }

    /** 
     * 获取 TASK_RECORD.HAVE_ATTACHMENT
     * @return TASK_RECORD.HAVE_ATTACHMENT
     */
    public String getHaveAttachment() {
        return haveAttachment;
    }

    /** 
     * 设置 TASK_RECORD.HAVE_ATTACHMENT
     * @param haveAttachment TASK_RECORD.HAVE_ATTACHMENT
     */
    public void setHaveAttachment(String haveAttachment) {
        this.haveAttachment = haveAttachment == null ? null : haveAttachment.trim();
    }
}