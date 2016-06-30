package com.goit.gojavaonline.module06.second;

import java.util.*;

/**
 * Created by Danil-MAC on 6/29/16.
 */
public class Order {

    private static Map<String, Integer> order = new HashMap<String, Integer>();
    private static List<MusicInstrument> tempOrder = new ArrayList<MusicInstrument>();


    public static void createOrder() {
        System.out.println("Hello! You are in order creating tool!");

        Scanner scanner = new Scanner(System.in);
        String stopper = "";
        while (!stopper.equals("stop")) {

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

            tempOrder.add((MusicInstrument) MusicShop.prepareInstruments(order));


        }


    }

}
