package com.ss.login;

import java.sql.*;

public class Validate {
	
	private static String dbAdmin = "root";
	private static String dbPass = "Welcome_1!";
	
	public static boolean checkUser(String user, String pass) {
		boolean st = false;
		try {
			// Load MySQL drivers
			Class.forName("com.mysql.jdbc.Driver");
		
			// Connecting to DB
			Connection con = DriverManager.getConnection("jdbc:mysql:/ /localhost:3306/sslogin", dbAdmin, dbPass);
			PreparedStatement ps = con.prepareStatement("select * from registry where email=? and pass=?");
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			st = rs.next();
		
			} catch (SQLException e) {
			e.printStackTrace();
			}
		return st;
	}
}
