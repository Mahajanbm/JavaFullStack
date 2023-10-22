package com.flipkart.mobile;

public class Client {
	String name="Sushant";
	
	static int id=10;
	static String city="Hyd";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1=new Client();
		c1.name="mahi";
		System.out.println("Id of Person is : "+id);
		System.out.println("Name of Person is :"+c1.name);

		System.out.println("City of Person is : "+city);


	}

}
