package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskProjectRecord extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long wspId;

    /** 
     */ 
    private String projectName;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private String layoutStyle;

    /** 
     */ 
    private String permissionType;

    /** 
     */ 
    private Long ownerId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TASK_PROJECT_RECORD.WSP_ID
     * @return TASK_PROJECT_RECORD.WSP_ID
     */
    public Long getWspId() {
        return wspId;
    }

    /** 
     * 设置 TASK_PROJECT_RECORD.WSP_ID
     * @param wspId TASK_PROJECT_RECORD.WSP_ID
     */
    public void setWspId(Long wspId) {
        this.wspId = wspId;
    }

    /** 
     * 获取 TASK_PROJECT_RECORD.PROJECT_NAME
     * @return TASK_PROJECT_RECORD.PROJECT_NAME
     */
    public String getProjectName() {
        return projectName;
    }

    /** 
     * 设置 TASK_PROJECT_RECORD.PROJECT_NAME
     * @param projectName TASK_PROJECT_RECORD.PROJECT_NAME
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /** 
     * 获取 TASK_PROJECT_RECORD.DESCRIPTION
     * @return TASK_PROJECT_RECORD.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 TASK_PROJECT_RECORD.DESCRIPTION
     * @param description TASK_PROJECT_RECORD.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 TASK_PROJECT_RECORD.LAYOUT_STYLE
     * @return TASK_PROJECT_RECORD.LAYOUT_STYLE
     */
    public String getLayoutStyle() {
        return layoutStyle;
    }

    /** 
     * 设置 TASK_PROJECT_RECORD.LAYOUT_STYLE
     * @param layoutStyle TASK_PROJECT_RECORD.LAYOUT_STYLE
     */
    public void setLayoutStyle(String layoutStyle) {
        this.layoutStyle = layoutStyle == null ? null : layoutStyle.trim();
    }

    /** 
     * 获取 TASK_PROJECT_RECORD.PERMISSION_TYPE
     * @return TASK_PROJECT_RECORD.PERMISSION_TYPE
     */
    public String getPermissionType() {
        return permissionType;
    }

    /** 
     * 设置 TASK_PROJECT_RECORD.PERMISSION_TYPE
     * @param permissionType TASK_PROJECT_RECORD.PERMISSION_TYPE
     */
    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType == null ? null : permissionType.trim();
    }

    /** 
     * 获取 TASK_PROJECT_RECORD.OWNER_ID
     * @return TASK_PROJECT_RECORD.OWNER_ID
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /** 
     * 设置 TASK_PROJECT_RECORD.OWNER_ID
     * @param ownerId TASK_PROJECT_RECORD.OWNER_ID
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}