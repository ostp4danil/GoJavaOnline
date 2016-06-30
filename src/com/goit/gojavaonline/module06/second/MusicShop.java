package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

abstract class MusicShop {


    private static List<MusicInstrument> availableInstuments = new ArrayList<MusicInstrument>();
    private static List<MusicInstrument> sentInstruments = new ArrayList<MusicInstrument>();




    public static void addInstuments() {
        System.out.println("!INSTUMENTS ADDNIG SYSTEM!");
        System.out.println("(to stop adding type \"stop\")\n");
        Scanner scanner = new Scanner(System.in);
        boolean stopper = false;
        while (!stopper) {
            System.out.println("Adding instrument name (available Piano, Trumpet, Guitar): ");
            String chooser = scanner.next();
            switch (chooser) {
                case "piano":
                    availableInstuments.add(new Piano(chooser));
                    break;
                case "trumpet":
                    availableInstuments.add(new Trumpet(chooser));
                    break;
                case "guitar":
                    availableInstuments.add(new Guitar(chooser));
                    break;
                case "stop":
                    stopper = true;
                    break;
                default:
                    System.out.println("Wrong instrument name! Enter correct data");
                    break;
            }

        }
    }

    public static List<MusicInstrument> prepareInstruments(Map<String, Integer> order) {

        for (int i=0; i<order.get("guitar"); i++){
            if (availableInstuments.get(i).getName().equals("guitar")){
                sentInstruments.add(availableInstuments.get(i));
                MusicInstrument.setElementsValue(MusicInstrument.getElementsValue()-1);
                availableInstuments.remove(i);
            }
        }

        for (int i=0; i<order.get("piano"); i++){
            if (availableInstuments.get(i).getName().equals("piano")){
                sentInstruments.add(availableInstuments.get(i));
                MusicInstrument.setElementsValue(MusicInstrument.getElementsValue()-1);
                availableInstuments.remove(i);
            }
        }

        for (int i=0; i<order.get("trumpet"); i++){
            System.out.println(availableInstuments.get(i).getName());
            if (availableInstuments.get(i).getName().equals("trumpet")){
                sentInstruments.add(availableInstuments.get(i));
                MusicInstrument.setElementsValue(MusicInstrument.getElementsValue()-1);
                availableInstuments.remove(i);
            }
        }

        return sentInstruments;

    }

    public static void showAll(){
        System.out.println("All instruments: ");
        //int i=0;
        for (int i=0; i<availableInstuments.size(); i++){
            System.out.println(availableInstuments.get(i).getName());
        }
    }

    public static void showOrder(){
        System.out.println("Your order: ");
        for (int i=0; i<sentInstruments.size(); i++){
            System.out.println(sentInstruments.get(i).getName());
        }
    }


}
