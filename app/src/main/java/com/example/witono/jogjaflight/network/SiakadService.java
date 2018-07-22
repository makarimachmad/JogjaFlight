package com.example.witono.jogjaflight.network;

import com.example.witono.jogjaflight.model.CheckUserResponse;
import com.example.witono.jogjaflight.model.LoginResponse;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface SiakadService {

    @FormUrlEncoded
    @POST("checkUser")
    Observable<CheckUserResponse> chekUser(@Field("username") String username);

    @FormUrlEncoded
    @POST("login")
    Observable<LoginResponse> login(@Field("username") String username,@Field("password") String password);

}
