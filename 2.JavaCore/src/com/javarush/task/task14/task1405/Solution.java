package com.javarush.task.task14.task1405;

/* 
Food
Требования:
1. Интерфейс Selectable должен быть реализован в классе Food.
2. Метод onSelect() в классе Food должен выводить на экран фразу "food was selected".
3. В методе foodMethods должны вызываться методы объекта типа Food.
4. В методе selectableMethods должны вызываться методы доступные у любого объекта реализующего интерфейс Selectable.
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.eat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void eat() {
            System.out.println("food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("food was selected");
        }
    }
}
