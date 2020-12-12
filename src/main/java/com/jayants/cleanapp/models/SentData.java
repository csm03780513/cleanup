package com.jayants.cleanapp.models;

import java.util.Date;

public class SentData {
    Date datesent;
    String senderID;
    String senderName;
    Integer amountSent;
    String recipientID;
    String recipientName;
    String transactionID;

    public SentData(Date datesent, String senderID, String senderName, Integer amountSent, String recipientID, String recipientName, String transactionID) {
        this.datesent = datesent;
        this.senderID = senderID;
        this.senderName = senderName;
        this.amountSent = amountSent;
        this.recipientID = recipientID;
        this.recipientName = recipientName;
        this.transactionID = transactionID;
    }


    public Date getDatesent() {
        return datesent;
    }

    public void setDatesent(Date datesent) {
        this.datesent = datesent;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Integer getAmountSent() {
        return amountSent;
    }

    public void setAmountSent(Integer amountSent) {
        this.amountSent = amountSent;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(String recipientID) {
        this.recipientID = recipientID;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
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
                "datesent=" + datesent +
                ", senderID='" + senderID + '\'' +
                ", senderName='" + senderName + '\'' +
                ", amountSent=" + amountSent +
                ", recipientID='" + recipientID + '\'' +
                ", recipientName='" + recipientName + '\'' +
                ", transactionID='" + transactionID + '\'' +
                '}';
    }
}
