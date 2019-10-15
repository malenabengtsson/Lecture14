package com.company;

public class Student {
    private String name;
    private int age;

    Student (String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Name: " + name + ". Age: " + age;
    }
}
