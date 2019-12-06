package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/");
	WebElement fromLoc = driver.findElement(By.xpath("//input[@placeholder = \"From*\"]"));
	fromLoc.sendKeys("Chennai");
	
	WebElement toLoc = driver.findElement(By.xpath("//input[@placeholder = \"To*\"]"));
	toLoc.sendKeys("Kumbakonam");
	
	
}
}
