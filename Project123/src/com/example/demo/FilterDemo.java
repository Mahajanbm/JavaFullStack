package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
	public static void main(String[] args) {
		//	int [] a=new int[] {10,20,30,55,66,99};
		//IntStream.of(a).filter(x-> x %2==0).forEach(System.out::println);
		Stream<String> d1=Stream.of("mahaja","nani","demo","java");
		//d1.filter(str->str.contains("m")).forEach(System.out::println);
		//d1.map(x->x.toUpperCase()).forEach(System.out::println);
		//d1.filter(x->x.contains("m")).map(String::toUpperCase).forEach(System.out::println);
		//  public static void main(final String[] args) {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");


		//   stringCollection
		//         .stream()
		//       .sorted()
		//.map(String::toUpperCase)
		//     .forEach(System.out::println);
	stringCollection.stream().sorted().forEach(System.out::println);
	}

}
