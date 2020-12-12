package com.jayants.cleanapp.models;

import java.util.Date;

public class UsersFundAccount {
    String userID;
    int totalAmount;
    Date created;
    Date lastUpdate;
    Boolean isActive;

    public UsersFundAccount(String userID, int totalAmount, Date created, Date lastUpdate, Boolean isActive) {
        this.userID = userID;
        this.totalAmount = totalAmount;
        this.created = created;
        this.lastUpdate = lastUpdate;
        this.isActive = isActive;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "{" +
                "userID='" + userID + '\'' +
                ", totalAmount=" + totalAmount +
                ", created=" + created +
                ", lastUpdate=" + lastUpdate +
                ", isActive=" + isActive +
                '}';
    }
}
