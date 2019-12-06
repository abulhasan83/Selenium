package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement f = driver.findElement(By.name("email"));
f.sendKeys("itabulhasan@gmail.com");

WebElement d = driver.findElement(By.className("inputtext _55r1 _6luy"));
d.sendKeys("mother");
driver.findElement(By.name("login"));
d.click();






}
}
