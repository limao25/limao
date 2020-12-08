package com.example.lib_core_one.mvp.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lib_core_one.mvp.presenter.BasePresenter;
import com.example.lib_core_one.mvp.presenter.lPresenter;
import com.example.lib_core_one.mvp.ui.view.lView;

public abstract class BaseActivity<P extends lPresenter> extends AppCompatActivity implements lActivity, lView {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(BandLayout());

        initView();

        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mPresenter != null){
            mPresenter.Destroy();
            mPresenter = null;
        }
    }
}
