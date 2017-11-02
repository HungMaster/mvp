package com.it.hungvt.mvpstructure.model;

/**
 * Created by Administrator on 11/2/2017.
 */

public class Account {
    private String username;
    private String emailAddress;
    private String password;

    public Account() {
    }

    public Account(String username, String emailAddress, String password) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
