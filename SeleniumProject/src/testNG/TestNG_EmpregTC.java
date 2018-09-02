package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_EmpregTC extends TestNGMaster	
{
	@Test(dataProvider="data")
	public void Org_EMpeg(String f,String l,String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Employee Registration Failed");
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][3];
		
		x[0][0]="Sharath";
		x[0][1]="Chandra";
		x[0][2]="CS45678";
		
		x[1][0]="Harish";
		x[1][1]="P";
		x[1][2]="PHS45678";
		
		x[2][0]="Nidish";
		x[2][1]="G";
		x[2][2]="NG45678";
		
		return x;
	}
}
