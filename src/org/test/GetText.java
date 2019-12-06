package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	WebElement wb1= dr.findElement(By.xpath("//span[text()='Create an account']"));
	String att = wb1.getText();
	System.out.println(att);
WebElement wb = dr.findElement(By.xpath("//input[@aria-label='Log In']"));
String att1 = wb.getAttribute("aria-label");
System.out.println(att1);

WebElement wb3 = dr.findElement(By.xpath("//div[contains(text(),'connect and')]"));
String s=wb3.getText();
System.out.println(s);
}
}
