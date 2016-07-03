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

    private List<MusicInstrument> selectInstruments(int summary, String name)
            throws RangeException, UnknownInstrumentException {

        if (summary < 0 || summary > countByName(name)) {
            throw new RangeException(summary);
        }
        List<MusicInstrument> selected = new ArrayList<>();
        boolean isAvailable = false;
        for (MusicInstrument instrument : instrumentsList) {
            String tmp = instrument.getName();
            if (summary == 0) {
                isAvailable = true;
                break;
            } else if (tmp.equals(name)) {
                selected.add(instrument);
                summary--;
                isAvailable = true;
            }

        }
        if (!isAvailable) {
            throw new UnknownInstrumentException(name);
        }
        return selected;

    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order)
            throws RangeException, UnknownInstrumentException {

        List<MusicInstrument> prepared = new ArrayList<>();
        Set<String> names = order.keySet();

        for (String name : names) {
            prepared.addAll(selectInstruments(order.get(name), name));
            instrumentsList.removeAll(prepared);
        }
        return prepared;
    }


    public List<MusicInstrument> getInstrumentsList() {
        return instrumentsList;
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
