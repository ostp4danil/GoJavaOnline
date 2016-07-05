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

    public boolean isValid(final String name, final int amount) throws UnknownInstrumentException, RangeException {
        for (MusicInstrument instrument : instrumentsList) {
            String instrumentName = instrument.getName();
            if (instrumentName.equals(name)) {
                if (amount > 0 && amount <= countByName(name)) {
                    return true;
                } else {
                    throw new RangeException(amount, name);
                }
            }
        }
        throw new UnknownInstrumentException(name);
    }

    private List<MusicInstrument> selectInstruments(final int amount, final String name) {

        int counter = amount;
        List<MusicInstrument> selected = new ArrayList<>();
        for (MusicInstrument instrument : instrumentsList) {
            String currentName = instrument.getName();
            if (counter == 0) {
                break;
            } else if (currentName.equals(name)) {
                selected.add(instrument);
                counter--;
            }

        }
        return selected;

    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order)
            throws UnknownInstrumentException, RangeException {

        List<MusicInstrument> prepared = new ArrayList<>();
        Set<String> names = order.keySet();

        for (String name : names) {

            if (isValid(name, order.get(name))) {
                prepared.addAll(selectInstruments(order.get(name), name));
                instrumentsList.removeAll(prepared);
            }

        }
        return prepared;
    }


    public String showInstruments() {
        String instrumentString = "";
        int count = 0;
        int sameNames = 1;
        while (count < instrumentsList.size() - 1) {
            if (instrumentsList.get(count).getName().equals(instrumentsList.get(count + 1).getName())) {
                sameNames++;
            } else {
                instrumentString += instrumentsList.get(count).getName() + ": " + sameNames + ",\t";
                sameNames = 1;
            }
            count++;
        }
        instrumentString += instrumentsList.get(count - 1).getName() + ": " + sameNames + ",\t";
        return instrumentString;
    }


    private int countByName(String name) {
        int count = 0;
        for (MusicInstrument instrument : instrumentsList) {
            if (instrument.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

}
