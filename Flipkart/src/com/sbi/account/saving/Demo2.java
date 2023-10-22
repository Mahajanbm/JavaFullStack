package com.sbi.account.saving;

public class Demo2 {
	String name="Sushant";
	int id=10;
	String city="Hyd";

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class c1=Class.forName("Demo2");
		Test1 test1=(Test1)c1.newInstance();
		Demo2 d1=new Demo2();
		System.out.println("Id of Person is : "+d1.id);
		System.out.println("Name of Person is :"+d1.name);

		System.out.println("City of Person is : "+d1.city);


	}

}
