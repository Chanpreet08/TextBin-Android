package com.chat_application_android.Rest;

import com.chat_application_android.Model.LoginModel;
import com.chat_application_android.Model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by chanpreet on 24/01/18.
 */

public interface ApiInterface {

    @POST("/api/login")
    Call<LoginResponse> requestLogin(@Body LoginModel loginModel);
}
