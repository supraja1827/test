package Testng_Program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng2
{
	public class Exp_testng {
		@BeforeClass
		public void login() {
		System.out.println("Login completed");
		}
		@AfterClass
		public void logout() {
		System.out.println("Logout completed");
		}
		@Test(priority=2)
		public void addemp() {
		System.out.println("Add new emp");
		}
		@Test(priority=1)
		public void delemp() {
		System.out.println("delete emp");
		}
		@Test(priority=1)
		public void delemp() {
		System.out.println("delete emp");
		}
		@Test(priority=1)
		public void delemp() {
		System.out.println("delete emp");
		}
		
	

}
}
