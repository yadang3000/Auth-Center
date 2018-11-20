package com.atom.group.authcenter.entity;

import java.util.Date;

public class ThirdSystem {
    private Long thirdId;

    private String thirdName;

    private String thirdCode;

    private Date checkInTime;

    private Byte status;

    public ThirdSystem(Long thirdId, String thirdName, String thirdCode, Date checkInTime, Byte status) {
        this.thirdId = thirdId;
        this.thirdName = thirdName;
        this.thirdCode = thirdCode;
        this.checkInTime = checkInTime;
        this.status = status;
    }

    public ThirdSystem() {
        super();
    }

    public Long getThirdId() {
        return thirdId;
    }

    public void setThirdId(Long thirdId) {
        this.thirdId = thirdId;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName == null ? null : thirdName.trim();
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
}