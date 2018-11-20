package com.atom.group.authcenter.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationUserExample() {
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

        public Criteria andApplicationUserIdIsNull() {
            addCriterion("application_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdIsNotNull() {
            addCriterion("application_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdEqualTo(Long value) {
            addCriterion("application_user_id =", value, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdNotEqualTo(Long value) {
            addCriterion("application_user_id <>", value, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdGreaterThan(Long value) {
            addCriterion("application_user_id >", value, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_user_id >=", value, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdLessThan(Long value) {
            addCriterion("application_user_id <", value, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdLessThanOrEqualTo(Long value) {
            addCriterion("application_user_id <=", value, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdIn(List<Long> values) {
            addCriterion("application_user_id in", values, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdNotIn(List<Long> values) {
            addCriterion("application_user_id not in", values, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdBetween(Long value1, Long value2) {
            addCriterion("application_user_id between", value1, value2, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andApplicationUserIdNotBetween(Long value1, Long value2) {
            addCriterion("application_user_id not between", value1, value2, "applicationUserId");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Boolean value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Boolean value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Boolean value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Boolean value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Boolean> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Boolean> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
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

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Long value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Long value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Long value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Long value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Long> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Long> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Long value1, Long value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
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