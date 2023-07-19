package com.zieta.javaassignmentthree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AnimalList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        // add some animal names to the list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Cheetah");
        animals.add("Jaguar");

        // display each element using simple for loop
        System.out.println("Using simple for loop:");
        for(int i=0; i<animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        // display each element using advanced for loop
        System.out.println("\nUsing advanced for loop:");
        for(String animal : animals) {
            System.out.println(animal);
        }

        // display each element using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // display each element using ListIterator
        System.out.println("\nUsing ListIterator:");
        ListIterator<String> listIterator = animals.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
