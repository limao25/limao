package com.example.lib_core_one.mvp.presenter;

import com.example.lib_core_one.mvp.model.lModel;
import com.example.lib_core_one.mvp.ui.view.lView;

public class BasePresenter <M extends lModel,V extends lView> implements lPresenter  {
    protected M mModel;
    protected V mView;

    public BasePresenter(M mModel, V mView) {
        this.mModel = mModel;
        this.mView = mView;
    }

    @Override
    public void Destroy() {
        if (mModel == null){
            mModel.Destroy();
            mModel = null;
        }
        System.gc();
    }
}
