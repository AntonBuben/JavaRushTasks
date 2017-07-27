package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char array[] = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            if (array[i] == ' ') {
                for (int j = i+1; j < array.length; j++) {
                    System.out.print(array[j]);
                }
            } else{
                for (int j = i; j < array.length; j++) {
                    System.out.print(array[j]);
                }
            }
            System.out.println();
        }

    }
}
