package com.javarush.task.task13.task1310;

/* 
Это кто там такой умный?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

<<<<<<< HEAD
    interface Secretary {
    }

    interface Boss {
    }

    class CleverMan {
=======
    interface Secretary extends Person{
    }

    interface Boss extends Person, Workable{
    }

    class CleverMan implements Boss  {
>>>>>>> origin/master
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean wantsToGetExtraWork() {
            return true;
        }
<<<<<<< HEAD
    }

    class SmartGirl {
=======


    }

    class SmartGirl implements Secretary {
>>>>>>> origin/master
        public void use(Person person) {
        }

        public void startToWork() {
<<<<<<< HEAD

=======
>>>>>>> origin/master
        }
    }
}
