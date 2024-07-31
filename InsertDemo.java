package com.samreen.jdbc;
import java.sql.*;
public class InsertDemo {


public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(ClassNotFoundException e) {}
	
	String url="jdbc:mysql://localhost:3306/jdbccruddb";
	String username="root";
	String pwd="sam@123";
	Connection con=DriverManager.getConnection(url,username,pwd);
	
	String insert_query="insert into employee_info values(101,'John','Deo',30),(102,'samreen','shaik',23)";
	Statement st=con.createStatement();
	st.executeUpdate(insert_query);
	System.out.println("record inserted successfully");
	con.close();
	
	

}

}