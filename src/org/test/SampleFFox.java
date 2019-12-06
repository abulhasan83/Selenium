package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleFFox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\SeleProject\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.swiggy.com/");
	WebElement web = driver.findElement(By.id("location"));
	web.sendKeys("Omr-chennai");
	
}
}
