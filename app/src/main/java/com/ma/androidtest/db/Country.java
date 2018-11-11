package com.ma.androidtest.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.db
 * 文件名：Country
 * 创建者：Mr.Ma
 * 创建时间：2018/11/11 21:35
 * 描述：TODO
 */
public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
