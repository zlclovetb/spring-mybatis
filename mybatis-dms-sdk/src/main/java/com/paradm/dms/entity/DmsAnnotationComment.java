package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAnnotationComment extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long annotationId;

    /** 
     */ 
    private Long parentId;

    /** 
     */ 
    private String username;

    /** 
     */ 
    private String comment;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ANNOTATION_COMMENT.DOC_ID
     * @return DMS_ANNOTATION_COMMENT.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT.DOC_ID
     * @param docId DMS_ANNOTATION_COMMENT.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT.ANNOTATION_ID
     * @return DMS_ANNOTATION_COMMENT.ANNOTATION_ID
     */
    public Long getAnnotationId() {
        return annotationId;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT.ANNOTATION_ID
     * @param annotationId DMS_ANNOTATION_COMMENT.ANNOTATION_ID
     */
    public void setAnnotationId(Long annotationId) {
        this.annotationId = annotationId;
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT.PARENT_ID
     * @return DMS_ANNOTATION_COMMENT.PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT.PARENT_ID
     * @param parentId DMS_ANNOTATION_COMMENT.PARENT_ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT.USERNAME
     * @return DMS_ANNOTATION_COMMENT.USERNAME
     */
    public String getUsername() {
        return username;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT.USERNAME
     * @param username DMS_ANNOTATION_COMMENT.USERNAME
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT.COMMENT
     * @return DMS_ANNOTATION_COMMENT.COMMENT
     */
    public String getComment() {
        return comment;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT.COMMENT
     * @param comment DMS_ANNOTATION_COMMENT.COMMENT
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}