package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        final int SIZE_ARRAY = 10;

        ArrayList<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < SIZE_ARRAY; i++) {
            list.add(bufferedReader.readLine());
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (String s : list){
            if (s.length() < min)
                min = s.length();
            if (s.length() > max)
                max = s.length();
        }
        for (String s : list){
            if (s.length() == min || s.length() == max){
                System.out.println(s);
                break;
            }
        }
    }
}
