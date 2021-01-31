package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

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
	
	public List<Employee> searchEmployee(String ename) {
		startSession();
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eq("ename", ename));
		List<Employee> l = c.list();
		tx.commit();
		closeSession();
		return l;
	}
	
	public List<Employee> searchEmployee(int eid) {
		startSession();
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eq("eid", eid));
		List<Employee> l = c.list();
		tx.commit();
		closeSession();
		return l;
	}
	
	public List<Employee> searchEmployee(int salary, boolean isSalary) {
		startSession();
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eq("salary", salary));
		List<Employee> l = c.list();
		tx.commit();
		closeSession();
		return l;
	}

	public List<Employee> display() {
		StringBuffer sb = new StringBuffer();
		startSession();
		Query q = session.createQuery("From Employee");
		List<Employee> l = q.list();

		tx.commit();
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
