package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Требования:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grantFatherName = reader.readLine();
        Cat catGrantFather = new Cat(grantFatherName, null, null);

        String grantMotherName = reader.readLine();
        Cat catGrantMother = new Cat(grantMotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrantFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrantMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrantFather);
        System.out.println(catGrantMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null) {
                if (father == null)
                    return "Cat name is " + name + ", no mother, no father";
                else
                    return "Cat name is " + name + ", no mother" + ", father is " + father.name;
            } else {
                if (father == null)
                    return "Cat name is " + name + ", mother is " + mother.name + ", no father";
                else
                    return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }

}
