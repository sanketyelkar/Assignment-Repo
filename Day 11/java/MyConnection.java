package com.thinkitive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	Connection con;
	Statement st;
	PreparedStatement ps;
	
	public MyConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getCon() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "sanket", "Sanket@306");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public Statement getStatement() {
		try {
			st = this.getCon().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}
	
	public PreparedStatement getPrepStatement(String sql) {
		try {
			ps = this.getCon().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch (NullPointerException e) {
//			e.printStackTrace();
//		}
		return ps;
	}

	public void closeCon() {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
