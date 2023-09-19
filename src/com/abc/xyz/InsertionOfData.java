package com.abc.xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertionOfData {
	static String ps = "avcdFtr5#%@1*fGj";
	static String user = "root";
	static String URL = "jdbc:mysql://localhost:3306/prabhjot";
	public static void startIt() {
	try {
		String name,city,email;
		int age;
		name = UIPart.returnName();
		city = UIPart.returnCity();
		email = UIPart.returnEmail();
		age = UIPart.returnAge();
		Connection conn = DriverManager.getConnection(URL,user,ps);
		PreparedStatement pstmt = conn.prepareStatement("insert into student(sname,semail,scity,sage) values(?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setString(3, city);
		pstmt.setInt(4, age);
		pstmt.execute();
		System.out.println("Added Data");
		UIPart.lb.setText("Successfully Added Data");
//		if(isTrue) {
//			System.out.println("Successfully Added Data in the Database");
//		}
//		else {
//			System.out.println("Error in adding data...!!!");
//		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}
