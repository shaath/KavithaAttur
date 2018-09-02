package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=b09f36be99ed22595a063d815b9cf3c7");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.name("country"));
		Select s=new Select(drop);
		
		List<WebElement> list=s.getOptions();
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			s.selectByIndex(i);
			String City=list.get(i).getText();
			System.out.println(City);
		}
	}

}
