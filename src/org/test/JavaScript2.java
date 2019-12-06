package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/");
	dr.manage().window().maximize();
	WebElement loc = dr.findElement(By.xpath("//span[contains(text(),'Checkout')]"));
	String text = loc.getText();
	System.out.println(text);
	JavascriptExecutor js = (JavascriptExecutor)dr;
	js.executeScript("arguments[0].scrollIntoView(true)",loc);
	WebElement up = dr.findElement(By.id("slide-16-layer-4"));
	js.executeScript("arguments[0].scrollIntoView(false)", up);
	
	
}
}
