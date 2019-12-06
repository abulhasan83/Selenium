package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugandWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	WebElement e = dr.findElement(By.id("identifierId"));
	e.sendKeys("itabulhasan");
	WebElement b = dr.findElement(By.xpath("//span[text()='Next']"));
	b.click();	
	Thread.sleep(5000);
	WebElement p = dr.findElement(By.name("password"));
	Thread.sleep(2000);
	p.sendKeys("9965071224");	
	System.out.println("hello");
					
	
		}
}
