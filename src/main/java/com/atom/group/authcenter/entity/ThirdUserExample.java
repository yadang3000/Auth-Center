package com.atom.group.authcenter.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThirdUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThirdUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andThirdUserIdIsNull() {
            addCriterion("third_user_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNotNull() {
            addCriterion("third_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdEqualTo(Long value) {
            addCriterion("third_user_id =", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotEqualTo(Long value) {
            addCriterion("third_user_id <>", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThan(Long value) {
            addCriterion("third_user_id >", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("third_user_id >=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThan(Long value) {
            addCriterion("third_user_id <", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThanOrEqualTo(Long value) {
            addCriterion("third_user_id <=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIn(List<Long> values) {
            addCriterion("third_user_id in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotIn(List<Long> values) {
            addCriterion("third_user_id not in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdBetween(Long value1, Long value2) {
            addCriterion("third_user_id between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotBetween(Long value1, Long value2) {
            addCriterion("third_user_id not between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdIsNull() {
            addCriterion("third_system_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdIsNotNull() {
            addCriterion("third_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdEqualTo(String value) {
            addCriterion("third_system_id =", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdNotEqualTo(String value) {
            addCriterion("third_system_id <>", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdGreaterThan(String value) {
            addCriterion("third_system_id >", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_system_id >=", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdLessThan(String value) {
            addCriterion("third_system_id <", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdLessThanOrEqualTo(String value) {
            addCriterion("third_system_id <=", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdLike(String value) {
            addCriterion("third_system_id like", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdNotLike(String value) {
            addCriterion("third_system_id not like", value, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdIn(List<String> values) {
            addCriterion("third_system_id in", values, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdNotIn(List<String> values) {
            addCriterion("third_system_id not in", values, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdBetween(String value1, String value2) {
            addCriterion("third_system_id between", value1, value2, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdSystemIdNotBetween(String value1, String value2) {
            addCriterion("third_system_id not between", value1, value2, "thirdSystemId");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenIsNull() {
            addCriterion("third_access_token is null");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenIsNotNull() {
            addCriterion("third_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenEqualTo(String value) {
            addCriterion("third_access_token =", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenNotEqualTo(String value) {
            addCriterion("third_access_token <>", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenGreaterThan(String value) {
            addCriterion("third_access_token >", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("third_access_token >=", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenLessThan(String value) {
            addCriterion("third_access_token <", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("third_access_token <=", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenLike(String value) {
            addCriterion("third_access_token like", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenNotLike(String value) {
            addCriterion("third_access_token not like", value, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenIn(List<String> values) {
            addCriterion("third_access_token in", values, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenNotIn(List<String> values) {
            addCriterion("third_access_token not in", values, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenBetween(String value1, String value2) {
            addCriterion("third_access_token between", value1, value2, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdAccessTokenNotBetween(String value1, String value2) {
            addCriterion("third_access_token not between", value1, value2, "thirdAccessToken");
            return (Criteria) this;
        }

        public Criteria andThirdCodeIsNull() {
            addCriterion("third_code is null");
            return (Criteria) this;
        }

        public Criteria andThirdCodeIsNotNull() {
            addCriterion("third_code is not null");
            return (Criteria) this;
        }

        public Criteria andThirdCodeEqualTo(String value) {
            addCriterion("third_code =", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeNotEqualTo(String value) {
            addCriterion("third_code <>", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeGreaterThan(String value) {
            addCriterion("third_code >", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("third_code >=", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeLessThan(String value) {
            addCriterion("third_code <", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeLessThanOrEqualTo(String value) {
            addCriterion("third_code <=", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeLike(String value) {
            addCriterion("third_code like", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeNotLike(String value) {
            addCriterion("third_code not like", value, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeIn(List<String> values) {
            addCriterion("third_code in", values, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeNotIn(List<String> values) {
            addCriterion("third_code not in", values, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeBetween(String value1, String value2) {
            addCriterion("third_code between", value1, value2, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andThirdCodeNotBetween(String value1, String value2) {
            addCriterion("third_code not between", value1, value2, "thirdCode");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNull() {
            addCriterion("check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNotNull() {
            addCriterion("check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeEqualTo(Date value) {
            addCriterion("check_in_time =", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotEqualTo(Date value) {
            addCriterion("check_in_time <>", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThan(Date value) {
            addCriterion("check_in_time >", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_in_time >=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThan(Date value) {
            addCriterion("check_in_time <", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_in_time <=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIn(List<Date> values) {
            addCriterion("check_in_time in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotIn(List<Date> values) {
            addCriterion("check_in_time not in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeBetween(Date value1, Date value2) {
            addCriterion("check_in_time between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_in_time not between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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