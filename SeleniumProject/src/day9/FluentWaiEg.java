package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaiEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
																	.pollingEvery(2, TimeUnit.SECONDS)
																	.ignoring(NoSuchElementException.class);

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='slide 3']"))).click();
	}

}
