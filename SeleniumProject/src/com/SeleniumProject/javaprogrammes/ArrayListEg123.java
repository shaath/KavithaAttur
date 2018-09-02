package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg123 {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		
		//Writing the data
		s.add("Kavitha");
		s.add('S');
		s.add(60000);
		s.add(true);
		
		s.add(6, "UFT");
		
		//Reading the data
//		System.out.println(s.get(2));
		System.out.println(s.size());
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
		}

	}

}
