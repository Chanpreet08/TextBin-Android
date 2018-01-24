package com.chat_application_android.Rest;

import com.chat_application_android.Model.User;
import com.chat_application_android.Response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by chanpreet on 24/01/18.
 */

public interface ApiInterface {

    @POST("/auth/login")
    Call<LoginResponse> requestLogin(@Body User user);
}
