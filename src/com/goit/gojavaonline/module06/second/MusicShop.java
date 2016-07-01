package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

class MusicShop {


    private List<MusicInstrument> availableInstruments = new ArrayList<MusicInstrument>();


    public void pushInstrument(MusicInstrument instrument, int value) {
        for(int i=0; i<value; i++) {
            availableInstruments.add(instrument);
        }
    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) {

        int g = order.get("guitar");
        int p = order.get("piano");
        int t = order.get("trumpet");

        for (int i = 0; i < availableInstruments.size(); i++) {
            if (availableInstruments.get(i).getName().equals("guitar")) {
                availableInstruments.remove(i);
                g--;
                if (g == 0) {
                    break;
                }
            }
        }

        for (int i = 0; i < availableInstruments.size(); i++) {
            if (availableInstruments.get(i).getName().equals("piano")) {
                availableInstruments.remove(i);
                p--;
                if (p == 0) {
                    break;
                }
            }
        }

        for (int i = 0; i < availableInstruments.size(); i++) {
            if (availableInstruments.get(i).getName().equals("trumpet")) {
                availableInstruments.remove(i);
                t--;
                if (t == 0) {
                    break;
                }
            }
        }

        return availableInstruments;

    }

    public void showAll() {
        System.out.println("All instruments: ");
        //int i=0;
        for (int i = 0; i < availableInstruments.size(); i++) {
            System.out.println(availableInstruments.get(i).getName());
        }
    }


}
