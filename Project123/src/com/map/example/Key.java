package com.map.example;

public class Key {
	String key;

	public Key(String key) {

		this.key = key;
	}
	@Override
	public int hashCode()
	{
		return (int)key.charAt(0);	
	}


	@Override
	public boolean equals(Object obj)
	{
		return key.equals((String)obj);
	}
}
