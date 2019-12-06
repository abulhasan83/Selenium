package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollD711 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://greenstech.in/selenium-course-content.html");
		WebElement wb = dr.findElement(By.xpath("//h2[text()='Best Selenium training institute in Adyar']"));
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView(true)", wb);
		
		TakesScreenshot tk = (TakesScreenshot)dr;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("D:\\eclipse\\SeleProject\\Screenshot\\Greens.png");
		FileUtils.copyFile(src, desc);
				}

}
