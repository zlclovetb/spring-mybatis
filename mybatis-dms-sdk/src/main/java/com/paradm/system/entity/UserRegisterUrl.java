package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class UserRegisterUrl extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long userRecordId;

    /** 
     */ 
    private String shortCode;

    /** 
     */ 
    private String longUrl;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 USER_REGISTER_URL.USER_RECORD_ID
     * @return USER_REGISTER_URL.USER_RECORD_ID
     */
    public Long getUserRecordId() {
        return userRecordId;
    }

    /** 
     * 设置 USER_REGISTER_URL.USER_RECORD_ID
     * @param userRecordId USER_REGISTER_URL.USER_RECORD_ID
     */
    public void setUserRecordId(Long userRecordId) {
        this.userRecordId = userRecordId;
    }

    /** 
     * 获取 USER_REGISTER_URL.SHORT_CODE
     * @return USER_REGISTER_URL.SHORT_CODE
     */
    public String getShortCode() {
        return shortCode;
    }

    /** 
     * 设置 USER_REGISTER_URL.SHORT_CODE
     * @param shortCode USER_REGISTER_URL.SHORT_CODE
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode == null ? null : shortCode.trim();
    }

    /** 
     * 获取 USER_REGISTER_URL.LONG_URL
     * @return USER_REGISTER_URL.LONG_URL
     */
    public String getLongUrl() {
        return longUrl;
    }

    /** 
     * 设置 USER_REGISTER_URL.LONG_URL
     * @param longUrl USER_REGISTER_URL.LONG_URL
     */
    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl == null ? null : longUrl.trim();
    }
}