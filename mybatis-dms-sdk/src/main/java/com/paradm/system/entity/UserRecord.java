package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class UserRecord extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long orgId;

    /** 
     */ 
    private String loginName;

    /** 
     */ 
    private String loginPwd;

    /** 
     */ 
    private String firstName;

    /** 
     */ 
    private String lastName;

    /** 
     */ 
    private String fullName;

    /** 
     */ 
    private String email;

    /** 
     */ 
    private String locale;

    /** 
     */ 
    private Integer maxAttempt;

    /** 
     */ 
    private Integer failedAttempt;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private String preference;

    /** 
     */ 
    private Date loginDate;

    /** 
     */ 
    private Date lastPwdUpdateDate;

    /** 
     */ 
    private String iconPath;

    /** 
     */ 
    private String authMobile;

    /** 
     */ 
    private String twoFactor;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 USER_RECORD.ORG_ID
     * @return USER_RECORD.ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /** 
     * 设置 USER_RECORD.ORG_ID
     * @param orgId USER_RECORD.ORG_ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /** 
     * 获取 USER_RECORD.LOGIN_NAME
     * @return USER_RECORD.LOGIN_NAME
     */
    public String getLoginName() {
        return loginName;
    }

    /** 
     * 设置 USER_RECORD.LOGIN_NAME
     * @param loginName USER_RECORD.LOGIN_NAME
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /** 
     * 获取 USER_RECORD.LOGIN_PWD
     * @return USER_RECORD.LOGIN_PWD
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /** 
     * 设置 USER_RECORD.LOGIN_PWD
     * @param loginPwd USER_RECORD.LOGIN_PWD
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /** 
     * 获取 USER_RECORD.FIRST_NAME
     * @return USER_RECORD.FIRST_NAME
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * 设置 USER_RECORD.FIRST_NAME
     * @param firstName USER_RECORD.FIRST_NAME
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /** 
     * 获取 USER_RECORD.LAST_NAME
     * @return USER_RECORD.LAST_NAME
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * 设置 USER_RECORD.LAST_NAME
     * @param lastName USER_RECORD.LAST_NAME
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /** 
     * 获取 USER_RECORD.FULL_NAME
     * @return USER_RECORD.FULL_NAME
     */
    public String getFullName() {
        return fullName;
    }

    /** 
     * 设置 USER_RECORD.FULL_NAME
     * @param fullName USER_RECORD.FULL_NAME
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /** 
     * 获取 USER_RECORD.EMAIL
     * @return USER_RECORD.EMAIL
     */
    public String getEmail() {
        return email;
    }

    /** 
     * 设置 USER_RECORD.EMAIL
     * @param email USER_RECORD.EMAIL
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /** 
     * 获取 USER_RECORD.LOCALE
     * @return USER_RECORD.LOCALE
     */
    public String getLocale() {
        return locale;
    }

    /** 
     * 设置 USER_RECORD.LOCALE
     * @param locale USER_RECORD.LOCALE
     */
    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    /** 
     * 获取 USER_RECORD.MAX_ATTEMPT
     * @return USER_RECORD.MAX_ATTEMPT
     */
    public Integer getMaxAttempt() {
        return maxAttempt;
    }

    /** 
     * 设置 USER_RECORD.MAX_ATTEMPT
     * @param maxAttempt USER_RECORD.MAX_ATTEMPT
     */
    public void setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
    }

    /** 
     * 获取 USER_RECORD.FAILED_ATTEMPT
     * @return USER_RECORD.FAILED_ATTEMPT
     */
    public Integer getFailedAttempt() {
        return failedAttempt;
    }

    /** 
     * 设置 USER_RECORD.FAILED_ATTEMPT
     * @param failedAttempt USER_RECORD.FAILED_ATTEMPT
     */
    public void setFailedAttempt(Integer failedAttempt) {
        this.failedAttempt = failedAttempt;
    }

    /** 
     * 获取 USER_RECORD.STATUS
     * @return USER_RECORD.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 USER_RECORD.STATUS
     * @param status USER_RECORD.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 USER_RECORD.PREFERENCE
     * @return USER_RECORD.PREFERENCE
     */
    public String getPreference() {
        return preference;
    }

    /** 
     * 设置 USER_RECORD.PREFERENCE
     * @param preference USER_RECORD.PREFERENCE
     */
    public void setPreference(String preference) {
        this.preference = preference == null ? null : preference.trim();
    }

    /** 
     * 获取 USER_RECORD.LOGIN_DATE
     * @return USER_RECORD.LOGIN_DATE
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /** 
     * 设置 USER_RECORD.LOGIN_DATE
     * @param loginDate USER_RECORD.LOGIN_DATE
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /** 
     * 获取 USER_RECORD.LAST_PWD_UPDATE_DATE
     * @return USER_RECORD.LAST_PWD_UPDATE_DATE
     */
    public Date getLastPwdUpdateDate() {
        return lastPwdUpdateDate;
    }

    /** 
     * 设置 USER_RECORD.LAST_PWD_UPDATE_DATE
     * @param lastPwdUpdateDate USER_RECORD.LAST_PWD_UPDATE_DATE
     */
    public void setLastPwdUpdateDate(Date lastPwdUpdateDate) {
        this.lastPwdUpdateDate = lastPwdUpdateDate;
    }

    /** 
     * 获取 USER_RECORD.ICON_PATH
     * @return USER_RECORD.ICON_PATH
     */
    public String getIconPath() {
        return iconPath;
    }

    /** 
     * 设置 USER_RECORD.ICON_PATH
     * @param iconPath USER_RECORD.ICON_PATH
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }

    /** 
     * 获取 USER_RECORD.AUTH_MOBILE
     * @return USER_RECORD.AUTH_MOBILE
     */
    public String getAuthMobile() {
        return authMobile;
    }

    /** 
     * 设置 USER_RECORD.AUTH_MOBILE
     * @param authMobile USER_RECORD.AUTH_MOBILE
     */
    public void setAuthMobile(String authMobile) {
        this.authMobile = authMobile == null ? null : authMobile.trim();
    }

    /** 
     * 获取 USER_RECORD.TWO_FACTOR
     * @return USER_RECORD.TWO_FACTOR
     */
    public String getTwoFactor() {
        return twoFactor;
    }

    /** 
     * 设置 USER_RECORD.TWO_FACTOR
     * @param twoFactor USER_RECORD.TWO_FACTOR
     */
    public void setTwoFactor(String twoFactor) {
        this.twoFactor = twoFactor == null ? null : twoFactor.trim();
    }
}