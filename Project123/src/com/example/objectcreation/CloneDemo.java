package com.example.objectcreation;

public class CloneDemo implements Cloneable {
	@Override 
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	String nameString="Mahajan";
	public static void main(String[] args) {
		CloneDemo d1=new CloneDemo();
		 try {
			CloneDemo d2=(CloneDemo)d1.clone();
			System.out.println(d2.nameString);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
