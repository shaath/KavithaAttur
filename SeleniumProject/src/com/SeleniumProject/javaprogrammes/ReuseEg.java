package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args)
	{
		MethodsExample m=new MethodsExample();
		
		
		int res=m.sum(60, 40);
		System.out.println(res);

		
		res=m.sum(30, 40, 300);
		System.out.println(res);
	}

}
