package com.colorfulweather.android.gson;

/**
 * @author Seaguller
 * @date 2021/10/15 16:31
 * @Description
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
