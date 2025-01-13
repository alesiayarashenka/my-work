package com.tms.lesson11.service;

import java.util.*;

public class CollectionService {

    public Map<Integer, Integer> reapedNumber(List<Integer> source) {
        Map<Integer, Integer> mapList = new HashMap<>();
        for (Integer s : source) {
            if(mapList.containsKey(s)){
                mapList.put(s,mapList.get(s) + 1);
            }
            else {
                mapList.put(s,1);
            }
        }
        return mapList;
    }

}
