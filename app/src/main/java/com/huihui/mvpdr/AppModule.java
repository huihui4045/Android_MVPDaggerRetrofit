package com.huihui.mvpdr;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Provides;


/**
 * Author: gavin
 * Date: 2016/11/17
 * Time: 18:00
 * Email:2415580905@qq.com
 */
public class AppModule {





    private Application mApplication;


    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Singleton
    @Provides
    Application providesApplication() {
        return mApplication;
    }
}
