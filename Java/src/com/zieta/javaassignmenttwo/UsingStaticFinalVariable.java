package com.zieta.javaassignmenttwo;

public class UsingStaticFinalVariable {
    
    public static int numObjects = 0;
    public final int MAX_VALUE = 100;
    public static final double PI = 3.14159;
    public UsingStaticFinalVariable() {
        numObjects++;
    }

    public static void main(String[] args) {
        UsingStaticFinalVariable obj1 = new UsingStaticFinalVariable();
        System.out.println("Number of objects created: " + UsingStaticFinalVariable.numObjects);
        System.out.println("Maximum value: " +obj1.MAX_VALUE);
        System.out.println("Value of pi: " +PI);
    }
}

