package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://demo.guru99.com/test/drag_drop.html");
	dr.manage().window().maximize();
	WebElement wb1 = dr.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement wb2 = dr.findElement(By.xpath("(//li[@data-id = \"2\"])[3]"));
	Actions a = new Actions(dr);
	a.dragAndDrop(wb1, wb2).perform();;
	
	
}
}
