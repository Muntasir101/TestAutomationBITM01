package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleValidation {

	public static void main(String[] args) {

		   WebDriver driver;
		   System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		   driver=new FirefoxDriver();
		   
		   String BaseUrl="https://demo.opencart.com/index.php?route=account/login";
		   
		   driver.get(BaseUrl);
		   
		   String ExpectedTile="account Login";
		   
		   String ActualTitle=driver.getTitle();
		   
		   String ActualURL=driver.getCurrentUrl();
		   
		   if(ActualTitle.equalsIgnoreCase(ExpectedTile))
		   {
			   System.out.println("Title Match.Test passed");
		   }
		   
		   else {
			   System.out.println("Title not Match.Test Failed.");
		   }
		   
		   driver.close();

	}

}
