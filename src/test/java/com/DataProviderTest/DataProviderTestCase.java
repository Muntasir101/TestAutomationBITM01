package com.DataProviderTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestCase {

	WebDriver driver;

	@DataProvider(name="SearchData")
	public Object [][] data()
	{
		Object[][] data=new Object[2][1];
		data[0][0]="https://google.com";
		data[1][0]="https://facebook.com";
		return data;
	}

	@DataProvider(name="SearchData2")
	public Object [][] data2()
	{
		Object[][] data2=new Object[2][1];
		data2[0][0]="https://bbc.com";
		data2[1][0]="https://cnn.com";
		return data2;
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		driver=new FirefoxDriver();
		Thread.sleep(5000);
	}

	@Test(dataProvider="SearchData2")
	public void searchTest(String site) throws InterruptedException
	{
		driver.get(site);
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}


}
