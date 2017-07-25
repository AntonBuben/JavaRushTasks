package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 1; i < 9; i++) {
            map.put("Name" + i, new Date("JUNE " + i + " 1980"));
        }
        map.put("Name10", new Date("SEPTEMBER 25 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        {
            ArrayList<String> temp = new ArrayList<String>();
            for (Map.Entry<String, Date> pair : map.entrySet()) {
                int month = pair.getValue().getMonth();
                if (4 < month && month < 8) {
                    temp.add(pair.getKey());
                }
            }
            for (String s : temp) {
                map.remove(s);
            }
        }
    }

    public static void main(String[] args) {

    }
}
