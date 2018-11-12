package com.ma.androidtest.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.gson
 * 文件名：Weather
 * 创建者：Mr.Ma
 * 创建时间：2018/11/12 16:24
 * 描述：TODO
 */
public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
