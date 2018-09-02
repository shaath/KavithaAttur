package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println("The number of links in google page is "+links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String name=links.get(i).getText();
			
			if (!name.equals(""))
			{
				System.out.println(name);
				count++;
			}
		}
		System.out.println("The number of visible links are "+count);
		System.out.println("The number of invisible links are "+(links.size()-count));
	}

}
