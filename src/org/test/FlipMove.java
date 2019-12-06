package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipMove {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	
	dr.get("https://www.flipkart.com/");
	dr.manage().window().maximize();
	
	WebElement w2 = dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	w2.click();
	
	WebElement wb1 = dr.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
	Actions a = new Actions(dr);
	a.moveToElement(wb1).perform();
	Thread.sleep(3000);
WebElement wb2 = dr.findElement(By.xpath("//a[@title='Formal Shoes']"));
wb2.click();
	Thread.sleep(3000);
	WebElement wb3 = dr.findElement(By.xpath("(//a[@title='Lace Up For Men'])[1]"));
	wb3.click();
	
	WebElement wb5 = dr.findElement(By.xpath("(//a[@class='_1TJldG _2I_hq9 _2UBURg'])[1]"));
	wb5.click();
	WebElement wb4 = dr.findElement(By.xpath("//button[text()='ADD TO CART']"));
	wb4.click();

	
}
}
