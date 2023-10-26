package com.oops.demo;

public class Test {

	
	static

	{
		System.out.println("This is static block");
	}
	static
	{
		System.out.println("This is 2nd static block");
	}
	public static void main(String[] args) {

		Product p1=new Product();
		p1.getData(101, "moblie", 465464.54f);
		p1.display();
		//Student s1=new Student();
		//s1.x=70;
		//System.out.println("This is Main method");
	}

}
