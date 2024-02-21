package org.example;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int input = scanner.nextInt();

        int [] userArray = new int[input];

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Please enter a number to go in the array: ");
            int number = scanner.nextInt();
            userArray[i] = number;
        }

        System.out.println(Arrays.toString(userArray));

        int [] numbers = {0, 1};
        change(numbers);
        printArray(numbers);

        int [] disorganised = {9, 5, 3, 6, 7, 2, 6, 10, 15};
        Arrays.sort(disorganised);
        //Arrays.sort(disorganised, 0, 4);

       printArray(disorganised);

        System.out.println(Arrays.binarySearch(disorganised, 15));

        String[] strings = new String[]{"abc", "def", "ghi"};

    }

    public static void change (int [] numbers) {
        numbers[0] = 1;
        numbers[1] = 0;
    }

    public static void printArray (int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        System.out.println();
    }

    public static int[] getNumbers() {
        int [] numbers = {1, 2, 3, 4, 5};
        return numbers;
    }
}