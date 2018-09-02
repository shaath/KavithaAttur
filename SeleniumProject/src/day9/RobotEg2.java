package day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RobotEg2 {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
//		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Dell\\Pictures\\jira.png");
		driver.findElement(By.id("photofile")).click();
		
//		Sleeper.sleepTightInSeconds(3);
		Thread.sleep(3000);
		String imagePath="C:\\Users\\Dell\\Pictures\\jira.png";
		
		 StringSelection stringSelection = new StringSelection(imagePath);
	     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	     clipboard.setContents(stringSelection, null);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
