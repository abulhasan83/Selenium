package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2Handle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	WebElement ser = dr.findElement(By.id("twotabsearchtextbox"));
	ser.sendKeys("iphone 8");
	WebElement clk = dr.findElement(By.xpath("(//input[@type='submit'])[1]"));
	clk.click();
	
	WebElement ph = dr.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 8')])[2]"));
	ph.click();
	Thread.sleep(5000);
	WebElement cart = dr.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
	cart.click();

	WebElement pr = dr.findElement(By.id("hlb-ptc-btn-native"));
	pr.click();
}
}
