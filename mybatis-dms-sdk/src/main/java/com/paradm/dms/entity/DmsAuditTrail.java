package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAuditTrail extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private String docName;

    /** 
     */ 
    private String location;

    /** 
     */ 
    private Long accessor;

    /** 
     */ 
    private String accessType;

    /** 
     */ 
    private Date accessDate;

    /** 
     */ 
    private String ipAddress;

    /** 
     */ 
    private String description;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_AUDIT_TRAIL.DOC_ID
     * @return DMS_AUDIT_TRAIL.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.DOC_ID
     * @param docId DMS_AUDIT_TRAIL.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.ROOT_ID
     * @return DMS_AUDIT_TRAIL.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.ROOT_ID
     * @param rootId DMS_AUDIT_TRAIL.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.DOC_NAME
     * @return DMS_AUDIT_TRAIL.DOC_NAME
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.DOC_NAME
     * @param docName DMS_AUDIT_TRAIL.DOC_NAME
     */
    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.LOCATION
     * @return DMS_AUDIT_TRAIL.LOCATION
     */
    public String getLocation() {
        return location;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.LOCATION
     * @param location DMS_AUDIT_TRAIL.LOCATION
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.ACCESSOR
     * @return DMS_AUDIT_TRAIL.ACCESSOR
     */
    public Long getAccessor() {
        return accessor;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.ACCESSOR
     * @param accessor DMS_AUDIT_TRAIL.ACCESSOR
     */
    public void setAccessor(Long accessor) {
        this.accessor = accessor;
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.ACCESS_TYPE
     * @return DMS_AUDIT_TRAIL.ACCESS_TYPE
     */
    public String getAccessType() {
        return accessType;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.ACCESS_TYPE
     * @param accessType DMS_AUDIT_TRAIL.ACCESS_TYPE
     */
    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.ACCESS_DATE
     * @return DMS_AUDIT_TRAIL.ACCESS_DATE
     */
    public Date getAccessDate() {
        return accessDate;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.ACCESS_DATE
     * @param accessDate DMS_AUDIT_TRAIL.ACCESS_DATE
     */
    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.IP_ADDRESS
     * @return DMS_AUDIT_TRAIL.IP_ADDRESS
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.IP_ADDRESS
     * @param ipAddress DMS_AUDIT_TRAIL.IP_ADDRESS
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /** 
     * 获取 DMS_AUDIT_TRAIL.DESCRIPTION
     * @return DMS_AUDIT_TRAIL.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 DMS_AUDIT_TRAIL.DESCRIPTION
     * @param description DMS_AUDIT_TRAIL.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}