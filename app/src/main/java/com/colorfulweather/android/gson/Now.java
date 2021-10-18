package com.colorfulweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Seaguller
 * @date 2021/10/15 16:33
 * @Description
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
