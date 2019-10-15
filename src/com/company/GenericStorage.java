package com.company;

import java.util.Collections;

public class GenericStorage<T1, T2> {
    private T1 value1;
    private T2 value2;
    private T1[] value1Array;
    private int i = 0;
    int size;

    GenericStorage(T1 value1, T2 value2, int size) {
        this.value1 = value1;
        this.value2 = value2;
        this.size = size;
        value1Array = (T1[]) new Object[size];


    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public void addToArray(T1 input) {
        if (i < size) {
            value1Array[i] = input;
            i++;
        } else {
            System.out.println("You have exceeded max size of the array, no more space!");
        }
    }

    public T1 getElement(int index) {
        if (index < value1Array.length) {
            return value1Array[index];
        } else {
            System.out.println("Does not exist");
            return null;
        }
    }

    public <T1 extends Number, T2 extends Number> float addNumbers(T1 num1, T2 num2) {
        return num1.floatValue() + num2.floatValue();
    }

    public <T> T[] switchElement(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;

    }

    public <T1 extends Collections, T2 extends Collections> Collections getBiggestCollection(T1 item1, T2 item2) {
        return null;
    }

    public <T extends Collections> Collections copyToOtherCollection(T c1, T c2) {
        T temp = c1;
        c1 = c2;
        c2 = temp;
        return c2;
    }
}



