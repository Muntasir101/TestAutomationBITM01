package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headles {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 1\\Tools\\geckodriver.exe");

		FirefoxOptions Obj=new FirefoxOptions();

		Obj.setHeadless(true);


		WebDriver driver=new FirefoxDriver(Obj);

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
