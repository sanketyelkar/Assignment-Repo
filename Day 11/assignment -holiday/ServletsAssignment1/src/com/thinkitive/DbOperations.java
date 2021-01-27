package com.thinkitive;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperations {
	private MyConnection conn = new MyConnection();
	private Statement st;
	private PreparedStatement ps;
	
	public int insert(String name, String email, String contact, String password) throws SQLException {
		ps = conn.getPreparedStatement("insert into product_users values(?,?,?,?)");
		int res = 0;
		
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setString(4, password);
			res = ps.executeUpdate();
			ps.close();
			conn.closeCon();
		
		return res;
	}
	
	public boolean checkLogin(String name, String password) {
		ResultSet rs;
		st = conn.getStatement();
		try {
			rs = st.executeQuery("select * from product_users");
			while(rs.next()) {
				if(rs.getString(1).equals(name))
					if(rs.getString(4).equals(password))
						return true;
					else
						return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
