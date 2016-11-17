package com.huihui.mvpdr;

import android.app.Application;

import com.huihui.mvpdr.data.AppServiceModule;
import com.huihui.mvpdr.data.api.ApiService;
import com.huihui.mvpdr.data.api.ApiServiceModule;
import com.huihui.mvpdr.model.User;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
@Singleton
@Component(modules = {AppModule.class, AppServiceModule.class, ApiServiceModule.class})
public interface AppComponent {

    Application getApplication();

    ApiService getService();

    User getUser();
}
