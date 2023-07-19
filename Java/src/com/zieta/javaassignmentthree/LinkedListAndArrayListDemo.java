package com.zieta.javaassignmentthree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAndArrayListDemo {

    public static void main(String[] args) {
        
        // create a linked list and add country names to it
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("India");
        linkedList.add("USA");
        linkedList.add("Japan");
        linkedList.add("Australia");
        linkedList.add("France");
        
        // create a new array list similar to linked list
        List<String> arrayList = new ArrayList<>(linkedList);
        
        // display the contents of linked list using iterator
        System.out.println("Contents of linked list:");
        Iterator<String> itr1 = linkedList.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        
        // display the contents of array list using iterator
        System.out.println("\nContents of array list:");
        Iterator<String> itr2 = arrayList.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }

}
