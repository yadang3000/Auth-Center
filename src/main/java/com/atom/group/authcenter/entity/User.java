package com.atom.group.authcenter.entity;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String password;

    private Byte gender;

    private String headerPhoto;

    private String email;

    private String mobile;

    private String countryCode;

    private Byte type;

    private Boolean activateStatus;

    private String activateCode;

    private String resetPasswordCode;

    private Date checkInTime;

    private Byte status;

    public User(Long userId, String userName, String password, Byte gender, String headerPhoto, String email, String mobile, String countryCode, Byte type, Boolean activateStatus, String activateCode, String resetPasswordCode, Date checkInTime, Byte status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.headerPhoto = headerPhoto;
        this.email = email;
        this.mobile = mobile;
        this.countryCode = countryCode;
        this.type = type;
        this.activateStatus = activateStatus;
        this.activateCode = activateCode;
        this.resetPasswordCode = resetPasswordCode;
        this.checkInTime = checkInTime;
        this.status = status;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getHeaderPhoto() {
        return headerPhoto;
    }

    public void setHeaderPhoto(String headerPhoto) {
        this.headerPhoto = headerPhoto == null ? null : headerPhoto.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Boolean getActivateStatus() {
        return activateStatus;
    }

    public void setActivateStatus(Boolean activateStatus) {
        this.activateStatus = activateStatus;
    }

    public String getActivateCode() {
        return activateCode;
    }

    public void setActivateCode(String activateCode) {
        this.activateCode = activateCode == null ? null : activateCode.trim();
    }

    public String getResetPasswordCode() {
        return resetPasswordCode;
    }

    public void setResetPasswordCode(String resetPasswordCode) {
        this.resetPasswordCode = resetPasswordCode == null ? null : resetPasswordCode.trim();
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}