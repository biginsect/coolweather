package com.biginsect.coolweather.model;

/**
 * Created by administration on 2016/8/14.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countryName) {
        this.countyName = countryName;
    }

    public void setCountyCode(String countryCode) {
        this.countyCode = countryCode;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public int getCityId() {
        return cityId;
    }
}
