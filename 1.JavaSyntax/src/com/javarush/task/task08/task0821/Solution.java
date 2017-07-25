package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать только три метода.
3. Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
4. В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
5. В методе createPeopleList() должны добавляться люди с одинаковыми именами.
6. Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
7. Метод main() должен вызывать метод createPeopleList().
8. Метод main() должен вызывать метод printPeopleList().
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Горбачев","Алексей");
        map.put("Чудинов","Константин");
        map.put("Санников","Евгений");
        map.put("Рыбцов","Сергей");
        map.put("Рогачев","Василий");
        map.put("Рычковский","Денис");
        map.put("Скосырских","Александра");
        map.put("Чудинов","Елизавета");
        map.put("Ерепанов","Денис");
        map.put("Табулды","Константин");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
