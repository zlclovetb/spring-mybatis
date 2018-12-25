package com.paradm.dms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmsAnnotationExample {
    /** 
     * 排序字段
    */
    protected String orderByClause;

    /** 
     * 过滤重复数据
    */
    protected boolean distinct;

    /** 
     * 查询条件
    */
    protected List<Criteria> oredCriteria;

    /** 
     * 构造查询条件
     */
    public DmsAnnotationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /** 
     * 设置排序字段
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** 
     * 获取排序字段
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /** 
     * 设置过滤重复数据
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /** 
     * 是否过滤重复数据
     */
    public boolean isDistinct() {
        return distinct;
    }

    /** 
     * 获取当前的查询条件实例
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /** 
     * 增加或者的查询条件,用于构建或者查询
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /** 
     * 创建一个新的或者查询条件
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /** 
     * 创建一个查询条件
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /** 
     * 内部构建查询条件对象
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /** 
     * 清除查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * nullDMS_ANNOTATION的基本动态SQL对象.
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNull() {
            addCriterion("DOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("DOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(Long value) {
            addCriterion("DOC_ID =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(Long value) {
            addCriterion("DOC_ID <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(Long value) {
            addCriterion("DOC_ID >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DOC_ID >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(Long value) {
            addCriterion("DOC_ID <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(Long value) {
            addCriterion("DOC_ID <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<Long> values) {
            addCriterion("DOC_ID in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<Long> values) {
            addCriterion("DOC_ID not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(Long value1, Long value2) {
            addCriterion("DOC_ID between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(Long value1, Long value2) {
            addCriterion("DOC_ID not between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("CONTENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("CONTENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Long value) {
            addCriterion("CONTENT_ID =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Long value) {
            addCriterion("CONTENT_ID <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Long value) {
            addCriterion("CONTENT_ID >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTENT_ID >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Long value) {
            addCriterion("CONTENT_ID <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Long value) {
            addCriterion("CONTENT_ID <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Long> values) {
            addCriterion("CONTENT_ID in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Long> values) {
            addCriterion("CONTENT_ID not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Long value1, Long value2) {
            addCriterion("CONTENT_ID between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Long value1, Long value2) {
            addCriterion("CONTENT_ID not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andPageIndexIsNull() {
            addCriterion("PAGE_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andPageIndexIsNotNull() {
            addCriterion("PAGE_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andPageIndexEqualTo(Integer value) {
            addCriterion("PAGE_INDEX =", value, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexNotEqualTo(Integer value) {
            addCriterion("PAGE_INDEX <>", value, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexGreaterThan(Integer value) {
            addCriterion("PAGE_INDEX >", value, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAGE_INDEX >=", value, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexLessThan(Integer value) {
            addCriterion("PAGE_INDEX <", value, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexLessThanOrEqualTo(Integer value) {
            addCriterion("PAGE_INDEX <=", value, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexIn(List<Integer> values) {
            addCriterion("PAGE_INDEX in", values, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexNotIn(List<Integer> values) {
            addCriterion("PAGE_INDEX not in", values, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_INDEX between", value1, value2, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_INDEX not between", value1, value2, "pageIndex");
            return (Criteria) this;
        }

        public Criteria andPageWidthIsNull() {
            addCriterion("PAGE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andPageWidthIsNotNull() {
            addCriterion("PAGE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andPageWidthEqualTo(Integer value) {
            addCriterion("PAGE_WIDTH =", value, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthNotEqualTo(Integer value) {
            addCriterion("PAGE_WIDTH <>", value, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthGreaterThan(Integer value) {
            addCriterion("PAGE_WIDTH >", value, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAGE_WIDTH >=", value, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthLessThan(Integer value) {
            addCriterion("PAGE_WIDTH <", value, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthLessThanOrEqualTo(Integer value) {
            addCriterion("PAGE_WIDTH <=", value, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthIn(List<Integer> values) {
            addCriterion("PAGE_WIDTH in", values, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthNotIn(List<Integer> values) {
            addCriterion("PAGE_WIDTH not in", values, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_WIDTH between", value1, value2, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_WIDTH not between", value1, value2, "pageWidth");
            return (Criteria) this;
        }

        public Criteria andPageHeightIsNull() {
            addCriterion("PAGE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPageHeightIsNotNull() {
            addCriterion("PAGE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPageHeightEqualTo(Integer value) {
            addCriterion("PAGE_HEIGHT =", value, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightNotEqualTo(Integer value) {
            addCriterion("PAGE_HEIGHT <>", value, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightGreaterThan(Integer value) {
            addCriterion("PAGE_HEIGHT >", value, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAGE_HEIGHT >=", value, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightLessThan(Integer value) {
            addCriterion("PAGE_HEIGHT <", value, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightLessThanOrEqualTo(Integer value) {
            addCriterion("PAGE_HEIGHT <=", value, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightIn(List<Integer> values) {
            addCriterion("PAGE_HEIGHT in", values, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightNotIn(List<Integer> values) {
            addCriterion("PAGE_HEIGHT not in", values, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_HEIGHT between", value1, value2, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andPageHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_HEIGHT not between", value1, value2, "pageHeight");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdIsNull() {
            addCriterion("ANNOTATION_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdIsNotNull() {
            addCriterion("ANNOTATION_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdEqualTo(Integer value) {
            addCriterion("ANNOTATION_TYPE_ID =", value, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdNotEqualTo(Integer value) {
            addCriterion("ANNOTATION_TYPE_ID <>", value, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdGreaterThan(Integer value) {
            addCriterion("ANNOTATION_TYPE_ID >", value, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANNOTATION_TYPE_ID >=", value, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdLessThan(Integer value) {
            addCriterion("ANNOTATION_TYPE_ID <", value, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ANNOTATION_TYPE_ID <=", value, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdIn(List<Integer> values) {
            addCriterion("ANNOTATION_TYPE_ID in", values, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdNotIn(List<Integer> values) {
            addCriterion("ANNOTATION_TYPE_ID not in", values, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ANNOTATION_TYPE_ID between", value1, value2, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andAnnotationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ANNOTATION_TYPE_ID not between", value1, value2, "annotationTypeId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("COORDINATE =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("COORDINATE <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("COORDINATE >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("COORDINATE >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("COORDINATE <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("COORDINATE <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("COORDINATE like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("COORDINATE not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("COORDINATE in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("COORDINATE not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("COORDINATE between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("COORDINATE not between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameIsNull() {
            addCriterion("FORM_FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameIsNotNull() {
            addCriterion("FORM_FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameEqualTo(String value) {
            addCriterion("FORM_FIELD_NAME =", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameNotEqualTo(String value) {
            addCriterion("FORM_FIELD_NAME <>", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameGreaterThan(String value) {
            addCriterion("FORM_FIELD_NAME >", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_FIELD_NAME >=", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameLessThan(String value) {
            addCriterion("FORM_FIELD_NAME <", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameLessThanOrEqualTo(String value) {
            addCriterion("FORM_FIELD_NAME <=", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameLike(String value) {
            addCriterion("FORM_FIELD_NAME like", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameNotLike(String value) {
            addCriterion("FORM_FIELD_NAME not like", value, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameIn(List<String> values) {
            addCriterion("FORM_FIELD_NAME in", values, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameNotIn(List<String> values) {
            addCriterion("FORM_FIELD_NAME not in", values, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameBetween(String value1, String value2) {
            addCriterion("FORM_FIELD_NAME between", value1, value2, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldNameNotBetween(String value1, String value2) {
            addCriterion("FORM_FIELD_NAME not between", value1, value2, "formFieldName");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueIsNull() {
            addCriterion("FORM_FIELD_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueIsNotNull() {
            addCriterion("FORM_FIELD_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueEqualTo(String value) {
            addCriterion("FORM_FIELD_VALUE =", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueNotEqualTo(String value) {
            addCriterion("FORM_FIELD_VALUE <>", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueGreaterThan(String value) {
            addCriterion("FORM_FIELD_VALUE >", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_FIELD_VALUE >=", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueLessThan(String value) {
            addCriterion("FORM_FIELD_VALUE <", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueLessThanOrEqualTo(String value) {
            addCriterion("FORM_FIELD_VALUE <=", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueLike(String value) {
            addCriterion("FORM_FIELD_VALUE like", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueNotLike(String value) {
            addCriterion("FORM_FIELD_VALUE not like", value, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueIn(List<String> values) {
            addCriterion("FORM_FIELD_VALUE in", values, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueNotIn(List<String> values) {
            addCriterion("FORM_FIELD_VALUE not in", values, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueBetween(String value1, String value2) {
            addCriterion("FORM_FIELD_VALUE between", value1, value2, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFormFieldValueNotBetween(String value1, String value2) {
            addCriterion("FORM_FIELD_VALUE not between", value1, value2, "formFieldValue");
            return (Criteria) this;
        }

        public Criteria andFontSizeIsNull() {
            addCriterion("FONT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFontSizeIsNotNull() {
            addCriterion("FONT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFontSizeEqualTo(Integer value) {
            addCriterion("FONT_SIZE =", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeNotEqualTo(Integer value) {
            addCriterion("FONT_SIZE <>", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeGreaterThan(Integer value) {
            addCriterion("FONT_SIZE >", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_SIZE >=", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeLessThan(Integer value) {
            addCriterion("FONT_SIZE <", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_SIZE <=", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeIn(List<Integer> values) {
            addCriterion("FONT_SIZE in", values, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeNotIn(List<Integer> values) {
            addCriterion("FONT_SIZE not in", values, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeBetween(Integer value1, Integer value2) {
            addCriterion("FONT_SIZE between", value1, value2, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_SIZE not between", value1, value2, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontIsNull() {
            addCriterion("FONT is null");
            return (Criteria) this;
        }

        public Criteria andFontIsNotNull() {
            addCriterion("FONT is not null");
            return (Criteria) this;
        }

        public Criteria andFontEqualTo(String value) {
            addCriterion("FONT =", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotEqualTo(String value) {
            addCriterion("FONT <>", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontGreaterThan(String value) {
            addCriterion("FONT >", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontGreaterThanOrEqualTo(String value) {
            addCriterion("FONT >=", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLessThan(String value) {
            addCriterion("FONT <", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLessThanOrEqualTo(String value) {
            addCriterion("FONT <=", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLike(String value) {
            addCriterion("FONT like", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotLike(String value) {
            addCriterion("FONT not like", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontIn(List<String> values) {
            addCriterion("FONT in", values, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotIn(List<String> values) {
            addCriterion("FONT not in", values, "font");
            return (Criteria) this;
        }

        public Criteria andFontBetween(String value1, String value2) {
            addCriterion("FONT between", value1, value2, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotBetween(String value1, String value2) {
            addCriterion("FONT not between", value1, value2, "font");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("COLOR is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("COLOR =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("COLOR <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("COLOR >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("COLOR <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("COLOR <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("COLOR like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("COLOR not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("COLOR in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("COLOR not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("COLOR between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("COLOR not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNull() {
            addCriterion("BACKGROUND_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNotNull() {
            addCriterion("BACKGROUND_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR =", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR <>", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThan(String value) {
            addCriterion("BACKGROUND_COLOR >", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThanOrEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR >=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThan(String value) {
            addCriterion("BACKGROUND_COLOR <", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThanOrEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR <=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLike(String value) {
            addCriterion("BACKGROUND_COLOR like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotLike(String value) {
            addCriterion("BACKGROUND_COLOR not like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIn(List<String> values) {
            addCriterion("BACKGROUND_COLOR in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotIn(List<String> values) {
            addCriterion("BACKGROUND_COLOR not in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorBetween(String value1, String value2) {
            addCriterion("BACKGROUND_COLOR between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotBetween(String value1, String value2) {
            addCriterion("BACKGROUND_COLOR not between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andReadOnlyIsNull() {
            addCriterion("READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andReadOnlyIsNotNull() {
            addCriterion("READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andReadOnlyEqualTo(Integer value) {
            addCriterion("READ_ONLY =", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotEqualTo(Integer value) {
            addCriterion("READ_ONLY <>", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyGreaterThan(Integer value) {
            addCriterion("READ_ONLY >", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_ONLY >=", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyLessThan(Integer value) {
            addCriterion("READ_ONLY <", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyLessThanOrEqualTo(Integer value) {
            addCriterion("READ_ONLY <=", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyIn(List<Integer> values) {
            addCriterion("READ_ONLY in", values, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotIn(List<Integer> values) {
            addCriterion("READ_ONLY not in", values, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyBetween(Integer value1, Integer value2) {
            addCriterion("READ_ONLY between", value1, value2, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_ONLY not between", value1, value2, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentIsNull() {
            addCriterion("READ_ONLY_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentIsNotNull() {
            addCriterion("READ_ONLY_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentEqualTo(Integer value) {
            addCriterion("READ_ONLY_COMMENT =", value, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentNotEqualTo(Integer value) {
            addCriterion("READ_ONLY_COMMENT <>", value, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentGreaterThan(Integer value) {
            addCriterion("READ_ONLY_COMMENT >", value, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_ONLY_COMMENT >=", value, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentLessThan(Integer value) {
            addCriterion("READ_ONLY_COMMENT <", value, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentLessThanOrEqualTo(Integer value) {
            addCriterion("READ_ONLY_COMMENT <=", value, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentIn(List<Integer> values) {
            addCriterion("READ_ONLY_COMMENT in", values, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentNotIn(List<Integer> values) {
            addCriterion("READ_ONLY_COMMENT not in", values, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentBetween(Integer value1, Integer value2) {
            addCriterion("READ_ONLY_COMMENT between", value1, value2, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andReadOnlyCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_ONLY_COMMENT not between", value1, value2, "readOnlyComment");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdIsNull() {
            addCriterion("MEASUREMENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdIsNotNull() {
            addCriterion("MEASUREMENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdEqualTo(Integer value) {
            addCriterion("MEASUREMENT_TYPE_ID =", value, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdNotEqualTo(Integer value) {
            addCriterion("MEASUREMENT_TYPE_ID <>", value, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdGreaterThan(Integer value) {
            addCriterion("MEASUREMENT_TYPE_ID >", value, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEASUREMENT_TYPE_ID >=", value, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdLessThan(Integer value) {
            addCriterion("MEASUREMENT_TYPE_ID <", value, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEASUREMENT_TYPE_ID <=", value, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdIn(List<Integer> values) {
            addCriterion("MEASUREMENT_TYPE_ID in", values, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdNotIn(List<Integer> values) {
            addCriterion("MEASUREMENT_TYPE_ID not in", values, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("MEASUREMENT_TYPE_ID between", value1, value2, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasurementTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEASUREMENT_TYPE_ID not between", value1, value2, "measurementTypeId");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("RECORD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("RECORD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(String value) {
            addCriterion("RECORD_STATUS =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(String value) {
            addCriterion("RECORD_STATUS <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(String value) {
            addCriterion("RECORD_STATUS >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_STATUS >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(String value) {
            addCriterion("RECORD_STATUS <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(String value) {
            addCriterion("RECORD_STATUS <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLike(String value) {
            addCriterion("RECORD_STATUS like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotLike(String value) {
            addCriterion("RECORD_STATUS not like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<String> values) {
            addCriterion("RECORD_STATUS in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<String> values) {
            addCriterion("RECORD_STATUS not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(String value1, String value2) {
            addCriterion("RECORD_STATUS between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(String value1, String value2) {
            addCriterion("RECORD_STATUS not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNull() {
            addCriterion("UPDATE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNotNull() {
            addCriterion("UPDATE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT =", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT <>", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThan(Integer value) {
            addCriterion("UPDATE_COUNT >", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT >=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThan(Integer value) {
            addCriterion("UPDATE_COUNT <", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT <=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIn(List<Integer> values) {
            addCriterion("UPDATE_COUNT in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotIn(List<Integer> values) {
            addCriterion("UPDATE_COUNT not in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_COUNT between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_COUNT not between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("UPDATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("UPDATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Long value) {
            addCriterion("UPDATER_ID =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Long value) {
            addCriterion("UPDATER_ID <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Long value) {
            addCriterion("UPDATER_ID >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATER_ID >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Long value) {
            addCriterion("UPDATER_ID <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Long value) {
            addCriterion("UPDATER_ID <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Long> values) {
            addCriterion("UPDATER_ID in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Long> values) {
            addCriterion("UPDATER_ID not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Long value1, Long value2) {
            addCriterion("UPDATER_ID between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Long value1, Long value2) {
            addCriterion("UPDATER_ID not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * nullDMS_ANNOTATION的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nullDMS_ANNOTATION的动态SQL对象.
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}