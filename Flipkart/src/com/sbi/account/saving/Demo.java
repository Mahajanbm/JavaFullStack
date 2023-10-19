package com.sbi.account.saving;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {
String str="mahajan";
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Constructor<Demo> c1=Demo.class.getDeclaredConstructor();
		Demo d1=c1.newInstance();
		System.out.println(d1.str);

	}

}
