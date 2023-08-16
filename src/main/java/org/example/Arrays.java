package org.example;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        char character = 'a';
        String s = "Hello";
        String s1 = new String("Hello");

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);

            int[] numbers1 = {1, 2, 3};
            for (int j = 0; j < numbers1.length; j++) {
                System.out.println(numbers1[j]);
            }
        }
    }

}
