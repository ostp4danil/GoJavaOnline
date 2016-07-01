package com.goit.gojavaonline.module06.second;

import java.util.*;

/**
 * Created by Danil-MAC on 6/29/16.
 */

public class Order {

    private Map<String, Integer> order = new HashMap<String, Integer>();
    private List<MusicInstrument> availableToOrder = new ArrayList<MusicInstrument>();


    public void createOrder(MusicShop currentMusicShop) {
        System.out.println("Hello! You are in order creating tool!");
        System.out.println("To cancel orders write \"stop\"");
        Scanner scanner = new Scanner(System.in);
        String stopper = "";
        while (!stopper.equals("stop")) {
            order.put("Guitar", 3);
            order.put("Trumpet", 2);
            order.put("Piano", 1);

            availableToOrder = currentMusicShop.prepareInstruments(order);
            stopper = scanner.next();

        }

    }
}
