package com.ma.androidtest.gson;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.gson
 * 文件名：AQI
 * 创建者：Mr.Ma
 * 创建时间：2018/11/12 16:04
 * 描述：TODO
 */
public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
