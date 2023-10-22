package com.demo.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,6,8,10};
		int b[]= {3,6,7,11,12,13};
		int x=a.length;
		int y=b.length;
		int z=x+y;
		int temp=0;
		int c[]=new int[z];

		for( int i=0;i<x;i++)
		{
			c[i]=a[i];
		}
		for( int i=0;i<y;i++)
		{
			c[i+x]=b[i];
		}
		for( int i=0;i<c.length;i++)
		{
			 for( int j=i+1;j<c.length;j++)
			 {
				 if( c[i]>c[j])
				 {
					 temp=c[i];//
					 c[i]=c[j];
					 c[j]=temp;
				 }
					 
			 }
			
			 
			
		}
		 for(int i=0;i<c.length;i++)
		 {
			 System.out.println(c[i]);
		 }
	}

}
