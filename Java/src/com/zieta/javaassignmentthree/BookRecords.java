package com.zieta.javaassignmentthree;

import java.text.*;

import java.util.*;

class Book {
    String name;
    int price;
    Date date;

    public Book(String name, int price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public void display() {
        System.out.println("Name: " + name + ", Price: " + price + ", Date: " + date);
    }

    public static Comparator<Book> sortByPriceAndName = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            if (b1.price == b2.price) {
                return b1.name.compareTo(b2.name);
            }
            return b1.price - b2.price;
        }
    };

    public static Comparator<Book> sortByDateDesc = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            return b2.date.compareTo(b1.date);
        }
    };
}

public class BookRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Date (in yyyy-MM-dd format): ");
            String dateStr = scanner.nextLine();
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
                books[i] = new Book(name, price, date);
            } catch (ParseException e) {
                System.out.println("Invalid date format!");
            }
        }

        System.out.println("All Book Records:");
        for (Book book : books) {
            book.display();
        }

        System.out.print("Enter book name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found:");
                book.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }

        Arrays.sort(books, Book.sortByPriceAndName);
        System.out.println("All Book Records sorted by price and name:");
        for (Book book : books) {
            book.display();
        }

        Arrays.sort(books, Book.sortByDateDesc);
        System.out.println("All Book Records in descending order of date:");
        for (Book book : books) {
            book.display();
        }
    }
}

