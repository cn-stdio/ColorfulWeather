package com.colorfulweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author Seaguller
 * @date 2021/10/14 16:31
 * @Description
 */
public class City extends DataSupport {

    /**
     * 城市ID
     */
    private int id;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 城市编号
     */
    private int cityCode;

    /**
     * 当前市所属省的ID值
     */
    private int provinceId;

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
}
