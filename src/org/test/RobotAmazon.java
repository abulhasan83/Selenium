package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAmazon {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	WebElement wb1 = dr.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	wb1.click();
	WebElement wb2 = dr.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
	wb2.click();
	
	WebElement wb3 = dr.findElement(By.xpath("//input[@id='ap_email']"));
	wb3.sendKeys("9965071224");
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	
	r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_C);

	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	WebElement wb4 = dr.findElement(By.xpath("//input[@id='continue']"));
	wb4.click();
	
	WebElement wb5 = dr.findElement(By.xpath("//input[@name='password']"));
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}
}
