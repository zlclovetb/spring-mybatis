package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAnnotationHighlightNtextRect extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long annotationId;

    /** 
     */ 
    private String coordinate;

    /** 
     */ 
    private Integer domRotateAngle;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOC_ID
     * @return DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOC_ID
     * @param docId DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.ANNOTATION_ID
     * @return DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.ANNOTATION_ID
     */
    public Long getAnnotationId() {
        return annotationId;
    }

    /** 
     * 设置 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.ANNOTATION_ID
     * @param annotationId DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.ANNOTATION_ID
     */
    public void setAnnotationId(Long annotationId) {
        this.annotationId = annotationId;
    }

    /** 
     * 获取 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.COORDINATE
     * @return DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.COORDINATE
     */
    public String getCoordinate() {
        return coordinate;
    }

    /** 
     * 设置 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.COORDINATE
     * @param coordinate DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.COORDINATE
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOM_ROTATE_ANGLE
     * @return DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOM_ROTATE_ANGLE
     */
    public Integer getDomRotateAngle() {
        return domRotateAngle;
    }

    /** 
     * 设置 DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOM_ROTATE_ANGLE
     * @param domRotateAngle DMS_ANNOTATION_HIGHLIGHT_NTEXT_RECT.DOM_ROTATE_ANGLE
     */
    public void setDomRotateAngle(Integer domRotateAngle) {
        this.domRotateAngle = domRotateAngle;
    }
}