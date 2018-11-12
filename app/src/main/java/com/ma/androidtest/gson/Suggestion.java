package com.ma.androidtest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.gson
 * 文件名：Suggestion
 * 创建者：Mr.Ma
 * 创建时间：2018/11/12 16:10
 * 描述：TODO
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }


}
