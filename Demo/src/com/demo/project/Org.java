package com.demo.project;

public class Org {
	int regId;
	String orgName;
	String location;
	int pincode;
	static	Org o1=new Org();
	static void getData(int id,String name,String loc,int pin)
	{
		o1.regId=id;
		o1.orgName=name;
		o1.location=loc;
		o1.pincode=pin;
		//regId=id;

	}
	static void display()
	{
		System.out.println(o1.orgName);
	}

}
