package com.atom.group.authcenter.entity;

import java.util.Date;

public class Application {
    private Long applicationId;

    private String applicationName;

    private String applicationCode;

    private Byte type;

    private Date checkInTime;

    private Byte status;

    public Application(Long applicationId, String applicationName, String applicationCode, Byte type, Date checkInTime, Byte status) {
        this.applicationId = applicationId;
        this.applicationName = applicationName;
        this.applicationCode = applicationCode;
        this.type = type;
        this.checkInTime = checkInTime;
        this.status = status;
    }

    public Application() {
        super();
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode == null ? null : applicationCode.trim();
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
}