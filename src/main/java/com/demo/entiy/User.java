package com.demo.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class User {

    private String username;
    private String password;
    private String fullname;
    private Timestamp date;

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @JsonFormat(pattern="yyyy-MM-dd")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
