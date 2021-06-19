package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllWindowGUID {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		driver=new FirefoxDriver();
		String BaseUrl="https://the-internet.herokuapp.com/windows";
		driver.get(BaseUrl);
		
		String parentGUID=driver.getWindowHandle();
		//System.out.println("Parent window GUID: "+parentGUID);
		
		WebElement NewWinBtn=driver.findElement(By.cssSelector("#content > div > a"));
		NewWinBtn.click();
		
		//Get all session id of browser
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);

		
		
	}

}
