package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a <= 0) throw new Exception();
        int b = Integer.parseInt(reader.readLine());
        if (b <= 0) throw new Exception();
        nod(a, b);
    }

    public static void nod(int a, int b) {
        if (a > b) a = a - b;
        else b = b - a;
        if (b == 0) {
            System.out.println(a);
            return;
        }
        nod(a, b);
    }
}