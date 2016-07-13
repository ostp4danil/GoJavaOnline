package com.goit.gojavaonline.module04.second;

/**
 * Created by Danil-MAC on 23.06.16.
 */
class TempConvertion {

    public static float convertToCelsius(float t){
        return  (float) ((t-32)/1.8);
    }

    public static float convertToFahrenheit(float t){
        return  (float) ((t*1.8)+32);
    }

}
