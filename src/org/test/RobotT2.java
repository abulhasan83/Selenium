package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotT2 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.google.co.in/webhp");
	dr.manage().window().maximize();						
	WebElement wb = dr.findElement(By.xpath("//a[@title='Google apps']"));
	wb.click();
	
	Robot r = new Robot();
	for(int i=0;i<=6;i++){
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
     }
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
