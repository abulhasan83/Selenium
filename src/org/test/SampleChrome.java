package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	WebElement txtUsr = driver.findElement(By.name("email"));
	txtUsr.sendKeys("itabulhasan@gmail.com");
	
	WebElement passUsr = driver.findElement(By.name("pass"));
	passUsr.sendKeys("mother");
	
	//driver.get("https://www.facebook.com/");
	
	
}
}
