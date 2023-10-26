package com.example.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		for(int i=0;i<=5;i++)
		{
			for(  j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();

			if(j==5)
			{
				for(int k=i;k<4;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}




	}

}
