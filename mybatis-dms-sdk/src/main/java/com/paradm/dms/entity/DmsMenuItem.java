package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsMenuItem extends BaseEntity implements Serializable {
    /** 
     */ 
    private String label;

    /** 
     */ 
    private String groupName;

    /** 
     */ 
    private Integer sequence;

    /** 
     */ 
    private String enableCss;

    /** 
     */ 
    private String disableCss;

    /** 
     */ 
    private String objectPermission;

    /** 
     */ 
    private String responseClass;

    /** 
     */ 
    private String description;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_MENU_ITEM.LABEL
     * @return DMS_MENU_ITEM.LABEL
     */
    public String getLabel() {
        return label;
    }

    /** 
     * 设置 DMS_MENU_ITEM.LABEL
     * @param label DMS_MENU_ITEM.LABEL
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /** 
     * 获取 DMS_MENU_ITEM.GROUP_NAME
     * @return DMS_MENU_ITEM.GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /** 
     * 设置 DMS_MENU_ITEM.GROUP_NAME
     * @param groupName DMS_MENU_ITEM.GROUP_NAME
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /** 
     * 获取 DMS_MENU_ITEM.SEQUENCE
     * @return DMS_MENU_ITEM.SEQUENCE
     */
    public Integer getSequence() {
        return sequence;
    }

    /** 
     * 设置 DMS_MENU_ITEM.SEQUENCE
     * @param sequence DMS_MENU_ITEM.SEQUENCE
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /** 
     * 获取 DMS_MENU_ITEM.ENABLE_CSS
     * @return DMS_MENU_ITEM.ENABLE_CSS
     */
    public String getEnableCss() {
        return enableCss;
    }

    /** 
     * 设置 DMS_MENU_ITEM.ENABLE_CSS
     * @param enableCss DMS_MENU_ITEM.ENABLE_CSS
     */
    public void setEnableCss(String enableCss) {
        this.enableCss = enableCss == null ? null : enableCss.trim();
    }

    /** 
     * 获取 DMS_MENU_ITEM.DISABLE_CSS
     * @return DMS_MENU_ITEM.DISABLE_CSS
     */
    public String getDisableCss() {
        return disableCss;
    }

    /** 
     * 设置 DMS_MENU_ITEM.DISABLE_CSS
     * @param disableCss DMS_MENU_ITEM.DISABLE_CSS
     */
    public void setDisableCss(String disableCss) {
        this.disableCss = disableCss == null ? null : disableCss.trim();
    }

    /** 
     * 获取 DMS_MENU_ITEM.OBJECT_PERMISSION
     * @return DMS_MENU_ITEM.OBJECT_PERMISSION
     */
    public String getObjectPermission() {
        return objectPermission;
    }

    /** 
     * 设置 DMS_MENU_ITEM.OBJECT_PERMISSION
     * @param objectPermission DMS_MENU_ITEM.OBJECT_PERMISSION
     */
    public void setObjectPermission(String objectPermission) {
        this.objectPermission = objectPermission == null ? null : objectPermission.trim();
    }

    /** 
     * 获取 DMS_MENU_ITEM.RESPONSE_CLASS
     * @return DMS_MENU_ITEM.RESPONSE_CLASS
     */
    public String getResponseClass() {
        return responseClass;
    }

    /** 
     * 设置 DMS_MENU_ITEM.RESPONSE_CLASS
     * @param responseClass DMS_MENU_ITEM.RESPONSE_CLASS
     */
    public void setResponseClass(String responseClass) {
        this.responseClass = responseClass == null ? null : responseClass.trim();
    }

    /** 
     * 获取 DMS_MENU_ITEM.DESCRIPTION
     * @return DMS_MENU_ITEM.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 DMS_MENU_ITEM.DESCRIPTION
     * @param description DMS_MENU_ITEM.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}