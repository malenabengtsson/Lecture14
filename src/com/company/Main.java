package com.company;

public class Main {

    public static void main(String[] args) {
      /*  Integer emptyIntArr[] = new Integer[3];
        Integer resultInt[] = Task.createArray((Integer)1,(Integer)2,(Integer)3, emptyIntArr);
        System.out.println(resultInt[0] + " " + resultInt[1]+ " " + resultInt[2]);

        String emptyStringArr[] = new String[3];
        String resultString[] = Task.createArray("Hello","Cool","World", emptyStringArr);
        System.out.println(resultString[0] + " " + resultString[1]+ " " + resultString[2]);

        Task task = new Task();
        task.showMenuAndGetChoice(MainMenu.values());
        task.showMenuAndGetChoice(CustomerMenu.values());
*/
        Student student = new Student("Anna", 45);
        Student student2 = new Student("Karl", 45);
        GenericStorage genericStorage = new GenericStorage(student, student2, 3);
        //System.out.println(genericStorage.getValue2());
       // System.out.println(genericStorage.getValue1());
        genericStorage.addToArray(student2);
        genericStorage.addToArray(student);
        System.out.println(genericStorage.getElement(1));
        System.out.println(genericStorage.getElement(5));


    }


}

