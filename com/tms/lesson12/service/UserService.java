package com.tms.lesson12.service;

import com.tms.lesson12.donain.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {

        public Map<Integer, Long> reapedNumber(List<Integer> source) {
            Map<Integer, Long> collect = source.stream()
                    .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
            return collect;
            }

        public List<String> increaseAge(List<User> source) {
            List<String> collect = source.stream()
                    .sorted(Comparator.comparingDouble(User::getUserAge))
                    .toList()
                    .stream().map(User::getUserName)
                    .collect(Collectors.toList());
            return collect;
        }

        public Set<String> withoutDouble(List<User> source) {
            Set<String> collect = source.stream()
                    .map(User::getUserName)
                    .collect(Collectors.toSet());
            return collect;
        }
}
