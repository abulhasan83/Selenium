package org.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelFirst {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SelePro\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String expectedTitle = "Welcome:Mercury Tours";
	        String actualTitle = "Welcome:Mercury Tours";
		driver.get("http://demo.guru99.com/test/newtours/");
		
		if (actualTitle.contentEquals(expectedTitle))
		{
            System.out.println("Test Passed!");
        } else
        {
            System.out.println("Test Failed");
        }
		
		driver.close();
	}

}