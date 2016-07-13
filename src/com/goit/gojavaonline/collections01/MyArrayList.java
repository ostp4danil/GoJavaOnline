package com.goit.gojavaonline.collections01;


public class MyArrayList {
    private Integer size;
    private Integer current = 0;
    private Integer[] array;

    public MyArrayList() {
        size = 10;
        array = new Integer[size];

    }

    public void add(int number) {
        if (current >= size) {
            Integer[] newArray = array.clone();
            size+=10;
            array = new Integer[size];
            for (int i=0; i<newArray.length; i++){
                array[i]=newArray[i];
            }
        }
        array[current] = number;
        current++;
    }

    public int get(int current) {
        return array[current];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (array[0]==null){
            return true;
        } else {
            return false;
        }
    }
}
