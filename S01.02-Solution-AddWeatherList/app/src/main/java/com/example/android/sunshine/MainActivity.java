/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Done (1) Create a field to store the weather display TextView
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        String[] dummyWeatherData = {

                "Today Feb 1 - Clear - 20°F/40°F",
                "Tomorrow Feb 2 - Cloudy - 30°F/40°F",
                "Saturday Feb 3 - Clear - 20°F/40°F",
                "Sunday Feb 4 - Rain - 40°F/50°F",
                "Monday Feb 5 - Clear - 20°F/40°F",
                "Tuesday Feb 6 - Snow possible - 20°F/30°F",
                "Wednesday Feb 7 - Clear - 40°F/50°F",
                "Thursday Feb 8 - Sunny - 50°F/60°F",

        };
        // Done (2) Use findViewById to get a reference to the weather display TextView

        // Done (3) Create an array of Strings that contain fake weather data

        for (String dummyWeatherDay : dummyWeatherData){
            mWeatherTextView.append(dummyWeatherDay + "\n\n\n");
        }

        // Done (4) Append each String from the fake weather data array to the TextView
    }
}
