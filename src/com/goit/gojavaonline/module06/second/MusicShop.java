package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;

class MusicShop {


    private List<MusicInstrument> availableInstruments = new ArrayList<>();


    public MusicShop(List<MusicInstrument> availableInstruments) {

        this.availableInstruments = availableInstruments;
    }

    private List<MusicInstrument> listingInstruments(int toRemove, String nameOfRemove) {

        List<MusicInstrument> order = new ArrayList<>();
        for (MusicInstrument instrument : availableInstruments) {
            String tmp = instrument.getName();
            if (toRemove == 0) {
                break;
            }

            if (tmp.equals(nameOfRemove)) {
                order.add(instrument);
                toRemove--;
            }

        }
        return order;


    }


    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) {

        List<MusicInstrument> sent = new ArrayList<>();
        Set<String> keyset = order.keySet();
        String[] names = new String[keyset.size()];
        keyset.toArray(names);
        for (int i = 0; i < names.length; i++) {
            sent.addAll(listingInstruments(order.get(names[i]), names[i]));
        }
        availableInstruments.removeAll(sent);
        return sent;
    }

    public List<MusicInstrument> getAvailableInstruments() {
        return availableInstruments;
    }
}
