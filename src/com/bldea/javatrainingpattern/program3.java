package com.bldea.javatrainingpattern;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the value");
		int s=sa.nextInt();
		for(int j=1;j<=s;j++)
		{
			for(int i=1;i<=s;i++)
			{
				if(j%2==0 )
				{
				System.out.print("1");
			    }
				else
				{
					System.out.print("0");
				}
			
			}
			System.out.println();
		}

	}

}
