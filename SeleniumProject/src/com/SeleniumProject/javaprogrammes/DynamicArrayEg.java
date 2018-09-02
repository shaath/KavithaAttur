package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		int[] salary=new int[5];

		System.out.println(salary.length);
		
		//Writing the data into an array
		salary[2]=60000;
		salary[4]=40000;
		
		salary[5]=90000;
		//Reading the data from an array
//		System.out.println(salary[1]);
		
		for (int i = 0; i < salary.length; i++) 
		{
			System.out.println(salary[i]);
		}
	}

}
