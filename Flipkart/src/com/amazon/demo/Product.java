package com.amazon.demo;

public class Product {

	int pId;
	String pName;
	float price;

	void getData(int pId,String pName,float price)
	{
		pId=pId;
		pName=pName;
		price=price;
	}
	void display()
	{
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(price);
	}
}
