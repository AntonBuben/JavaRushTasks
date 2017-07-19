package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        if (checkEvent(num)) {
            switch (valued(num)) {
                case 1:
                    System.out.println("четное однозначное число");
                    break;
                case 2:
                    System.out.println("четное двузначное число");
                    break;
                case 3:
                    System.out.println("четное трехзначное число");
                    break;
            }

        } else {
            switch (valued(num)) {
                case 1:
                    System.out.println("нечетное однозначное число");
                    break;
                case 2:
                    System.out.println("нечетное двузначное число");
                    break;
                case 3:
                    System.out.println("нечетное трехзначное число");
                    break;
            }
        }


    }

    public static boolean checkEvent(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static int valued(int num) {
        int n = 0;
        if (0 < num && num < 10) {
            n = 1;
        } else if (10 <= num && num < 100) {
            n = 2;
        } else if (100 <= num && num < 1000) {
            n = 3;
        }
        return n;
    }
}
