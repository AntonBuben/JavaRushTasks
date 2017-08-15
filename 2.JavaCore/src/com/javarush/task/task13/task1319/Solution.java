package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
4. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
5. Метод main должен закрывать объект типа BufferedWriter после использования.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));
        String str;
        while (true){
            str = reader.readLine();
            writer.write(str);
            writer.newLine();
            if (str.equals("exit"))
                break;

        }
        reader.close();
        writer.close();
    }
}
