package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsRoot extends BaseEntity implements Serializable {
    /** 
     */ 
    private String rootName;

    /** 
     */ 
    private String rootType;

    /** 
     */ 
    private Long locId;

    /** 
     */ 
    private Integer storageLimit;

    /** 
     */ 
    private BigDecimal totalSize;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ROOT.ROOT_NAME
     * @return DMS_ROOT.ROOT_NAME
     */
    public String getRootName() {
        return rootName;
    }

    /** 
     * 设置 DMS_ROOT.ROOT_NAME
     * @param rootName DMS_ROOT.ROOT_NAME
     */
    public void setRootName(String rootName) {
        this.rootName = rootName == null ? null : rootName.trim();
    }

    /** 
     * 获取 DMS_ROOT.ROOT_TYPE
     * @return DMS_ROOT.ROOT_TYPE
     */
    public String getRootType() {
        return rootType;
    }

    /** 
     * 设置 DMS_ROOT.ROOT_TYPE
     * @param rootType DMS_ROOT.ROOT_TYPE
     */
    public void setRootType(String rootType) {
        this.rootType = rootType == null ? null : rootType.trim();
    }

    /** 
     * 获取 DMS_ROOT.LOC_ID
     * @return DMS_ROOT.LOC_ID
     */
    public Long getLocId() {
        return locId;
    }

    /** 
     * 设置 DMS_ROOT.LOC_ID
     * @param locId DMS_ROOT.LOC_ID
     */
    public void setLocId(Long locId) {
        this.locId = locId;
    }

    /** 
     * 获取 DMS_ROOT.STORAGE_LIMIT
     * @return DMS_ROOT.STORAGE_LIMIT
     */
    public Integer getStorageLimit() {
        return storageLimit;
    }

    /** 
     * 设置 DMS_ROOT.STORAGE_LIMIT
     * @param storageLimit DMS_ROOT.STORAGE_LIMIT
     */
    public void setStorageLimit(Integer storageLimit) {
        this.storageLimit = storageLimit;
    }

    /** 
     * 获取 DMS_ROOT.TOTAL_SIZE
     * @return DMS_ROOT.TOTAL_SIZE
     */
    public BigDecimal getTotalSize() {
        return totalSize;
    }

    /** 
     * 设置 DMS_ROOT.TOTAL_SIZE
     * @param totalSize DMS_ROOT.TOTAL_SIZE
     */
    public void setTotalSize(BigDecimal totalSize) {
        this.totalSize = totalSize;
    }
}