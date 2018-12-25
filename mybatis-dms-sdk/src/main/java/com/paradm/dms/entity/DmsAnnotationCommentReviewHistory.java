package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAnnotationCommentReviewHistory extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long commentId;

    /** 
     */ 
    private String status;

    /** 
     */ 
    private String reviewedBy;

    /** 
     */ 
    private Date dateReviewed;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DOC_ID
     * @return DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DOC_ID
     * @param docId DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.COMMENT_ID
     * @return DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.COMMENT_ID
     */
    public Long getCommentId() {
        return commentId;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.COMMENT_ID
     * @param commentId DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.COMMENT_ID
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.STATUS
     * @return DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.STATUS
     */
    public String getStatus() {
        return status;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.STATUS
     * @param status DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.STATUS
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.REVIEWED_BY
     * @return DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.REVIEWED_BY
     */
    public String getReviewedBy() {
        return reviewedBy;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.REVIEWED_BY
     * @param reviewedBy DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.REVIEWED_BY
     */
    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy == null ? null : reviewedBy.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DATE_REVIEWED
     * @return DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DATE_REVIEWED
     */
    public Date getDateReviewed() {
        return dateReviewed;
    }

    /** 
     * 设置 DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DATE_REVIEWED
     * @param dateReviewed DMS_ANNOTATION_COMMENT_REVIEW_HISTORY.DATE_REVIEWED
     */
    public void setDateReviewed(Date dateReviewed) {
        this.dateReviewed = dateReviewed;
    }
}