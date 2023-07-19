package com.zieta.javaassignmentthree;

import java.util.*;

import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a new Vector
        Vector<String> countries = new Vector<>();

        // Add some elements to the vector
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("Russia");
        countries.add("Japan");

        // Display all elements of the vector using simple for loop
        System.out.println("Elements of Vector:");
        for(int i=0; i<countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        // Display the size and capacity of the vector
        System.out.println("\nSize of Vector: " + countries.size());
        System.out.println("Capacity of Vector: " + countries.capacity());

        // Insert an element at specific position
        countries.add(2, "Australia");
        System.out.println("\nAfter inserting 'Australia' at index 2: ");
        for(int i=0; i<countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        // Remove a particular element
        countries.remove("USA");
        System.out.println("\nAfter removing 'USA': ");
        for(int i=0; i<countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        // Update an element
        countries.set(3, "Germany");
        System.out.println("\nAfter updating element at index 3 with 'Germany': ");
        for(int i=0; i<countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        // Create a new ArrayList similar to the Vector
        ArrayList<String> countriesList = new ArrayList<>(countries);
        Iterator<String> itr = countriesList.iterator();

        // Display elements of ArrayList using Iterator
        System.out.println("\nElements of ArrayList:");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
