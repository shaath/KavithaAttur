package methods;

import java.io.IOException;

public class EmpRegTC {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Empreg("Sharath", "Chandra", "GSC98765");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");


	}

}
