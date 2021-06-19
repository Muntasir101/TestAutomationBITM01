package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSize {

	public static void main(String[] args) {
		
		   WebDriver driver;
		
		   System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		   driver=new FirefoxDriver();
		   
		  // driver.manage().window().maximize();
		   
		   //Get full window size

		   
		 //  System.out.println("Full Window size: "+Wsize);
		   
		   
		   //Target (1000,600) 
		   driver.manage().window().setSize(new Dimension(1000,600));
		   
		   Dimension Wsize=driver.manage().window().getSize();
		   
		   //Get Width
		   int BrowserWidth=Wsize.width;
		   System.out.println("New Width: "+BrowserWidth);
		   
		   //Get Height
		   int BrowserHeight=Wsize.height;
		   System.out.println("New Height: "+BrowserHeight);
		   
		   

	}

}
