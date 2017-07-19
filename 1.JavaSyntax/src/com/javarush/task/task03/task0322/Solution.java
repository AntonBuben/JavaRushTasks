package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //Scanner scanner = new Scanner(System.in);
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String name1 = scanner.readLine();
        String name2 = scanner.readLine();
        String name3 = scanner.readLine();
        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}