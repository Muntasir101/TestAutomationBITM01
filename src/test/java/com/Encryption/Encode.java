package com.Encryption;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Encode {

	static String enecodedPassword="MTIzNDU2";
	
	

	public static String getDecodepassword()
	{
		return new String(Base64.getDecoder().decode(enecodedPassword.getBytes()));
	}

	public static void main(String[] args) {
		/*
		 * Password Encryption
		 */
		String password="123456";
		byte[] encodePassword=Base64.getEncoder().encode(password.getBytes());

		/*
		 * ------------------------
		 * ---------------------
		 */

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		driver=new FirefoxDriver();

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


	}

}
