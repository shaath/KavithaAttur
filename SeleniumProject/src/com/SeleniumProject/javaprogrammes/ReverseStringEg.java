package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String course="Madam";  // madaM
		String rev="";
		int len=course.length();
		
//		for (int i = 0; i < len; i++) 
//		{
//			System.out.println(course.charAt(i));
//		}
		
		for (int i = len-1; i >=0; i--) 
		{
//			System.out.print(course.charAt(i));
			rev=rev+course.charAt(i);
		}
		
		if (course.equalsIgnoreCase(rev)) 
		{
			System.out.println("The given string polyndrome");
		}
		else
		{
			System.out.println("The given string is not a polyndrome");
		}
	}

}
