package com.zieta.javaassignmenttwo;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to display: ");
        int numTerms = sc.nextInt();
        
        int term1 = 0, term2 = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(term1 + " ");
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
    }
}

