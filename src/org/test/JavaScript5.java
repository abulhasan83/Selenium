package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://www.adactin.com/HotelApp/");
	dr.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)dr;
	WebElement usr = dr.findElement(By.id("username"));
	js.executeScript("arguments[0].setAttribute('value','abulhasan')", usr);
	WebElement pass = dr.findElement(By.id("password"));
	js.executeScript("arguments[0].setAttribute('value','abul@12323')", pass);
	WebElement btn = dr.findElement(By.xpath("//input[@id='login']"));
	Object o = js.executeScript("return arguments[0].getAttribute('id')", btn);
	String s=(String)o;
	System.out.println(s);
	js.executeScript("arguments[0].click()", btn);
	
	
}
}
