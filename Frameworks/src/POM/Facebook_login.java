package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {

	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement connection;
	
	public Facebook_login(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void setusername(String user){
		un.sendKeys(user);
	}
	public void setpassword(String pwd){
		pass.sendKeys(pwd);
	}
	public void login_btn(){
		connection.click();
	}
	
}
