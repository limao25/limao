package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.ypk.library.interfac.OnTabClickListener;
import com.ypk.library.view.YPKTabLayoutView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tabtextlist = new ArrayList<>();
    private YPKTabLayoutView mYPKTabLayoutView;
    private ImageView imgOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        mYPKTabLabbyoutView = (YPKTabLayoutView) findViewById(R.id.mYPKTabLayoutView);
//
//        tabtextlist.add("推荐学习");
//        tabtextlist.add("企业学院");
//        tabtextlist.add("我的关注");
//
//        mYPKTabLayoutView.setTabTextList(tabtextlist);
//
//        mYPKTabLayoutView.setOnTabClickListener(new OnTabClickListener() {
//            @Override
//            public void tabSelectedListener(int i) { Toast.makeText(MainActivity.this, tabtextlist.get(i), Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, "" + tabtextlist.get(i), Toast.LENGTH_SHORT).show();
//            }
//        });

    }

}

