package pom;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Login_POM extends Constants
{
	@Test
	public void login()
	{	
		driver.get(url);
				
		lp.Org_Login(u, p);
		
		Sleeper.sleepTightInSeconds(5);
				
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
