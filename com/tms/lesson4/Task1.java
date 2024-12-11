package com.tms.lesson4;

public class Task1 {

    public static void main(String[] args) {

        int[] mass_1 = {5,29,32,19, 45,10,6, 9};

        int[] mass_2 = {9, 21, 5, 45, 17,19, 3, 29};

        for(int item_1 : mass_1){
            for(int item_2 : mass_2) {
                if (item_1 == item_2) {
                    System.out.println(item_1);
                }
            }
        }
    }
}
