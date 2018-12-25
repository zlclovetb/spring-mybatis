package com.paradm.workspace.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class WspTemplateRecord extends BaseEntity implements Serializable {
    /** 
     */ 
    private String name;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private String isPublic;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 WSP_TEMPLATE_RECORD.NAME
     * @return WSP_TEMPLATE_RECORD.NAME
     */
    public String getName() {
        return name;
    }

    /** 
     * 设置 WSP_TEMPLATE_RECORD.NAME
     * @param name WSP_TEMPLATE_RECORD.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /** 
     * 获取 WSP_TEMPLATE_RECORD.DESCRIPTION
     * @return WSP_TEMPLATE_RECORD.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 WSP_TEMPLATE_RECORD.DESCRIPTION
     * @param description WSP_TEMPLATE_RECORD.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 WSP_TEMPLATE_RECORD.IS_PUBLIC
     * @return WSP_TEMPLATE_RECORD.IS_PUBLIC
     */
    public String getIsPublic() {
        return isPublic;
    }

    /** 
     * 设置 WSP_TEMPLATE_RECORD.IS_PUBLIC
     * @param isPublic WSP_TEMPLATE_RECORD.IS_PUBLIC
     */
    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic == null ? null : isPublic.trim();
    }
}