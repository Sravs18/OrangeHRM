package orangehrm.testcases;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminloginwithInvalidCredentials
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp=new LoginPage();
		lp.login("abc", "xyz");
		boolean res=lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("System displayed appropriate error message for invalid credentials");
			
		}else
		{
			System.out.println("System not displayed appropriate error message for invalid credentials");
		}
		
		AppUtils.closeApp();
		
		}

}
