package com.colorfulweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author Seaguller
 * @date 2021/10/14 16:43
 * @Description
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
