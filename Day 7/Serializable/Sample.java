package com.thinkitive;

public class Sample {
	public static void main(String[] args) {
		Address a = new Address(421202, "Thane");
		Employee e1 = new Employee(1, "Sanket", 72000, a);
		Employee e2 = new Employee();
		System.out.println(e1);
		System.out.println(e2);

		System.out.println();

		e1.doSerialize();
//		e2 = e2.doDeserialize();
		e2 = e1.doDeserialize(); //e1.doDese() OR e2.doDese() kahi pan chalta we just have to call them
		System.out.println(e1);
		System.out.println(e2);
	}

}
