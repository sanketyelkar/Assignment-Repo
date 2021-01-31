package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class HibernateConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
	public HibernateConnection() {
		cfg = new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		factory = cfg.configure().buildSessionFactory();
	}
	
	public void startSession() {
		session = factory.openSession();
		tx = session.beginTransaction();
	}
	
	public void addWord(String word, String means) {
		Dictionary d = new Dictionary(word, means);
		startSession();
		session.save(d);
		tx.commit();
		closeSession();
	}
	
	public List<Dictionary> searchWord(String word) {
		startSession();
		Criteria c = session.createCriteria(Dictionary.class);
		List<Dictionary> l = c.add(Restrictions.eq("word", word)).list();
		tx.commit();
		closeSession();
		return l;
	}
	
	public List<Dictionary> displayAll() {
		startSession();
		Query c = session.createQuery("From Dictionary");
		List<Dictionary> l = c.list();
		tx.commit();
		closeSession();
		return l;
	}
	
	public void deleteWord(String word) {
		startSession();
		Criteria c = session.createCriteria(Dictionary.class);
		List<Dictionary> l = c.add(Restrictions.eq("word", word)).list();
		session.delete(l.get(0));
		tx.commit();
		closeSession();
	}
	
	
	public void closeSession() {
		session.close();
	}
	
}
