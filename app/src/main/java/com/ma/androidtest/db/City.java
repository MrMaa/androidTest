package com.ma.androidtest.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.db
 * 文件名：City
 * 创建者：Mr.Ma
 * 创建时间：2018/11/11 21:33
 * 描述：TODO
 */
public class City extends DataSupport {
    private int id;
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private int cityCode;
    private int provinceId;

}
