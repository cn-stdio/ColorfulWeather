package com.colorfulweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Seaguller
 * @date 2021/10/15 16:37
 * @Description
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
