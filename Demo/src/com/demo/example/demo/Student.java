package com.demo.example.demo;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String city;
	String grade;
	Student s1=new Student();
	void getData()
	{Student s2=new Student();
		Scanner  s1=new Scanner(System.in);
		System.out.println("Enter Student Id");
		id=s1.nextInt();
		System.out.println("Enter Student Name");
		name=s1.next();
		System.out.println("Enter Student City");
		city=s1.next();
		System.out.println("Enter Student Grade");
		grade=s1.next();
	}
	void display()
	{
		System.out.println("Student Id Is: "+id);
	}
}
