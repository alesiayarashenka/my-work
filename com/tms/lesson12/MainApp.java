package com.tms.lesson12;

import com.tms.lesson12.donain.User;
import com.tms.lesson12.service.UserService;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        UserService userService = new UserService();

        //---Создаем список с дубликатами
        List<Integer> listNumbers = List.of(4,14,4,24,64,5,15,44,5,10,5,33,4,6,2,4,21);

        //---Выведем список без дубликатов и количество повторений
        var res = userService.reapedNumber(listNumbers);
        System.out.println("The list with reaped numbers: " + res);

        //---Список пользователей в порядке увеличения возраста
        List<User> listAge = List.of(new User("Olya", 28),
        (new User("Kolya", 24)),
        (new User("Valya", 33)),
        (new User("Olya", 40)),
        (new User("Hanna", 18)),
        (new User("Kolya", 25)));

        var resultAge = userService.increaseAge(listAge);

        System.out.println("List of users by age: " + resultAge);

        //---Список пользователей без дубликатов
        var listdouble = userService.withoutDouble(listAge);
        System.out.println("List of users without duplicates: " + listdouble);

    }
}
