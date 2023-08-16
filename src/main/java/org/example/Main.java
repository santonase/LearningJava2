package org.example;


public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.age = 20;
        person.name = "A";
        person.speak();
        person.sayHello();
        int years = person.calculateYearsToRetirement();
        System.out.println("Count of years: " + years);

        }
    }
