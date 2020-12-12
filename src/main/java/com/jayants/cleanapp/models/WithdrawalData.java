package com.jayants.cleanapp.models;

import java.util.Date;

public class WithdrawalData {
    Date dateWithdrawn;
    String userID;
    String userName;
    Integer amountWithdrawn;
    String transactionID;

    public WithdrawalData(Date dateWithdrawn, String userID, String userName, Integer amountWithdrawn, String transactionID) {
        this.dateWithdrawn = dateWithdrawn;
        this.userID = userID;
        this.userName = userName;
        this.amountWithdrawn = amountWithdrawn;
        this.transactionID = transactionID;
    }


    public Date getDateWithdrawn() {
        return dateWithdrawn;
    }

    public void setDateWithdrawn(Date dateWithdrawn) {
        this.dateWithdrawn = dateWithdrawn;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void setAmountWithdrawn(Integer amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    @Override
    public String toString() {
        return "{" +
                "dateWithdrawn=" + dateWithdrawn +
                ", userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", amountWithdrawn=" + amountWithdrawn +
                ", transactionID='" + transactionID + '\'' +
                '}';
    }
}
