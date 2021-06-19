package com.p1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver;
		
	   System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
	   driver=new FirefoxDriver();
	   
	   
	   
	   try {
		 //Implicit Wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   
		   //Explicit
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.visibilityOfAllElements());
		   
		   
				   
			Thread.sleep(10000);	   
		   
		   
		   driver.get("https://www.google.com");
	   }
	   
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   
	  // driver.get("google.com");
	   
	 //  driver.get("file://C://Users//munta//OneDrive//Desktop//Your Store.html");
	   
	   
	   driver.close();
	   
	  // driver.quit();
 
	}

}
