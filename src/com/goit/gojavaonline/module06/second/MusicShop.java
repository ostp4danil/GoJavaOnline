package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Set;

class MusicShop {


    private List<MusicInstrument> instrumentsList = new ArrayList<>();


    public MusicShop(List<MusicInstrument> availableInstruments) {

        this.instrumentsList = availableInstruments;
    }

    private List<MusicInstrument> addToOrder(int currentValue, String currentName)
            throws RangeException, UnknownInstrumentException {

        if (currentValue < 0 || currentValue > countByName(currentName)) {
            throw new RangeException(currentValue);
        }
        List<MusicInstrument> order = new ArrayList<>();
        boolean isAvaliable = false;
        for (MusicInstrument instrument : instrumentsList) {
            String tmp = instrument.getName();
            if (currentValue == 0) {
                isAvaliable = true;
                break;
            } else if (tmp.equals(currentName)) {
                order.add(instrument);
                currentValue--;
                isAvaliable = true;
            }

        }
        if (!isAvaliable) {
            throw new UnknownInstrumentException(currentName);
        }
        return order;

    }


    public List<MusicInstrument> getInstrumentsList() {
        return instrumentsList;
    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order)
            throws RangeException, UnknownInstrumentException {

        List<MusicInstrument> prepared = new ArrayList<>();
        Set<String> names = order.keySet();

        for (String name : names) {
            prepared.addAll(addToOrder(order.get(name), name));
            instrumentsList.removeAll(prepared);
        }
        return prepared;
    }


    private int countByName(String name) {
        int value = 0;
        for (MusicInstrument instrument : instrumentsList) {
            if (instrument.getName().equals(name)) {
                value++;
            }
        }
        return value;
    }

}
