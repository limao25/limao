package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.testone.adapter.MyFragmentAdapterr;
import com.example.testone.fragment.FirstFragment;
import com.example.testone.fragment.FourtFragment;
import com.example.testone.fragment.SeancondFragment;
import com.example.testone.fragment.ThirdFragment;
import com.ypk.library.interfac.OnTabClickListener;
import com.ypk.library.view.YPKTabLayoutView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tabtextlist = new ArrayList<>();
    private YPKTabLayoutView mYPKTabLayoutView;
    private ImageView imgOne;
    private ViewPager vpOne;
    private MyFragmentAdapterr myFragmentAdapterr;
    private List<Fragment> fragment_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpOne = (ViewPager) findViewById(R.id.vp_one);

        fragment_list.add(new FirstFragment());
        fragment_list.add(new SeancondFragment());
        fragment_list.add(new ThirdFragment());
        fragment_list.add(new FourtFragment());

        myFragmentAdapterr = new MyFragmentAdapterr(getSupportFragmentManager(),fragment_list);

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

