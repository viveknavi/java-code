package com.bldea.javatrainingpattern;

import java.util.Scanner;

public class program6 {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sa.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i==0&& j!=0 && j!=n-1)|| (j==n-1 && i!=0)|| (j==0 && i!=0)||(i==n/2))
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				}
			
			}

			for(int j=0;j<=n;j++)
			{
				if(j==0 ||i==j||j==n )
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				}
			
			}

			for(int j=0;j<=n;j++)
			{
				if(j==0 ||i==j||j==n )
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				}
			
			}
			for(int j=0;j<=n;j++)
			{
				if(j==0 && i!=(n)||i==(n)&& j!=0 && j!=n||j==(n)&&i!=(n))
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				}
			
			}
			
			
			System.out.println();
		}
	}
}
