package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = reader.readLine();
            if (str.equals("exit")) {
                break;
            } else {
                try {
                    if (str.contains(".")){
                        print(Double.parseDouble(str));
                    }
                    else {
                        int i = Integer.parseInt(str);
                        if (0 < i && i < 128)
                            print((short) i);
                        else if (i <= 0 || 128 <= i)
                            print(i);

                    }
                } catch (NumberFormatException e) {
                    print(str);
                }
            }


        }


    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
