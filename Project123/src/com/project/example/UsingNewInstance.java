package com.project.example;

public class UsingNewInstance {
	String string="Demo";

	public static void main(String[] args) {
		try {
			Class class1=Class.forName("UsingNewInstance");
			UsingNewInstance u1=(UsingNewInstance)class1.newInstance();
			System.out.println(u1.string);
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
