package com.huihui.mvpdr;

import android.app.Application;
import android.content.Context;

import com.huihui.mvpdr.data.AppServiceModule;
import com.huihui.mvpdr.data.api.ApiServiceModule;

/**
 * Created by Administrator on 2016/11/17 0017.
 */

public class AppApplication extends Application {

    private AppComponent appComponent;


    public static AppApplication get(Context context) {
        return (AppApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();


        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .appServiceModule(new AppServiceModule())
                .build();


    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
