package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsLocMaster extends BaseEntity implements Serializable {
    /** 
     */ 
    private String locName;

    /** 
     */ 
    private String locPath;

    /** 
     */ 
    private Integer segmentNo;

    /** 
     */ 
    private String description;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_LOC_MASTER.LOC_NAME
     * @return DMS_LOC_MASTER.LOC_NAME
     */
    public String getLocName() {
        return locName;
    }

    /** 
     * 设置 DMS_LOC_MASTER.LOC_NAME
     * @param locName DMS_LOC_MASTER.LOC_NAME
     */
    public void setLocName(String locName) {
        this.locName = locName == null ? null : locName.trim();
    }

    /** 
     * 获取 DMS_LOC_MASTER.LOC_PATH
     * @return DMS_LOC_MASTER.LOC_PATH
     */
    public String getLocPath() {
        return locPath;
    }

    /** 
     * 设置 DMS_LOC_MASTER.LOC_PATH
     * @param locPath DMS_LOC_MASTER.LOC_PATH
     */
    public void setLocPath(String locPath) {
        this.locPath = locPath == null ? null : locPath.trim();
    }

    /** 
     * 获取 DMS_LOC_MASTER.SEGMENT_NO
     * @return DMS_LOC_MASTER.SEGMENT_NO
     */
    public Integer getSegmentNo() {
        return segmentNo;
    }

    /** 
     * 设置 DMS_LOC_MASTER.SEGMENT_NO
     * @param segmentNo DMS_LOC_MASTER.SEGMENT_NO
     */
    public void setSegmentNo(Integer segmentNo) {
        this.segmentNo = segmentNo;
    }

    /** 
     * 获取 DMS_LOC_MASTER.DESCRIPTION
     * @return DMS_LOC_MASTER.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 DMS_LOC_MASTER.DESCRIPTION
     * @param description DMS_LOC_MASTER.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}