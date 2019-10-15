package com.company;

import java.util.Scanner;

public class Task {


    public static <T> T[] createArray(T param1, T param2, T param3, T[] emptyArr) {
        emptyArr[0] = param1;
        emptyArr[1] = param2;
        emptyArr[2] = param3;
        return emptyArr;
    }

    public static <T extends hasDescription> T showMenuAndGetChoice(T [] enumValues){

        System.out.println("Welcome to the bank.\nMake a choice:\n-----");
        int i=1;
        for (T enumValue : enumValues){
            System.out.println(i+ ". " + enumValue.getInterface());
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        int choiceIndex = scanner.nextInt();
        return enumValues[choiceIndex-1];
    }
}

