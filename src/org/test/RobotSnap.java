package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotSnap {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.snapdeal.com/offers/quirky");
	dr.manage().window().maximize();		
	WebElement wb1 = dr.findElement(By.xpath("//i[@class='sd-icon sd-icon-menu']"));
	Actions a = new Actions(dr);
	a.moveToElement(wb1).perform();
   WebElement wb2=	dr.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
	a.contextClick(wb2).perform();
	Robot r = new Robot();
	for(int i=0;i<2;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);	
}
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
}
}
