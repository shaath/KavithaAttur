package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("SharathChandra1234", "SharathChandra1234");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");

	}

}
