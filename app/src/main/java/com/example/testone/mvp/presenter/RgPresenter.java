package com.example.testone.mvp.presenter;

import android.util.Log;

import com.example.lib_core_one.entity.MyEntity;
import com.example.lib_core_one.mvp.presenter.BasePresenter;
import com.example.testone.mvp.contract.RegContract;
import com.example.testone.mvp.model.Entity.MyRegEntity;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RgPresenter extends BasePresenter<RegContract.RegModel,RegContract.RegView> {

    public RgPresenter(RegContract.RegModel mModel, RegContract.RegView mView) {
        super(mModel, mView);
    }

    public void GetReg(MyRegEntity myRegEntity){
        mModel.GetReg(myRegEntity, new Observer<MyEntity<MyRegEntity>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(MyEntity<MyRegEntity> myRegEntityMyEntity) {

                Log.d("123","" + myRegEntityMyEntity.toString());
                String msg = myRegEntityMyEntity.getMsg();

                Log.d("123","" + msg);
                int code = myRegEntityMyEntity.getCode();
                Log.d("123","" + code);

                mView.initAdapter(code);

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
