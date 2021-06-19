package com.BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		driver=new FirefoxDriver();
		
		
		String BaseUrl="http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146";
		driver.get(BaseUrl);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement mouseHover=driver.findElement(By.xpath("/html/body/section/header/nav[2]/div/div/div/span/ul/li/a"));
		
		moveElement(driver,mouseHover);
		
		//click sub menu
		driver.findElement(By.linkText("COURSES")).click();

	}
	
	public static void moveElement(WebDriver driver, WebElement element)
	{
		Actions acObj=new Actions(driver);
		
		acObj.moveToElement(element).build().perform();
	}

}
