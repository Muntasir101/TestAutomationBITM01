package com.Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		driver=new FirefoxDriver();
		String BaseUrl="https://google.com";
		driver.get(BaseUrl);
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//Take screenshot
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("E:\\Training\\PeopleNTech\\BITM Online 1\\Screenshot\\PageScreenshot.png"),true);
		} 
		catch (IOException e) 
		{
	
			System.out.println("Error"+e);
			e.printStackTrace();
		}
		

		
	}

}
