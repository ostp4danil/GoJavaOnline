package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;

class MusicShop {


    private List<MusicInstrument> availableInstruments = new ArrayList<MusicInstrument>();


    public void pushInstrument(MusicInstrument instrument, int value) {
        for (int i = 0; i < value; i++) {
            availableInstruments.add(instrument);
        }
    }

    public void listingInsruments(int toRemove, String nameOfRemove) {

        for (int i = 0; i < availableInstruments.size(); i++) {
            String tmp = availableInstruments.get(i).getName();
            if (tmp.equals(nameOfRemove)) {
                availableInstruments.remove(i);
                toRemove--;
            }
            if (toRemove==0) {break;}
        }

        // return availableInstruments;


    }


    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) {


        Set keyset = order.keySet();
        String[] names = new String[keyset.size()];
        keyset.toArray(names);
        for (int i = 0; i < names.length; i++) {
            listingInsruments(order.get(names[i]), names[i]);
            //System.out.println(names[0] +  names[1]+ names[2]);
        }
        return availableInstruments;

    }

    public void showAll() {
        System.out.println("All instruments: ");
        for (int i = 0; i < availableInstruments.size(); i++) {
            System.out.println(availableInstruments.get(i).getName() + " ");
        }
    }


}
