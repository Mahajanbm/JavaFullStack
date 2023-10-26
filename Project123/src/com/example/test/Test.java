package com.example.test;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	HashMap<Integer, String>
		int a[]={23,45,12,78,4,90,1};        
		int b[]={77,11,45,88,32,56,3};
		int x=a.length;
		int y=b.length;
		int z=x+y;
		int c[]=new int[z];

		 for( int i=0;i<a.length;i++)
		 {
			 c[i]=a[i];
		 }
		 for(int i=0;i<b.length;i++)
		 {
			 c[i+x]=b[i];
		 }
		 for(int j=0;j<c.length;j++)
		 {
			 System.out.println(c[j]);
		 }
	}

}
