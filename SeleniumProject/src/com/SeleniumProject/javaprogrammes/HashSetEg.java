package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Manual");
		s.add("Kavitha");
		s.add("Apple");
		s.add("Selenium");
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
//			System.out.println(it.next());
			String data=it.next();
			System.out.println(data);		
		}
	}

}
