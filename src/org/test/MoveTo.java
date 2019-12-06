package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://www.greenstechnologies.in/selenium-training.php");
	dr.manage().window().maximize();
	WebElement wb1 = dr.findElement(By.xpath("//a[text()='COURSES']"));
	  Actions s = new Actions(dr);
     s.moveToElement(wb1).perform();
	
	WebElement wb2 = dr.findElement(By.xpath("//span[text()=\"Java Training \"]"));
	s.moveToElement(wb2).perform();
	 
	WebElement wb3= dr.findElement(By.xpath("//span[text()='Core Java Training']"));
	wb3.click();
}
}
