package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        System.out.print(name+" получает "+Integer.parseInt(number1)+" через "+Integer.parseInt(number2)+" лет.");
    }
}
