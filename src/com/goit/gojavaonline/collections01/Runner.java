package com.goit.gojavaonline.collections01;

/**
 * Created by Danil-MAC on 7/7/16.
 */
public class Runner {
    public static void main(String[] args) {
        MyArrayList myArray = new MyArrayList();
        if (myArray.isEmpty()){
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
        for (int i=0; i<40; i++) {
            myArray.add(i);
            System.out.println(myArray.get(i));
        }

        System.out.println("In 24 is: " + myArray.get(24));
    }
}
