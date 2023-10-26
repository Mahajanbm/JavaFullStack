package com.oops.demo;

public class Employee {
	static
	{
		System.out.println("This is static block");
	}
	{
		System.out.println("This is non-static block");
	}
	public Employee() {
		System.out.println("This is constructor");
	}
	void display()
	{
		System.out.println("THis is non-static method");
	}
	static void demo()
	{
		System.out.println("This is static method");
	}
	public static void main(String[] args) {
		Employee.demo();
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.display();
	}
}
