package com.example.demo;

import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s1=Stream.of("m","mm","dd","qwe");
		s1.forEach(System.out::println);
		String[] aStrings=new String[] {"mahajan","pune","Demo"};
		Stream<String> s2=Stream.of(aStrings);
		s2.forEach(System.out::println);

	}

}
