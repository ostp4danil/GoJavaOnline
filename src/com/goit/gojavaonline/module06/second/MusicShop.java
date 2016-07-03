package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Set;

class MusicShop {


    private List<MusicInstrument> instrumentsList = new ArrayList<>();
    private String avaliableString;


    public MusicShop(List<MusicInstrument> availableInstruments) {

        this.instrumentsList = availableInstruments;
    }

    private List<MusicInstrument> checkOrder(int currentValue, String currentName) {
        try {
            if (currentValue < 0 || currentValue > countByName(currentName)) {
                throw new RangeException(currentValue);
            }
            List<MusicInstrument> order = new ArrayList<>();
            boolean instrumentChecker = false;
            for (MusicInstrument instrument : instrumentsList) {
                String tmp = instrument.getName();
                if (currentValue == 0) {
                    instrumentChecker = true;
                    break;
                } else if (tmp.equals(currentName)) {
                    order.add(instrument);
                    currentValue--;
                    instrumentChecker = true;
                }

            }
            if (!instrumentChecker) {
                throw new UnknownInstrumentException(currentName);
            }
            return order;
        } catch (UnknownInstrumentException e) {
            System.out.println("ERROR: Instrument " + e.getInstrumentName()
                    + " not found. Order will be canceled!");
        } catch (RangeException e) {
            System.out.println("Order range could not be:" + e.getValue() + ".Order will be canceled!");
        }

        return null;
    }


        public List<MusicInstrument> prepareInstruments (Map < String, Integer > order) {
            avaliableString = "Now available:\n";
            List<MusicInstrument> sent = new ArrayList<>();
            Set<String> keyset = order.keySet();

            for (String name : keyset) {
                try {
                    sent.addAll(checkOrder(order.get(name), name));
                    instrumentsList.removeAll(sent);
                   // avaliableString += name + "\t:\t" + countByName(name) + "\n";
                } catch (NullPointerException e) {
                    System.out.println("Make valid order!");
                } finally {
                    avaliableString += name + "\t:\t" + countByName(name) + "\n";
                }

            }
            return sent;
        }

    public String getAvaliableString() {
        return avaliableString;
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
