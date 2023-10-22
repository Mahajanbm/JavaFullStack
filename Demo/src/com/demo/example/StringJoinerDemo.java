package com.demo.example;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		//StringJoiner sj=new StringJoiner(",");
		StringJoiner sj=new StringJoiner(",","[","]");
		sj.add("Mahajan");
		sj.add("Mungal");
		sj.add("Demo");
		sj.add("pune");
		sj.add("Payal");
		System.out.println(sj);
	}
}
