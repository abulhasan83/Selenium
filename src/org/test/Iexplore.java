package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iexplore {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","D:\\eclipse\\SeleProject\\Drivers\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUsr = driver.findElement(By.id("email"));
	txtUsr.sendKeys("itabulhasan@gmail.com");
	
	WebElement passUsr = driver.findElement(By.id("pass"));
	passUsr.sendKeys("mother");
	
	
}
}
