package com.DataProviderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestByDataSet {
	WebDriver driver;
	String BaseUrl="https://demo.opencart.com/index.php?route=account/login";
	
	@DataProvider(name="LoginTestDataSet1")
	public Object [][] data()
	{	
		Object[][] data=new Object[3][2];
		data[0][0]="mail@mail.com";
		data[0][1]="123456";
		
		data[1][0]="mail2@mail.com";
		data[1][1]="123456";
		
		data[2][0]="mail3@mail.com";
		data[2][1]="123456";
		
		return data;
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

	@Test(dataProvider="LoginTestDataSet1")
	public void searchTest(String email,String password) throws InterruptedException
	{
		  driver.get(BaseUrl);
		   
		   //Email
		   WebElement Email=driver.findElement(By.id("input-email"));
		   
		   //Password
		   WebElement Password=driver.findElement(By.id("input-password"));
	
		   //Login Button
		   WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		   
		   //Action 
		   Email.clear();
		   Email.sendKeys(email);
		   
		   Password.clear();
		   Password.sendKeys(password);
		   
		   LoginBtn.click();
			
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}


}
