package com.samreen.jdbc;

	import java.sql.*;
	public class JdbcDemo {
		public static void main(String[] args) throws Exception {
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			}catch (ClassNotFoundException e) {}
			//create a new table under the JdbcCrud database
			
			String sql_query = "create table emp_info(eno int , ename varchar(10) , salary int , eaddr varchar(10));";
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb","root","sam@123");
			
			Statement st = con.createStatement();
			// to create a table with columns
			st.executeUpdate(sql_query);
			// to my refernace
			System.out.println("Table created successfully");
			con.close();
			
		}
	}
