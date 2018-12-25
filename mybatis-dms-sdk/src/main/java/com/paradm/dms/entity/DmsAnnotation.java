package com.paradm.dms.entity;

import com.paradm.base.entity.BaseEntity;
import java.io.Serializable;

/** 
 * @author Spring.Zhang
 * @company ParaDM Limited
 * @creation date:2018-12-25 13:32:33
 */
public class DmsAnnotation extends BaseEntity implements Serializable {
    /** 
     */ 
    private Long docId;

    /** 
     */ 
    private Long contentId;

    /** 
     */ 
    private Integer pageIndex;

    /** 
     */ 
    private Integer pageWidth;

    /** 
     */ 
    private Integer pageHeight;

    /** 
     */ 
    private Integer annotationTypeId;

    /** 
     */ 
    private String coordinate;

    /** 
     */ 
    private String formFieldName;

    /** 
     */ 
    private String formFieldValue;

    /** 
     */ 
    private Integer fontSize;

    /** 
     */ 
    private String font;

    /** 
     */ 
    private String color;

    /** 
     */ 
    private String backgroundColor;

    /** 
     */ 
    private Integer readOnly;

    /** 
     */ 
    private Integer readOnlyComment;

    /** 
     */ 
    private Integer measurementTypeId;

    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 DMS_ANNOTATION.DOC_ID
     * @return DMS_ANNOTATION.DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /** 
     * 设置 DMS_ANNOTATION.DOC_ID
     * @param docId DMS_ANNOTATION.DOC_ID
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /** 
     * 获取 DMS_ANNOTATION.CONTENT_ID
     * @return DMS_ANNOTATION.CONTENT_ID
     */
    public Long getContentId() {
        return contentId;
    }

    /** 
     * 设置 DMS_ANNOTATION.CONTENT_ID
     * @param contentId DMS_ANNOTATION.CONTENT_ID
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /** 
     * 获取 DMS_ANNOTATION.PAGE_INDEX
     * @return DMS_ANNOTATION.PAGE_INDEX
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /** 
     * 设置 DMS_ANNOTATION.PAGE_INDEX
     * @param pageIndex DMS_ANNOTATION.PAGE_INDEX
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /** 
     * 获取 DMS_ANNOTATION.PAGE_WIDTH
     * @return DMS_ANNOTATION.PAGE_WIDTH
     */
    public Integer getPageWidth() {
        return pageWidth;
    }

    /** 
     * 设置 DMS_ANNOTATION.PAGE_WIDTH
     * @param pageWidth DMS_ANNOTATION.PAGE_WIDTH
     */
    public void setPageWidth(Integer pageWidth) {
        this.pageWidth = pageWidth;
    }

    /** 
     * 获取 DMS_ANNOTATION.PAGE_HEIGHT
     * @return DMS_ANNOTATION.PAGE_HEIGHT
     */
    public Integer getPageHeight() {
        return pageHeight;
    }

    /** 
     * 设置 DMS_ANNOTATION.PAGE_HEIGHT
     * @param pageHeight DMS_ANNOTATION.PAGE_HEIGHT
     */
    public void setPageHeight(Integer pageHeight) {
        this.pageHeight = pageHeight;
    }

    /** 
     * 获取 DMS_ANNOTATION.ANNOTATION_TYPE_ID
     * @return DMS_ANNOTATION.ANNOTATION_TYPE_ID
     */
    public Integer getAnnotationTypeId() {
        return annotationTypeId;
    }

    /** 
     * 设置 DMS_ANNOTATION.ANNOTATION_TYPE_ID
     * @param annotationTypeId DMS_ANNOTATION.ANNOTATION_TYPE_ID
     */
    public void setAnnotationTypeId(Integer annotationTypeId) {
        this.annotationTypeId = annotationTypeId;
    }

    /** 
     * 获取 DMS_ANNOTATION.COORDINATE
     * @return DMS_ANNOTATION.COORDINATE
     */
    public String getCoordinate() {
        return coordinate;
    }

    /** 
     * 设置 DMS_ANNOTATION.COORDINATE
     * @param coordinate DMS_ANNOTATION.COORDINATE
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.FORM_FIELD_NAME
     * @return DMS_ANNOTATION.FORM_FIELD_NAME
     */
    public String getFormFieldName() {
        return formFieldName;
    }

    /** 
     * 设置 DMS_ANNOTATION.FORM_FIELD_NAME
     * @param formFieldName DMS_ANNOTATION.FORM_FIELD_NAME
     */
    public void setFormFieldName(String formFieldName) {
        this.formFieldName = formFieldName == null ? null : formFieldName.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.FORM_FIELD_VALUE
     * @return DMS_ANNOTATION.FORM_FIELD_VALUE
     */
    public String getFormFieldValue() {
        return formFieldValue;
    }

    /** 
     * 设置 DMS_ANNOTATION.FORM_FIELD_VALUE
     * @param formFieldValue DMS_ANNOTATION.FORM_FIELD_VALUE
     */
    public void setFormFieldValue(String formFieldValue) {
        this.formFieldValue = formFieldValue == null ? null : formFieldValue.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.FONT_SIZE
     * @return DMS_ANNOTATION.FONT_SIZE
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /** 
     * 设置 DMS_ANNOTATION.FONT_SIZE
     * @param fontSize DMS_ANNOTATION.FONT_SIZE
     */
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /** 
     * 获取 DMS_ANNOTATION.FONT
     * @return DMS_ANNOTATION.FONT
     */
    public String getFont() {
        return font;
    }

    /** 
     * 设置 DMS_ANNOTATION.FONT
     * @param font DMS_ANNOTATION.FONT
     */
    public void setFont(String font) {
        this.font = font == null ? null : font.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.COLOR
     * @return DMS_ANNOTATION.COLOR
     */
    public String getColor() {
        return color;
    }

    /** 
     * 设置 DMS_ANNOTATION.COLOR
     * @param color DMS_ANNOTATION.COLOR
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.BACKGROUND_COLOR
     * @return DMS_ANNOTATION.BACKGROUND_COLOR
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /** 
     * 设置 DMS_ANNOTATION.BACKGROUND_COLOR
     * @param backgroundColor DMS_ANNOTATION.BACKGROUND_COLOR
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor == null ? null : backgroundColor.trim();
    }

    /** 
     * 获取 DMS_ANNOTATION.READ_ONLY
     * @return DMS_ANNOTATION.READ_ONLY
     */
    public Integer getReadOnly() {
        return readOnly;
    }

    /** 
     * 设置 DMS_ANNOTATION.READ_ONLY
     * @param readOnly DMS_ANNOTATION.READ_ONLY
     */
    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
    }

    /** 
     * 获取 DMS_ANNOTATION.READ_ONLY_COMMENT
     * @return DMS_ANNOTATION.READ_ONLY_COMMENT
     */
    public Integer getReadOnlyComment() {
        return readOnlyComment;
    }

    /** 
     * 设置 DMS_ANNOTATION.READ_ONLY_COMMENT
     * @param readOnlyComment DMS_ANNOTATION.READ_ONLY_COMMENT
     */
    public void setReadOnlyComment(Integer readOnlyComment) {
        this.readOnlyComment = readOnlyComment;
    }

    /** 
     * 获取 DMS_ANNOTATION.MEASUREMENT_TYPE_ID
     * @return DMS_ANNOTATION.MEASUREMENT_TYPE_ID
     */
    public Integer getMeasurementTypeId() {
        return measurementTypeId;
    }

    /** 
     * 设置 DMS_ANNOTATION.MEASUREMENT_TYPE_ID
     * @param measurementTypeId DMS_ANNOTATION.MEASUREMENT_TYPE_ID
     */
    public void setMeasurementTypeId(Integer measurementTypeId) {
        this.measurementTypeId = measurementTypeId;
    }
}