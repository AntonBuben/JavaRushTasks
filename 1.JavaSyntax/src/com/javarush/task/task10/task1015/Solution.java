package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfList = new ArrayList[3];
        arrayOfList[0] = new ArrayList<String>();
        arrayOfList[1] = new ArrayList<String>();
        arrayOfList[2] = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            arrayOfList[0].add("String"+i);
            arrayOfList[1].add("String"+i);
            arrayOfList[2].add("String"+i);
        }
        return arrayOfList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}