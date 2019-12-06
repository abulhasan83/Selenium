package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealD3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.navigate().to("https://www.snapdeal.com/");
	dr.manage().window().maximize();
	dr.manage().deleteAllCookies();
	WebElement wb1 = dr.findElement(By.xpath("//span[@class = \"accountUserImg col-xs-9\"]"));
	wb1.click();
	
	WebElement wb2 = dr.findElement(By.xpath("//span[@class = \"newUserRegister\"]"));
	wb2.click();
	Thread.sleep(5000);
	
	JavascriptExecutor j = (JavascriptExecutor) dr;
	
	WebElement user = dr.findElement(By.xpath("//input[@name='username']"));
	j.executeScript("arguments[0].setAttribute('value','haihwru')", user);
	
}
}
