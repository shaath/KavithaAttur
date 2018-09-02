package com.SeleniumProject.javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		String course="Selenium";
		
		switch(course)
		{
		case "selenium":
			System.out.println("You are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "Manual":
			System.out.println("This is manual testing");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
