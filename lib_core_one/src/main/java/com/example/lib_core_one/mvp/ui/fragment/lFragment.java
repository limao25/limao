package com.example.lib_core_one.mvp.ui.fragment;

import android.view.View;

import androidx.annotation.IdRes;

import com.example.lib_core_one.mvp.ui.activity.lActivity;

public interface lFragment extends lActivity {

    <T extends View> T findViewById(@IdRes int id);

}
