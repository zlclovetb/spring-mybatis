package com.paradm.task.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskAttachmentExample {
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
    public TaskAttachmentExample() {
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
     * nullTASK_ATTACHMENT的基本动态SQL对象.
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNull() {
            addCriterion("ATTACHMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNotNull() {
            addCriterion("ATTACHMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME =", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME <>", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThan(String value) {
            addCriterion("ATTACHMENT_NAME >", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME >=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThan(String value) {
            addCriterion("ATTACHMENT_NAME <", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME <=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLike(String value) {
            addCriterion("ATTACHMENT_NAME like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotLike(String value) {
            addCriterion("ATTACHMENT_NAME not like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIn(List<String> values) {
            addCriterion("ATTACHMENT_NAME in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotIn(List<String> values) {
            addCriterion("ATTACHMENT_NAME not in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_NAME between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_NAME not between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameIsNull() {
            addCriterion("CONVERTED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConvertedNameIsNotNull() {
            addCriterion("CONVERTED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConvertedNameEqualTo(String value) {
            addCriterion("CONVERTED_NAME =", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameNotEqualTo(String value) {
            addCriterion("CONVERTED_NAME <>", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameGreaterThan(String value) {
            addCriterion("CONVERTED_NAME >", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERTED_NAME >=", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameLessThan(String value) {
            addCriterion("CONVERTED_NAME <", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameLessThanOrEqualTo(String value) {
            addCriterion("CONVERTED_NAME <=", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameLike(String value) {
            addCriterion("CONVERTED_NAME like", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameNotLike(String value) {
            addCriterion("CONVERTED_NAME not like", value, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameIn(List<String> values) {
            addCriterion("CONVERTED_NAME in", values, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameNotIn(List<String> values) {
            addCriterion("CONVERTED_NAME not in", values, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameBetween(String value1, String value2) {
            addCriterion("CONVERTED_NAME between", value1, value2, "convertedName");
            return (Criteria) this;
        }

        public Criteria andConvertedNameNotBetween(String value1, String value2) {
            addCriterion("CONVERTED_NAME not between", value1, value2, "convertedName");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdIsNull() {
            addCriterion("TASK_PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdIsNotNull() {
            addCriterion("TASK_PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdEqualTo(Long value) {
            addCriterion("TASK_PROJECT_ID =", value, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdNotEqualTo(Long value) {
            addCriterion("TASK_PROJECT_ID <>", value, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdGreaterThan(Long value) {
            addCriterion("TASK_PROJECT_ID >", value, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_PROJECT_ID >=", value, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdLessThan(Long value) {
            addCriterion("TASK_PROJECT_ID <", value, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_PROJECT_ID <=", value, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdIn(List<Long> values) {
            addCriterion("TASK_PROJECT_ID in", values, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdNotIn(List<Long> values) {
            addCriterion("TASK_PROJECT_ID not in", values, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdBetween(Long value1, Long value2) {
            addCriterion("TASK_PROJECT_ID between", value1, value2, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andTaskProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_PROJECT_ID not between", value1, value2, "taskProjectId");
            return (Criteria) this;
        }

        public Criteria andLocIdIsNull() {
            addCriterion("LOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocIdIsNotNull() {
            addCriterion("LOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocIdEqualTo(Long value) {
            addCriterion("LOC_ID =", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdNotEqualTo(Long value) {
            addCriterion("LOC_ID <>", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdGreaterThan(Long value) {
            addCriterion("LOC_ID >", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOC_ID >=", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdLessThan(Long value) {
            addCriterion("LOC_ID <", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdLessThanOrEqualTo(Long value) {
            addCriterion("LOC_ID <=", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdIn(List<Long> values) {
            addCriterion("LOC_ID in", values, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdNotIn(List<Long> values) {
            addCriterion("LOC_ID not in", values, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdBetween(Long value1, Long value2) {
            addCriterion("LOC_ID between", value1, value2, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdNotBetween(Long value1, Long value2) {
            addCriterion("LOC_ID not between", value1, value2, "locId");
            return (Criteria) this;
        }

        public Criteria andSegmentNoIsNull() {
            addCriterion("SEGMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSegmentNoIsNotNull() {
            addCriterion("SEGMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentNoEqualTo(Integer value) {
            addCriterion("SEGMENT_NO =", value, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoNotEqualTo(Integer value) {
            addCriterion("SEGMENT_NO <>", value, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoGreaterThan(Integer value) {
            addCriterion("SEGMENT_NO >", value, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEGMENT_NO >=", value, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoLessThan(Integer value) {
            addCriterion("SEGMENT_NO <", value, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoLessThanOrEqualTo(Integer value) {
            addCriterion("SEGMENT_NO <=", value, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoIn(List<Integer> values) {
            addCriterion("SEGMENT_NO in", values, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoNotIn(List<Integer> values) {
            addCriterion("SEGMENT_NO not in", values, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoBetween(Integer value1, Integer value2) {
            addCriterion("SEGMENT_NO between", value1, value2, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andSegmentNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SEGMENT_NO not between", value1, value2, "segmentNo");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andItemSizeIsNull() {
            addCriterion("ITEM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andItemSizeIsNotNull() {
            addCriterion("ITEM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andItemSizeEqualTo(Long value) {
            addCriterion("ITEM_SIZE =", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotEqualTo(Long value) {
            addCriterion("ITEM_SIZE <>", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeGreaterThan(Long value) {
            addCriterion("ITEM_SIZE >", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_SIZE >=", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeLessThan(Long value) {
            addCriterion("ITEM_SIZE <", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_SIZE <=", value, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeIn(List<Long> values) {
            addCriterion("ITEM_SIZE in", values, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotIn(List<Long> values) {
            addCriterion("ITEM_SIZE not in", values, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeBetween(Long value1, Long value2) {
            addCriterion("ITEM_SIZE between", value1, value2, "itemSize");
            return (Criteria) this;
        }

        public Criteria andItemSizeNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_SIZE not between", value1, value2, "itemSize");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("EXT is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("EXT is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("EXT =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("EXT <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("EXT >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("EXT >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("EXT <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("EXT <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("EXT like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("EXT not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("EXT in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("EXT not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("EXT between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("EXT not between", value1, value2, "ext");
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
    }

    /**
     * nullTASK_ATTACHMENT的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nullTASK_ATTACHMENT的动态SQL对象.
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