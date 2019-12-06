package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement txtUsr = driver.findElement(By.name("fldLoginUserId"));
		
		//System.out.println("hi");
		txtUsr.sendKeys("Customer id");
		

	}

}
