package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////Employee e1=new Employee(1,"mahajan");

		//Employee e2=new Employee(2,"kjf");
		//Employee e3=new Employee(3,"545");
		//Employee e4=new Employee(4,"mungal");
		//List<Employee> l1=Arrays.asList(e1,e2,e3,e4);
		//boolean b1=
		List<String> l1=Arrays.asList("Abc","Demo","Mahajan");
		l1.sort(Collections.reverseOrder());
		System.out.println(l1);
	}

}
