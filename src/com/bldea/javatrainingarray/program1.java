package com.bldea.javatrainingarray;


import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
		{
		System.out.println("enter the marks of "+i);
		a[i]=sa.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("marks of student "+i+" is "+a[i]);
		}
		
	}

}

