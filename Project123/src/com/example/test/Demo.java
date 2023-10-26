package com.example.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo {
	public static void main(String[] args) {
		String string="mom";
		int x=string.length();
		String tempString="";
		//String m[]=new String[x];
		for(int i=x-1;i>=0;i--)
		{
			tempString=tempString+string.charAt(i);

		}
		if(string.equals(tempString))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
