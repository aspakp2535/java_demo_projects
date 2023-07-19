package com.zieta.demopurpose;

import java.util.Scanner;

public class NumbertoWord {

    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    public static String convert(int num) {
        if (num < 0 || num > 99999) {
            return "Invalid input";
        }
        if (num == 0) {
            return "zero";
        }
        String words = "";
        if (num / 1000 > 0) {
            words += ones[num / 1000] + " thousand ";
            num %= 1000;
        }
        if (num / 100 > 0) {
            words += ones[num / 100] + " hundred ";
            num %= 100;
        }
        if (num >= 20) {
            words += tens[num / 10] + " ";
            num %= 10;
        }
        if (num > 0) {
            words += ones[num];
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("In words: " + convert(num));
    }
}