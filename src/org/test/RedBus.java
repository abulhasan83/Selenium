package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.redbus.in/");
	Alert a = dr.switchTo().alert();
	a.accept();
	WebElement wb1 = dr.findElement(By.id("i-icon-profile"));
	wb1.click();
	
	WebElement wb2 = dr.findElement(By.id("signInLink"));
	wb2.click();
	
	WebElement wb3 = dr.findElement(By.xpath("//input[@id=\"mobileNoInp\"]"));
	wb3.sendKeys("9965071224");
	
}
}
