package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3];
		
		System.out.println("The number of rows are "+x.length);
		System.out.println("The number of columns for 0 th index row "+x[0].length);
		
		x[0][1]="Kavitha";
		x[1][2]="Selenium";
		
//		x[1][2]="Manual";
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}

}
