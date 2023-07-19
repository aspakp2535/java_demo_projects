package com.zieta.advancejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FileAppend {
	 

public static void main( String[] args ) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the data : ");
	  String data = sc.next();
	  String data1 = " "+data;
      try {
    	  
          FileInputStream fileInputStream = new FileInputStream("Append.txt");
          
          FileWriter fileWriter = new FileWriter("Append.txt",true);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

          bufferedWriter.write(data1);

          bufferedWriter.close();
          fileWriter.close();

          int i=0;
          while((i=fileInputStream.read())!=-1) {
        	  System.out.print((char)i);
          }
          
          
      } catch (Exception e) {
        
      }
      
   }
}
