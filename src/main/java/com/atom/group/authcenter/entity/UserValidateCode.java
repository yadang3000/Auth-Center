package com.atom.group.authcenter.entity;

import java.util.Date;

public class UserValidateCode {
    private Long validateCodeId;

    private String code;

    private Byte type;

    private Date checkInTime;

    private Date expireTime;

    private Byte status;

    private Long userId;

    public UserValidateCode(Long validateCodeId, String code, Byte type, Date checkInTime, Date expireTime, Byte status, Long userId) {
        this.validateCodeId = validateCodeId;
        this.code = code;
        this.type = type;
        this.checkInTime = checkInTime;
        this.expireTime = expireTime;
        this.status = status;
        this.userId = userId;
    }

    public UserValidateCode() {
        super();
    }

    public Long getValidateCodeId() {
        return validateCodeId;
    }

    public void setValidateCodeId(Long validateCodeId) {
        this.validateCodeId = validateCodeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}