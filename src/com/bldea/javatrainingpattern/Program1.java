package com.bldea.javatrainingpattern;

public class Program1 {
public static void main(String[] args) {
		
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=j;i++)
			{
				if(i==1|| j==5 ||i==j )
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print("@");
				}
			
			}
			System.out.println();
		}

	}
}
