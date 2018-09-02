package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg
{
	@Parameters({"plotform", "browser"})
	@Test
	public void tt(String pt,String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if (pt.equalsIgnoreCase("windows") && br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (pt.equalsIgnoreCase("windows") & br.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.WINDOWS);
		
//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.ANY);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.2:4444/wd/hub"), cap);
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		
		email.sendKeys("gandesharath@gmail.com");
		
//		Sleeper.sleepTightInSeconds(5);
//		
//		email.clear();
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
