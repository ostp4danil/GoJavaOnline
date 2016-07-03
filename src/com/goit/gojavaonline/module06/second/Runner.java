package com.goit.gojavaonline.module06.second;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runner {
    public static void main(String[] args) throws RangeException, UnknownInstrumentException {


        List<MusicInstrument> firstInstrumentsPack = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            firstInstrumentsPack.add(new Piano("piano"));
            firstInstrumentsPack.add(new Trumpet("trumpet"));
            firstInstrumentsPack.add(new Guitar("guitar"));
        }

        MusicShop firstMusicShop = new MusicShop(firstInstrumentsPack);
        Map<String, Integer> order = new HashMap<>();
        System.out.println("Now avaliable: " + firstMusicShop.getInstrumentsList()+"\n");

        order.put("guitar",3);
        order.put("trumpet", 4);
        order.put("piano", 1);
        List<MusicInstrument> takenOrder;
        takenOrder = firstMusicShop.prepareInstruments(order);
        System.out.println("You ordered: " + takenOrder);
        System.out.println("Now available: " + firstMusicShop.getInstrumentsList());
        order.clear();


        order.put("guitar", 1);
        order.put("trumpet", 1);
        order.put("piano", 1);
        takenOrder = firstMusicShop.prepareInstruments(order);
        System.out.println("\nYou ordered: " + takenOrder);
        System.out.println("Now available: " + firstMusicShop.getInstrumentsList());
        order.clear();
    }
}
