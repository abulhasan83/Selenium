package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeHandle {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.homedepot.com/");
	dr.manage().window().maximize();
	WebElement se = dr.findElement(By.id("headerSearch"));
	se.sendKeys("ceiling fan");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	WebElement fan = dr.findElement(By.xpath("//img[@src='https://images.homedepot-static.com/productImages/8a4a97e9-0442-4209-8e83-20a618514334/svn/espresso-bronze-home-decorators-collection-ceiling-fans-with-lights-yg493od-eb-64_400_compressed.jpg']"));
	fan.click();
	Thread.sleep(3000);
	WebElement cart = dr.findElement(By.xpath("(//span[@class='bttn__content'])[5]"));
	Actions c = new Actions(dr);
	c.moveToElement(cart);
	cart.click();
	Thread.sleep(15000);
	WebElement fr = dr.findElement(By.xpath("//iframe[@class='thd-overlay-frame']"));
	dr.switchTo().frame(fr);
	WebElement txt = dr.findElement(By.xpath("(//div[text()='$959.96'])[2]"));
	String text = txt.getText();
	System.out.println(text);
}
}
