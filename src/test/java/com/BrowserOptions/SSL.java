package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");
		
		FirefoxOptions Obj=new FirefoxOptions();
		
		//Accept certificate
		Obj.setAcceptInsecureCerts(true);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://cacert.org/");
		
		System.out.println(driver.getTitle());

	}

}
