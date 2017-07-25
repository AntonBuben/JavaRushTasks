package com.javarush.task.task08.task0824;

/* 
Собираем семейство
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human r1 = new Human();
        r1.name = "r1";
        r1.sex = false;
        r1.age = 10;

        Human r2 = new Human();
        r2.name = "r1";
        r2.sex = false;
        r2.age = 10;

        Human r3 = new Human();
        r3.name = "r1";
        r3.sex = false;
        r3.age = 10;

        Human p = new Human();
        p.name = "p";
        p.sex = true;
        p.age = 30;
        p.children.add(r1);
        p.children.add(r2);
        p.children.add(r3);

        Human m = new Human();
        m.name = "m";
        m.sex = false;
        m.age = 30;
        m.children.add(r1);
        m.children.add(r2);
        m.children.add(r3);

        Human d1 = new Human();
        d1.name = "d1";
        d1.sex = true;
        d1.age = 70;
        d1.children.add(p);

        Human b1 = new Human();
        b1.name = "b1";
        b1.sex = false;
        b1.age = 70;
        b1.children.add(p);

        Human d2 = new Human();
        d2.name = "d2";
        d2.sex = true;
        d2.age = 70;
        d2.children.add(m);
        Human b2 = new Human();
        b2.name = "b2";
        b2.sex = false;
        b2.age = 70;
        b2.children.add(m);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(m);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public Boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
