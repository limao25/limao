package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.testone.adapter.MyFragmentAdapterr;
import com.example.testone.entity.MyTab;
import com.example.testone.fragment.FirstFragment;
import com.example.testone.fragment.FourtFragment;
import com.example.testone.fragment.SeancondFragment;
import com.example.testone.fragment.ThirdFragment;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.ypk.library.interfac.OnTabClickListener;
import com.ypk.library.view.YPKTabLayoutView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CustomTabEntity> tabtextlist = new ArrayList<>();
    private YPKTabLayoutView mYPKTabLayoutView;
    private ImageView imgOne;
    private ViewPager vpOne;
    private MyFragmentAdapterr myFragmentAdapterr;
    private List<Fragment> fragment_list = new ArrayList<>();
    private CommonTabLayout commonOne;

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

        vpOne.setAdapter(myFragmentAdapterr);
//        mYPKTabLabbyoutView = (YPKTabLayoutView) findViewById(R.id.mYPKTabLayoutView);
//
        tabtextlist.add(new MyTab("我的东西",0,0));
        tabtextlist.add(new MyTab("我的爱好",0,0));
        tabtextlist.add(new MyTab("我的特工",0,0));
        tabtextlist.add(new MyTab("我的花朵",0,0));

        commonOne = (CommonTabLayout) findViewById(R.id.common_one);

        commonOne.setTabData(tabtextlist);

        commonOne.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                if (position == 0){
                    vpOne.setCurrentItem(0);
                }else if (position == 1){
                    vpOne.setCurrentItem(1);
                }else if (position == 2){
                    vpOne.setCurrentItem(2);
                }else if (position == 3){
                    vpOne.setCurrentItem(3);
                }
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
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

