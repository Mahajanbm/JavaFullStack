package com.example.objectcreation;

public class Demo {
	String string="Mahajan";
	public static void main(String[] args) {
		try {
			Class class1=Class.forName("Demo");
			Demo n1=(Demo)class1.newInstance();
			System.out.println(n1.string);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
