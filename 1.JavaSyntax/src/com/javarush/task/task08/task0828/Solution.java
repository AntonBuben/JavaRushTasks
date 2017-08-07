package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        HashMap<Integer, String> monthesOfYear = new HashMap<>();
        monthesOfYear.put(1, "January");
        monthesOfYear.put(2, "February");
        monthesOfYear.put(3, "March");
        monthesOfYear.put(4, "April");
        monthesOfYear.put(5, "May");
        monthesOfYear.put(6, "June");
        monthesOfYear.put(7, "July");
        monthesOfYear.put(8, "August");
        monthesOfYear.put(9, "September");
        monthesOfYear.put(10, "October");
        monthesOfYear.put(11, "November");
        monthesOfYear.put(12, "December");

        Iterator<Map.Entry<Integer, String>> iterator = monthesOfYear.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<Integer, String> pair = iterator.next();
            Integer numberOfMonth = pair.getKey();            //ключ
            String nameOfMonth = pair.getValue();        //значение
            if (nameOfMonth.equals(month))
                System.out.println(month + " is " + numberOfMonth + " month");
        }


    }
}
