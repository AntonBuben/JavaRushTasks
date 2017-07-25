package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

import sun.misc.ExtensionInfo;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human d1 = new Human("D1", true, 80);
        Human d2 = new Human("D2", true, 80);
        Human b1 = new Human("B1", false, 80);
        Human b2 = new Human("B2", false, 80);
        Human p = new Human("P", true, 30, d1, b1);
        Human m = new Human("M", false, 30, d2, b2);
        Human r1 = new Human("R1", true, 11, p, m);
        Human r2 = new Human("R2", true, 11, p, m);
        Human r3 = new Human("R3", true, 11, p, m);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(p);
        System.out.println(m);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //напишите тут ваш код


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















