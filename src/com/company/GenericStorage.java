package com.company;

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
}
