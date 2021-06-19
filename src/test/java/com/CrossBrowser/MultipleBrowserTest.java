package com.CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	
	WebDriver driver;
	
	String FirefoxDriverPath=".\\src\\test\\resources\\Drivers\\geckodriver.exe";	
	String ChromeDriverPath=".\\src\\test\\resources\\Drivers\\chromedriver.exe";
	String TestSite="https://google.com";
	

	@BeforeTest
	@Parameters("Browser")
	public void SetUp(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",FirefoxDriverPath);	    
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",ChromeDriverPath);	    
			driver=new ChromeDriver();
		}
		
		else {
			throw new Exception("Browser not found");
		}
	}
	
	@Test
	public void Title()
	{
		driver.get(TestSite);
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.quit();
	}
	
}
