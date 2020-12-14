package com.example.testone.mvp.contract;

import com.example.lib_core_one.entity.MyEntity;
import com.example.lib_core_one.mvp.model.lModel;
import com.example.lib_core_one.mvp.ui.view.lView;
import com.example.testone.mvp.model.Entity.MyLoginEntity;

import io.reactivex.Observer;

public interface LoginContract {

    interface GetLoginModel extends lModel {
        void GetLogin(MyLoginEntity myLoginEntity, Observer<MyEntity<MyLoginEntity>> observer);
    }

    interface GetLoginView extends lView {
        void initToast(String Msg);
    }
}
