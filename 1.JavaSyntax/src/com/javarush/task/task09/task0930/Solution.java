package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        int num = 0;
        for (String x: array)   {
            if (isNumber(x)) num++;
        }
        String[] letters = new String[array.length-num];
        int[] numbers = new int[num];
        int s1 = 0;
        int s2 = 0;
        for (int i=0; i<array.length; i++)  {
            if (isNumber(array[i])) {
                numbers[s1] = Integer.parseInt(array[i]);
                s1++;
            }
            else {
                letters[s2] = array[i];
                s2++;
            }
        }
        isGreaterThan(array[1],array[2]);
        Arrays.sort(letters);
        Arrays.sort(numbers);
        String[] numCopy = new String[numbers.length];
        for (int i=0;i<numbers.length;i++)  {
            numCopy[i] = String.valueOf(numbers[numbers.length-i-1]);
        }
        s1 = 0;
        s2 = 0;
        for (int i=0;i<array.length;i++)    {
            if (isNumber(array[i])) {
                array[i] = numCopy[s2];
                s2++;
            }
            else  {
                array[i] = letters[s1];
                s1++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
