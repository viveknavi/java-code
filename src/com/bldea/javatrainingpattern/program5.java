package com.bldea.javatrainingpattern;

import java.util.Scanner;

public class program5 {
public static void main(String[] args) {
	Scanner sa=new Scanner(System.in);
	System.out.println("enter the value");
	int n=sa.nextInt();
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if((i==j && i<=n/2 && j<=n/2)|| (i+j)==(n-1) && i<=n/2 )
			{
			System.out.print("*");
		    }
			else
			{
				System.out.print(" ");
			}
		
		}

		for(int j=1;j<=n;j++)
		{
			if(i==0 && j<=(n-1) ||j==(n/2) && i<=(n/2)  ||i==(n/2) && j<=(n-1))
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
			if((i==j && i<=n/2 && j<=n/2)|| (i+j)==(n-1) && i<=n/2 )
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
			if((j==0 && i<=n/2)||(i==0 && j<=n-1)||(i==n/4 && j<=n/2)||(i==(n/2) && j<=n-1))
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
			if(j==0 && i <=n/2||(i+j==n/2)&& i<=n/4||(i-j==n/4)&& j<=n/3)
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
