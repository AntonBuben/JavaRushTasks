package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double 3.14
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String subUrl  = url.substring(url.indexOf("?")+1);

        String [] tokens = subUrl.split("(\\&+)|(\\?+)");

        ArrayList<String> objList = new ArrayList<String>();
        Pattern objMutch = Pattern.compile("^obj=.*");
        for(String a:tokens){
            if(!a.equals("")){
                Matcher matcher = objMutch.matcher(a);
                if(matcher.find()){ objList.add(a.substring(a.indexOf("=")+1)); }
                if(a.contains("=")){ System.out.print(a.substring(0,(a.indexOf("="))) +" "); }
                else {System.out.print(a+" ");}
            }
        }

        Pattern doublePattern = Pattern.compile("[0-9.]");
        Pattern stringPattern = Pattern.compile("[A-Za-z]");

        System.out.println();
        for(String a:objList){
            Matcher matcher = stringPattern.matcher(a);
            Matcher matcher1 = doublePattern.matcher(a);
            if(matcher.find()){alert(a);}
            else  if(matcher1.find()){alert(Double.parseDouble(a));}
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
