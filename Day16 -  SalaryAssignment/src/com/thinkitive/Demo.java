package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		
		Employee e = context.getBean("emp", Employee.class);
		e.printEmpDetails();
		
		Employee e1 = context.getBean("emp", Employee.class);
		e1.printEmpDetails();
		
		Employee e3 = context.getBean("emp2", Employee.class);
		e3.printEmpDetails();

	}
}
