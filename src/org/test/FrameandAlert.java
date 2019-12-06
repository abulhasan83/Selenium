package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	dr.manage().window().maximize();
	WebElement wb = dr.findElement(By.xpath("//iframe[@src='trans.htm']"));
	dr.switchTo().frame(wb);
	JavascriptExecutor js = (JavascriptExecutor)dr;
	WebElement wb1 = dr.findElement(By.xpath("//input[@type='submit']"));
	js.executeScript("arguments[0].scrollIntoView(true)", wb1);
	
	WebElement wb2 = dr.findElement(By.xpath("//input[@type='submit']"));
	wb2.click();
	
}
}
