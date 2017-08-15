package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
3. Программа должна выводить данные на экран.
4. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        ArrayList<Integer> numbers = new ArrayList<>();
        while (readerFile.ready()) {
            //int i  = readerFile.read();
            Integer i = Integer.parseInt(readerFile.readLine());
            if (i % 2 == 0)
                numbers.add(i);
        }

        Collections.sort(numbers);

        for (Integer i : numbers)
            System.out.println(i);


        reader.close();
        readerFile.close();
    }
}
