package com.example.testone;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class SvgActivity extends AppCompatActivity {
    private ImageView imgTest;

//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svg);

//        imgTest = (ImageView) findViewById(R.id.img_test);
//
//        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable)imgTest.getDrawable();
//
//        drawable.start();
    }
}