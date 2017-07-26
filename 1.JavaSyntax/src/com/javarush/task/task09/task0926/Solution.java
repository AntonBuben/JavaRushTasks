package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Требования:
1. Метод createList должен объявлять и инициализировать переменную типа ArrayList.
2. Метод createList должен возвращать созданный список.
3. Метод createList должен добавлять в список 5 элементов.
4. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
5. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{1, 2, 3, 4, 5});
        list.add(new int[]{1, 2});
        list.add(new int[]{1, 2, 3, 4});
        list.add(new int[]{1, 2, 3, 4, 5, 6, 7});
        list.add(new int[]{});
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
