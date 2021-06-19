package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuth {

	public static void main(String[] args) {
		WebDriver driver;
		   System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		   driver=new FirefoxDriver();
		   
		   String BaseUrl="http://admin:admin@the-internet.herokuapp.com/basic_auth";
		   
		   driver.get(BaseUrl);
	}

}
