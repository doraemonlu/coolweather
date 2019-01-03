package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private int cityId;
    private String countyName;
    private int weatherId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }
    public void setCityId(int id) {
        this.cityId = id;
    }
    public String getCountyName() {
        return countyName;
    }
    public void setCountyName(String name) {
        this.countyName = Name;
    }
    public int getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(int id) {
        this.weatherId = id;
    }
}
