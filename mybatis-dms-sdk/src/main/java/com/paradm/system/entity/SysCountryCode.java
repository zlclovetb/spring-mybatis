package com.paradm.system.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class SysCountryCode extends BaseEntity implements Serializable {
    /** 
     */ 
    private String countryName;

    /** 
     */ 
    private String countryCode;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 SYS_COUNTRY_CODE.COUNTRY_NAME
     * @return SYS_COUNTRY_CODE.COUNTRY_NAME
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * 设置 SYS_COUNTRY_CODE.COUNTRY_NAME
     * @param countryName SYS_COUNTRY_CODE.COUNTRY_NAME
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /** 
     * 获取 SYS_COUNTRY_CODE.COUNTRY_CODE
     * @return SYS_COUNTRY_CODE.COUNTRY_CODE
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * 设置 SYS_COUNTRY_CODE.COUNTRY_CODE
     * @param countryCode SYS_COUNTRY_CODE.COUNTRY_CODE
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }
}