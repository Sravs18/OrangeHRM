package orangehrm.testcases;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class EmployeeLoginTest {

	public static void main(String[] args) 
	{
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("sravs7639", "Sravlu244!");
		
		boolean res=	lp.isDashBoardModuleDisplayed();
		
		if(res)
		{
			System.out.println("employee login test pass");
		}
		else
		{
			System.out.println("employee login test fail");
		}
	


	lp.logout();
	AppUtils.closeApp();
	
	}
}
