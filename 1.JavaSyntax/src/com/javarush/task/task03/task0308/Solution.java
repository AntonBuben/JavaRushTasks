package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int mult = 1;
        for (int i = 2; i < 11; i++) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
