package com.paradm.workspace.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class WspTemplateFolder extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long templateId;

    /** 
     */ 
    private String name;

    /** 
     */ 
    private Long parentId;

    /** 
     */ 
    private String priority;

    /** 
     */ 
    private String referenceNo;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private String inheritFlag;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.TEMPLATE_ID
     * @return WSP_TEMPLATE_FOLDER.TEMPLATE_ID
     */
    public Long getTemplateId() {
        return templateId;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.TEMPLATE_ID
     * @param templateId WSP_TEMPLATE_FOLDER.TEMPLATE_ID
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.NAME
     * @return WSP_TEMPLATE_FOLDER.NAME
     */
    public String getName() {
        return name;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.NAME
     * @param name WSP_TEMPLATE_FOLDER.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.PARENT_ID
     * @return WSP_TEMPLATE_FOLDER.PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.PARENT_ID
     * @param parentId WSP_TEMPLATE_FOLDER.PARENT_ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.PRIORITY
     * @return WSP_TEMPLATE_FOLDER.PRIORITY
     */
    public String getPriority() {
        return priority;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.PRIORITY
     * @param priority WSP_TEMPLATE_FOLDER.PRIORITY
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.REFERENCE_NO
     * @return WSP_TEMPLATE_FOLDER.REFERENCE_NO
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.REFERENCE_NO
     * @param referenceNo WSP_TEMPLATE_FOLDER.REFERENCE_NO
     */
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo == null ? null : referenceNo.trim();
    }

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.DESCRIPTION
     * @return WSP_TEMPLATE_FOLDER.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.DESCRIPTION
     * @param description WSP_TEMPLATE_FOLDER.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 WSP_TEMPLATE_FOLDER.INHERIT_FLAG
     * @return WSP_TEMPLATE_FOLDER.INHERIT_FLAG
     */
    public String getInheritFlag() {
        return inheritFlag;
    }

    /** 
     * 设置 WSP_TEMPLATE_FOLDER.INHERIT_FLAG
     * @param inheritFlag WSP_TEMPLATE_FOLDER.INHERIT_FLAG
     */
    public void setInheritFlag(String inheritFlag) {
        this.inheritFlag = inheritFlag == null ? null : inheritFlag.trim();
    }
}