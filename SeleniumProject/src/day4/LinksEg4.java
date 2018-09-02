package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg4 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com:9090/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		int len=links.size();
		for (int i = 0; i < len	; i++) 
		{
			String text=links.get(i).getText();
			System.out.println(text);
			links.get(i).click();
			Sleeper.sleepTightInSeconds(3);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Kavitha UK Recordings\\Workspace\\SeleniumProject\\src\\sceenshots\\"+text+".png"));
		
			
			driver.navigate().back();
			
			block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
			links=block.findElements(By.tagName("a"));
		}

	}

}
