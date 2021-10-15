package com.colorfulweather.android.util;

import android.text.TextUtils;
import android.util.Log;
import com.colorfulweather.android.db.City;
import com.colorfulweather.android.db.County;
import com.colorfulweather.android.db.Province;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Seaguller
 * @date 2021/10/14 16:48
 * @Description 将服务器响应的JSON数据插入数据库
 */
public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     * @param response 响应信息
     * @return 解析和处理是否成功
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);

                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }

                Log.i("Response", "服务器返回的省级数据解析和处理成功！");

                return true;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        Log.w("Response", "服务器返回的省级数据解析和处理失败！");

        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     * @param response 响应信息
     * @param provinceId 所属省级ID
     * @return 是否解析和处理成功
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);

                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);

                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }

                Log.i("Response", "服务器返回的市级数据解析和处理成功！");
                
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        Log.w("Response", "服务器返回的市级数据解析和处理失败！");
        
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     * @param response 响应信息
     * @param cityId 所属城市ID
     * @return 是否解析和处理成功
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);

                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);

                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }

                Log.i("Response", "服务器返回的县级数据解析和处理成功！");
                
                return true;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        Log.w("Response", "服务器返回的县级数据解析和处理失败！");

        return false;
    }
}
