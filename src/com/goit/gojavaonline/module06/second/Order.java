package com.goit.gojavaonline.module06.second;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Danil-MAC on 6/29/16.
 */
public class Order {

    Map<String, Integer> order = new HashMap<String, Integer>();
    private static List<MusicInstrument> sentInstruments;


    public static void createOrder(Map<String, Integer> order) {
        System.out.println("Hello! You are in order creating tool!");

        Scanner scanner = new Scanner(System.in);
        String stopper = "";
        while (!stopper.equals("stop'")) {

            System.out.println("How many Guitars you want to add?");
            int currentAddingInstrument = scanner.nextInt();
            order.put("guitar", currentAddingInstrument);

            System.out.println("How many Trumpets you want to add?");
            currentAddingInstrument = scanner.nextInt();
            order.put("trumpet", currentAddingInstrument);

            System.out.println("How many Pianos you want to add?");
            currentAddingInstrument = scanner.nextInt();
            order.put("piano", currentAddingInstrument);

            System.out.println("Write \"stop\" to cancel.");
            stopper = scanner.next();

            sentInstruments = MusicShop.

        }

    }

}
