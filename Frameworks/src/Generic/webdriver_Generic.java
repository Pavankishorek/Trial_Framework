package Generic;

import org.openqa.selenium.WebDriver;

public class webdriver_Generic {

	public void get_the_title(WebDriver driver)
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	public void get_the_url(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public void get_pagesource(WebDriver driver)
	{
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
	}

}
