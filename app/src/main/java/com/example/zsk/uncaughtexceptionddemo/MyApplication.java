package com.example.zsk.uncaughtexceptionddemo;

import android.app.Application;

/**
 * @author ZSK
 * @date 2018/1/15
 * @function
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}
