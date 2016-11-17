package com.huihui.mvpdr.data.api;

import com.huihui.mvpdr.model.User;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Administrator on 2016/11/17 0017.
 */

public interface ApiService {
    @GET("/users")
    public void getUsers(Callback<List<User>> callback);
}
