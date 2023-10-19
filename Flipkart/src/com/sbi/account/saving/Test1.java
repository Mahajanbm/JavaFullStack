package com.sbi.account.saving;

public class Test1 {
	 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c1=Class.forName("Test1");
		Test1 test1=(Test1)c1.newInstance();
	}

}
