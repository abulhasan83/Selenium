package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollScript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/");
	WebElement wb = dr.findElement(By.xpath("//div[text()='Got a Question?']"));
	
	JavascriptExecutor js = (JavascriptExecutor)dr;
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)", wb);
	
	WebElement wb1 = dr.findElement(By.xpath("//span[text()='Automation Tools Tutorial']"));
	
     js.executeScript("arguments[0].scrollIntoView(false)", wb1);

}
}
