package orangehrm.testcases;

import Utils.AppUtils;
import orangehrm.library.LoginPage;
import orangehrm.library.User;

public class UserRegTest {

	public static void main(String[] args) throws InterruptedException
	{
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		User usr=new User();
		boolean res=usr.addUser("Ajay k", "sravs2021","Sravlu244!");
		if(res)
		{
			System.out.println("user registration test pass");
		
		}
		else
		{
			System.out.println("user registration test fail");
		}
		
		lp.logout();
		AppUtils.closeApp();
		
		
		
		

	}

}
