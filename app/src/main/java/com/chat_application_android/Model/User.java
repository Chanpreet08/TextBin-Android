package com.chat_application_android.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chanpreet on 24/01/18.
 */

public class User {

    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("password")
    private String password;
    @SerializedName("admin")
    private Boolean admin;
    @SerializedName("phoneNumber")
    private String phoneNumber;

    User(String firstName, String lastName,String phoneNumber,String password,Boolean admin){
        this.firstName = firstName;
        this.lastName= lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.admin = admin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
