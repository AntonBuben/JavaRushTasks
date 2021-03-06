package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
Требования:
1. В классе Solution должны быть реализованы статические методы initList(List list), printListValues(List list), processCastedObjects(List list).
2. Метод initList должен заполнять полученный список произвольными значениями.
3. Метод printListValues должен выводить содержимое полученного списка на экран.
4. Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        //3
        initList(list);

        //4 - Исправь 2 ошибки
        printListValues(list);

        //5

    }

    public static void initList(List list){
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }
    public static void printListValues(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void processCastedObjects(List list){
        for (Object object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
