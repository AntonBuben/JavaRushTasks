package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        int min = Integer.MAX_VALUE;
        for (String s : list){
            if (s.length() < min)
                min = s.length();
        }
        for (String s : list){
            if (s.length() == min)
                System.out.println(s);
        }
    }
}
