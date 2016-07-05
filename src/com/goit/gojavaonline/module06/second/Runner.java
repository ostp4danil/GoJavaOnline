package com.goit.gojavaonline.module06.second;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runner {
    public static void main(String[] args) throws RangeException, UnknownInstrumentException {


        List<MusicInstrument> firstInstrumentsPack = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            firstInstrumentsPack.add(new Piano("piano"));
        }
        for (int i = 0; i < 16; i++) {
            firstInstrumentsPack.add(new Guitar("guitar"));
        }
        for (int i = 0; i < 7; i++) {
            firstInstrumentsPack.add(new Guitar("trumpet"));
        }

        MusicShop firstMusicShop = new MusicShop(firstInstrumentsPack);
        Map<String, Integer> order = new HashMap<>();
        System.out.println("Now avaliable:\n" + firstMusicShop.showInstruments() + "\n");
        List<MusicInstrument> finishedOrder;
        try {
            order.put("guitar", 7);
            order.put("trumpet", 2);
            finishedOrder = firstMusicShop.prepareInstruments(order);
            System.out.println("You ordered: " + finishedOrder);
            System.out.println("Now available:\n" + firstMusicShop.showInstruments());
            order.clear();

            order.put("piano", 1);
            finishedOrder = firstMusicShop.prepareInstruments(order);
            System.out.println("\nYou ordered: " + finishedOrder);
            System.out.println("Now available:\n" + firstMusicShop.showInstruments());
            order.clear();

            order.put("piano", 1);
            order.put("guitar", 9);
            order.put("trumpet", 6);
            finishedOrder = firstMusicShop.prepareInstruments(order);
            System.out.println("\nYou ordered: " + finishedOrder);
            System.out.println("Now available:\n" + firstMusicShop.showInstruments());
            order.clear();
        } catch (RangeException e) {
            System.out.println("\nError! Order canceled. Wrong amount: " + e.getValue() + " of " +e.getName());
        } catch (UnknownInstrumentException e) {
            System.out.println("\nError! Order canceled. Wrong instrument: " + e.getInstrumentName());
        }

    }
}
