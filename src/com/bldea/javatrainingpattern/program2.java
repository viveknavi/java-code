package com.bldea.javatrainingpattern;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
	Scanner sa=new Scanner(System.in);
	System.out.println("enter the value");
	int s=sa.nextInt();
		int count=s*s;
		for(int i=1;i<=s;i++)
		{
			for(int j=1;j<=s;j++)
			{
				if (count<10)
				{
					System.out.print("0");
					
				}
				System.out.print(count);
				count--;
			}System.out.println();
		}
	}

}
