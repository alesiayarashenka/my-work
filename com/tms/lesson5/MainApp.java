package com.tms.lesson5;

public class MainApp {

    public static void main(String[] args) {

        Student hanna = new Student("Hanna","MacLoud");

        String fullNameHanna = hanna.fullname();

        System.out.println(fullNameHanna);

        hanna.lessons = 7;
        hanna.visit(hanna.lastname, hanna.lessons);

        int lessonHanna = 10;
        hanna.visit(hanna.lastname, lessonHanna);

        Student max = new Student("Max","O'Connor", 28);

        String fullNameMax = max.fullname();

        System.out.println(fullNameMax);

        max.lessons = 13;
        max.visit(max.lastname, max.lessons);

        int lessonMax = 20;
        max.visit("O'Connor", lessonMax);

        Student tomas = new Student("Tomas", "Black", 30, 15);

        String fullNameTomas = tomas.fullname();

        System.out.println(fullNameTomas);

        tomas.visit(tomas.lastname, tomas.lessons);

        int tomasLesson = 19;
        tomas.visit(tomas.lastname, tomasLesson);

        tomas.lessons = 9;
        tomas.visit(tomas.lastname, tomas.lessons);

    }
}
