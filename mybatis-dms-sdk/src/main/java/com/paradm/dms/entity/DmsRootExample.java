package com.paradm.dms.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmsRootExample {
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
    public DmsRootExample() {
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
     * nullDMS_ROOT的基本动态SQL对象.
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

        public Criteria andRootNameIsNull() {
            addCriterion("ROOT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRootNameIsNotNull() {
            addCriterion("ROOT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRootNameEqualTo(String value) {
            addCriterion("ROOT_NAME =", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotEqualTo(String value) {
            addCriterion("ROOT_NAME <>", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameGreaterThan(String value) {
            addCriterion("ROOT_NAME >", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROOT_NAME >=", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameLessThan(String value) {
            addCriterion("ROOT_NAME <", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameLessThanOrEqualTo(String value) {
            addCriterion("ROOT_NAME <=", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameLike(String value) {
            addCriterion("ROOT_NAME like", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotLike(String value) {
            addCriterion("ROOT_NAME not like", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameIn(List<String> values) {
            addCriterion("ROOT_NAME in", values, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotIn(List<String> values) {
            addCriterion("ROOT_NAME not in", values, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameBetween(String value1, String value2) {
            addCriterion("ROOT_NAME between", value1, value2, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotBetween(String value1, String value2) {
            addCriterion("ROOT_NAME not between", value1, value2, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootTypeIsNull() {
            addCriterion("ROOT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRootTypeIsNotNull() {
            addCriterion("ROOT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRootTypeEqualTo(String value) {
            addCriterion("ROOT_TYPE =", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotEqualTo(String value) {
            addCriterion("ROOT_TYPE <>", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeGreaterThan(String value) {
            addCriterion("ROOT_TYPE >", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROOT_TYPE >=", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeLessThan(String value) {
            addCriterion("ROOT_TYPE <", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeLessThanOrEqualTo(String value) {
            addCriterion("ROOT_TYPE <=", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeLike(String value) {
            addCriterion("ROOT_TYPE like", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotLike(String value) {
            addCriterion("ROOT_TYPE not like", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeIn(List<String> values) {
            addCriterion("ROOT_TYPE in", values, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotIn(List<String> values) {
            addCriterion("ROOT_TYPE not in", values, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeBetween(String value1, String value2) {
            addCriterion("ROOT_TYPE between", value1, value2, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotBetween(String value1, String value2) {
            addCriterion("ROOT_TYPE not between", value1, value2, "rootType");
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

        public Criteria andStorageLimitIsNull() {
            addCriterion("STORAGE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andStorageLimitIsNotNull() {
            addCriterion("STORAGE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLimitEqualTo(Integer value) {
            addCriterion("STORAGE_LIMIT =", value, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitNotEqualTo(Integer value) {
            addCriterion("STORAGE_LIMIT <>", value, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitGreaterThan(Integer value) {
            addCriterion("STORAGE_LIMIT >", value, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORAGE_LIMIT >=", value, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitLessThan(Integer value) {
            addCriterion("STORAGE_LIMIT <", value, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitLessThanOrEqualTo(Integer value) {
            addCriterion("STORAGE_LIMIT <=", value, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitIn(List<Integer> values) {
            addCriterion("STORAGE_LIMIT in", values, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitNotIn(List<Integer> values) {
            addCriterion("STORAGE_LIMIT not in", values, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitBetween(Integer value1, Integer value2) {
            addCriterion("STORAGE_LIMIT between", value1, value2, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andStorageLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("STORAGE_LIMIT not between", value1, value2, "storageLimit");
            return (Criteria) this;
        }

        public Criteria andTotalSizeIsNull() {
            addCriterion("TOTAL_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTotalSizeIsNotNull() {
            addCriterion("TOTAL_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSizeEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SIZE =", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SIZE <>", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_SIZE >", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SIZE >=", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeLessThan(BigDecimal value) {
            addCriterion("TOTAL_SIZE <", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SIZE <=", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SIZE in", values, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SIZE not in", values, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SIZE between", value1, value2, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SIZE not between", value1, value2, "totalSize");
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
     * nullDMS_ROOT的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nullDMS_ROOT的动态SQL对象.
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