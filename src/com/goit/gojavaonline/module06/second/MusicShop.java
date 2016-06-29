package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Map ;
import java.util.List;
import java.util.Scanner;

abstract class MusicShop {


    private static List<MusicInstrument> availableInstuments = new ArrayList<MusicInstrument>();
    private static List<MusicInstrument> sentInstruments;


    public static void showSent(List<MusicInstrument> ){


    }

    public static void addInstuments(){
        System.out.println("!INSTUMENTS ADDNIG SYSTEM!");
        System.out.println("(to stop adding type \"stop\")\n");
        Scanner scanner = new Scanner(System.in);
        boolean stopper = false;
        while (!stopper) {
            System.out.println("Adding instrument name (available Piano, Trumpet, Guitar): ");
            String chooser = scanner.next();
            switch (chooser) {
                case "Piano":
                    availableInstuments.add(new Piano(chooser));
                    break;
                case "Trumpet":
                    availableInstuments.add(new Trumpet(chooser));
                    break;
                case "Guitar":
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

    public static List<MusicInstrument> prepareInstruments(Map<String, Integer> order){

        if (order.get("guitar")<=()
                && order.get("piano"<=MusicInstrument.getElementsValue())
                && order.get("trumpet"))
        for (int elementCode = 1; elementCode<4; elementCode++){
            for(int i=0; i<MusicInstrument.getElementsValue(); i++){

            }
        }



    }

    public static void showInstruments(){
        System.out.println(availableInstuments.toString());

    }


}
