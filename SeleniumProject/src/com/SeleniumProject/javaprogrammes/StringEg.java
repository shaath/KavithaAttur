package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args)
	{
		String course="Selenium";
		
		System.out.println(course.length());
		
		System.out.println(course.charAt(5));
		
		System.out.println(course.substring(2, 5));
		
		System.out.println("You are selected "+course);
		
//		System.out.println(course.join("#", "You are selcted", course,"Sharath"));

		System.out.println(course.equalsIgnoreCase("selenium"));
		
		System.out.println(course.contains("len"));
		
		System.out.println(course.indexOf('i'));
		
		System.out.println(course.replace('e', 'a'));
		
		System.out.println(course.toUpperCase());
		
		System.out.println(course.toLowerCase());
		
		System.out.println(course.replaceFirst("len", "kavitha"));
		
		System.out.println(course.lastIndexOf('e'));
	}

}
