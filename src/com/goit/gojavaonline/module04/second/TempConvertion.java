package com.goit.gojavaonline.module04.second;

/**
 * Created by Danil-MAC on 23.06.16.
 */
public class TempConvertion {

    public static double convertToCelsius(double t){
        return   ((t-32)/1.8);
    }

    public static double convertToFahrenheit(double t){
        return ((t*1.8)+32);
    }

}
