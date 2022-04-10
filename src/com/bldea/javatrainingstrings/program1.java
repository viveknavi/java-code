package com.bldea.javatrainingstrings;

public class program1 {
	public static void main(String[] args) {
		String s1= ("vivek");
		String s2= ("vivek");

		if(s1.equals(s2)==true)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.isBlank());
		System.out.println(s1.lines());
	}

}
