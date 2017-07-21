package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        final int SIZE_ARRAY = 5;

        ArrayList<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < SIZE_ARRAY; i++) {
            list.add(bufferedReader.readLine());
        }
        list.remove(2);

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.get(list.size()-i));
        }
    }
}


