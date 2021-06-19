package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config {

	public static void main(String[] args) {
		
		   WebDriver driver;
		
		   System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		   driver=new FirefoxDriver();
		   
		   

	}

}
