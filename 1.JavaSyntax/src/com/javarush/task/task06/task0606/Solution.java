package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        char a;
        for (int i = 0; i < number.length(); i++) {
            a = number.charAt(i);
            if (a%2==0){
                even = even + 1;
            }
            else {
                odd = odd + 1;
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
