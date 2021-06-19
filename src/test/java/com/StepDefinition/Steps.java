package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps  {
	
	//Extent Report
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest logger;
	
	
	WebDriver driver=null;
	
	@Given("Open Browser")
	public void open_browser() {
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReport\\MyLoginCucumberTestReport.html"); 
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		
		logger=report.createTest("Browser Open passed");
		
		report.flush();
	}

	@And("Open Login page")
	public void open_login_page() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}

	@When("Enter valid email and Enter valid password")
	public void enter_valid_email_and_enter_valid_password() {
		   //Email
		   WebElement Email=driver.findElement(By.id("input-email"));
		   
		   //Password
		   WebElement Password=driver.findElement(By.id("input-password"));
	
		   //Login Button
		   WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		   
		   //Action 
		   Email.clear();
		   Email.sendKeys("mail22@mail.com");
		   
		   Password.clear();
		   Password.sendKeys("123456");
		   
		   LoginBtn.click();
	}

	@Then("Login successful and redirect to Account page")
	public void login_successful_and_redirect_to_account_page() {
		String ExpectedTitle="My Account";
		String ActualTitle= driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
	}


}
