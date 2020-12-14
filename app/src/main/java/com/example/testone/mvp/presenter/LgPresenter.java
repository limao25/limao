package com.example.testone.mvp.presenter;

import android.util.Log;

import com.example.lib_core_one.entity.MyEntity;
import com.example.lib_core_one.mvp.presenter.BasePresenter;
import com.example.testone.mvp.contract.LoginContract;
import com.example.testone.mvp.model.Entity.MyLoginEntity;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class LgPresenter extends BasePresenter<LoginContract.GetLoginModel,LoginContract.GetLoginView> {

    public LgPresenter(LoginContract.GetLoginModel mModel, LoginContract.GetLoginView mView) {
        super(mModel, mView);
    }

    public void GetLogin(MyLoginEntity myLoginEntity){
        mModel.GetLogin(myLoginEntity, new Observer<MyEntity<MyLoginEntity>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(MyEntity<MyLoginEntity> myLoginEntityMyEntity) {
                String s = myLoginEntityMyEntity.toString();

                MyLoginEntity data = myLoginEntityMyEntity.getData();



                Log.d("123","" + data);

                int code = myLoginEntityMyEntity.getCode();
                String msg = myLoginEntityMyEntity.getMsg();
                mView.initToast(msg);

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
