package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize(String name) {
        this.name = name;
        age = 1;
        weight = 10;
        color = "green";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "green";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 10;
        color = "green";
    }

    public void initialize(int weight, String color) {
        age = 1;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        age = 1;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
