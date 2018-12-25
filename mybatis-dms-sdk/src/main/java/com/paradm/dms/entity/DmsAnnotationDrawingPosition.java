package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAnnotationDrawingPosition extends BaseEntity implements Serializable {
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
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ANNOTATION_DRAWING_POSITION.DOC_ID
     * @return DMS_ANNOTATION_DRAWING_POSITION.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_ANNOTATION_DRAWING_POSITION.DOC_ID
     * @param docId DMS_ANNOTATION_DRAWING_POSITION.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_ANNOTATION_DRAWING_POSITION.ANNOTATION_ID
     * @return DMS_ANNOTATION_DRAWING_POSITION.ANNOTATION_ID
     */
    public Long getAnnotationId() {
        return annotationId;
    }

    /** 
     * 设置 DMS_ANNOTATION_DRAWING_POSITION.ANNOTATION_ID
     * @param annotationId DMS_ANNOTATION_DRAWING_POSITION.ANNOTATION_ID
     */
    public void setAnnotationId(Long annotationId) {
        this.annotationId = annotationId;
    }

    /** 
     * 获取 DMS_ANNOTATION_DRAWING_POSITION.COORDINATE
     * @return DMS_ANNOTATION_DRAWING_POSITION.COORDINATE
     */
    public String getCoordinate() {
        return coordinate;
    }

    /** 
     * 设置 DMS_ANNOTATION_DRAWING_POSITION.COORDINATE
     * @param coordinate DMS_ANNOTATION_DRAWING_POSITION.COORDINATE
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }
}