package com.ma.androidtest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.gson
 * 文件名：Now
 * 创建者：Mr.Ma
 * 创建时间：2018/11/12 16:06
 * 描述：TODO
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }


}
