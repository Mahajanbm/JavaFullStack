package com.array.example;

public class MinMax {
	public static void main(String[] args) {
		int arr[]= {10,20,55,30,90,78,5};
		int x=arr.length;
		int min=arr[0];
		for(int i=0;i<x;i++)
		{
			if(min<arr[i])
			{
				min=arr[i];
			}
		}
System.out.println(min);

	}
}
