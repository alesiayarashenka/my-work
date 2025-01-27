package com.tms.lesson11.service;

import com.tms.lesson11.domain.User;

import java.util.*;

public class CollectionService {

    public Map<Integer, Integer> reapedNumber(List<Integer> source) {
        Map<Integer, Integer> mapList = new HashMap<>();
        for (Integer s : source) {
            if (mapList.containsKey(s)) {
                mapList.put(s, mapList.get(s) + 1);
            } else {
                mapList.put(s, 1);
            }
        }
        return mapList;
    }

    public Set<User> sortByAge(List<User> source) {
        Set<User> set = new TreeSet<>();
        for (User s : source) {
            set.add(s);
        }
        return set;
    }

    public Set<String> sortWithoutDouble(List<User> source) {
        Set<String> set = new HashSet<>();
        for (User s : source) {
            set.add(s.getUserName());
        }
        return set;
    }

}
