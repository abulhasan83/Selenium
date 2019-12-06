package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDay8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		dr.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)dr;
		WebElement wb = dr.findElement(By.xpath("//frame[@src='RSLogin.html?v=12']"));
		dr.switchTo().frame(wb);
		
		WebElement wb1 = dr.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		
		wb1.click();
		Alert a = dr.switchTo().alert();
		a.accept();
		
		
	}

}
