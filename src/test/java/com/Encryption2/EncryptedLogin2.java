package com.Encryption2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Password stored in local drive text file
 * read this password
 * use this password for login 
 * This is Encrypted test
 * Muntasir 31/08/2020
 */

public class EncryptedLogin2{

	WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		EncryptedLogin2 obj=new EncryptedLogin2();
		obj.setUp();
		obj.TestClose();

	}
	
	public void setUp() throws IOException, InterruptedException
	{
	
		System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");	    
		driver=new FirefoxDriver();
		
		driver.manage().deleteAllCookies();

		String BaseUrl="https://demo.opencart.com/index.php?route=account/login";
		String TestEmail="mail22@mail.com";

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
		Password.sendKeys(getDecodepassword());
		
		LoginBtn.click();
		Thread.sleep(5000);
	}
	
	public void TestClose()
	{
		driver.close();
	}

	private static String getDecodepassword() throws IOException {
		return new String(Base64.getDecoder().decode(getEncodePassword().getBytes()));

	}

	private static String getEncodePassword() throws IOException {
		BufferedReader reader;

		reader=new BufferedReader(new FileReader("E:/Training/PeopleNTech/BITM Online 1/11th Class/Password_data.txt"));
		String line;
		line=reader.readLine();

		reader.close();

		return new String(Base64.getEncoder().encode(line.getBytes()));
		
	}
}
