package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class UserOrgnize extends BaseEntity implements Serializable {
    /** 
     */ 
    private String orgName;

    /** 
     */ 
    private String orgType;

    /** 
     */ 
    private Long parentId;

    /** 
     */ 
    private String orgDesc;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 USER_ORGNIZE.ORG_NAME
     * @return USER_ORGNIZE.ORG_NAME
     */
    public String getOrgName() {
        return orgName;
    }

    /** 
     * 设置 USER_ORGNIZE.ORG_NAME
     * @param orgName USER_ORGNIZE.ORG_NAME
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /** 
     * 获取 USER_ORGNIZE.ORG_TYPE
     * @return USER_ORGNIZE.ORG_TYPE
     */
    public String getOrgType() {
        return orgType;
    }

    /** 
     * 设置 USER_ORGNIZE.ORG_TYPE
     * @param orgType USER_ORGNIZE.ORG_TYPE
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /** 
     * 获取 USER_ORGNIZE.PARENT_ID
     * @return USER_ORGNIZE.PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /** 
     * 设置 USER_ORGNIZE.PARENT_ID
     * @param parentId USER_ORGNIZE.PARENT_ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /** 
     * 获取 USER_ORGNIZE.ORG_DESC
     * @return USER_ORGNIZE.ORG_DESC
     */
    public String getOrgDesc() {
        return orgDesc;
    }

    /** 
     * 设置 USER_ORGNIZE.ORG_DESC
     * @param orgDesc USER_ORGNIZE.ORG_DESC
     */
    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc == null ? null : orgDesc.trim();
    }
}