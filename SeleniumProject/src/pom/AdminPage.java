package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage 
{
	@FindBy(linkText="Admin")
	WebElement admin;
	
	@FindBy(linkText="PIM")
	WebElement pim;
	
	@FindBy(linkText="Leave")
	WebElement leave;
	
	@FindBy(linkText="Time")
	WebElement time;
	
	@FindBy(linkText="Recruitment")
	WebElement recruitment;
	
	@FindBy(linkText="Performance")
	WebElement performance;
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;
	
	@FindBy(linkText="Directory")
	WebElement directory;
	
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome;
	
	@FindBy(linkText="Change Password")
	WebElement CP;
	
	@FindBy(linkText="About")
	WebElement about;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	
	public void adminclick()
	{
		admin.click();
	}
	
	public void pimclick()
	{
		pim.click();
	}
	
	public void leaveclick()
	{
		leave.click();
	}
	
	public void timeclick()
	{
		time.click();
	}
	
	public void recruitmentclick()
	{
		recruitment.click();
	}
	
	public void performanceclick()
	{
		performance.click();
	}
	
	public void dashboardclick()
	{
		dashboard.click();
	}
	
	public void directryclick()
	{
		directory.click();
	}
	
	public void welcomeclick()
	{
		welcome.click();
	}
	public void cpclick()
	{
		CP.click();
	}
	
	public void aboutclick()
	{
		about.click();
	}
	
	public void logoutclick()
	{
		logout.click();
	}
}
