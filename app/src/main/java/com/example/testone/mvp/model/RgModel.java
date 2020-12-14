package com.example.testone.mvp.model;

import com.example.lib_core_one.entity.MyEntity;
import com.example.lib_core_one.mvp.model.BaseModel;
import com.example.lib_core_one.network.MyHttpManger;
import com.example.testone.mvp.contract.RegContract;
import com.example.testone.mvp.model.Entity.MyRegEntity;
import com.example.testone.mvp.model.api.RegApi;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RgModel extends BaseModel implements RegContract.RegModel {

    @Override
    public void GetReg(MyRegEntity myRegEntity, Observer<MyEntity<MyRegEntity>> observer) {
        MyHttpManger.getInstance()
                .NoTokenRetrofit()
                .create(RegApi.class)
                .GetReg(myRegEntity)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(observer);

    }

}
