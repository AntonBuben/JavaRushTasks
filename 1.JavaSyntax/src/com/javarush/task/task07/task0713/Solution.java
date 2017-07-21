package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        final int SIZE_ARRAY = 20;

        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < SIZE_ARRAY; i++) {
            listMain.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (Integer s : listMain) {
                if (s % 3 == 0)
                    list1.add(s);
                if (s % 2 == 0)
                    list2.add(s);
                if (s % 3 != 0 && s % 2 != 0)
                    list3.add(s);
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }


    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer s : list) {
            System.out.println(s);
        }
    }
}
