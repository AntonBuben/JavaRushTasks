package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, sum = 0, itr = 0;
        while (num != -1) {
            num = Integer.parseInt(bufferedReader.readLine());
            if (num == -1) {
                System.out.println((double)sum/itr);
            }
            sum+=num;
            itr++;
        }

    }
}

