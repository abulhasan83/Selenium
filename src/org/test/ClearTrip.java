package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.cleartrip.com/");
	WebElement li = dr.findElement(By.id("userAccountLink"));
	li.click();
	WebElement sign = dr.findElement(By.xpath("//input[@title='Sign In']"));
	sign.click();
	
Thread.sleep(3000);
WebElement id = dr.findElement(By.id("email"));
id.sendKeys("abulhasan");
WebElement pass = dr.findElement(By.id("password"));
pass.sendKeys("12234355@Ty");	
}
}
