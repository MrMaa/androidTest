package com.ma.androidtest.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名：androidTest
 * 包名：com.ma.androidtest.db
 * 文件名：Province
 * 创建者：Mr.Ma
 * 创建时间：2018/11/11 21:31
 * 描述：TODO
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
