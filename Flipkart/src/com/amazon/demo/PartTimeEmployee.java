package com.amazon.demo;

import java.util.jar.Attributes.Name;

public class PartTimeEmployee {
	int id=102;
	String name="varsha";
	String city="Pune";
	float salary=453456.5f;
	void getData(int a,String b,String c,float d)
	{
		id=a;
		name=b;
		city=c;
		salary=d;
	}
	void display()
	{
		System.out.println("Part time Emp Id: "+id);
		System.out.println("PartTime Emp Name: "+name);
		System.out.println("city time Emp Id: "+city);
		System.out.println("Salary Emp Name: "+salary);
	}

}
