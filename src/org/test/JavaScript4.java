package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
	WebElement em = dr.findElement(By.id("email"));
	em.sendKeys("itabulhasan");
	WebElement ps = dr.findElement(By.id("pass"));
	ps.sendKeys("abul32444");
	
	WebElement btn = dr.findElement(By.id("loginbutton"));
	JavascriptExecutor js = (JavascriptExecutor)dr;
	js.executeScript("arguments[0].click()", btn);
}
}
