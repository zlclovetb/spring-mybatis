package com.paradm.workspace.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class WspUserOrgnize extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long wspId;

    /** 
     */ 
    private Long orgId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 WSP_USER_ORGNIZE.WSP_ID
     * @return WSP_USER_ORGNIZE.WSP_ID
     */
    public Long getWspId() {
        return wspId;
    }

    /** 
     * 设置 WSP_USER_ORGNIZE.WSP_ID
     * @param wspId WSP_USER_ORGNIZE.WSP_ID
     */
    public void setWspId(Long wspId) {
        this.wspId = wspId;
    }

    /** 
     * 获取 WSP_USER_ORGNIZE.ORG_ID
     * @return WSP_USER_ORGNIZE.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 WSP_USER_ORGNIZE.ORG_ID
     * @param orgId WSP_USER_ORGNIZE.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}