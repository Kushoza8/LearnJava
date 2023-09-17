package com.kush_package;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    //if we do not
    Human(int age, String name, int salary, boolean married) {
        //not declared method as public so it is considered as default meaning can be accessed inside the same package by other classes.
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}

