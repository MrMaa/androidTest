package com.ma.androidtest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.util
 * 文件名：HttpUtil
 * 创建者：Mr.Ma
 * 创建时间：2018/11/11 21:51
 * 描述：TODO
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
