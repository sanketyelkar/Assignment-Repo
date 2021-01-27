package com.thinkitive;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyDbOperations {
	MyConnection myCon = new MyConnection();
	PreparedStatement ps;
	Statement st;

	public void create() {
		try {
			st = myCon.getStatement();
			st.execute("create table emp(eid int, ename varchar(15), salary int)");
			myCon.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(int eid, String ename, int salary) {
		try {
			ps = myCon.getPrepStatement("insert into emp values(?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setInt(3, salary);
			ps.execute();

			myCon.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(int eid, String ename) {
		try {
			ps = myCon.getPrepStatement("update emp set ename=? where eid=?");
			ps.setString(1, ename);
			ps.setInt(2, eid);
			ps.execute();

			myCon.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int eid) {
		try {
			ps = myCon.getPrepStatement("delete from emp where eid = ?");
			ps.setInt(1, eid);
			ps.execute();
			myCon.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(String ename) {
		try {
			ps = myCon.getPrepStatement("delete from emp where ename = ?");
			ps.setString(1, ename);
			ps.execute();
			myCon.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List display() {
		List l = new ArrayList();
		System.out.println("\nDisplaying table:");
		ResultSet rs;
		StringBuffer sb = new StringBuffer();
		st = myCon.getStatement();
		try {
			rs = st.executeQuery("select * from emp");
			while (rs.next())
				l.add(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + "\n");
			myCon.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l;
	}

}
