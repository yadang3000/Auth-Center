package com.atom.group.authcenter.entity;

import java.util.Date;

public class ApplicationUser {
    private Long applicationUserId;

    private Boolean isAdmin;

    private Date checkInTime;

    private Byte status;

    private Long applicationId;

    private Long userId;

    public ApplicationUser(Long applicationUserId, Boolean isAdmin, Date checkInTime, Byte status, Long applicationId, Long userId) {
        this.applicationUserId = applicationUserId;
        this.isAdmin = isAdmin;
        this.checkInTime = checkInTime;
        this.status = status;
        this.applicationId = applicationId;
        this.userId = userId;
    }

    public ApplicationUser() {
        super();
    }

    public Long getApplicationUserId() {
        return applicationUserId;
    }

    public void setApplicationUserId(Long applicationUserId) {
        this.applicationUserId = applicationUserId;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}