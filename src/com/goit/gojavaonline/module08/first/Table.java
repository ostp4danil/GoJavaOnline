package com.goit.gojavaonline.module08.first;

import java.util.Collection;

/**
 * Created by Danil-MAC on 7/7/16.
 */
public class Table {

    private Collection<File> collection;

    public Table(Collection collection){
        this.collection=collection;
    }


    public void printAudioFileTable(Collection collection){

        System.out.println(collection.toString());
    }
}
