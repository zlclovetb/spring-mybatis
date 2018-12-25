package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsCommentReply extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long dmsCommentId;

    /** 
     */ 
    private String message;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_COMMENT_REPLY.DOC_ID
     * @return DMS_COMMENT_REPLY.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_COMMENT_REPLY.DOC_ID
     * @param docId DMS_COMMENT_REPLY.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_COMMENT_REPLY.DMS_COMMENT_ID
     * @return DMS_COMMENT_REPLY.DMS_COMMENT_ID
     */
    public Long getDmsCommentId() {
        return dmsCommentId;
    }

    /** 
     * 设置 DMS_COMMENT_REPLY.DMS_COMMENT_ID
     * @param dmsCommentId DMS_COMMENT_REPLY.DMS_COMMENT_ID
     */
    public void setDmsCommentId(Long dmsCommentId) {
        this.dmsCommentId = dmsCommentId;
    }

    /** 
     * 获取 DMS_COMMENT_REPLY.MESSAGE
     * @return DMS_COMMENT_REPLY.MESSAGE
     */
    public String getMessage() {
        return message;
    }

    /** 
     * 设置 DMS_COMMENT_REPLY.MESSAGE
     * @param message DMS_COMMENT_REPLY.MESSAGE
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}