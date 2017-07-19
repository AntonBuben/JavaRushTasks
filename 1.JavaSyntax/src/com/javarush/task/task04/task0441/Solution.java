package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b && b == c) {
            System.out.println(a | b | c);
        } else {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(b);
                } else{
                    System.out.println(c);
                }
            }
            if (b > a && b > c) {
                if (a > c) {
                    System.out.println(a);
                } else{
                    System.out.println(c);
                }
            }
            if (c > a && c > b) {
                if (a > b) {
                    System.out.println(a);
                } else{
                    System.out.println(b);
                }
            }

        }
    }

}

