package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader file = new BufferedReader (new InputStreamReader(new FileInputStream(filename), "windows-1251"));

        while (file.ready()) {
            System.out.println(file.readLine());
        }

        file.close();
        reader.close();


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        InputStream inputStream = new FileInputStream(reader.readLine());
//        //OutputStream outputStream = new PrintStream (System.out);
//
//        while (inputStream.available() > 0){
//            int data = inputStream.read();
//            System.out.print((char)data);
//            //outputStream.write(data);
//        }
//
//        inputStream.close();
//        reader.close();
//        //outputStream.close();

    }
}