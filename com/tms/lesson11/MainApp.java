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

        //---Выведем список имен без дубликатов
        User user1 = new User("Olya", 28);
        User user2 =new User("Kolya", 24);
        User user3 =new User("Valya", 33);
        User user4 =new User("Olya", 40);
        User user5 =new User("Hanna", 18);
        User user6 =new User("Kolya", 25);

        Map<String,User> userMap = new HashMap<>();

        userMap.put(user1.getUserName(), user1);
        userMap.put(user2.getUserName(), user2);
        userMap.put(user3.getUserName(), user3);
        userMap.put(user4.getUserName(), user4);
        userMap.put(user5.getUserName(), user5);
        userMap.put(user6.getUserName(), user6);

        var allUser = userMap.keySet();
        System.out.println(allUser);

        //---Выведем список пользователей в порядке увеличения возраста
        Set<User> set = new TreeSet<>();
        set.add(new User("Olya", 28));
        set.add(new User("Kolya", 24));
        set.add(new User("Valya", 33));
        set.add(new User("Olya", 40));
        set.add(new User("Hanna", 18));
        set.add(new User("Kolya", 25));

        System.out.println(set);

    }
}
