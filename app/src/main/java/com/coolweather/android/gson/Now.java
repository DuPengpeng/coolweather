package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("temp")
    public String temperature;

    @SerializedName("text")
    public String text_info;

    @SerializedName("windDir")
    public String windDirection;

    public String cloud;
}
