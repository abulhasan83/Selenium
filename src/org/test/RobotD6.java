package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotD6 {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	WebElement wb = dr.findElement(By.xpath("//input[@name='email']"));
	wb.sendKeys("itabulhasan@gmail.com");
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}
}
