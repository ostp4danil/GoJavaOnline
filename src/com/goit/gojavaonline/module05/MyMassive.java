package com.goit.gojavaonline.module05;

import java.util.Scanner;

/**
 * Created by Danil-MAC on 23.06.16.
 */
public class MyMassive {
    public static void main(String[] args) {
        //int valuable = new Scanner();
        final int MASS_SIZE = 15;

        int[] myMass = new int[MASS_SIZE];
        for (int i = 0; i<MASS_SIZE; i++){
            myMass[i]= (int) Math.random();

            System.out.printf(myMass[i] + " ");
        }



    }
}
