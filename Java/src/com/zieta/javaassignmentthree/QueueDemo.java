package com.zieta.javaassignmentthree;

import java.util.PriorityQueue;

import java.util.ArrayDeque;

public class QueueDemo {
    public static void main(String[] args) {
        
        // Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add("C");
        priorityQueue.add("B");
        priorityQueue.add("A");

        // Print the elements in the PriorityQueue
        System.out.println("Elements in PriorityQueue:");
        for(String element : priorityQueue) {
            System.out.println(element);
        }

        // Create an ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Add elements to the front of the ArrayDeque
        arrayDeque.addFirst("C");
        arrayDeque.addFirst("B");
        arrayDeque.addFirst("A");

        // Print the elements in the ArrayDeque
        System.out.println("Elements in ArrayDeque:");
        for(String element : arrayDeque) {
            System.out.println(element);
        }
    }
}
