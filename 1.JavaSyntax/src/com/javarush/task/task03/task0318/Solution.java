package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.input.InputMethodTextRun;

import java.io.*;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String year = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        System.out.print(name+" захватит мир через "+Integer.parseInt(year)+" лет. Му-ха-ха!");
    }
}
