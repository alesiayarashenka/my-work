package com.tms;

public class HomeTask_4_2 {
    public static void main(String[] args) {

        int[] mass = {13, 67, 44, 9, 56, 20};
        int max = mass[0];
        int min = mass[0];
        int sum = 0;

        for (int j = 0; j < mass.length; j++) {
            if (mass[j] > max) {
                max = mass[j];
            }
            if (mass[j] < min) {
                min = mass[j];
            }

            sum += mass[j];

        }
        System.out.println("Количество элементов в массиве: " + mass.length);
        System.out.println("Сумма всех элементов в массиве: " + sum);
        System.out.println("Максимальная сумма всех элементов в массиве: " + max);
        System.out.println("Минимальная сумма всех элементов в массиве: " + min);
    }

}

