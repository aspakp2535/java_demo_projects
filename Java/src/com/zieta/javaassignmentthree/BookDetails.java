package com.zieta.javaassignmentthree;

import java.util.*;

class Book1 implements Comparable<Book1>{
    private int bookId;
    private String name;
    private double price;
    private String author;

    public Book1(int bookId, String name, double price, String author) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book1 o) {
        if (this.price > o.price) {
            return -1;
        } else if (this.price < o.price) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bookId;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book1 other = (Book1) obj;
        if (bookId != other.bookId)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", name=" + name + ", price=" + price + ", author=" + author + "]";
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Set<Book1> bookSet = new HashSet<>();

        // Adding books to the set
        bookSet.add(new Book1(101, "The Alchemist", 9.99, "Paulo Coelho"));
        bookSet.add(new Book1(102, "To Kill a Mockingbird", 7.99, "Harper Lee"));
        bookSet.add(new Book1(103, "Pride and Prejudice", 6.99, "Jane Austen"));
        bookSet.add(new Book1(104, "Animal Farm", 5.99, "George Orwell"));
        bookSet.add(new Book1(105, "The Great Gatsby", 8.99, "F. Scott Fitzgerald"));

        // Displaying all books in the set
        System.out.println("All Books: ");
        for (Book1 book : bookSet) {
            System.out.println(book);
        }

        // Sorting and displaying books in descending order of price
        List<Book1> bookList = new ArrayList<>(bookSet);
        Collections.sort(bookList);
        System.out.println("Books in Descending order of price: ");
        for (Book1 book : bookList) {
            System.out.println(book);
        }
    }
}
