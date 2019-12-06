package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Para {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://greenstech.in/selenium-course-content.html");
	WebElement w = dr.findElement(By.xpath("//p[contains(text(),'Selenium is a framework')]"));
	String text = w.getText();
	System.out.println(text);	
}
}
