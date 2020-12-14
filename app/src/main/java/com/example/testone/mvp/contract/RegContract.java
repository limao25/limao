package com.example.testone.mvp.contract;

import com.example.lib_core_one.entity.MyEntity;
import com.example.lib_core_one.mvp.model.lModel;
import com.example.lib_core_one.mvp.ui.view.lView;
import com.example.testone.mvp.model.Entity.MyRegEntity;

import io.reactivex.Observer;

public interface RegContract  {

    interface RegModel extends lModel {
        void GetReg(MyRegEntity myRegEntity, Observer<MyEntity<MyRegEntity>> observer);
    }

    interface RegView extends lView {
        void initAdapter(int code);
    }

}
