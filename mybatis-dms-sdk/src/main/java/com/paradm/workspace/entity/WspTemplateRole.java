package com.paradm.workspace.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class WspTemplateRole extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long templateId;

    /** 
     */ 
    private Long orgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 WSP_TEMPLATE_ROLE.TEMPLATE_ID
     * @return WSP_TEMPLATE_ROLE.TEMPLATE_ID
     */
    public Long getTemplateId() {
        return templateId;
    }

    /** 
     * 设置 WSP_TEMPLATE_ROLE.TEMPLATE_ID
     * @param templateId WSP_TEMPLATE_ROLE.TEMPLATE_ID
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /** 
     * 获取 WSP_TEMPLATE_ROLE.ORG_ID
     * @return WSP_TEMPLATE_ROLE.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 WSP_TEMPLATE_ROLE.ORG_ID
     * @param orgId WSP_TEMPLATE_ROLE.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}