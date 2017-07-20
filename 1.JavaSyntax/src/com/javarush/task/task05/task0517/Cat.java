package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "green";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 1;
        color = "green";
    }

    public Cat(String name) {
        this.name = name;
        age = 1;
        weight = 1;
        color = "green";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 1;
    }

    public Cat(int weight,String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        age = 1;
    }

    public static void main(String[] args) {

    }
}
