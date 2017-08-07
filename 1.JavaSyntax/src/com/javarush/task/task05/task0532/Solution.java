package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        //напишите тут ваш код
        int n = Integer.MIN_VALUE;
        while (n <= 0){
        n = Integer.parseInt(reader.readLine());
        }
        maximum = Integer.parseInt(reader.readLine());
        int temp;
        for (int i = 1; i < n; i++) {
            temp = Integer.parseInt(reader.readLine());
            if (maximum < temp) {
                maximum = temp;
            }
        }

        System.out.println(maximum);
    }
}
