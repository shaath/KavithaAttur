package day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		Sleeper.sleepTightInSeconds(3);
		
		Alert alt=driver.switchTo().alert();
		
		alt.sendKeys("Yes");
		
		alt.accept();
		
	}

}
