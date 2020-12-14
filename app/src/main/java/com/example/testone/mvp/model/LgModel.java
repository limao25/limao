package com.example.testone.mvp.model;

import com.example.lib_core_one.entity.MLoginEntity;
import com.example.lib_core_one.entity.MyEntity;
import com.example.lib_core_one.mvp.model.BaseModel;
import com.example.lib_core_one.network.MyHttpManger;
import com.example.testone.mvp.contract.LoginContract;
import com.example.testone.mvp.model.Entity.MyLoginEntity;
import com.example.testone.mvp.model.api.LoginApi;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LgModel extends BaseModel implements LoginContract.GetLoginModel {
    @Override
    public void GetLogin(MyLoginEntity myLoginEntity, Observer<MLoginEntity<MyLoginEntity>> observer) {
        MyHttpManger
                .getInstance()
                .NoTokenRetrofit()
                .create(LoginApi.class)
                .GetLogin(myLoginEntity)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(observer);

    }
}
