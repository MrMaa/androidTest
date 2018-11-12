package com.ma.androidtest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.gson
 * 文件名：Basic
 * 创建者：Mr.Ma
 * 创建时间：2018/11/12 15:53
 * 描述：TODO
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public  String weaterId;

    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
