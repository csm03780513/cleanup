package com.jayants.cleanapp.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
public class UsersData {
    @Id
    String userID;
    String username;
    String password;
    String userrole;


    public UsersData(String userID, String username, String password, String userrole) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.userrole = userrole;
    }

    public UsersData() {

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    @Override
    public String toString() {
        return "{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userrole='" + userrole + '\'' +
                '}';
    }
}
