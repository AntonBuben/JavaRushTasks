package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

import java.util.ArrayList;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String secondName;
        private boolean sex;
        private int age;
        private Date dateOfBirth;
        private ArrayList<Human> children;

        public Human(int age) {
            this.age = age;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(Date dateOfBirth) {

            this.dateOfBirth = dateOfBirth;
        }

        public Human(ArrayList<Human> children) {

            this.children = children;
        }

        public Human(String firstName, String secondName, Date dateOfBirth) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(String firstName, String secondName, boolean sex, int age, Date dateOfBirth, ArrayList<Human> children) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
            this.dateOfBirth = dateOfBirth;
            this.children = children;
        }

        public Human(String firstName, String secondName) {

            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(String firstName, String secondName, boolean sex, Date dateOfBirth) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.sex = sex;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(String firstName, String secondName, boolean sex, Date dateOfBirth, ArrayList<Human> children) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.sex = sex;
            this.dateOfBirth = dateOfBirth;
            this.children = children;
        }
    }
}
