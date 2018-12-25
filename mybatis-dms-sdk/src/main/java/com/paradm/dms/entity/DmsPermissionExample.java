package com.paradm.dms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmsPermissionExample {
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
    public DmsPermissionExample() {
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
     * nullDMS_PERMISSION的基本动态SQL对象.
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNull() {
            addCriterion("ROOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("ROOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRootIdEqualTo(Long value) {
            addCriterion("ROOT_ID =", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotEqualTo(Long value) {
            addCriterion("ROOT_ID <>", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThan(Long value) {
            addCriterion("ROOT_ID >", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROOT_ID >=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThan(Long value) {
            addCriterion("ROOT_ID <", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThanOrEqualTo(Long value) {
            addCriterion("ROOT_ID <=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdIn(List<Long> values) {
            addCriterion("ROOT_ID in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotIn(List<Long> values) {
            addCriterion("ROOT_ID not in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdBetween(Long value1, Long value2) {
            addCriterion("ROOT_ID between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotBetween(Long value1, Long value2) {
            addCriterion("ROOT_ID not between", value1, value2, "rootId");
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

        public Criteria andReadFlagIsNull() {
            addCriterion("READ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReadFlagIsNotNull() {
            addCriterion("READ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReadFlagEqualTo(Integer value) {
            addCriterion("READ_FLAG =", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagNotEqualTo(Integer value) {
            addCriterion("READ_FLAG <>", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagGreaterThan(Integer value) {
            addCriterion("READ_FLAG >", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_FLAG >=", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagLessThan(Integer value) {
            addCriterion("READ_FLAG <", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagLessThanOrEqualTo(Integer value) {
            addCriterion("READ_FLAG <=", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagIn(List<Integer> values) {
            addCriterion("READ_FLAG in", values, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagNotIn(List<Integer> values) {
            addCriterion("READ_FLAG not in", values, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagBetween(Integer value1, Integer value2) {
            addCriterion("READ_FLAG between", value1, value2, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_FLAG not between", value1, value2, "readFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagIsNull() {
            addCriterion("CREATE_FOLDER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagIsNotNull() {
            addCriterion("CREATE_FOLDER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagEqualTo(Integer value) {
            addCriterion("CREATE_FOLDER_FLAG =", value, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagNotEqualTo(Integer value) {
            addCriterion("CREATE_FOLDER_FLAG <>", value, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagGreaterThan(Integer value) {
            addCriterion("CREATE_FOLDER_FLAG >", value, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_FOLDER_FLAG >=", value, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagLessThan(Integer value) {
            addCriterion("CREATE_FOLDER_FLAG <", value, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_FOLDER_FLAG <=", value, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagIn(List<Integer> values) {
            addCriterion("CREATE_FOLDER_FLAG in", values, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagNotIn(List<Integer> values) {
            addCriterion("CREATE_FOLDER_FLAG not in", values, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_FOLDER_FLAG between", value1, value2, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateFolderFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_FOLDER_FLAG not between", value1, value2, "createFolderFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagIsNull() {
            addCriterion("CREATE_DOCUMENT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagIsNotNull() {
            addCriterion("CREATE_DOCUMENT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagEqualTo(Integer value) {
            addCriterion("CREATE_DOCUMENT_FLAG =", value, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagNotEqualTo(Integer value) {
            addCriterion("CREATE_DOCUMENT_FLAG <>", value, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagGreaterThan(Integer value) {
            addCriterion("CREATE_DOCUMENT_FLAG >", value, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_DOCUMENT_FLAG >=", value, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagLessThan(Integer value) {
            addCriterion("CREATE_DOCUMENT_FLAG <", value, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_DOCUMENT_FLAG <=", value, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagIn(List<Integer> values) {
            addCriterion("CREATE_DOCUMENT_FLAG in", values, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagNotIn(List<Integer> values) {
            addCriterion("CREATE_DOCUMENT_FLAG not in", values, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_DOCUMENT_FLAG between", value1, value2, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDocumentFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_DOCUMENT_FLAG not between", value1, value2, "createDocumentFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagIsNull() {
            addCriterion("SET_ALERT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagIsNotNull() {
            addCriterion("SET_ALERT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagEqualTo(Integer value) {
            addCriterion("SET_ALERT_FLAG =", value, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagNotEqualTo(Integer value) {
            addCriterion("SET_ALERT_FLAG <>", value, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagGreaterThan(Integer value) {
            addCriterion("SET_ALERT_FLAG >", value, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SET_ALERT_FLAG >=", value, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagLessThan(Integer value) {
            addCriterion("SET_ALERT_FLAG <", value, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagLessThanOrEqualTo(Integer value) {
            addCriterion("SET_ALERT_FLAG <=", value, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagIn(List<Integer> values) {
            addCriterion("SET_ALERT_FLAG in", values, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagNotIn(List<Integer> values) {
            addCriterion("SET_ALERT_FLAG not in", values, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagBetween(Integer value1, Integer value2) {
            addCriterion("SET_ALERT_FLAG between", value1, value2, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andSetAlertFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("SET_ALERT_FLAG not between", value1, value2, "setAlertFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagIsNull() {
            addCriterion("RENAME_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRenameFlagIsNotNull() {
            addCriterion("RENAME_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRenameFlagEqualTo(Integer value) {
            addCriterion("RENAME_FLAG =", value, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagNotEqualTo(Integer value) {
            addCriterion("RENAME_FLAG <>", value, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagGreaterThan(Integer value) {
            addCriterion("RENAME_FLAG >", value, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENAME_FLAG >=", value, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagLessThan(Integer value) {
            addCriterion("RENAME_FLAG <", value, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagLessThanOrEqualTo(Integer value) {
            addCriterion("RENAME_FLAG <=", value, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagIn(List<Integer> values) {
            addCriterion("RENAME_FLAG in", values, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagNotIn(List<Integer> values) {
            addCriterion("RENAME_FLAG not in", values, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagBetween(Integer value1, Integer value2) {
            addCriterion("RENAME_FLAG between", value1, value2, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andRenameFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("RENAME_FLAG not between", value1, value2, "renameFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagIsNull() {
            addCriterion("COPY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCopyFlagIsNotNull() {
            addCriterion("COPY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCopyFlagEqualTo(Integer value) {
            addCriterion("COPY_FLAG =", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagNotEqualTo(Integer value) {
            addCriterion("COPY_FLAG <>", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagGreaterThan(Integer value) {
            addCriterion("COPY_FLAG >", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("COPY_FLAG >=", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagLessThan(Integer value) {
            addCriterion("COPY_FLAG <", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("COPY_FLAG <=", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagIn(List<Integer> values) {
            addCriterion("COPY_FLAG in", values, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagNotIn(List<Integer> values) {
            addCriterion("COPY_FLAG not in", values, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagBetween(Integer value1, Integer value2) {
            addCriterion("COPY_FLAG between", value1, value2, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("COPY_FLAG not between", value1, value2, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagIsNull() {
            addCriterion("MOVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMoveFlagIsNotNull() {
            addCriterion("MOVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMoveFlagEqualTo(Integer value) {
            addCriterion("MOVE_FLAG =", value, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagNotEqualTo(Integer value) {
            addCriterion("MOVE_FLAG <>", value, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagGreaterThan(Integer value) {
            addCriterion("MOVE_FLAG >", value, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOVE_FLAG >=", value, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagLessThan(Integer value) {
            addCriterion("MOVE_FLAG <", value, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagLessThanOrEqualTo(Integer value) {
            addCriterion("MOVE_FLAG <=", value, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagIn(List<Integer> values) {
            addCriterion("MOVE_FLAG in", values, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagNotIn(List<Integer> values) {
            addCriterion("MOVE_FLAG not in", values, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagBetween(Integer value1, Integer value2) {
            addCriterion("MOVE_FLAG between", value1, value2, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andMoveFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("MOVE_FLAG not between", value1, value2, "moveFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagIsNull() {
            addCriterion("ACCESS_CONTROL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagIsNotNull() {
            addCriterion("ACCESS_CONTROL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagEqualTo(Integer value) {
            addCriterion("ACCESS_CONTROL_FLAG =", value, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagNotEqualTo(Integer value) {
            addCriterion("ACCESS_CONTROL_FLAG <>", value, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagGreaterThan(Integer value) {
            addCriterion("ACCESS_CONTROL_FLAG >", value, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_CONTROL_FLAG >=", value, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagLessThan(Integer value) {
            addCriterion("ACCESS_CONTROL_FLAG <", value, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_CONTROL_FLAG <=", value, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagIn(List<Integer> values) {
            addCriterion("ACCESS_CONTROL_FLAG in", values, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagNotIn(List<Integer> values) {
            addCriterion("ACCESS_CONTROL_FLAG not in", values, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_CONTROL_FLAG between", value1, value2, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAccessControlFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_CONTROL_FLAG not between", value1, value2, "accessControlFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagIsNull() {
            addCriterion("AUDIT_TRAIL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagIsNotNull() {
            addCriterion("AUDIT_TRAIL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagEqualTo(Integer value) {
            addCriterion("AUDIT_TRAIL_FLAG =", value, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagNotEqualTo(Integer value) {
            addCriterion("AUDIT_TRAIL_FLAG <>", value, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagGreaterThan(Integer value) {
            addCriterion("AUDIT_TRAIL_FLAG >", value, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_TRAIL_FLAG >=", value, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagLessThan(Integer value) {
            addCriterion("AUDIT_TRAIL_FLAG <", value, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_TRAIL_FLAG <=", value, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagIn(List<Integer> values) {
            addCriterion("AUDIT_TRAIL_FLAG in", values, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagNotIn(List<Integer> values) {
            addCriterion("AUDIT_TRAIL_FLAG not in", values, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_TRAIL_FLAG between", value1, value2, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andAuditTrailFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_TRAIL_FLAG not between", value1, value2, "auditTrailFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagIsNull() {
            addCriterion("DOWNLOAD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagIsNotNull() {
            addCriterion("DOWNLOAD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagEqualTo(Integer value) {
            addCriterion("DOWNLOAD_FLAG =", value, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagNotEqualTo(Integer value) {
            addCriterion("DOWNLOAD_FLAG <>", value, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagGreaterThan(Integer value) {
            addCriterion("DOWNLOAD_FLAG >", value, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_FLAG >=", value, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagLessThan(Integer value) {
            addCriterion("DOWNLOAD_FLAG <", value, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagLessThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_FLAG <=", value, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagIn(List<Integer> values) {
            addCriterion("DOWNLOAD_FLAG in", values, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagNotIn(List<Integer> values) {
            addCriterion("DOWNLOAD_FLAG not in", values, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_FLAG between", value1, value2, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andDownloadFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_FLAG not between", value1, value2, "downloadFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagIsNull() {
            addCriterion("EDIT_INDEX_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagIsNotNull() {
            addCriterion("EDIT_INDEX_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagEqualTo(Integer value) {
            addCriterion("EDIT_INDEX_FLAG =", value, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagNotEqualTo(Integer value) {
            addCriterion("EDIT_INDEX_FLAG <>", value, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagGreaterThan(Integer value) {
            addCriterion("EDIT_INDEX_FLAG >", value, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("EDIT_INDEX_FLAG >=", value, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagLessThan(Integer value) {
            addCriterion("EDIT_INDEX_FLAG <", value, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagLessThanOrEqualTo(Integer value) {
            addCriterion("EDIT_INDEX_FLAG <=", value, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagIn(List<Integer> values) {
            addCriterion("EDIT_INDEX_FLAG in", values, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagNotIn(List<Integer> values) {
            addCriterion("EDIT_INDEX_FLAG not in", values, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagBetween(Integer value1, Integer value2) {
            addCriterion("EDIT_INDEX_FLAG between", value1, value2, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andEditIndexFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("EDIT_INDEX_FLAG not between", value1, value2, "editIndexFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("UPDATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("UPDATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(Integer value) {
            addCriterion("UPDATE_FLAG =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(Integer value) {
            addCriterion("UPDATE_FLAG <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(Integer value) {
            addCriterion("UPDATE_FLAG >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_FLAG >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(Integer value) {
            addCriterion("UPDATE_FLAG <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_FLAG <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<Integer> values) {
            addCriterion("UPDATE_FLAG in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<Integer> values) {
            addCriterion("UPDATE_FLAG not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_FLAG between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_FLAG not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagIsNull() {
            addCriterion("INVITATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagIsNotNull() {
            addCriterion("INVITATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagEqualTo(Integer value) {
            addCriterion("INVITATION_FLAG =", value, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagNotEqualTo(Integer value) {
            addCriterion("INVITATION_FLAG <>", value, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagGreaterThan(Integer value) {
            addCriterion("INVITATION_FLAG >", value, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("INVITATION_FLAG >=", value, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagLessThan(Integer value) {
            addCriterion("INVITATION_FLAG <", value, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagLessThanOrEqualTo(Integer value) {
            addCriterion("INVITATION_FLAG <=", value, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagIn(List<Integer> values) {
            addCriterion("INVITATION_FLAG in", values, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagNotIn(List<Integer> values) {
            addCriterion("INVITATION_FLAG not in", values, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagBetween(Integer value1, Integer value2) {
            addCriterion("INVITATION_FLAG between", value1, value2, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andInvitationFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("INVITATION_FLAG not between", value1, value2, "invitationFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagIsNull() {
            addCriterion("LIST_VERSION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagIsNotNull() {
            addCriterion("LIST_VERSION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagEqualTo(Integer value) {
            addCriterion("LIST_VERSION_FLAG =", value, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagNotEqualTo(Integer value) {
            addCriterion("LIST_VERSION_FLAG <>", value, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagGreaterThan(Integer value) {
            addCriterion("LIST_VERSION_FLAG >", value, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIST_VERSION_FLAG >=", value, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagLessThan(Integer value) {
            addCriterion("LIST_VERSION_FLAG <", value, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagLessThanOrEqualTo(Integer value) {
            addCriterion("LIST_VERSION_FLAG <=", value, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagIn(List<Integer> values) {
            addCriterion("LIST_VERSION_FLAG in", values, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagNotIn(List<Integer> values) {
            addCriterion("LIST_VERSION_FLAG not in", values, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagBetween(Integer value1, Integer value2) {
            addCriterion("LIST_VERSION_FLAG between", value1, value2, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andListVersionFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("LIST_VERSION_FLAG not between", value1, value2, "listVersionFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagIsNull() {
            addCriterion("MUST_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMustFlagIsNotNull() {
            addCriterion("MUST_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMustFlagEqualTo(String value) {
            addCriterion("MUST_FLAG =", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagNotEqualTo(String value) {
            addCriterion("MUST_FLAG <>", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagGreaterThan(String value) {
            addCriterion("MUST_FLAG >", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MUST_FLAG >=", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagLessThan(String value) {
            addCriterion("MUST_FLAG <", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagLessThanOrEqualTo(String value) {
            addCriterion("MUST_FLAG <=", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagLike(String value) {
            addCriterion("MUST_FLAG like", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagNotLike(String value) {
            addCriterion("MUST_FLAG not like", value, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagIn(List<String> values) {
            addCriterion("MUST_FLAG in", values, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagNotIn(List<String> values) {
            addCriterion("MUST_FLAG not in", values, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagBetween(String value1, String value2) {
            addCriterion("MUST_FLAG between", value1, value2, "mustFlag");
            return (Criteria) this;
        }

        public Criteria andMustFlagNotBetween(String value1, String value2) {
            addCriterion("MUST_FLAG not between", value1, value2, "mustFlag");
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
     * nullDMS_PERMISSION的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nullDMS_PERMISSION的动态SQL对象.
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