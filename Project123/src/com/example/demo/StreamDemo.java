package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//Stream<String> s1=Stream.empty();
		Collection<String> collection=Arrays.asList("mahajan","java","Demo","ajay","puine");
		Stream<String> s1=collection.stream();
		s1.forEach(System.out::println);
		List<String> l1=Arrays.asList("demo","mungal","pune university");
		Stream<String> s2=l1.stream();
		s2.forEach(System.out::println);

	}
}
