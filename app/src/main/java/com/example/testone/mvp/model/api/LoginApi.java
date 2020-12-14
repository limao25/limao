package com.example.testone.mvp.model.api;

import com.example.lib_core_one.entity.MyEntity;
import com.example.testone.mvp.model.Entity.MyLoginEntity;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {
///gisim/user/login

    @POST("gisim/user/login")
    Observable<MyEntity<MyLoginEntity>> GetLogin(@Body MyLoginEntity myLoginEntity);

}
