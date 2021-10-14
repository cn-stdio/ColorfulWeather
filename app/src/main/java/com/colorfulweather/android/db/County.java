package com.colorfulweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author Seaguller
 * @date 2021/10/14 16:32
 * @Description
 */
public class County extends DataSupport {

    /**
     * 县ID
     */
    private int id;

    /**
     * 县名字
     */
    private String countyName;

    /**
     * 县对应天气ID
     */
    private String weatherId;

    /**
     * 县所属城市的ID值
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
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
