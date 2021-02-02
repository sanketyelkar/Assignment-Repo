package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.thinkitive");

//		ApplicationContext context = new ClassPathXmlApplicationContext("newSpring.xml");
		
		Address a = context.getBean(Address.class);
		Address a1 = context.getBean(Address.class);
		a.setCity("Pune");
		a.setPincode(4000);
		a1.setCity("Domb");
		a1.setPincode(5000);
		
		List<Address> l = new ArrayList<>();
		l.add(a);
		l.add(a1);
		
		Employee e = context.getBean(Employee.class);
		e.setEid(1);
		e.setEname("sankeydfnh");
		e.setSalary(2345);
		e.setAddr(l);
		
		System.out.println(e);
		
	}
}
