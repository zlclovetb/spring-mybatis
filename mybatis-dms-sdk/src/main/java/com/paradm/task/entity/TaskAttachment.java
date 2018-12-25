package com.paradm.task.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class TaskAttachment extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long taskId;

    /** 
     */ 
    private String attachmentName;

    /** 
     */ 
    private String convertedName;

    /** 
     */ 
    private Long taskProjectId;

    /** 
     */ 
    private Long locId;

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
     * 获取 TASK_ATTACHMENT.TASK_ID
     * @return TASK_ATTACHMENT.TASK_ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /** 
     * 设置 TASK_ATTACHMENT.TASK_ID
     * @param taskId TASK_ATTACHMENT.TASK_ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /** 
     * 获取 TASK_ATTACHMENT.ATTACHMENT_NAME
     * @return TASK_ATTACHMENT.ATTACHMENT_NAME
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /** 
     * 设置 TASK_ATTACHMENT.ATTACHMENT_NAME
     * @param attachmentName TASK_ATTACHMENT.ATTACHMENT_NAME
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName == null ? null : attachmentName.trim();
    }

    /** 
     * 获取 TASK_ATTACHMENT.CONVERTED_NAME
     * @return TASK_ATTACHMENT.CONVERTED_NAME
     */
    public String getConvertedName() {
        return convertedName;
    }

    /** 
     * 设置 TASK_ATTACHMENT.CONVERTED_NAME
     * @param convertedName TASK_ATTACHMENT.CONVERTED_NAME
     */
    public void setConvertedName(String convertedName) {
        this.convertedName = convertedName == null ? null : convertedName.trim();
    }

    /** 
     * 获取 TASK_ATTACHMENT.TASK_PROJECT_ID
     * @return TASK_ATTACHMENT.TASK_PROJECT_ID
     */
    public Long getTaskProjectId() {
        return taskProjectId;
    }

    /** 
     * 设置 TASK_ATTACHMENT.TASK_PROJECT_ID
     * @param taskProjectId TASK_ATTACHMENT.TASK_PROJECT_ID
     */
    public void setTaskProjectId(Long taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    /** 
     * 获取 TASK_ATTACHMENT.LOC_ID
     * @return TASK_ATTACHMENT.LOC_ID
     */
    public Long getLocId() {
        return locId;
    }

    /** 
     * 设置 TASK_ATTACHMENT.LOC_ID
     * @param locId TASK_ATTACHMENT.LOC_ID
     */
    public void setLocId(Long locId) {
        this.locId = locId;
    }

    /** 
     * 获取 TASK_ATTACHMENT.SEGMENT_NO
     * @return TASK_ATTACHMENT.SEGMENT_NO
     */
    public Integer getSegmentNo() {
        return segmentNo;
    }

    /** 
     * 设置 TASK_ATTACHMENT.SEGMENT_NO
     * @param segmentNo TASK_ATTACHMENT.SEGMENT_NO
     */
    public void setSegmentNo(Integer segmentNo) {
        this.segmentNo = segmentNo;
    }

    /** 
     * 获取 TASK_ATTACHMENT.CONTENT_TYPE
     * @return TASK_ATTACHMENT.CONTENT_TYPE
     */
    public String getContentType() {
        return contentType;
    }

    /** 
     * 设置 TASK_ATTACHMENT.CONTENT_TYPE
     * @param contentType TASK_ATTACHMENT.CONTENT_TYPE
     */
    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    /** 
     * 获取 TASK_ATTACHMENT.ITEM_SIZE
     * @return TASK_ATTACHMENT.ITEM_SIZE
     */
    public Long getItemSize() {
        return itemSize;
    }

    /** 
     * 设置 TASK_ATTACHMENT.ITEM_SIZE
     * @param itemSize TASK_ATTACHMENT.ITEM_SIZE
     */
    public void setItemSize(Long itemSize) {
        this.itemSize = itemSize;
    }

    /** 
     * 获取 TASK_ATTACHMENT.EXT
     * @return TASK_ATTACHMENT.EXT
     */
    public String getExt() {
        return ext;
    }

    /** 
     * 设置 TASK_ATTACHMENT.EXT
     * @param ext TASK_ATTACHMENT.EXT
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}