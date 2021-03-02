package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {

	@FindBy(id="identifierId")
	private WebElement untbox;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[1]")
	private WebElement connection;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[1]")
	private WebElement connection1;
	
	public Mainpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setusername(String un){
		untbox.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void button()
	{
		connection.click();
	}

	public void button1()
	{
		connection1.click();
	}
}
