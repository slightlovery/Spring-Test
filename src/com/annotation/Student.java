package com.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    @Required
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
}
