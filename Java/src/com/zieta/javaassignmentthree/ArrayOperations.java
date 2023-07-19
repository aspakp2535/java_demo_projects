package com.zieta.javaassignmentthree;

import java.util.Scanner;

public class ArrayOperations {
    private int[] array;

    // Constructor to initialize the array with user input
    public ArrayOperations(int size) {
        array = new int[size];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }

    // Method to display all elements of the array
    public void display() {
        System.out.print("Elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to calculate the sum of all elements of the array
    public void sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // Method to calculate the sum of even and odd elements of the array
    public void sum(int type) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        if (type == 0) {
            System.out.println("Sum of even elements: " + sumEven);
        } else {
            System.out.println("Sum of odd elements: " + sumOdd);
        }
    }

    // Main method to create object of ArrayOperations class and call methods
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(5);
        arr.display();
        arr.sum();
        arr.sum(0);
        arr.sum(1);
    }
}

