package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptD12 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://www.greenstechnologys.com/");
	dr.manage().window().maximize();
	WebElement txt = dr.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	
	JavascriptExecutor js = (JavascriptExecutor) dr;
	js.executeScript("arguments[0].scrollIntoView(true)", txt);
	
	String text = txt.getText();
	System.out.println(text);
}
}
