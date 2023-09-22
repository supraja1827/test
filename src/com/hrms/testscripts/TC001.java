package com.hrms.testscripts;

import com.hrms.lib.general;

public class TC001 
{
	public static void main(String args[])
	{
	   general obj = new general();
	   obj.openApplication();
	   obj.login();
	   obj.logout();
	   obj.closeApplication();
	}

}
