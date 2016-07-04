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

    public boolean isValid(String name) {
        for (MusicInstrument instrument : instrumentsList) {
            String tmp = instrument.getName();
            if (tmp.equals(name)) {
                return true;
            }

        }
        return false;

    }

    private List<MusicInstrument> selectInstruments(int sum, String name) {

        List<MusicInstrument> selected = new ArrayList<>();
        for (MusicInstrument instrument : instrumentsList) {
            String tmp = instrument.getName();
            if (sum == 0) {
                break;
            } else if (tmp.equals(name)) {
                selected.add(instrument);
                sum--;
            }

        }
        return selected;

    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order)
            throws RangeException, UnknownInstrumentException {

        List<MusicInstrument> prepared = new ArrayList<>();
        Set<String> names = order.keySet();

        for (String name : names) {
            if (isValid(name)) {
                prepared.addAll(selectInstruments(order.get(name), name));
                instrumentsList.removeAll(prepared);
            } else{
                if (order.get((name))>=0 && order.get(name)<=countByName(name)){
                    throw new RangeException(order.get(name));
                }
                    throw new UnknownInstrumentException(name);
            }
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
