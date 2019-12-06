package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHandle {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	WebElement sc = dr.findElement(By.id("twotabsearchtextbox"));
	sc.sendKeys("iphones 7 black");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement ph = dr.findElement(By.xpath("(//span[text()='Apple iPhone 7 (32GB) - Black'])[1]"));
	ph.click();
	Thread.sleep(3000);
	String par = dr.getWindowHandle();
	System.out.println(par);
	Set<String> allw = dr.getWindowHandles();
	for(String x:allw) {
	if(!par.equals(x)) {
		dr.switchTo().window(x);
	}
	}
	WebElement cart = dr.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
	cart.click();
WebElement cho = dr.findElement(By.id("hlb-ptc-btn-native"));
cho.click();
WebElement text = dr.findElement(By.xpath("//label[contains(text(),'phone number')]"));
String t = text.getText();
System.out.println(t);

}
}
