package com.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {

		   WebDriver driver;
		   System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		   driver=new FirefoxDriver();
		   
		   String BaseUrl="https://demo.opencart.com/index.php?route=account/login";
		   String TestEmail="mail.mail.com";
		   String TestPassword="123456";
		   

		   
		   driver.get(BaseUrl);
		   
		   //Email
		   WebElement Email=driver.findElement(By.id("input-email"));
		   
		   //Password
		   WebElement Password=driver.findElement(By.id("input-password"));
	
		   //Login Button
		   WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		   
		   //Action 
		   Email.clear();
		   Email.sendKeys(TestEmail);
		   
		   Password.clear();
		   Password.sendKeys(TestPassword);
		   
		   LoginBtn.click();
		   
		   
	}

}
