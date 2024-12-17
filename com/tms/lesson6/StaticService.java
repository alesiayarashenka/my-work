package com.tms.lesson6;

public class StaticService {

    public static void test(String string, int value) {
        int i = 1;
        while (i <= value) {
            System.out.println(string);
            i++;
        }
    }

}


