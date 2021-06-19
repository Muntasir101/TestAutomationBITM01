package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchMultipleWindow {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");	    
		driver=new FirefoxDriver();
		String BaseUrl="https://the-internet.herokuapp.com/windows";
		driver.get(BaseUrl);
		
		String parentGUID=driver.getWindowHandle();
		
		WebElement NewWinBtn=driver.findElement(By.cssSelector("#content > div > a"));
		NewWinBtn.click();
		
		//Get all session id of browser
		Set<String> allGUID=driver.getWindowHandles();
		
		System.out.println("Total windows"+allGUID.size());
		
		System.out.println("page Title before Switching "+driver.getTitle());
		
		//Switch to Child
		for(String ChildGUID :allGUID)
		{
			if(!ChildGUID.equals(parentGUID))
			{
				driver.switchTo().window(ChildGUID);
				
				driver.navigate().to("https://google.com");
				
				System.out.println("Child Title "+driver.getTitle());
				
				break;
			}
		}
		
		//Switch back to parent
		for(String ChildGUID :allGUID)
		{
			if(!ChildGUID.equals(parentGUID))
			{
				driver.switchTo().window(parentGUID);
				
				driver.navigate().to("https://bing.com");
				
				System.out.println("back to Parent new Title "+driver.getTitle());
				
				break;
			}
		}
		
		//Again go to child
				for(String ChildGUID :allGUID)
				{
					if(!ChildGUID.equals(parentGUID))
					{
						driver.switchTo().window(ChildGUID);
						
						driver.navigate().to("https://facebook.com");
						
						System.out.println("back to Child new Title "+driver.getTitle());
						
						break;
					}
					
				}
				
				//driver.close();
		driver.quit();

	}

}
