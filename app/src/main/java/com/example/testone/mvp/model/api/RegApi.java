package com.example.testone.mvp.model.api;

import com.example.lib_core_one.entity.MyEntity;
import com.example.testone.mvp.model.Entity.MyRegEntity;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegApi {
///gisim/user/register

    @POST("gisim/user/register")
    Observable<MyEntity<MyRegEntity>> GetReg(@Body MyRegEntity myRegEntity);

}
