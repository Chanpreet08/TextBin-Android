package com.chat_application_android.Model;

/**
 * Created by chanpreet on 24/01/18.
 */

public class LoginModel {

    private String phoneNumber;
    private String token;
    private String password;

    LoginModel(String phoneNumber,String password, String token){
        this.phoneNumber = phoneNumber;
        this.token = token;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
