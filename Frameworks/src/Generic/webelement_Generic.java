package Generic;

import org.openqa.selenium.WebElement;

public class webelement_Generic {

	public void get_the_text(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
	}
	public void get_cssvalue(WebElement ele,String an)
	{
		String css = ele.getCssValue(an);
		System.out.println(css);
	}
	public void get_attribute(WebElement ele,String aa)
	{
		String att = ele.getAttribute(aa);
		System.out.println(att);
	}
}
