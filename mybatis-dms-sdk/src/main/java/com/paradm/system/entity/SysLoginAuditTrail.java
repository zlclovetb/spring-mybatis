package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class SysLoginAuditTrail extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long orgId;

    /** 
     */ 
    private Date loginTime;

    /** 
     */ 
    private Date logoutTime;

    /** 
     */ 
    private String loginStatus;

    /** 
     */ 
    private String loginClient;

    /** 
     */ 
    private String loginDescription;

    /** 
     */ 
    private String ipAddress;

    /** 
     */ 
    private String sessionId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.ORG_ID
     * @return SYS_LOGIN_AUDIT_TRAIL.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.ORG_ID
     * @param orgId SYS_LOGIN_AUDIT_TRAIL.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.LOGIN_TIME
     * @return SYS_LOGIN_AUDIT_TRAIL.LOGIN_TIME
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.LOGIN_TIME
     * @param loginTime SYS_LOGIN_AUDIT_TRAIL.LOGIN_TIME
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.LOGOUT_TIME
     * @return SYS_LOGIN_AUDIT_TRAIL.LOGOUT_TIME
     */
    public Date getLogoutTime() {
        return logoutTime;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.LOGOUT_TIME
     * @param logoutTime SYS_LOGIN_AUDIT_TRAIL.LOGOUT_TIME
     */
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.LOGIN_STATUS
     * @return SYS_LOGIN_AUDIT_TRAIL.LOGIN_STATUS
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.LOGIN_STATUS
     * @param loginStatus SYS_LOGIN_AUDIT_TRAIL.LOGIN_STATUS
     */
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus == null ? null : loginStatus.trim();
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.LOGIN_CLIENT
     * @return SYS_LOGIN_AUDIT_TRAIL.LOGIN_CLIENT
     */
    public String getLoginClient() {
        return loginClient;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.LOGIN_CLIENT
     * @param loginClient SYS_LOGIN_AUDIT_TRAIL.LOGIN_CLIENT
     */
    public void setLoginClient(String loginClient) {
        this.loginClient = loginClient == null ? null : loginClient.trim();
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.LOGIN_DESCRIPTION
     * @return SYS_LOGIN_AUDIT_TRAIL.LOGIN_DESCRIPTION
     */
    public String getLoginDescription() {
        return loginDescription;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.LOGIN_DESCRIPTION
     * @param loginDescription SYS_LOGIN_AUDIT_TRAIL.LOGIN_DESCRIPTION
     */
    public void setLoginDescription(String loginDescription) {
        this.loginDescription = loginDescription == null ? null : loginDescription.trim();
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.IP_ADDRESS
     * @return SYS_LOGIN_AUDIT_TRAIL.IP_ADDRESS
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.IP_ADDRESS
     * @param ipAddress SYS_LOGIN_AUDIT_TRAIL.IP_ADDRESS
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /** 
     * 获取 SYS_LOGIN_AUDIT_TRAIL.SESSION_ID
     * @return SYS_LOGIN_AUDIT_TRAIL.SESSION_ID
     */
    public String getSessionId() {
        return sessionId;
    }

    /** 
     * 设置 SYS_LOGIN_AUDIT_TRAIL.SESSION_ID
     * @param sessionId SYS_LOGIN_AUDIT_TRAIL.SESSION_ID
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }
}