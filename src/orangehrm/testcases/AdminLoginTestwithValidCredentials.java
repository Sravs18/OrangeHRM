package orangehrm.testcases;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminLoginTestwithValidCredentials
{

	public static void main(String[] args)
	{
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
	boolean res=	lp.isAdminModuleDisplayed();
	if(res)
	{
		System.out.println("Admin login test pass");
	}
	else
	{
		System.out.println("Admin login test fail");	
	}
	lp.logout();
	AppUtils.closeApp();
	
	}

}
