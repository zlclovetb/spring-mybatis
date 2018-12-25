package com.paradm.task.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskRecordExample {
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
    public TaskRecordExample() {
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
     * nullTASK_RECORD的基本动态SQL对象.
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

        public Criteria andWspIdIsNull() {
            addCriterion("WSP_ID is null");
            return (Criteria) this;
        }

        public Criteria andWspIdIsNotNull() {
            addCriterion("WSP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWspIdEqualTo(Long value) {
            addCriterion("WSP_ID =", value, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdNotEqualTo(Long value) {
            addCriterion("WSP_ID <>", value, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdGreaterThan(Long value) {
            addCriterion("WSP_ID >", value, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WSP_ID >=", value, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdLessThan(Long value) {
            addCriterion("WSP_ID <", value, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdLessThanOrEqualTo(Long value) {
            addCriterion("WSP_ID <=", value, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdIn(List<Long> values) {
            addCriterion("WSP_ID in", values, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdNotIn(List<Long> values) {
            addCriterion("WSP_ID not in", values, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdBetween(Long value1, Long value2) {
            addCriterion("WSP_ID between", value1, value2, "wspId");
            return (Criteria) this;
        }

        public Criteria andWspIdNotBetween(Long value1, Long value2) {
            addCriterion("WSP_ID not between", value1, value2, "wspId");
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

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNull() {
            addCriterion("IS_PUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNotNull() {
            addCriterion("IS_PUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicEqualTo(String value) {
            addCriterion("IS_PUBLIC =", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotEqualTo(String value) {
            addCriterion("IS_PUBLIC <>", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThan(String value) {
            addCriterion("IS_PUBLIC >", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PUBLIC >=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThan(String value) {
            addCriterion("IS_PUBLIC <", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThanOrEqualTo(String value) {
            addCriterion("IS_PUBLIC <=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLike(String value) {
            addCriterion("IS_PUBLIC like", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotLike(String value) {
            addCriterion("IS_PUBLIC not like", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicIn(List<String> values) {
            addCriterion("IS_PUBLIC in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotIn(List<String> values) {
            addCriterion("IS_PUBLIC not in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicBetween(String value1, String value2) {
            addCriterion("IS_PUBLIC between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotBetween(String value1, String value2) {
            addCriterion("IS_PUBLIC not between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Date value) {
            addCriterion("DUE_DATE =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Date value) {
            addCriterion("DUE_DATE <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Date value) {
            addCriterion("DUE_DATE >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DUE_DATE >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Date value) {
            addCriterion("DUE_DATE <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Date value) {
            addCriterion("DUE_DATE <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Date> values) {
            addCriterion("DUE_DATE in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Date> values) {
            addCriterion("DUE_DATE not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Date value1, Date value2) {
            addCriterion("DUE_DATE between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Date value1, Date value2) {
            addCriterion("DUE_DATE not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdIsNull() {
            addCriterion("TASK_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdIsNotNull() {
            addCriterion("TASK_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdEqualTo(Long value) {
            addCriterion("TASK_COLUMN_ID =", value, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdNotEqualTo(Long value) {
            addCriterion("TASK_COLUMN_ID <>", value, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdGreaterThan(Long value) {
            addCriterion("TASK_COLUMN_ID >", value, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_COLUMN_ID >=", value, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdLessThan(Long value) {
            addCriterion("TASK_COLUMN_ID <", value, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_COLUMN_ID <=", value, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdIn(List<Long> values) {
            addCriterion("TASK_COLUMN_ID in", values, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdNotIn(List<Long> values) {
            addCriterion("TASK_COLUMN_ID not in", values, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdBetween(Long value1, Long value2) {
            addCriterion("TASK_COLUMN_ID between", value1, value2, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andTaskColumnIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_COLUMN_ID not between", value1, value2, "taskColumnId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdIsNull() {
            addCriterion("APPROVAL_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdIsNotNull() {
            addCriterion("APPROVAL_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdEqualTo(Long value) {
            addCriterion("APPROVAL_ORG_ID =", value, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdNotEqualTo(Long value) {
            addCriterion("APPROVAL_ORG_ID <>", value, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdGreaterThan(Long value) {
            addCriterion("APPROVAL_ORG_ID >", value, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPROVAL_ORG_ID >=", value, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdLessThan(Long value) {
            addCriterion("APPROVAL_ORG_ID <", value, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("APPROVAL_ORG_ID <=", value, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdIn(List<Long> values) {
            addCriterion("APPROVAL_ORG_ID in", values, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdNotIn(List<Long> values) {
            addCriterion("APPROVAL_ORG_ID not in", values, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdBetween(Long value1, Long value2) {
            addCriterion("APPROVAL_ORG_ID between", value1, value2, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andApprovalOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("APPROVAL_ORG_ID not between", value1, value2, "approvalOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdIsNull() {
            addCriterion("LOCK_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdIsNotNull() {
            addCriterion("LOCK_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdEqualTo(Long value) {
            addCriterion("LOCK_ORG_ID =", value, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdNotEqualTo(Long value) {
            addCriterion("LOCK_ORG_ID <>", value, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdGreaterThan(Long value) {
            addCriterion("LOCK_ORG_ID >", value, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOCK_ORG_ID >=", value, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdLessThan(Long value) {
            addCriterion("LOCK_ORG_ID <", value, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("LOCK_ORG_ID <=", value, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdIn(List<Long> values) {
            addCriterion("LOCK_ORG_ID in", values, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdNotIn(List<Long> values) {
            addCriterion("LOCK_ORG_ID not in", values, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdBetween(Long value1, Long value2) {
            addCriterion("LOCK_ORG_ID between", value1, value2, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andLockOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("LOCK_ORG_ID not between", value1, value2, "lockOrgId");
            return (Criteria) this;
        }

        public Criteria andActoridIsNull() {
            addCriterion("ACTORID is null");
            return (Criteria) this;
        }

        public Criteria andActoridIsNotNull() {
            addCriterion("ACTORID is not null");
            return (Criteria) this;
        }

        public Criteria andActoridEqualTo(Long value) {
            addCriterion("ACTORID =", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotEqualTo(Long value) {
            addCriterion("ACTORID <>", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridGreaterThan(Long value) {
            addCriterion("ACTORID >", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTORID >=", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridLessThan(Long value) {
            addCriterion("ACTORID <", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridLessThanOrEqualTo(Long value) {
            addCriterion("ACTORID <=", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridIn(List<Long> values) {
            addCriterion("ACTORID in", values, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotIn(List<Long> values) {
            addCriterion("ACTORID not in", values, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridBetween(Long value1, Long value2) {
            addCriterion("ACTORID between", value1, value2, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotBetween(Long value1, Long value2) {
            addCriterion("ACTORID not between", value1, value2, "actorid");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentIsNull() {
            addCriterion("HAVE_ATTACHMENT is null");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentIsNotNull() {
            addCriterion("HAVE_ATTACHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentEqualTo(String value) {
            addCriterion("HAVE_ATTACHMENT =", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentNotEqualTo(String value) {
            addCriterion("HAVE_ATTACHMENT <>", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentGreaterThan(String value) {
            addCriterion("HAVE_ATTACHMENT >", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("HAVE_ATTACHMENT >=", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentLessThan(String value) {
            addCriterion("HAVE_ATTACHMENT <", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentLessThanOrEqualTo(String value) {
            addCriterion("HAVE_ATTACHMENT <=", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentLike(String value) {
            addCriterion("HAVE_ATTACHMENT like", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentNotLike(String value) {
            addCriterion("HAVE_ATTACHMENT not like", value, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentIn(List<String> values) {
            addCriterion("HAVE_ATTACHMENT in", values, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentNotIn(List<String> values) {
            addCriterion("HAVE_ATTACHMENT not in", values, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentBetween(String value1, String value2) {
            addCriterion("HAVE_ATTACHMENT between", value1, value2, "haveAttachment");
            return (Criteria) this;
        }

        public Criteria andHaveAttachmentNotBetween(String value1, String value2) {
            addCriterion("HAVE_ATTACHMENT not between", value1, value2, "haveAttachment");
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
     * nullTASK_RECORD的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nullTASK_RECORD的动态SQL对象.
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