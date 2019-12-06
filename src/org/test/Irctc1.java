package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc1 {
public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
   WebDriver dr = new ChromeDriver();
   dr.manage().deleteAllCookies();
   dr.navigate().to("https://www.irctc.co.in/nget/train-search");
   dr.manage().window().maximize();
   dr.findElement(By.xpath("//input[@placeholder=\"From*\"]")).sendKeys("Mannargudi");
   dr.findElement(By.xpath("//input[@placeholder=\"To*\"]")).sendKeys("Chennai");
   dr.switchTo().alert().dismiss();
   dr.findElement(By.xpath("//button[@label=\"Find Trains\"]")).click();
   
}
}
