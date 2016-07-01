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
            order.put("guitar", 4);
            order.put("trumpet", 6);
            order.put("piano", 2);

            System.out.println("You ordered: " + order.toString());
            availableToOrder = (currentMusicShop.prepareInstruments(order));
            System.out.println("Now, available to order:");

            for(int i=0; i<availableToOrder.size(); i++){
                MusicInstrument current = availableToOrder.get(i);
                if(current.getName().equals("Guitar"))
                    System.out.println;
                System.out.print(availableToOrder.get(i).getName());

            }
            // availableToOrder.add((MusicInstrument)currentMusicShop.prepareInstruments(order));

            stopper = scanner.next();

        }

    }
}
