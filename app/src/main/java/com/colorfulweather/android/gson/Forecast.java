package com.colorfulweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Seaguller
 * @date 2021/10/15 16:39
 * @Description
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;

        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
