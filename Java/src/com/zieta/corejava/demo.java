package com.zieta.corejava;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        if (str2.startsWith(str1)) {
            System.out.println("The second string starts with the first string.");
        } else {
            System.out.println("The second string does not start with the first string.");
        }
    }
}

