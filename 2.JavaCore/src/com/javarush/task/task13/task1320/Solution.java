package com.javarush.task.task13.task1320;

/* 
Neo
Требования:
1. Интерфейс DBObject должен быть реализован в классе User.
2. Метод initializeIdAndName должен возвращать корректный объект типа User, объект на котором производится вызов метода("этот" объект).
3. Метод initializeIdAndName должен устанавливать значения полей id и name согласно переданным ему параметрам.
4. Программа должна выводить на экран: "User has name Neo, id = 1"
5. Метод toString не менять.
6. Метод main не менять.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject{
        long id;
        String name;

        @Override
        public DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }
}
