package com.example.myhealth;

public class user_info {
    user_stats user = new user_stats();
    public String userName;

    public void main(String[] args) {
        user.Name = "aa";
        userName = user.Name;
    }

    public String getUserName() {
        return userName;
    }
}
