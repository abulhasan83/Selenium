package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSprint {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.sprint.com/");
	dr.manage().window().maximize();
	WebElement wb1 = dr.findElement(By.xpath("//p[contains(text(),'Plans')]"));
	String s1 = wb1.getText();
	System.out.println(s1);
	//Actions a = new Actions(dr);
	//a.moveToElement(wb1).perform();
	 
	// WebElement wb2 = dr.findElement(By.xpath("(//a[@class='js-nav-link'])[57]"));
	// a.moveToElement(wb2).perform();
	 
	
	
}
}
