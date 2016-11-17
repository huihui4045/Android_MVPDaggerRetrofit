package com.huihui.mvpdr.data;

import com.huihui.mvpdr.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
@Module
public class AppServiceModule {

    @Provides
    User provideUser() {
        User user = new User();
        user.setId("1");
        user.setName("hello world");
        return user;
    }
}
