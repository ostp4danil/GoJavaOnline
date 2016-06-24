package com.goit.gojavaonline.module03.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Rose extends Flower {
    private int valueOfRoses;

    public int getValueOfAllRosres(){
        return RoseBush.getValueOfRoseBush()+valueOfRoses;
    }
}
