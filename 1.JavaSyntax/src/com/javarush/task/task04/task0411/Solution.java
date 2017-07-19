package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        if (month == 12){
            month= 0;
        }
        if (0 <= month && month <6){
            if (month <= 2)
                System.out.println("зима");
            else
                System.out.println("весна");
        } else
            if (month >=9)
                System.out.println("осень");
            else
                System.out.println("лето");


    }
}