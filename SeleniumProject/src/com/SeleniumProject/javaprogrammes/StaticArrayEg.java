package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium","Manual","UFT",2000,'M'};
		
		//Length of array
		System.out.println("The length of the array "+x.length);
		
		//Reading the data from an array
//		System.out.println(x[1]);
		
//		for (int i = 0; i < x.length; i++)
//		{
//			System.out.println(x[i]);
//		}
		
		
		for (Object data : x) 
		{
			System.out.println(data);
		}

	}

}
