package Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_test;
import Generic.Generic_read_excel;
import POM.Facebook_login;

public class Valid_login extends Base_test {

	@Test
	public void login(){
		String user=Generic_read_excel.getdata("sheet1",0,0);
		String pass=Generic_read_excel.getdata("sheet1",0,1);
		Facebook_login f1=new Facebook_login(driver);
		f1.setusername(user);
		f1.setpassword(pass);
		f1.login_btn();
		Assert.fail();
	}
}
