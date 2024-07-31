package com.samreen.jdbc;
import java.sql.*;
public class UpdateEmployee {
	public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(ClassNotFoundException e) {}
	// connection driver

	String url="jdbc:mysql://localhost:3306/jdbccruddb";
	String username="root";
	String pwd="sam@123";
	Connection con=DriverManager.getConnection(url,username,pwd);
	Statement st=con.createStatement();
	// alter column
	
	String update_query="alter table  employee_info add column designation VARCHAR(50) ";
	st.executeUpdate(update_query);
	// update age and desigination
	
	
	String update_sql="UPDATE employee_info SET age = 35,designation ='senior' WHERE first_name = 'samreen' AND last_name = 'shaik'";

	
	st.executeUpdate(update_sql);
	System.out.println("record inserted successfully"+"update_sql");
	con.close();
	
}
}
