package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaChro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement web = driver.findElement(By.name("username"));
		web.sendKeys("itabulhasan@gmail.com");
		
		WebElement web1 = driver.findElement(By.name("password"));
		web1.sendKeys("123@gggg");
}
}