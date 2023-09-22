package com.hrms.testscripts;

import com.hrms.lib.general;

public class TC002
{
	public static void main(String args[]) {
	   
	general obj = new general();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.addNewEmp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();

	}
	

}
