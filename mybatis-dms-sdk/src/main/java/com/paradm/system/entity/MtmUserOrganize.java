package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class MtmUserOrganize extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long sourceOrgId;

    /** 
     */ 
    private Long relateOrgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 MTM_USER_ORGANIZE.SOURCE_ORG_ID
     * @return MTM_USER_ORGANIZE.SOURCE_ORG_ID
     */
    public Long getSourceOrgId() {
        return sourceOrgId;
    }

    /** 
     * 设置 MTM_USER_ORGANIZE.SOURCE_ORG_ID
     * @param sourceOrgId MTM_USER_ORGANIZE.SOURCE_ORG_ID
     */
    public void setSourceOrgId(Long sourceOrgId) {
        this.sourceOrgId = sourceOrgId;
    }

    /** 
     * 获取 MTM_USER_ORGANIZE.RELATE_ORG_ID
     * @return MTM_USER_ORGANIZE.RELATE_ORG_ID
     */
    public Long getRelateOrgId() {
        return relateOrgId;
    }

    /** 
     * 设置 MTM_USER_ORGANIZE.RELATE_ORG_ID
     * @param relateOrgId MTM_USER_ORGANIZE.RELATE_ORG_ID
     */
    public void setRelateOrgId(Long relateOrgId) {
        this.relateOrgId = relateOrgId;
    }
}