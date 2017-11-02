package com.it.hungvt.mvpstructure;

import android.app.Application;

/**
 * Created by Administrator on 11/2/2017.
 */

public class App extends Application {

    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
