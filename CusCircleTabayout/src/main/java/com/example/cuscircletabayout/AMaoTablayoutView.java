package com.example.cuscircletabayout;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class AMaoTablayoutView extends View {
    private Paint paint;

    public AMaoTablayoutView(Context context) {
        this(context,null);
    }

    public AMaoTablayoutView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs ,0);
    }

    public AMaoTablayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initView();
        initData();
    }

    private void initView() {

    }

    private void initData() {

    }
}
