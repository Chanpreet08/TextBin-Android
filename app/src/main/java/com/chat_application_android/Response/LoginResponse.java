package com.chat_application_android.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chanpreet on 24/01/18.
 */

public class LoginResponse {

    @SerializedName("status")
    private Boolean status;
    @SerializedName("msg")
    private String msg;
    @SerializedName("token")
    private String token;

    LoginResponse(Boolean status, String msg, String token){
        this.status = status;
        this.msg = msg;
        this.token = token;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
