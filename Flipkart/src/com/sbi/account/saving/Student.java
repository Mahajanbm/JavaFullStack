package com.sbi.account.saving;

public class Student  implements Cloneable{
	int id=100;
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return  super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student();
		Student s2= (Student)s1.clone();
		System.out.println(s2.id);
	}
	

}
