package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsComment extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private String topicMessage;

    /** 
     */ 
    private String status;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_COMMENT.DOC_ID
     * @return DMS_COMMENT.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_COMMENT.DOC_ID
     * @param docId DMS_COMMENT.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_COMMENT.TOPIC_MESSAGE
     * @return DMS_COMMENT.TOPIC_MESSAGE
     */
    public String getTopicMessage() {
        return topicMessage;
    }

    /** 
     * 设置 DMS_COMMENT.TOPIC_MESSAGE
     * @param topicMessage DMS_COMMENT.TOPIC_MESSAGE
     */
    public void setTopicMessage(String topicMessage) {
        this.topicMessage = topicMessage == null ? null : topicMessage.trim();
    }

    /** 
     * 获取 DMS_COMMENT.STATUS
     * @return DMS_COMMENT.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 DMS_COMMENT.STATUS
     * @param status DMS_COMMENT.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}