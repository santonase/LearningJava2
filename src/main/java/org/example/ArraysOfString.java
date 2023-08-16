package org.example;

public class ArraysOfString {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "bye";
        strings[2] = "Java";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string:strings) {
            System.out.println("foreach: "+string);
        }

        int[] numbers1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x: numbers1) {
            sum += x;
            System.out.println(x);
        }
        System.out.println("Sum of numbers: "+ sum);

        int value = 0;
        String s = "asdasd";
        System.out.println(s);
    }
}
