package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiFrame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	dr.get("https://retail.onlinesbi.com/retail/login.htm");
	WebElement wb = dr.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
	wb.click();
	WebElement wb1 = dr.findElement(By.xpath("//input[@title='Login']"));
	wb.click();
	Alert a = dr.switchTo().alert();
	a.accept();
	
}
}
