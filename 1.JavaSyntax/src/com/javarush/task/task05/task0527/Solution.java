package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 12,1);
        Dog dog = new Dog("Dog",11,2);

        //напишите тут ваш код
    }


    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Cat {
        //напишите тут ваш код
        public String name;
        public int age;
        public int weight;


        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }

    public static class Dog {
        //напишите тут ваш код
        public String name;
        public int age;
        public int weight;


        public Dog(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }
}