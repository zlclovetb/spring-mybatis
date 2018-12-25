package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class SysAuditTrail extends BaseEntity implements Serializable {
    /** 
     */ 
    private String description;

    /** 
     */ 
    private String ipAddress;

    /** 
     */ 
    private String auditType;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 SYS_AUDIT_TRAIL.DESCRIPTION
     * @return SYS_AUDIT_TRAIL.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 SYS_AUDIT_TRAIL.DESCRIPTION
     * @param description SYS_AUDIT_TRAIL.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 SYS_AUDIT_TRAIL.IP_ADDRESS
     * @return SYS_AUDIT_TRAIL.IP_ADDRESS
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** 
     * 设置 SYS_AUDIT_TRAIL.IP_ADDRESS
     * @param ipAddress SYS_AUDIT_TRAIL.IP_ADDRESS
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /** 
     * 获取 SYS_AUDIT_TRAIL.AUDIT_TYPE
     * @return SYS_AUDIT_TRAIL.AUDIT_TYPE
     */
    public String getAuditType() {
        return auditType;
    }

    /** 
     * 设置 SYS_AUDIT_TRAIL.AUDIT_TYPE
     * @param auditType SYS_AUDIT_TRAIL.AUDIT_TYPE
     */
    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
    }
}