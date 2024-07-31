package com.samreen.jdbc;

import java.sql.*;
public class JdbcCreate {

		public static void main(String[] args) throws Exception {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException e) {}
		
			
			String sql_query = "create table employee_info(eno int primary key auto_increment , first_name varchar(50) , last_name varchar(50), age int);";
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb","root","sam@123");
			
			Statement st = con.createStatement();
		
			st.executeUpdate(sql_query);

			System.out.println("Table created successfully");
			con.close();

			
		}

	}