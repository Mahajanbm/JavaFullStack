package com.oops.demo;
public class Client {
	public Client() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Client Constructor");
	}
	{
		System.out.println("non-static block");
	}
	{
		System.out.println("This is 2nd non-static block");
	}
	public static void main(String[] args) {
		Client c1=new Client();


	}
}
