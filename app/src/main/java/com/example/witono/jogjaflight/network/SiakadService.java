package com.example.witono.jogjaflight.network;

import com.example.witono.jogjaflight.BuildConfig;
import com.example.witono.jogjaflight.model.Cabang;
import com.example.witono.jogjaflight.model.CheckUserResponse;
import com.example.witono.jogjaflight.model.Jadwal;
import com.example.witono.jogjaflight.model.LoginResponse;
import com.example.witono.jogjaflight.model.Nilai;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface SiakadService {

    @FormUrlEncoded
    @POST("api/checkUser")
    Observable<CheckUserResponse> chekUser(@Field("username") String username);

    @FormUrlEncoded
    @POST("api/login")
    Observable<LoginResponse> login(@Field("username") String username, @Field("password") String password);

    @GET("api/getListCabang")
    Observable<List<Cabang>> getListCabang();

    @FormUrlEncoded
    @POST("service/dataMhs")
    Observable<List<Jadwal>> getJadwalMhs(@Field("keyapi") String keyapi ,@Field("kategori") String kategori,
                                          @Field("tahun") int tahun, @Field("term") int term, @Field("nim") String nim);

    @FormUrlEncoded
    @POST("service/dataMhs")
    Observable<List<Nilai>> getNilailMhs(@Field("keyapi") String keyapi , @Field("kategori") String kategori,
                                         @Field("tahun") int tahun, @Field("term") int term, @Field("nim") String nim);




}
