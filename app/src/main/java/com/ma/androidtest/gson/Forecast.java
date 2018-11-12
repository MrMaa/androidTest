package com.ma.androidtest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.gson
 * 文件名：Forecast
 * 创建者：Mr.Ma
 * 创建时间：2018/11/12 16:19
 * 描述：TODO
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_id")
        public String info;
    }



}
