package com.bldea.javatrainingarray;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the class count:");
		int m=sa.nextInt();
		//System.out.println("enter the  count of students:");
		//int n=sa.nextInt();
		String a[][]=new String[m][];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the count of students of each class-"+i);
			a[i]=new String [sa.nextInt()];
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				
		System.out.println("enter the names of the class-"+i+"student "+j);
		a[i][j]= sa.next();
			}
		
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
					System.out.println("marks of student "+i+" students-"+j+ "is"+a[i][j]);
				
			}
		}
		
	}
}
