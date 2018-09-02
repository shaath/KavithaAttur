package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniummethodsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		driver.close();
	}

}
