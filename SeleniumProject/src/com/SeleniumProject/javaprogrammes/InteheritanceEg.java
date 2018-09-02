package com.SeleniumProject.javaprogrammes;

public class InteheritanceEg extends MethodsExample
{
	public static void main(String[] args) 
	{
		Function1();
		
		
		int res=sum(30, 40);
		System.out.println(res);

	}

	public static int sum(int a, int b)
	{
		System.out.println("This is sum method in child class");
		return 0;
	}
}
