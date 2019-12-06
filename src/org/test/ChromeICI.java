package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeICI {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement w1 = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	w1.sendKeys("abulhasan");
	
}
}
s