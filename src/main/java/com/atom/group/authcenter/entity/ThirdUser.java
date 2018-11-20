package com.atom.group.authcenter.entity;

import java.util.Date;

public class ThirdUser {
    private Long thirdUserId;

    private String thirdSystemId;

    private String thirdAccessToken;

    private String thirdCode;

    private Date checkInTime;

    private Byte status;

    private Long userId;

    public ThirdUser(Long thirdUserId, String thirdSystemId, String thirdAccessToken, String thirdCode, Date checkInTime, Byte status, Long userId) {
        this.thirdUserId = thirdUserId;
        this.thirdSystemId = thirdSystemId;
        this.thirdAccessToken = thirdAccessToken;
        this.thirdCode = thirdCode;
        this.checkInTime = checkInTime;
        this.status = status;
        this.userId = userId;
    }

    public ThirdUser() {
        super();
    }

    public Long getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(Long thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getThirdSystemId() {
        return thirdSystemId;
    }

    public void setThirdSystemId(String thirdSystemId) {
        this.thirdSystemId = thirdSystemId == null ? null : thirdSystemId.trim();
    }

    public String getThirdAccessToken() {
        return thirdAccessToken;
    }

    public void setThirdAccessToken(String thirdAccessToken) {
        this.thirdAccessToken = thirdAccessToken == null ? null : thirdAccessToken.trim();
    }

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode == null ? null : thirdCode.trim();
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}