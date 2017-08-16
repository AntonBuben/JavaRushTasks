package com.javarush.task.task14.task1414;

/* 
MovieFactory
Требования:
1. Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
2. Метод MovieFactory.getMovie должен возвращать объект типа Cartoon в случае передачи ему строки "cartoon" в качестве параметра.
3. Метод MovieFactory.getMovie должен возвращать объект типа Thriller в случае передачи ему строки "thriller" в качестве параметра.
4. Метод main должен считывать строки с клавиатуры.
5. Метод main должен прекращать считывать строки с клавиатуры в случае, если была введена некорректная строка(не "cartoon", не "thriller" или не "soapOpera").
6. Для каждой введенной строки необходимо вызвать метод MovieFactory.getMovie.
7. Для всех введенных корректных строк необходимо вывести на экран простые имена(movie.getClass().getSimpleName()) типов объектов возвращаемых методом MovieFactory.getMovie.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arrayKeys[] = {"cartoon", "thriller", "soapOpera"};
        ArrayList<Movie> listOfTrueKeys = new ArrayList<>();
        Movie movie = null;
        while (true) {
            movie = MovieFactory.getMovie(reader.readLine());
                if (movie!= null) {
                    listOfTrueKeys.add(movie);
                } else
                    break;

        }

        for (Movie movies : listOfTrueKeys)
            System.out.println(movies.getClass().getSimpleName());

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            } else movie = null;

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }

}
