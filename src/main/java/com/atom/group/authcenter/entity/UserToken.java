package com.atom.group.authcenter.entity;

import java.util.Date;

public class UserToken {
    private Long userTokenId;

    private String token;

    private Date checkInTime;

    private Date expireTime;

    private String bindIp;

    private String refreshToken;

    private Byte loginType;

    private String thirdCode;

    private Byte status;

    private Long applicationId;

    private Long clientId;

    private Long userId;

    public UserToken(Long userTokenId, String token, Date checkInTime, Date expireTime, String bindIp, String refreshToken, Byte loginType, String thirdCode, Byte status, Long applicationId, Long clientId, Long userId) {
        this.userTokenId = userTokenId;
        this.token = token;
        this.checkInTime = checkInTime;
        this.expireTime = expireTime;
        this.bindIp = bindIp;
        this.refreshToken = refreshToken;
        this.loginType = loginType;
        this.thirdCode = thirdCode;
        this.status = status;
        this.applicationId = applicationId;
        this.clientId = clientId;
        this.userId = userId;
    }

    public UserToken() {
        super();
    }

    public Long getUserTokenId() {
        return userTokenId;
    }

    public void setUserTokenId(Long userTokenId) {
        this.userTokenId = userTokenId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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

    public String getBindIp() {
        return bindIp;
    }

    public void setBindIp(String bindIp) {
        this.bindIp = bindIp == null ? null : bindIp.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    public Byte getLoginType() {
        return loginType;
    }

    public void setLoginType(Byte loginType) {
        this.loginType = loginType;
    }

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode == null ? null : thirdCode.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}