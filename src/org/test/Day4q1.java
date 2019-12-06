package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4q1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.navigate().to("http://www.greenstechnologys.com/");
	dr.manage().window().maximize();
	WebElement wb1 = dr.findElement(By.xpath("//h2[contains(text(),\"Overall Reviews\")]"));
	String s = wb1.getText();
	System.out.println(s);
	
	
}
}
