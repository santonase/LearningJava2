package org.example;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Sviatoslav", 30);
        Person person2 = new Person("Dmytro", 50);
        person2.setName("Qwerty");
        person2.setNameAndAge("Dmytro", 51);
        person2.getName();
        person2.speak();

        System.out.println("Count of years to retirement: " + person1.calculatedYearsToRetirement());
        System.out.println("Count of years to retirement: " + person2.calculatedYearsToRetirement());

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String username) {
        this.name = username;
    }

    void getName() {
        this.name = name;
        System.out.println(name);
    }

    int calculatedYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Hello, my name is: " + name + ", I'm: " + age + " years.");
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
