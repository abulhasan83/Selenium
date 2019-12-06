package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotFlip {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.flipkart.com/");
	dr.manage().window().maximize();
	
	WebElement wb1 = dr.findElement(By.xpath("(//input[@type='text'])[2]"));
	wb1.sendKeys("9965071224");
	
  TakesScreenshot tk = (TakesScreenshot) dr;
  File f = tk.getScreenshotAs(OutputType.FILE);
  File desc = new File("D:\\eclipse\\SeleProject\\Screenshot\\Abul.png");
  FileUtils.copyFile(f, desc);
	
}
}
