package com.oops.demo;

public class Org {
	private	int regNo;//0
	private	String name;
	private	String location;

	public void getData(int regNo,String name,String location)
	{
		this.regNo=regNo;
		this.name=name;
	}
	public void display()
	{
		System.out.println(regNo);
		System.out.println(name);

	}

}
