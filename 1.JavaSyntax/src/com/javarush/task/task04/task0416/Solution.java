package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(bufferedReader.readLine());
        if ((int)t%5==4)
            System.out.println("красный");
        else {
            if ((int)t%5==3) {
                System.out.println("желтый");
            }
            else {
                System.out.println("зелёный");
            }
        }

    }
}