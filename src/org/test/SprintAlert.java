package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SprintAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	dr.get("https://www.sprint.com/");
	WebElement wb = dr.findElement(By.xpath("//p[text()='Sign In']"));
	wb.click();
	WebElement wb1 = dr.findElement(By.id("loginHeaderButton"));
wb1.click();
}
}
