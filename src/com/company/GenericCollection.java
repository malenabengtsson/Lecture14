package com.company;

import java.util.Collection;

public class GenericCollection <T extends Collection> {
    private T array;

    public GenericCollection(T emptyCollection){
        this.array = emptyCollection;

    }

    public void addElement (Object element){
        array.add(element);

    }
    public int getSize(){
        return array.size();
    }
}
