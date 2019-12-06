package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAll {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://demo.automationtesting.in/Alerts.html");
	dr.manage().window().maximize();
	WebElement wb = dr.findElement(By.xpath("//button[@class='btn btn-danger']"));
	wb.click();
	Alert a = dr.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
    a.accept();
    WebElement w = dr.findElement(By.xpath("//a[@href='#CancelTab']"));
    w.click();
    
    WebElement wb1 = dr.findElement(By.xpath("//button[@class='btn btn-primary']"));
    wb1.click();
    Alert b = dr.switchTo().alert();
    String text2 = b.getText();
    System.out.println(text2);
     a.dismiss();
    
    WebElement wb4 = dr.findElement(By.xpath("//a[@href='#Textbox']"));
    wb4.click();
    WebElement wb2 = dr.findElement(By.xpath("//button[@class='btn btn-info']"));
    wb2.click();
    Alert c = dr.switchTo().alert();
    String text3 = c.getText();
    System.out.println(text3);
    a.sendKeys("OK");
    a.accept();
    
    
}
}
