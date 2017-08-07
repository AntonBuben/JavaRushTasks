package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        Map<String, String> cities = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();


            cities.put(city,family);
           // addresses.add(family);
           // cities.add(family);

        }

        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
        //System.out.println("print");
        String city  = reader.readLine();
        for (Map.Entry<String, String> pair : cities.entrySet())
            if (pair.getKey().equals(city))
                System.out.println(pair.getValue());


//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
