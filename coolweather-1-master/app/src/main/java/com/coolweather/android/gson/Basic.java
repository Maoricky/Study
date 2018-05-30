package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")//city表示城市名
    public String cityName;

    @SerializedName("id")//id表示城市对应的天气id
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")//让JSON字段和Java字段之间建立映射关系
        public String updateTime;

    }

}
