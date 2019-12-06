package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement wb = dr.findElement(By.xpath("//frame[@name='login_page']"));
		dr.switchTo().frame(wb);
		WebElement wb1 = dr.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		wb1.sendKeys("abulhasan");
		JavascriptExecutor js = (JavascriptExecutor)dr;
		WebElement wb3 = dr.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		js.executeScript("arguments[0].click()",wb3);
		
		
	}

}
