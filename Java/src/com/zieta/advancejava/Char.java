package com.zieta.advancejava;

import java.io.IOException;

public class Char {
    public static void main(String[] args) throws IOException {
    	System.out.println("Enter a character:");
        int i = System.in.read(); // returns ASCII code of 1st character
        System.out.println("The character you entered is: " + (char) i); // will print the character
        String message = "Error: This is an error message";
        System.out.println("\u001B[37m" + message + "\u001B[0m");
    }
}
