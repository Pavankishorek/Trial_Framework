package Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_test;
import Generic.Generic_excel;
import pom.Mainpage;

public class valid_login extends Base_test {

	@Test
	public void test() throws InterruptedException{
		String un = Generic_excel.getdata("sheet2",0,0);
		String pwd = Generic_excel.getdata("sheet2",0,1);
		Mainpage m1=new  Mainpage(driver);
		m1.setusername(un);
		m1.button();
		Thread.sleep(2000);
		m1.setpassword(pwd);
		m1.button1();
		//Assert.fail();
	}
}
