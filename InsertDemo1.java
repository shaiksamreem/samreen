package com.samreen.jdbc;

import java.sql.*;
import java.util.Scanner;

public class InsertDemo1 {
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
					Statement st=con.createStatement();
					Scanner sc=new Scanner(System.in);
					while (true)
					{
						System.out.println("enter the employee  number ");
						int eno=sc.nextInt();
						System.out.println("enter the employee first_name");
						String first_name =sc.next();
						System.out.println("enter the employee last_name");
						String last_name =sc.next();
						System.out.println("enter the employee  age ");
						int age=sc.nextInt();
						System.out.println("enter the employee  desigination");
						String designation=sc.next();
						String insert_data=String.format("insert into employee_info values(%d,'%s','%s',%d,'%s')",eno,first_name,last_name,age,designation);
						st.executeUpdate(insert_data);
						System.out.println("record inserted successfully");
						System.out.println("!-------------- do u want insertred[yes/no]:----");
						String option=sc.next();
						if(option.equalsIgnoreCase("No")){
							System.out.println("stop this process");
							break;
						}
						
					}
					con.close();
			

	}

}
