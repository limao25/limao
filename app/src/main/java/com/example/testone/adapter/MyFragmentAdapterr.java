package com.example.testone.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFragmentAdapterr extends FragmentPagerAdapter {
    private List<Fragment> fragment_list =  new ArrayList<>();

    public MyFragmentAdapterr(@NonNull FragmentManager fm, List<Fragment> fragment_list) {
        super(fm);
        this.fragment_list = fragment_list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragment_list.get(position);
    }

    @Override
    public int getCount() {
        return fragment_list.size();
    }
}
