package com.example.testone.Customvew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class mainlogview extends View {
    private Context mContext;

    public mainlogview(Context context) {
        this(context,null);
    }

    public mainlogview(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public mainlogview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
         mContext = context;
         initData();
         initAttr(attrs,defStyleAttr);

    }

    private void initAttr(AttributeSet attrs, int defStyleAttr) {

    }

    private void initData() {

    }

}
