package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleD3 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	dr.manage().window().maximize();
	WebElement wb1 = dr.findElement(By.xpath("//input[@id=\"firstName\"]"));
	wb1.sendKeys("Abulhasan");
	
	WebElement wb2 = dr.findElement(By.id("lastName"));
	wb2.sendKeys("Abubakkar");
	
	WebElement wb3 = dr.findElement(By.id("username"));
	wb3.sendKeys("itabulhasan10");
	
	WebElement wb4 = dr.findElement(By.name("Passwd"));
	wb4.sendKeys("abulhasan@84");
	
	WebElement wb5 = dr.findElement(By.name("ConfirmPasswd"));
	wb5.sendKeys("abulhasan@84");
	
	WebElement wb6 = dr.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]"));
	wb6.click();
	
	WebElement wb7 = dr.findElement(By.id("phoneNumberId"));
	wb7.sendKeys("7904260842");
	
}
}
