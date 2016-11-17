package com.huihui.mvpdr;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/11/17 0017.
 */

public class AppApplication extends Application {

    private AppComponent appComponent;


    public static AppApplication get(Context context){
        return (AppApplication)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();







    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
