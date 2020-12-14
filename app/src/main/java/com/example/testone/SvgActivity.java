package com.example.testone;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.MyLocationStyle;

public class SvgActivity extends AppCompatActivity {
    private ImageView imgTest;
    private MapView map;
    private MapView mMapView = null;
    private AMap aMap;
    private MyLocationStyle myLocationStyle;
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{
                    "android.permission.WRITE_EXTERNAL_STORAGE"
                    , "android.permission.ACCESS_NETWORK_STATE"
                    , "android.permission.ACCESS_WIFI_STATE"
                    , "android.permission.READ_PHONE_STATE"
                    , "android.permission.ACCESS_COARSE_LOCATION"
                    , "android.permission.ACCESS_FINE_LOCATION"
            }, 100);
        }
        setContentView(R.layout.activity_svg);
        map = (MapView) findViewById(R.id.map);
        mMapView = (MapView) findViewById(R.id.map);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
        mMapView.onCreate(savedInstanceState);
        if (aMap == null) {
            aMap = mMapView.getMap();
        }

//        imgTest = (ImageView) findViewById(R.id.img_test);
//
//        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable)imgTest.getDrawable();
//
//        drawable.start();
    }
}