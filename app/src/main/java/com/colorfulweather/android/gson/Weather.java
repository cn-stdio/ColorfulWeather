package com.colorfulweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Seaguller
 * @date 2021/10/15 16:25
 * @Description
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
