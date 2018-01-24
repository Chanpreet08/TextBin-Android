package com.chat_application_android.Model;

/**
 * Created by chanpreet on 24/01/18.
 */

public class LoginResponse {

    private Boolean success;
    private String msg;

    LoginResponse(Boolean success ,String msg){
        this.success = success;
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
