package com.zieta.corejava;

import java.util.Scanner;

public class PowerOfNumber {

    static int power(int a, int b) {
        if (b == 0)
            return 1;
        else
            return (a * power(a, b - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

        int result = power(a, b);
        System.out.println("Result of " + a + "^" + b + " is: " + result);
    }
}
