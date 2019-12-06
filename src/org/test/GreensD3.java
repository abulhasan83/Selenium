package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensD3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://greenstech.in/selenium-course-content.html");
	WebElement wb = dr.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/core%20java%20material.pdf\"]"));
	wb.click();
	
	dr.manage().window().maximize();
	
}
}
