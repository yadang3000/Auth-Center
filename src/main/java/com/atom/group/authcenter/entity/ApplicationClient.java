package com.atom.group.authcenter.entity;

import java.util.Date;

public class ApplicationClient {
    private Long clientId;

    private String secretCode;

    private Long timeMillis;

    private String clientName;

    private String clientCode;

    private Byte type;

    private Date checkInTime;

    private Byte status;

    private Long applicationId;

    public ApplicationClient(Long clientId, String secretCode, Long timeMillis, String clientName, String clientCode, Byte type, Date checkInTime, Byte status, Long applicationId) {
        this.clientId = clientId;
        this.secretCode = secretCode;
        this.timeMillis = timeMillis;
        this.clientName = clientName;
        this.clientCode = clientCode;
        this.type = type;
        this.checkInTime = checkInTime;
        this.status = status;
        this.applicationId = applicationId;
    }

    public ApplicationClient() {
        super();
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode == null ? null : secretCode.trim();
    }

    public Long getTimeMillis() {
        return timeMillis;
    }

    public void setTimeMillis(Long timeMillis) {
        this.timeMillis = timeMillis;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode == null ? null : clientCode.trim();
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
}