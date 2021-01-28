package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDbConnection {
	private Configuration cfg;
	private SessionFactory factory;
	private Session session;
	private Transaction tx;

	public MyDbConnection() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		//closing factory means unloading the class loaded in memory so cud hamper speed in big projetcs
	}

	public void startSession() {
		session = factory.openSession(); // Connection Open
		tx = session.beginTransaction();
	}

	public void closeSession() {
		session.close();
	}

	public void insertEmployee(int eid, String ename, int salary) {
		Employee e = new Employee(eid, ename, salary);

		startSession();
		session.save(e);
		tx.commit();
		closeSession();
	}

	public void updateEmployee(int eid, String ename, int salary) {
		Employee e = new Employee(eid, ename, salary);

		startSession();
		session.update(e);
		tx.commit();
		closeSession();
	}

	public List<Employee> display() {
//		Query q = session.createQuery("From Employee where salary < 9000");
		StringBuffer sb = new StringBuffer();
		startSession();
		Query q = session.createQuery("From Employee");
		List<Employee> l = q.list();
//		for (Employee ee : l)
//			sb.append(ee+" \n");

		tx.commit(); //commit is reqd for querying as well as per documentation
		closeSession();
		return l;
	}

	public void deleteEmployee(int eid, String ename, int salary) {
		Employee e = new Employee(eid, ename, salary);

		startSession();
		session.delete(e);
		tx.commit();
		closeSession();
	}

}
