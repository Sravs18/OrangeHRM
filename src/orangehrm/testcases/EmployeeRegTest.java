package orangehrm.testcases;

import Utils.AppUtils;
import orangehrm.library.Employee;
import orangehrm.library.LoginPage;

public class EmployeeRegTest {

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp=new Employee();
		boolean res = emp.addEmployee("john", "D");
		
		if(res)
		{
			System.out.println("Employee Registration Test pass");
		}else
		{
			System.out.println("Employee Registration Test fail");
		}
		
		lp.logout();
		AppUtils.closeApp();
		
		
		

	}

}
