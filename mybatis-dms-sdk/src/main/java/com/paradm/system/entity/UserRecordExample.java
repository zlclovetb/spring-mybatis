package com.paradm.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRecordExample {
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
    public UserRecordExample() {
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
     * nullUSER_RECORD的基本动态SQL对象.
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

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("LOGIN_PWD is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("LOGIN_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("LOGIN_PWD =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("LOGIN_PWD <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("LOGIN_PWD >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PWD >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("LOGIN_PWD <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PWD <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("LOGIN_PWD like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("LOGIN_PWD not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("LOGIN_PWD in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("LOGIN_PWD not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("LOGIN_PWD between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PWD not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FIRST_NAME <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FIRST_NAME like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("LAST_NAME =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("LAST_NAME <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("LAST_NAME >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("LAST_NAME <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("LAST_NAME like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("LAST_NAME not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("LAST_NAME in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("LAST_NAME not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("LAST_NAME between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNull() {
            addCriterion("LOCALE is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNotNull() {
            addCriterion("LOCALE is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleEqualTo(String value) {
            addCriterion("LOCALE =", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotEqualTo(String value) {
            addCriterion("LOCALE <>", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThan(String value) {
            addCriterion("LOCALE >", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE >=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThan(String value) {
            addCriterion("LOCALE <", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThanOrEqualTo(String value) {
            addCriterion("LOCALE <=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLike(String value) {
            addCriterion("LOCALE like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotLike(String value) {
            addCriterion("LOCALE not like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleIn(List<String> values) {
            addCriterion("LOCALE in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotIn(List<String> values) {
            addCriterion("LOCALE not in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleBetween(String value1, String value2) {
            addCriterion("LOCALE between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotBetween(String value1, String value2) {
            addCriterion("LOCALE not between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptIsNull() {
            addCriterion("MAX_ATTEMPT is null");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptIsNotNull() {
            addCriterion("MAX_ATTEMPT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptEqualTo(Integer value) {
            addCriterion("MAX_ATTEMPT =", value, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptNotEqualTo(Integer value) {
            addCriterion("MAX_ATTEMPT <>", value, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptGreaterThan(Integer value) {
            addCriterion("MAX_ATTEMPT >", value, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_ATTEMPT >=", value, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptLessThan(Integer value) {
            addCriterion("MAX_ATTEMPT <", value, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_ATTEMPT <=", value, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptIn(List<Integer> values) {
            addCriterion("MAX_ATTEMPT in", values, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptNotIn(List<Integer> values) {
            addCriterion("MAX_ATTEMPT not in", values, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptBetween(Integer value1, Integer value2) {
            addCriterion("MAX_ATTEMPT between", value1, value2, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andMaxAttemptNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_ATTEMPT not between", value1, value2, "maxAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptIsNull() {
            addCriterion("FAILED_ATTEMPT is null");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptIsNotNull() {
            addCriterion("FAILED_ATTEMPT is not null");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptEqualTo(Integer value) {
            addCriterion("FAILED_ATTEMPT =", value, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptNotEqualTo(Integer value) {
            addCriterion("FAILED_ATTEMPT <>", value, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptGreaterThan(Integer value) {
            addCriterion("FAILED_ATTEMPT >", value, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAILED_ATTEMPT >=", value, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptLessThan(Integer value) {
            addCriterion("FAILED_ATTEMPT <", value, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptLessThanOrEqualTo(Integer value) {
            addCriterion("FAILED_ATTEMPT <=", value, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptIn(List<Integer> values) {
            addCriterion("FAILED_ATTEMPT in", values, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptNotIn(List<Integer> values) {
            addCriterion("FAILED_ATTEMPT not in", values, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptBetween(Integer value1, Integer value2) {
            addCriterion("FAILED_ATTEMPT between", value1, value2, "failedAttempt");
            return (Criteria) this;
        }

        public Criteria andFailedAttemptNotBetween(Integer value1, Integer value2) {
            addCriterion("FAILED_ATTEMPT not between", value1, value2, "failedAttempt");
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

        public Criteria andPreferenceIsNull() {
            addCriterion("PREFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNotNull() {
            addCriterion("PREFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andPreferenceEqualTo(String value) {
            addCriterion("PREFERENCE =", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotEqualTo(String value) {
            addCriterion("PREFERENCE <>", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThan(String value) {
            addCriterion("PREFERENCE >", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("PREFERENCE >=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThan(String value) {
            addCriterion("PREFERENCE <", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThanOrEqualTo(String value) {
            addCriterion("PREFERENCE <=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLike(String value) {
            addCriterion("PREFERENCE like", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotLike(String value) {
            addCriterion("PREFERENCE not like", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceIn(List<String> values) {
            addCriterion("PREFERENCE in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotIn(List<String> values) {
            addCriterion("PREFERENCE not in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceBetween(String value1, String value2) {
            addCriterion("PREFERENCE between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotBetween(String value1, String value2) {
            addCriterion("PREFERENCE not between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("LOGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("LOGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("LOGIN_DATE =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("LOGIN_DATE <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("LOGIN_DATE >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGIN_DATE >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("LOGIN_DATE <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("LOGIN_DATE <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("LOGIN_DATE in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("LOGIN_DATE not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("LOGIN_DATE between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("LOGIN_DATE not between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateIsNull() {
            addCriterion("LAST_PWD_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateIsNotNull() {
            addCriterion("LAST_PWD_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateEqualTo(Date value) {
            addCriterion("LAST_PWD_UPDATE_DATE =", value, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_PWD_UPDATE_DATE <>", value, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_PWD_UPDATE_DATE >", value, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_PWD_UPDATE_DATE >=", value, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateLessThan(Date value) {
            addCriterion("LAST_PWD_UPDATE_DATE <", value, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_PWD_UPDATE_DATE <=", value, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateIn(List<Date> values) {
            addCriterion("LAST_PWD_UPDATE_DATE in", values, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_PWD_UPDATE_DATE not in", values, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_PWD_UPDATE_DATE between", value1, value2, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastPwdUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_PWD_UPDATE_DATE not between", value1, value2, "lastPwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNull() {
            addCriterion("ICON_PATH is null");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNotNull() {
            addCriterion("ICON_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andIconPathEqualTo(String value) {
            addCriterion("ICON_PATH =", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotEqualTo(String value) {
            addCriterion("ICON_PATH <>", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThan(String value) {
            addCriterion("ICON_PATH >", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_PATH >=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThan(String value) {
            addCriterion("ICON_PATH <", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThanOrEqualTo(String value) {
            addCriterion("ICON_PATH <=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLike(String value) {
            addCriterion("ICON_PATH like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotLike(String value) {
            addCriterion("ICON_PATH not like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathIn(List<String> values) {
            addCriterion("ICON_PATH in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotIn(List<String> values) {
            addCriterion("ICON_PATH not in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathBetween(String value1, String value2) {
            addCriterion("ICON_PATH between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotBetween(String value1, String value2) {
            addCriterion("ICON_PATH not between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andAuthMobileIsNull() {
            addCriterion("AUTH_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andAuthMobileIsNotNull() {
            addCriterion("AUTH_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthMobileEqualTo(String value) {
            addCriterion("AUTH_MOBILE =", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileNotEqualTo(String value) {
            addCriterion("AUTH_MOBILE <>", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileGreaterThan(String value) {
            addCriterion("AUTH_MOBILE >", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_MOBILE >=", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileLessThan(String value) {
            addCriterion("AUTH_MOBILE <", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileLessThanOrEqualTo(String value) {
            addCriterion("AUTH_MOBILE <=", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileLike(String value) {
            addCriterion("AUTH_MOBILE like", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileNotLike(String value) {
            addCriterion("AUTH_MOBILE not like", value, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileIn(List<String> values) {
            addCriterion("AUTH_MOBILE in", values, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileNotIn(List<String> values) {
            addCriterion("AUTH_MOBILE not in", values, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileBetween(String value1, String value2) {
            addCriterion("AUTH_MOBILE between", value1, value2, "authMobile");
            return (Criteria) this;
        }

        public Criteria andAuthMobileNotBetween(String value1, String value2) {
            addCriterion("AUTH_MOBILE not between", value1, value2, "authMobile");
            return (Criteria) this;
        }

        public Criteria andTwoFactorIsNull() {
            addCriterion("TWO_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andTwoFactorIsNotNull() {
            addCriterion("TWO_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andTwoFactorEqualTo(String value) {
            addCriterion("TWO_FACTOR =", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorNotEqualTo(String value) {
            addCriterion("TWO_FACTOR <>", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorGreaterThan(String value) {
            addCriterion("TWO_FACTOR >", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorGreaterThanOrEqualTo(String value) {
            addCriterion("TWO_FACTOR >=", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorLessThan(String value) {
            addCriterion("TWO_FACTOR <", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorLessThanOrEqualTo(String value) {
            addCriterion("TWO_FACTOR <=", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorLike(String value) {
            addCriterion("TWO_FACTOR like", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorNotLike(String value) {
            addCriterion("TWO_FACTOR not like", value, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorIn(List<String> values) {
            addCriterion("TWO_FACTOR in", values, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorNotIn(List<String> values) {
            addCriterion("TWO_FACTOR not in", values, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorBetween(String value1, String value2) {
            addCriterion("TWO_FACTOR between", value1, value2, "twoFactor");
            return (Criteria) this;
        }

        public Criteria andTwoFactorNotBetween(String value1, String value2) {
            addCriterion("TWO_FACTOR not between", value1, value2, "twoFactor");
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
     * nullUSER_RECORD的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nullUSER_RECORD的动态SQL对象.
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