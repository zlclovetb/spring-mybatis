package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsContent extends BaseEntity implements Serializable {
    /** 
     */ 
    private String convertedName;

    /** 
     */ 
    private Long locId;

    /** 
     */ 
    private Long rootId;

    /** 
     */ 
    private Integer segmentNo;

    /** 
     */ 
    private String contentType;

    /** 
     */ 
    private Long itemSize;

    /** 
     */ 
    private String ext;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_CONTENT.CONVERTED_NAME
     * @return DMS_CONTENT.CONVERTED_NAME
     */
    public String getConvertedName() {
        return convertedName;
    }

    /** 
     * 设置 DMS_CONTENT.CONVERTED_NAME
     * @param convertedName DMS_CONTENT.CONVERTED_NAME
     */
    public void setConvertedName(String convertedName) {
        this.convertedName = convertedName == null ? null : convertedName.trim();
    }

    /** 
     * 获取 DMS_CONTENT.LOC_ID
     * @return DMS_CONTENT.LOC_ID
     */
    public Long getLocId() {
        return locId;
    }

    /** 
     * 设置 DMS_CONTENT.LOC_ID
     * @param locId DMS_CONTENT.LOC_ID
     */
    public void setLocId(Long locId) {
        this.locId = locId;
    }

    /** 
     * 获取 DMS_CONTENT.ROOT_ID
     * @return DMS_CONTENT.ROOT_ID
     */
    public Long getRootId() {
        return rootId;
    }

    /** 
     * 设置 DMS_CONTENT.ROOT_ID
     * @param rootId DMS_CONTENT.ROOT_ID
     */
    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    /** 
     * 获取 DMS_CONTENT.SEGMENT_NO
     * @return DMS_CONTENT.SEGMENT_NO
     */
    public Integer getSegmentNo() {
        return segmentNo;
    }

    /** 
     * 设置 DMS_CONTENT.SEGMENT_NO
     * @param segmentNo DMS_CONTENT.SEGMENT_NO
     */
    public void setSegmentNo(Integer segmentNo) {
        this.segmentNo = segmentNo;
    }

    /** 
     * 获取 DMS_CONTENT.CONTENT_TYPE
     * @return DMS_CONTENT.CONTENT_TYPE
     */
    public String getContentType() {
        return contentType;
    }

    /** 
     * 设置 DMS_CONTENT.CONTENT_TYPE
     * @param contentType DMS_CONTENT.CONTENT_TYPE
     */
    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    /** 
     * 获取 DMS_CONTENT.ITEM_SIZE
     * @return DMS_CONTENT.ITEM_SIZE
     */
    public Long getItemSize() {
        return itemSize;
    }

    /** 
     * 设置 DMS_CONTENT.ITEM_SIZE
     * @param itemSize DMS_CONTENT.ITEM_SIZE
     */
    public void setItemSize(Long itemSize) {
        this.itemSize = itemSize;
    }

    /** 
     * 获取 DMS_CONTENT.EXT
     * @return DMS_CONTENT.EXT
     */
    public String getExt() {
        return ext;
    }

    /** 
     * 设置 DMS_CONTENT.EXT
     * @param ext DMS_CONTENT.EXT
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}