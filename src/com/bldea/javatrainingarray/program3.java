package com.bldea.javatrainingarray;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the  count of university:");
		int m=sa.nextInt();
		//System.out.println("enter the clg count:");
		//int n=sa.nextInt();
		//System.out.println("enter the  count of clss:");
		//int o=sa.nextInt();
		//System.out.println("enter the  count of students:");
		//int p=sa.nextInt();
		String a[][][][]=new String[m][][][];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the count of clg of each university-"+i);
			a[i]=new String [sa.nextInt()][][];
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter the count of class of each clg-"+j);

				a[i][j]=new String[sa.nextInt()][];
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
				System.out.println("enter the count of student of each clss-"+k);

				a[i][j][k]=new String[sa.nextInt()];
				}
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a[i][j][k].length;l++)
					{
						System.out.println("enter the name of the student of university-"+i+"clg "+j+" class"+k+ "stdnts"+l);
						a[i][j][k][l]= sa.next();
					}
				}


			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a[i][j][k].length;l++)
					{


						System.out.println("the name of thestudent of university- "+i+" clg "+j+" class "+k+ " stdnts" +l+ " is "+a[i][j][k][l] );

					}
				}
			}

		}
	}
}
