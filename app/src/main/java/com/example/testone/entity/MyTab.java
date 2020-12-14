package com.example.testone.entity;

import com.flyco.tablayout.listener.CustomTabEntity;

public class MyTab implements CustomTabEntity {
    private String title;
    private int select;
    private int unselector;

    public MyTab(String title, int select, int unselector) {
        this.title = title;
        this.select = select;
        this.unselector = unselector;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return select;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unselector;
    }
}
