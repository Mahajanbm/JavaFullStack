package com.array.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ShiftZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,0,20,50,0,60,90,84,56,0,5};
		int x=a.length;
		int count=0;
		for(int i=0;i<x;i++)
		{
			if(a[i]!=0)

				a[count++]=a[i];

			while(count<x)
				a[count++]=0;
		}
		for(int i=0;i<x;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
