package org.example;

public class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is" + name + ", I'm " + age + " years");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
//        System.out.println("Count of years: " + years);
        return years;
    }
}
