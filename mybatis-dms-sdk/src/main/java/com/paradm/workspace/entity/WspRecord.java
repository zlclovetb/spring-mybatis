package com.paradm.workspace.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class WspRecord extends BaseEntity implements Serializable {
    /** 
     */ 
    private String name;

    /** 
     */ 
    private String code;

    /** 
     */ 
    private String description;

    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private Date expireDate;

    /** 
     */ 
    private Long ownerId;

    /** 
     */ 
    private String iconPath;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 WSP_RECORD.NAME
     * @return WSP_RECORD.NAME
     */
    public String getName() {
        return name;
    }

    /** 
     * 设置 WSP_RECORD.NAME
     * @param name WSP_RECORD.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /** 
     * 获取 WSP_RECORD.CODE
     * @return WSP_RECORD.CODE
     */
    public String getCode() {
        return code;
    }

    /** 
     * 设置 WSP_RECORD.CODE
     * @param code WSP_RECORD.CODE
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /** 
     * 获取 WSP_RECORD.DESCRIPTION
     * @return WSP_RECORD.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 WSP_RECORD.DESCRIPTION
     * @param description WSP_RECORD.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 WSP_RECORD.ROOT_ID
     * @return WSP_RECORD.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 WSP_RECORD.ROOT_ID
     * @param rootId WSP_RECORD.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 WSP_RECORD.STATUS
     * @return WSP_RECORD.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 WSP_RECORD.STATUS
     * @param status WSP_RECORD.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 WSP_RECORD.EXPIRE_DATE
     * @return WSP_RECORD.EXPIRE_DATE
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /** 
     * 设置 WSP_RECORD.EXPIRE_DATE
     * @param expireDate WSP_RECORD.EXPIRE_DATE
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /** 
     * 获取 WSP_RECORD.OWNER_ID
     * @return WSP_RECORD.OWNER_ID
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /** 
     * 设置 WSP_RECORD.OWNER_ID
     * @param ownerId WSP_RECORD.OWNER_ID
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /** 
     * 获取 WSP_RECORD.ICON_PATH
     * @return WSP_RECORD.ICON_PATH
     */
    public String getIconPath() {
        return iconPath;
    }

    /** 
     * 设置 WSP_RECORD.ICON_PATH
     * @param iconPath WSP_RECORD.ICON_PATH
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }
}