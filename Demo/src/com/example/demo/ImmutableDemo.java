package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableDemo {
	 private final String  name;
	 private final HashMap<String, String> hashMap;

	

	public ImmutableDemo(String name, HashMap<String, String> hashMap) {
		super();
		this.name = name;
		HashMap<String , String> temphas=new HashMap<String, String>();
		String key;
		Iterator<String> it=hashMap.keySet().iterator();
		while(it.hasNext())		
			
		{
			key=it.next();
			hashMap.put(key, hashMap.get(key));
		} 
		this.hashMap=hashMap;
	}



	public HashMap<String, String> getHashMap() {
		return (HashMap<String, String>)hashMap.clone();
	}



	public String getName() {
		return name;
	}
	 
}
