package com.ExtentReportsDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class LoginTestReport {
	
	
	//Extent Report
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest logger;

		
	WebDriver driver;
	String FirefoxDriverPath=".\\src\\test\\resources\\Drivers\\geckodriver.exe";

	@SuppressWarnings("deprecation")
	@Test
	public void login() throws IOException {
		
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReport\\MyLoginTestReport.html"); 
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		
		logger=report.createTest("Login Test");
		

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesFile\\OR.properties");
		Properties prop=new Properties();
		prop.load(fis);

		System.setProperty("webdriver.gecko.driver",FirefoxDriverPath);	    
		driver=new FirefoxDriver();
		logger.log(Status.INFO, "Firefox Started");

		driver.get(prop.getProperty("testSiteUrl"));
		logger.log(Status.INFO, "Login page open");

		//Login
		//Email
		WebElement Email=driver.findElement(By.id("input-email"));		

		//Password
		WebElement Password=driver.findElement(By.id("input-password"));		

		//Login Button
		WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));

		//Action 
		Email.clear();
		Email.sendKeys(prop.getProperty("TestEmail"));
		logger.log(Status.INFO, "Email input done");

		Password.clear();
		Password.sendKeys(prop.getProperty("TestPassword"));
		logger.log(Status.INFO, "Password input done");

		LoginBtn.click();
		
		logger.log(Status.PASS, "Succesfully Test case Executed.");
		
		report.flush();
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
