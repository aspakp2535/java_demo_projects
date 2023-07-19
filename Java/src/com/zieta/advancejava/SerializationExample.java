package com.zieta.advancejava;

import java.io.*;

class Student implements Serializable {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class SerializationExample {

    public static void main(String[] args) {
        Student student = new Student("Hunt",101);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Person.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Student object serialized successfully.\n");
        } catch (Exception e) {
           
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("Person.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student deserializedStudent = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialized Student object:");
            System.out.println("Name: " + deserializedStudent.name);
            System.out.println("Roll No: " + deserializedStudent.rollNo);
        } catch (Exception e) {
          
        }
    }
}
