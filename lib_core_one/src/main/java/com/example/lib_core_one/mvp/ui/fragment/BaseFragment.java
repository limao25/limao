package com.example.lib_core_one.mvp.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lib_core_one.mvp.presenter.lPresenter;
import com.example.lib_core_one.mvp.ui.view.lView;

public abstract class BaseFragment <P extends lPresenter> extends Fragment implements lFragment, lView {
    protected P mPresenter;
    protected View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(BandLayout(), null);

        return mView;
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return mView.findViewById(id);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initView();

        initData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mPresenter != null){
            mPresenter.Destroy();
            mPresenter = null;
        }
    }
}
