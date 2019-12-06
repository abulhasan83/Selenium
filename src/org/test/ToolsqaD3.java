package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaD3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/automation-practice-form/");
	WebElement wb1 = dr.findElement(By.name("firstname"));
	wb1.sendKeys("Abulhasan A");
	
	WebElement wb2 = dr.findElement(By.id("lastname"));
	wb2.sendKeys("Abubakkar");
	
	//WebElement wb3 = dr.findElement(By.name("submit"));
	//wb3.click();
	
	WebElement wb4 = dr.findElement(By.xpath("//input[@value = \"Male\"]"));
	wb4.click();
	
	WebElement wb5 = dr.findElement(By.id("exp-6"));
	wb5.click();
	
	WebElement wb6 = dr.findElement(By.id("datepicker"));
	wb6.sendKeys("01-12-1983");
	
	WebElement wb7 = dr.findElement(By.xpath("//input[@value= \"Manual Tester\"]"));
	wb7.click();
	
	WebElement wb8 = dr.findElement(By.id("tool-2"));
	wb8.click();
	
	//WebElement wb9 = dr.findElement(By.id("continents"));
	//wb9.sendKeys("Asia");
	//wb9.isSelected();
	
	WebElement wb10 = dr.findElement(By.xpath("//button[@class = \"btn btn-info\"]"));
	wb10.click();
	
	
}
}
