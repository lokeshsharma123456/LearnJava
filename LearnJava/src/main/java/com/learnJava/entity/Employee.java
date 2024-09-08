package com.learnJava.entity;

import com.learnJava.model.Person;

public class Employee implements Person {
    private String FirstName;
    private String LastName;
    private int age;
    private String Email;


    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public void setFirstName(String name) {

    }

    @Override
    public String getLastName() {
        return "";
    }

    @Override
    public void setLastName(String name) {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public String getEmail() {
        return "";
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }
}
