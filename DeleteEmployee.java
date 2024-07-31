package com.samreen.jdbc;
import java.sql.*;
public class DeleteEmployee {

	public static void main(String[] args) throws Exception{
		// using try catch to handle class not found exception
try {
Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e) {}

String url="jdbc:mysql://localhost:3306/jdbccruddb";
String username="root";
String pwd="sam@123";
Connection con=DriverManager.getConnection(url,username,pwd);


//sql query to display entire table
String delete_query="drop table employee_info";

Statement st=con.createStatement();
int delete_record_row=st.executeUpdate(delete_query);

System.out.println("deleting the table successfully:");

con.close();


}


}
