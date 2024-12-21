package com.tms.lesson5;

public class Student {

    public String firstname;

    public String lastname;

    public int age;

    public int lessons;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Student(String firstname, String lastname, int age, int lessons) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.lessons = lessons;
    }

    public void visit(String lastname, int lessons) {
        System.out.println(lastname + " посещает " + lessons + " занятий");
    }

    public String fullname() {
        String fullname = "Firstname: " + firstname + ", Lastname: " + lastname;
        return fullname;
    }


}
