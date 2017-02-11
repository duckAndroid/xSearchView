package com.pythoncat.xsearchview.base;

import android.app.Application;

import com.pythoncat.xsearchview.utils.App;

/**
 * @author Administrator
 *         2017/2/11
 *         com.pythoncat.dragviewdemo.base
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        App.set(this);
    }
}
