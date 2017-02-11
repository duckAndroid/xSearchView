package com.pythoncat.xsearchview.utils;
import android.app.Application;
import android.support.annotation.NonNull;

/**
 * @author Administrator
 *         2017/2/11
 *         com.pythoncat.dragviewdemo.utils
 */

public class App {

    private static Application instance;
    public static Application get(){

        return instance;
    }
    public static void set(@NonNull Application application){
        instance = application;
    }
}
