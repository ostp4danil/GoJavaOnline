package com.goit.gojavaonline.module06.second;




public class Runner {
    public static void main(String[] args) {


        MusicShop firstMusicShop = new MusicShop();
        firstMusicShop.pushInstrument(new Piano("Piano"),5);
        firstMusicShop.pushInstrument(new Trumpet("Trumpet"), 5);
        firstMusicShop.pushInstrument(new Guitar("Guitar"), 5);

        Order currentOrder = new Order();
        currentOrder.createOrder(firstMusicShop);

        firstMusicShop.showAll();
    }
}
