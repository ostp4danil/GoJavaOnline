package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Set;

class MusicShop {


    private List<MusicInstrument> availableInstruments = new ArrayList<>();


    public MusicShop(List<MusicInstrument> availableInstruments) {

        this.availableInstruments = availableInstruments;
    }

    private List<MusicInstrument> checkOrder(int currentValue, String currentName) throws UnknownInstrumentException {
        List<MusicInstrument> order = new ArrayList<>();
        boolean instrumentChecker = false;
        for (MusicInstrument instrument : availableInstruments) {
            String tmp = instrument.getName();
            if (currentValue == 0) {
                instrumentChecker = true;
                break;
            }
            if (tmp.equals(currentName)) {
                order.add(instrument);
                currentValue--;
                instrumentChecker = true;
            }

        }
        if (!instrumentChecker) {
            throw new UnknownInstrumentException(currentName);
        }
        return order;

    }


    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) {
        List<MusicInstrument> sent = new ArrayList<>();
        Set<String> keyset = order.keySet();
        String nowAvailable = "";

        try {
            for (String name : keyset) {
                sent.addAll(checkOrder(order.get(name), name));
                availableInstruments.removeAll(sent);
            }
        } catch (UnknownInstrumentException e) {
            System.out.println("\nERROR: Instrument " + e.getInstrumentName()
                    + " not found. Order will be canceled!");
        }


        return sent;
    }


    private int countByName(String name) {
        int value = 0;
        for (MusicInstrument instrument : availableInstruments) {
            if (instrument.getName().equals(name)) {
                value++;
            }
        }
        return value;
    }


    public String showAvailableInstruments() {
        String[] range;
      //  range[0] = "1";
        String available = "Now available:\n";
        for (int i=1; i<availableInstruments.size(); i++) {
            String tempInstrument = availableInstruments.get(i).getName();
            available += "\t" + tempInstrument + "\t:\t" + countByName(tempInstrument);
        }

        return available;
    }
}
