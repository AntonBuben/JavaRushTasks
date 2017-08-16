package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
Требования:
1. Метод cleanAllApartments должен принимать список аппартаметов в качестве параметра.
2. В методе cleanAllApartments для всех однокомнатных аппартаментов(Apt1Room) содержащихся в списке необходимо вызвать метод clean1Room.
3. В методе cleanAllApartments для всех двухкомнатных аппартаментов(Apt2Room) содержащихся в списке необходимо вызвать метод clean2Rooms.
4. В методе cleanAllApartments для всех трехкомнатных аппартаментов(Apt3Room) содержащихся в списке необходимо вызвать метод clean3Rooms.
5. Классы Apt1Room, Apt2Room, Apt3Room должны поддерживать(реализовывать) интерфейс Apartment.
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
        for (Apartment apartment : apartments) {
            if (apartment instanceof Apt1Room)
                ((Apt1Room) apartment).clean1Room();
            if (apartment instanceof Apt2Room)
                ((Apt2Room) apartment).clean2Rooms();
            if (apartment instanceof Apt3Room)
                ((Apt3Room) apartment).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class Apt1Room implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
