package com.zieta.corejava;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rate per item: ");

        double rate = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        double amount = rate * quantity;
        double discount = 0;

        if (amount >= 0 && amount < 1000) {
            discount = 0;
        } else if (amount >= 1000 && amount < 2000) {
            discount = 0.05 * amount;
        } else if (amount >= 2000 && amount < 3000) {
            discount = 0.1 * amount;
        } else if (amount >= 3000 && amount < 4000) {
            discount = 0.15 * amount;
        } else if (amount >= 4000) {
            discount = 0.25 * amount;
        }

        double finalAmount = amount - discount;

        System.out.println("Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final amount to pay: " + finalAmount);
    }
    
}

















 