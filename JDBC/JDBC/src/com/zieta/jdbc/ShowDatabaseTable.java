package com.zieta.jdbc;

import java.sql.*;

public class ShowDatabaseTable {
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
   static final String DB_URL = "jdbc:mysql://localhost/zieta"; 
   static final String USER = "root"; 
   static final String PASS = "Hunt@1508"; 

   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try{
         Class.forName(JDBC_DRIVER);

         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

         System.out.println("Creating statement...");
         stmt = conn.createStatement();
         String sql;
         sql = "SELECT * FROM employee"; 
         ResultSet rs = stmt.executeQuery(sql);

         while(rs.next()){
            
            int id  = rs.getInt("id");
            String name = rs.getString("name");
            float salary = rs.getFloat("salary");
            

           
            System.out.print("ID: " + id);
            System.out.print(", Name: " + name);
            System.out.print(", Salary: " + salary);
            System.out.println();
            
         }

         rs.close();
         stmt.close();
         conn.close();
      }
      catch(SQLException se){
        
      }
      catch(Exception e){

      }
      finally{
         
         try{
            if(stmt!=null)
               stmt.close();
         }
         catch(SQLException se2){
         }
         try{
            if(conn!=null)
               conn.close();
         }
         catch(SQLException se){
            
         }
      }
      System.out.println("Goodbye!");
   }
}

