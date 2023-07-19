package com.zieta.advancejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDataCopy {
    public static void main(String[] args) {
        

        try {
            FileInputStream inputStream = new FileInputStream("Append.txt");
            FileOutputStream outputStream = new FileOutputStream("Copy.txt");

           
            int i=0;
            while((i=inputStream.read())!=-1) {
            	outputStream.write(i);
            	
            	System.out.print((char)i);
            }

            inputStream.close();
            outputStream.close();
            System.out.println();
            System.out.println("File copied successfully.");
            
//            FileInputStream fin = new FileInputStream("Copy.txt");
//            int j=0;
//            while((j=fin.read())!=-1) {
//          	  System.out.print((char)j);
//            }
        } catch (IOException e) {
            
        }
    }
}

