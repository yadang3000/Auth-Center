package com.atom.group.authcenter.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoIsNull() {
            addCriterion("header_photo is null");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoIsNotNull() {
            addCriterion("header_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoEqualTo(String value) {
            addCriterion("header_photo =", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoNotEqualTo(String value) {
            addCriterion("header_photo <>", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoGreaterThan(String value) {
            addCriterion("header_photo >", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("header_photo >=", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoLessThan(String value) {
            addCriterion("header_photo <", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoLessThanOrEqualTo(String value) {
            addCriterion("header_photo <=", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoLike(String value) {
            addCriterion("header_photo like", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoNotLike(String value) {
            addCriterion("header_photo not like", value, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoIn(List<String> values) {
            addCriterion("header_photo in", values, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoNotIn(List<String> values) {
            addCriterion("header_photo not in", values, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoBetween(String value1, String value2) {
            addCriterion("header_photo between", value1, value2, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andHeaderPhotoNotBetween(String value1, String value2) {
            addCriterion("header_photo not between", value1, value2, "headerPhoto");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andActivateStatusIsNull() {
            addCriterion("activate_status is null");
            return (Criteria) this;
        }

        public Criteria andActivateStatusIsNotNull() {
            addCriterion("activate_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivateStatusEqualTo(Boolean value) {
            addCriterion("activate_status =", value, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusNotEqualTo(Boolean value) {
            addCriterion("activate_status <>", value, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusGreaterThan(Boolean value) {
            addCriterion("activate_status >", value, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activate_status >=", value, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusLessThan(Boolean value) {
            addCriterion("activate_status <", value, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("activate_status <=", value, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusIn(List<Boolean> values) {
            addCriterion("activate_status in", values, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusNotIn(List<Boolean> values) {
            addCriterion("activate_status not in", values, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("activate_status between", value1, value2, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activate_status not between", value1, value2, "activateStatus");
            return (Criteria) this;
        }

        public Criteria andActivateCodeIsNull() {
            addCriterion("activate_code is null");
            return (Criteria) this;
        }

        public Criteria andActivateCodeIsNotNull() {
            addCriterion("activate_code is not null");
            return (Criteria) this;
        }

        public Criteria andActivateCodeEqualTo(String value) {
            addCriterion("activate_code =", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeNotEqualTo(String value) {
            addCriterion("activate_code <>", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeGreaterThan(String value) {
            addCriterion("activate_code >", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("activate_code >=", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeLessThan(String value) {
            addCriterion("activate_code <", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeLessThanOrEqualTo(String value) {
            addCriterion("activate_code <=", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeLike(String value) {
            addCriterion("activate_code like", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeNotLike(String value) {
            addCriterion("activate_code not like", value, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeIn(List<String> values) {
            addCriterion("activate_code in", values, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeNotIn(List<String> values) {
            addCriterion("activate_code not in", values, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeBetween(String value1, String value2) {
            addCriterion("activate_code between", value1, value2, "activateCode");
            return (Criteria) this;
        }

        public Criteria andActivateCodeNotBetween(String value1, String value2) {
            addCriterion("activate_code not between", value1, value2, "activateCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeIsNull() {
            addCriterion("reset_password_code is null");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeIsNotNull() {
            addCriterion("reset_password_code is not null");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeEqualTo(String value) {
            addCriterion("reset_password_code =", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeNotEqualTo(String value) {
            addCriterion("reset_password_code <>", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeGreaterThan(String value) {
            addCriterion("reset_password_code >", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reset_password_code >=", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeLessThan(String value) {
            addCriterion("reset_password_code <", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeLessThanOrEqualTo(String value) {
            addCriterion("reset_password_code <=", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeLike(String value) {
            addCriterion("reset_password_code like", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeNotLike(String value) {
            addCriterion("reset_password_code not like", value, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeIn(List<String> values) {
            addCriterion("reset_password_code in", values, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeNotIn(List<String> values) {
            addCriterion("reset_password_code not in", values, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeBetween(String value1, String value2) {
            addCriterion("reset_password_code between", value1, value2, "resetPasswordCode");
            return (Criteria) this;
        }

        public Criteria andResetPasswordCodeNotBetween(String value1, String value2) {
            addCriterion("reset_password_code not between", value1, value2, "resetPasswordCode");
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