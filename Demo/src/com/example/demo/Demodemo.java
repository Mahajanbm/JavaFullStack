package com.example.demo;

public class Demodemo {


	public static void main(String[] args) {
		String str="HHHllo, World!";
		// int x=str.length;
		int count=0;
		int temp=1;
		for( int i=0;i<str.length();i++)

		{
			if(str.charAt(count)==str.charAt(i))
			{  
				System.out.println("char at "+str.charAt(count)+" "+temp) ;
				temp++;
			}
		}

	}    }

