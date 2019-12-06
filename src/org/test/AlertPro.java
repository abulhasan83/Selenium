package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPro {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
	dr.manage().window().maximize();
	WebElement b = dr.findElement(By.xpath("//input[@value=\"SIGN IN\"]"));
	b.click();
	Alert a = dr.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
    a.accept();	
}
}
