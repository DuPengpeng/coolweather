package com.coolweather.android.gson;

import java.util.List;

public class Daily_forecast {

    public String code;

    public List<Daily> daily;

    public class Daily {
        public String fxDate;

        public String tempMax;

        public String tempMin;

        public String textDay;


    }

}
