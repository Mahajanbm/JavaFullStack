package com.oops.demo;

public class Product {
	private	int pId;
	private	String pName;
	private	float pPrice;
	private String desc;

	public void getData(int x,String y,float z)
	{
		pId=x;
		pName=y;
		pPrice=z;
	}
	
	public void getData1(int x,String y)
	{
		pId=x;
		pName=y;
	}
	public void getData2(int x)
	{
		pId=x;
		//pName=y;
	}
	public void display2()
	{
		System.out.println(pId);
		//System.out.println(pName);
	}
	public void display1()
	{
		System.out.println(pId);
		System.out.println(pName);
	}
	public void display()
	{
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(pPrice);
	}

}
