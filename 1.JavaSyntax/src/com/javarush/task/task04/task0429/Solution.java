package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int count1 = 0;
        int count2 = 0;

        if (a > 0) count1++;
        else if (a < 0) count2++;
        if (b > 0) count1++;
        else if (b < 0) count2++;
        if (c > 0) count1++;
        else if (c < 0) count2++;

        System.out.println("количество отрицательных чисел:"+" "+count2);
        System.out.println("количество положительных чисел:"+ " "+ count1);

    }
}
