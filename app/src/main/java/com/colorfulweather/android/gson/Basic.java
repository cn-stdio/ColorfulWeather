package com.colorfulweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Seaguller
 * @date 2021/10/15 16:26
 * @Description
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
