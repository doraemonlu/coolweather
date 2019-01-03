package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int id) {
        this.provinceCode = id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String name) {
        this.provinceName = name;
    }

}
