package com.tms.lesson11;

import com.tms.lesson11.domain.User;
import com.tms.lesson11.service.CollectionService;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        CollectionService userService = new CollectionService();

        //---Создаем список с дубликатами
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(4);
        listNumbers.add(14);
        listNumbers.add(4);
        listNumbers.add(24);
        listNumbers.add(64);
        listNumbers.add(5);
        listNumbers.add(15);
        listNumbers.add(44);
        listNumbers.add(5);
        listNumbers.add(10);
        listNumbers.add(5);
        listNumbers.add(33);
        listNumbers.add(4);
        listNumbers.add(6);
        listNumbers.add(2);
        listNumbers.add(4);
        listNumbers.add(21);

        //---Выведем список без дубликатов и количество повторений
        var res = userService.reapedNumber(listNumbers);
        System.out.println("The list with reaped numbers: " + res);

        //---Список пользователей в порядке увеличения возраста
        List<User> listAge = new ArrayList<>();

        listAge.add(new User("Olya", 28));
        listAge.add(new User("Kolya", 24));
        listAge.add(new User("Valya", 33));
        listAge.add(new User("Olya", 40));
        listAge.add(new User("Hanna", 18));
        listAge.add(new User("Kolya", 25));

        var resultAge = userService.sortByAge(listAge);

        System.out.println("List of users by age: " + resultAge);

        //---Список пользователей без дубликатов
        var listdouble = userService.sortWithoutDouble(listAge);
        System.out.println("List of users without duplicates: " + listdouble);

    }
}
