package com.tms.lesson11.domain;

import java.util.Objects;

public class User implements Comparable<User>{

    private String userName;

    private Integer userAge;

    public User(String userName, Integer userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    @Override
    public String toString() {
        return userName;
    }

    @Override
    public int hashCode() {
        return userAge.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userAge, user.userAge);
    }

    @Override
    public int compareTo(User o) {
        return userAge - o.userAge;
    }

}
