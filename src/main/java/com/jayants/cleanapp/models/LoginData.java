package com.jayants.cleanapp.models;

import org.springframework.stereotype.Service;

@Service
public class LoginData {
    private int responseCode;
    private String loginMessage;
    private boolean successful;




    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    @Override
    public String toString() {
        return "{" +
                "responseCode=" + responseCode +
                ", loginMessage='" + loginMessage + '\'' +
                ", successful=" + successful +
                '}';
    }
}
